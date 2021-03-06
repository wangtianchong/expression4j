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

package com.rongdu.expression4j.sample;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

import com.rongdu.expression4j.basic.MathematicalElement;
import com.rongdu.expression4j.basic.OperatorManager;
import com.rongdu.expression4j.core.Catalog;
import com.rongdu.expression4j.core.Expression;
import com.rongdu.expression4j.core.ExpressionModel;
import com.rongdu.expression4j.core.Parameters;
import com.rongdu.expression4j.core.exception.EvalException;
import com.rongdu.expression4j.core.exception.ParametersException;
import com.rongdu.expression4j.core.predefine.AbstractFunction;
import com.rongdu.expression4j.factory.ExpressionFactory;
import com.rongdu.expression4j.factory.NumberFactory;
import com.rongdu.expression4j.util.MathUtil;
import com.rongdu.expression4j.util.ParameterUtil;

public class MyFirstUserDefineFunction {

	private static class Factoriel extends AbstractFunction {

		/**
		 * compute the factoril of a number
		 * @param x number to compute
		 * @return factoriel of the number.
		 */
		private BigDecimal fact(BigDecimal x,MathContext mc) {
			if (x.compareTo(new BigDecimal(0))==0) {
				return new BigDecimal(1);
			}
			//x*fact(x-1)
			return fact(x.subtract(new BigDecimal(1), mc),mc).multiply(x, mc);
		}
		
		/**
		 * evaluation method called by the Expression4j when needed.
		 * 
		 * @param parameters parameter given to the function for the evaluation.
		 */
		public MathematicalElement evaluate(Parameters parameters) throws EvalException {
			try {
				MathematicalElement me = parameters.getParameter("x");
				BigDecimal tmpValue = me.getRealValue(getCatalog().getMathContext()); 
				if (tmpValue .compareTo(MathUtil.getZero())< 0) {
					throw new EvalException("Cannot evaluate fact of negativ number.");
				}
				BigDecimal result = fact(tmpValue,getCatalog().getMathContext());
				
				return NumberFactory.createReal(result);
			}
			catch (ParametersException pe) {
				throw new EvalException("Cannot evaluate fact(x). " + pe);
			}
			
		}

		
		public MathematicalElement evaluate(OperatorManager operatorManager,Parameters parameters) throws EvalException {
			return evaluate(parameters);
		}

		public Catalog getCatalog() {
			return ExpressionFactory.getCatalog();
		}

		/**
		 * get the function name
		 */
		public String getName() {
			return "fact";
		}

		/**
		 * get parameter list of the function.
		 */
		public List getParameters() {
			//this util method get one parameter "x".
			return ParameterUtil.generateXParameters();
		}

		public ExpressionModel getExpressionModel() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	
	public static void main(String[] args) {
		try {
			//define a specific catalog (not necessary,
			//we can use the default catalog instead)
			Catalog catalog = ExpressionFactory.createCatalog("catalog",MathUtil.getDefaultMathContext());
			
			//add the user define function to the catalog
			catalog.addExpression(new Factoriel());
			
			//create the expression who use the user define function
			//dont forget to put the catalog of the user define function
			//if default catalog is not used.
			Expression expression1 = ExpressionFactory.createExpression("f(x)=fact(x+1)",catalog);
			System.out.println("Expression name: " + expression1.getName());
			System.out.println("Expression : " + expression1);
			System.out.println("Expression parameters: " + expression1.getParameters());
			
			//compute a value
			MathematicalElement me1 = NumberFactory.createReal(new BigDecimal(5));
			Parameters parameters = ExpressionFactory.createParameters();
			parameters.addParameter("x",me1);
			
			System.out.println("Value of expression h :" + expression1.evaluate(parameters));

		}
		catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
}
