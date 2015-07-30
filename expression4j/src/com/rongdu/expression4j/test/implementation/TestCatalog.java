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

import java.math.MathContext;

import com.rongdu.expression4j.core.Catalog;
import com.rongdu.expression4j.core.Expression;
import com.rongdu.expression4j.core.exception.ParsingException;
import com.rongdu.expression4j.factory.ExpressionFactory;
import com.rongdu.expression4j.util.MathUtil;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * test addition in expression
 * @author SGINER
 *
 */
public class TestCatalog extends TestCase {
    private static MathContext mc=MathUtil.getDefaultMathContext();
	public static Test suite() {
		return new TestSuite(TestCatalog.class);
	}

	public void testEmptyCatalog() {
		Catalog catalog = ExpressionFactory.createCatalog("Catalog",mc);
		assertEquals(15,catalog.listExpression().size());
	}

	public void testGeneralCatalog() {
		String expressionString = "f()=1+2";
		try {
			Expression expression = ExpressionFactory.createExpression(expressionString);
			Catalog catalog = ExpressionFactory.getCatalog();
			expression = catalog.getExpression("f");
			assertNotNull(expression);
		}
		catch (ParsingException pe) {
			fail("Cannot parse simple expression. " + pe);
		}
	}

	public void testGeneralCatalog2() {
		String expressionString = "f()=1+2";
		try {
			Expression expression = ExpressionFactory.createExpression(expressionString);
			expressionString = "g(x)=2*x";
			expression = ExpressionFactory.createExpression(expressionString);
			
			Catalog catalog = ExpressionFactory.getCatalog();
			expression = catalog.getExpression("f");
			assertNotNull(expression);
			expression = catalog.getExpression("g");
			assertNotNull(expression);
		}
		catch (ParsingException pe) {
			fail("Cannot parse simple expression. " + pe);
		}
	}

	public void testCatalog() {
		String expressionString = "f()=1+2";
		try {
			Expression expression = ExpressionFactory.createExpression(expressionString);
			Catalog catalog = ExpressionFactory.createCatalog("Catalog1",mc);
			catalog.addExpression(expression);
			
			expressionString = "g(x)=2*x";
			expression = ExpressionFactory.createExpression(expressionString);
			catalog.addExpression(expression);
			
			expression = catalog.getExpression("f");
			assertNotNull(expression);
			expression = catalog.getExpression("g");
			assertNotNull(expression);
		}
		catch (ParsingException pe) {
			fail("Cannot parse simple expression. " + pe);
		}
	}
	
}
