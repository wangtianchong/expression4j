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

package com.rongdu.expression4j.basic.operatorimpl.complex;

import java.math.BigDecimal;
import java.math.MathContext;

import com.rongdu.expression4j.basic.MathematicalElement;
import com.rongdu.expression4j.basic.MathematicalException;
import com.rongdu.expression4j.basic.Operator;
import com.rongdu.expression4j.basic.OperatorImpl;
import com.rongdu.expression4j.basic.impl.ComplexImpl;
import com.rongdu.expression4j.core.exception.EvalException;
import com.rongdu.expression4j.util.MathUtil;

public class OperatorMultiplyComplexComplex implements OperatorImpl {

	public boolean isUnaryOperator() {
		return false;
	}

	public int getLeftOperandeType() {
		return 2;
	}

	public int getRightOperandeType() {
		return 2;
	}

	public String getOperatorName() {
		return Operator.OPERATOR_MULTIPLY;
	}

	public MathematicalElement compute(MathContext mc,MathematicalElement leftElement,
			MathematicalElement rightElement) throws EvalException {
	    if(mc==null){
            mc=MathUtil.getDefaultMathContext();
        }
		try {
			if (leftElement.getType() != 2 || rightElement.getType() != 2) {
				throw new EvalException("Incosistent element type for operator multiply complex complex.");
			}
	
			BigDecimal a = leftElement.getRealValue(mc);
			BigDecimal b = leftElement.getComplexValue(mc);
			BigDecimal c = rightElement.getRealValue(mc);
			BigDecimal d = rightElement.getComplexValue(mc);
			//a*c-b*d
			BigDecimal realValue = a.multiply(c, mc).subtract(b.multiply(d, mc), mc);
			//a*d+b*c
			BigDecimal complexValue = a.multiply(d, mc).add(b.multiply(c, mc), mc);
			
			return new ComplexImpl(realValue,complexValue);
		}
		catch (MathematicalException me) {
			throw new EvalException("Cannot evaluate value for multiply complex complex.",me);
		}
	}

}
