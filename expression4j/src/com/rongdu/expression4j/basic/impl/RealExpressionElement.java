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

package com.rongdu.expression4j.basic.impl;

import java.math.BigDecimal;
import java.util.List;

import com.rongdu.expression4j.basic.ExpressionElement;
import com.rongdu.expression4j.basic.MathematicalElement;
import com.rongdu.expression4j.basic.OperatorManager;
import com.rongdu.expression4j.basic.ParseInfo;
import com.rongdu.expression4j.core.Catalog;
import com.rongdu.expression4j.core.ExpressionModel;
import com.rongdu.expression4j.core.Parameters;
import com.rongdu.expression4j.core.exception.EvalException;
import com.rongdu.expression4j.core.exception.ParsingException;
import com.rongdu.expression4j.core.impl.TreeElement;
import com.rongdu.expression4j.factory.NumberFactory;
import com.rongdu.expression4j.util.ExpressionElementUtil;

/**
 * Parse a real expression. Real is like 2.45e-3 or 2.34 or 5
 * 
 * BNF is
 * 
 * real           ::= real-simple | real-simple "e" signed-integer
 * real-simple    ::= integer | integer "." integer
 * signed-integer ::= additive-op integer | integer
 * additive-op    ::= "+" | "-"
 * integer        ::= number integer | integer
 * number         ::= [0-9] 
 * 
 * @author SGINER
 *
 */
public class RealExpressionElement implements ExpressionElement {

	public RealExpressionElement() {
		super();
	}

	/* (non-Javadoc)
	 * @see fr.expression4j.basic.ExpressionElement#parseElement(java.lang.String, fr.expression4j.basic.ParseInfo)
	 */
	public boolean parseElement(String expression, ExpressionModel expressionModel,
			ParseInfo parseInfo, Catalog catalog, List functionParameters, int priorityOperatorLevel) throws ParsingException {
		int startPos = parseInfo.getEndPos();
		int currentPos = parseInfo.getEndPos();

		ParseInfo tmpParseInfo = new ParseInfo();
		tmpParseInfo.setEndPos(currentPos);
		
		ExpressionElement realSimple = new RealSimpleExpressionElement();
		ExpressionElement signedInteger = new SignedIntegerExpressionElement();
		
		
		if (realSimple.parseElement(expression,expressionModel,tmpParseInfo,catalog, functionParameters, 0)) {
			int storedEndPos = tmpParseInfo.getEndPos();
			
			if (ExpressionElementUtil.checkPosition(expression,storedEndPos) &&
				expression.charAt(storedEndPos) == 'e') {
				
				tmpParseInfo.setEndPos(storedEndPos + 1);
				
				if (signedInteger.parseElement(expression,expressionModel,tmpParseInfo,catalog, functionParameters, 0)) {
					//found signed integer after the "e"
					storedEndPos = tmpParseInfo.getEndPos();
					String realString = expression.substring(startPos,storedEndPos);
					MathematicalElement realValue = NumberFactory.createReal(new BigDecimal(realString));
					parseInfo.setEndPos(storedEndPos);
					TreeElement tmpTreeElement = new TreeElement(TreeElement.TREE_ELEMENT_TYPE_VALUE,null,null,realValue,getName(),null,null);
					parseInfo.setTreeElement(tmpTreeElement);
					return true;
				}
				else {
					//found "e" but not the signed integer !!
					// not e real
					parseInfo.setEndPos(storedEndPos + 1);
					return false;
				}
			}
			else {
				//"e" not found
				//return the simple real
				String realString = expression.substring(startPos,storedEndPos);
				MathematicalElement realValue = NumberFactory.createReal(new BigDecimal(realString));
				parseInfo.setEndPos(storedEndPos);
				TreeElement tmpTreeElement = new TreeElement(TreeElement.TREE_ELEMENT_TYPE_VALUE,null,null,realValue,getName(),null,null);
				parseInfo.setTreeElement(tmpTreeElement);
				return true;
			}
		}
		
		//real not found
		return false;
	}

	public String getName() {
		return "RealExpressionElement";
	}

	public MathematicalElement evaluate(TreeElement element, Catalog catalog, OperatorManager operatorManager, Parameters parameters, ExpressionModel model) throws EvalException {
		throw new EvalException("Cannot evaluate " + getName());
	}

	public String toString(TreeElement element, ExpressionModel expressionModel) {
		return "<" + getName() + ">";
	}

}
