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

package com.rongdu.expression4j.basic.operatorimpl.realcomplex;

import java.math.BigDecimal;
import java.math.MathContext;

import com.rongdu.expression4j.basic.MathematicalElement;
import com.rongdu.expression4j.basic.MathematicalException;
import com.rongdu.expression4j.basic.Operator;
import com.rongdu.expression4j.basic.OperatorImpl;
import com.rongdu.expression4j.basic.impl.ComplexImpl;
import com.rongdu.expression4j.core.exception.EvalException;
import com.rongdu.expression4j.util.MathUtil;

public class OperatorDivideRealComplex implements OperatorImpl {

	public boolean isUnaryOperator() {
		return false;
	}

	public int getLeftOperandeType() {
		return 1;
	}

	public int getRightOperandeType() {
		return 2;
	}

	public String getOperatorName() {
		return Operator.OPERATOR_DIVIDE;
	}

	public MathematicalElement compute(MathContext mc,MathematicalElement leftElement,
			MathematicalElement rightElement) throws EvalException {
	    if(mc==null){
            mc=MathUtil.getDefaultMathContext();
        }
		try {
			BigDecimal realValue;
			BigDecimal complexValue;

			if (leftElement.getType() == 1 && rightElement.getType() == 2) {
				//a(b+ci) ==> a*(b-ci)/(b+ci)*(b-ci)
			    BigDecimal a = leftElement.getRealValue(mc);
			    BigDecimal b = rightElement.getRealValue(mc);
			    BigDecimal c = rightElement.getComplexValue(mc);
				//realValue = (a*b)/(b*b+c*c);
			    realValue=a.multiply(b, mc).divide(b.pow(2,mc).add(c.pow(2,mc),mc), mc);
				if (c.compareTo(new BigDecimal(0)) > 0) {
					//complexValue = -(a*c)/(b*b+c*c);
				    complexValue=a.multiply(c, mc).divide(b.pow(2,mc).add(c.pow(2,mc),mc), mc).negate();
				}
				else {
					//complexValue = (a*c)/(b*b+c*c);
				    complexValue=a.multiply(c, mc).divide(b.pow(2,mc).add(c.pow(2,mc),mc), mc);
				}
				return new ComplexImpl(realValue,complexValue);
			}
			else if (leftElement.getType() == 2 && rightElement.getType() == 1) {
				realValue = leftElement.getRealValue(mc) .multiply(rightElement.getRealValue(mc), mc) ;
				complexValue = leftElement.getComplexValue(mc).multiply(rightElement.getRealValue(mc),mc);
				return new ComplexImpl(realValue,complexValue);
			}
			else {
				throw new EvalException("Incosistent element type for operator minus real complex.");
			}
			
		}
		catch (MathematicalException me) {
			throw new EvalException("Cannot evaluate value for divide real complex.",me);
		}
	}

}
