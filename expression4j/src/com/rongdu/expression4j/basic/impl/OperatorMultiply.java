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

import com.rongdu.expression4j.basic.Operator;

/**
 * @author SGINER
 *
 * @deprecated
 */
public class OperatorMultiply implements Operator {

	public OperatorMultiply() {
		super();
	}

	/* (non-Javadoc)
	 * @see fr.expression4j.basic.Operator#isUnary()
	 */
	public boolean isUnary() {
		return false;
	}

	/* (non-Javadoc)
	 * @see fr.expression4j.basic.Operator#getName()
	 */
	public String getName() {
		return "multiply";
	}

	/* (non-Javadoc)
	 * @see fr.expression4j.basic.Operator#getSymbol()
	 */
	public String getSymbol() {
		return "*";
	}

}
