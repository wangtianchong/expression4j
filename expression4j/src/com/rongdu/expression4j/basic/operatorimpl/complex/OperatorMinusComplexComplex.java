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

public class OperatorMinusComplexComplex implements OperatorImpl {

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
		return Operator.OPERATOR_MINUS;
	}

	public MathematicalElement compute(MathContext mc,MathematicalElement leftElement,
			MathematicalElement rightElement) throws EvalException {
	    if(mc==null){
            mc=MathUtil.getDefaultMathContext();
        }
		try {
			if (leftElement.getType() != 2 || rightElement.getType() != 2) {
				throw new EvalException("Incosistent element type for operator minus complex complex.");
			}
			
			BigDecimal  realValue = leftElement.getRealValue(mc).subtract(rightElement.getRealValue(mc), mc) ;
			BigDecimal complexValue = leftElement.getComplexValue(mc) .subtract(rightElement.getComplexValue(mc),mc);
			return new ComplexImpl(realValue,complexValue);
		}
		catch (MathematicalException me) {
			throw new EvalException("Cannot evaluate value for minux complex complex.",me);
		}
	}

}
