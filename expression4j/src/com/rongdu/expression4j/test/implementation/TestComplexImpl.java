//Copyright 2006 Stephane GINER
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.rongdu.expression4j.test.implementation;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Properties;

import com.rongdu.expression4j.basic.MathematicalElement;
import com.rongdu.expression4j.basic.MathematicalException;
import com.rongdu.expression4j.basic.impl.ComplexImpl;
import com.rongdu.expression4j.util.MathUtil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * test implementation of complex number
 * @author SGINER
 *
 */
public class TestComplexImpl extends TestCase {
    private static MathContext mc=MathUtil.getDefaultMathContext();
	public static Test suite() {
		return new TestSuite(TestComplexImpl.class);
	}

	public void testComplexImpl() {
		ComplexImpl complexImpl = new ComplexImpl(new BigDecimal(230),new BigDecimal(240));
		assertEquals("Invalid ComplexImpl type",2,complexImpl.getType());
		assertEquals("Invalid complexImpl real value",230,complexImpl.getRealValue(mc).doubleValue(),0);
		try {
			assertEquals("Invalid complexImpl complex value",240,complexImpl.getComplexValue(mc).doubleValue(),0);
		}
		catch (MathematicalException me) {
			fail("cannot get complex value of ComplexImpl!");
		}
	}

	public void testComplexImplProperties() {
		MathematicalElement complexImpl = new ComplexImpl(new BigDecimal(0),new BigDecimal(0));
		Properties properties = new Properties();
		
		properties.setProperty(MathematicalElement.REAL_VALUE,"10.2");
		properties.setProperty(MathematicalElement.COMPLEX_VALUE,"5.3");
		complexImpl.setProperties(properties);
		assertEquals("Invalid real value form properties.",10.2,complexImpl.getRealValue(mc).doubleValue(),0);
		try {
			assertEquals("Invalid complex value form properties.",5.3,complexImpl.getComplexValue(mc).doubleValue(),0);
		}
		catch (MathematicalException me) {
			fail("Could not find complex value on a complex element.");
		}
	}

}
