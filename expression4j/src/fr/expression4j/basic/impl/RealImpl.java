package fr.expression4j.basic.impl;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Properties;

import fr.expression4j.basic.MathematicalElement;
import fr.expression4j.basic.MathematicalException;
import fr.expression4j.util.MathUtil;

public class RealImpl implements MathematicalElement {

	protected BigDecimal realValue;
	protected Properties properties; 
	
	public RealImpl(BigDecimal value) {
		this.realValue = value;
		properties = new Properties();
		properties.setProperty(MathematicalElement.REAL_VALUE,String.valueOf(value));
	}
	
	public BigDecimal getComplexValue(MathContext mc) throws MathematicalException {
		throw new MathematicalException("Real number has no complex value.");
	}

	public BigDecimal getRealValue(MathContext mc) {
		return realValue;
	}

	public String toString() {
		return "" + realValue;
	}

	public int getType() {
		return 1;
	}
	
	public void setRealValue(BigDecimal value) {
		this.realValue = value;
		properties.setProperty(MathematicalElement.REAL_VALUE,String.valueOf(value));
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
		String stringValue = properties.getProperty(MathematicalElement.REAL_VALUE);
		if (stringValue != null) {
			realValue = new BigDecimal(stringValue);
		}
		else {
			realValue = MathUtil.getZero();
		}
	}

	public Object getValue() {
		return realValue;
	}

	
}
