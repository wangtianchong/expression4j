package fr.expression4j.util;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathUtil {
    public static MathContext getDefaultMathContext(){
        MathContext mc=new MathContext(64,RoundingMode.HALF_UP);
        return mc;
    }
    public static BigDecimal getZero(){
        return new BigDecimal(0);
    }
}
