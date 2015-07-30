//   Copyright 2006 Stephane GINER
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

package com.rongdu.expression4j.basic.impl;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.rongdu.expression4j.basic.MathematicalElement;
import com.rongdu.expression4j.basic.MathematicalException;
import com.rongdu.expression4j.util.MathUtil;

public class ComplexImpl extends RealImpl {

	static Logger log = Logger. getLogger(ComplexImpl.class);

	private BigDecimal complexValue;

	public ComplexImpl(BigDecimal realValue, BigDecimal complexValue) {
		super(realValue);
		log.debug("In constructor: real: " + realValue + " complex: " + complexValue);
		this.complexValue = complexValue;
		properties.setProperty(MathematicalElement.COMPLEX_VALUE,String.valueOf(complexValue));
	}


	public BigDecimal getComplexValue(MathContext mc) throws MathematicalException {
		return complexValue;
	}

	public String toString() {
		String result = "";
		if (realValue.compareTo(new BigDecimal(0))!=0) {
			result += realValue;
		}
		if (complexValue.compareTo(new BigDecimal(0))!=0) {
			if (complexValue .compareTo(new BigDecimal(0)) < 0) {
				result += complexValue;
			}
			else {
				result += "+" + complexValue;
			}
			result += "i";
		}
		return result;
	}

	public int getType() {
		return 2;
	}

	public void setProperties(Properties properties) {
		super.setProperties(properties);

		String stringValue = properties.getProperty(MathematicalElement.COMPLEX_VALUE);
		if (stringValue != null) {
			complexValue = new BigDecimal(stringValue);
		}
		else {
			complexValue = MathUtil.getZero();
		}
	}
	
}
