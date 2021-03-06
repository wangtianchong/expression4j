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

package com.rongdu.expression4j.sample.configuration;

import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;

import com.rongdu.expression4j.basic.MathematicalElement;
import com.rongdu.expression4j.basic.OperatorManager;
import com.rongdu.expression4j.config.ConfigurationUtil;
import com.rongdu.expression4j.core.Expression;
import com.rongdu.expression4j.core.Parameters;
import com.rongdu.expression4j.factory.ExpressionFactory;
import com.rongdu.expression4j.factory.NumberFactory;
import com.rongdu.expression4j.factory.OperatorManagerFactory;
import com.rongdu.expression4j.sample.custom.element.StringMathematicalElement;

public class LoadCustomExpressionElementConfiguration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InputStream inputStream = new FileInputStream("c:/config.xml");
			ConfigurationUtil.loadConfig(inputStream);
			
			//compute expression
			Parameters parameters = ExpressionFactory.createParameters();
			parameters.addParameter("x",new StringMathematicalElement("test"));
			parameters.addParameter("y",new StringMathematicalElement("une valeur"));
			
			Expression expression = ExpressionFactory.getCatalog().getExpression("g");
			OperatorManager opManager = OperatorManagerFactory.getOperatorManager("stringOperatorManager");
			
			MathematicalElement result = expression.evaluate(opManager,parameters);
			
			//display result
			System.out.println("result: " + result.getValue());
			
			//compute expression with a real
			for (int i=0; i<10; i++) {
				parameters.addParameter("x",NumberFactory.createReal(new BigDecimal(i)));
				parameters.addParameter("y",new StringMathematicalElement("une valeur"));
				
				result = expression.evaluate(opManager,parameters);

				//display result
				System.out.println("result: " + result.getValue());
			}
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
			System.out.println("error: " + e.getCause());
		}

	}

}
