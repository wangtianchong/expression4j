/*
 * XML Type:  expression-element
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.ExpressionElement
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config.impl;
/**
 * An XML expression-element(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public class ExpressionElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.ExpressionElement
{
    
    public ExpressionElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPRESSIONELEMENTCLASSNAME$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "expression-element-class-name");
    private static final javax.xml.namespace.QName EVALUATIONORDER$2 = 
        new javax.xml.namespace.QName("", "evaluation-order");
    
    
    /**
     * Gets the "expression-element-class-name" element
     */
    public java.lang.String getExpressionElementClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONELEMENTCLASSNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expression-element-class-name" element
     */
    public org.apache.xmlbeans.XmlString xgetExpressionElementClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONELEMENTCLASSNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expression-element-class-name" element
     */
    public void setExpressionElementClassName(java.lang.String expressionElementClassName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONELEMENTCLASSNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPRESSIONELEMENTCLASSNAME$0);
            }
            target.setStringValue(expressionElementClassName);
        }
    }
    
    /**
     * Sets (as xml) the "expression-element-class-name" element
     */
    public void xsetExpressionElementClassName(org.apache.xmlbeans.XmlString expressionElementClassName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONELEMENTCLASSNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPRESSIONELEMENTCLASSNAME$0);
            }
            target.set(expressionElementClassName);
        }
    }
    
    /**
     * Gets the "evaluation-order" attribute
     */
    public int getEvaluationOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVALUATIONORDER$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "evaluation-order" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetEvaluationOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(EVALUATIONORDER$2);
            return target;
        }
    }
    
    /**
     * Sets the "evaluation-order" attribute
     */
    public void setEvaluationOrder(int evaluationOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVALUATIONORDER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVALUATIONORDER$2);
            }
            target.setIntValue(evaluationOrder);
        }
    }
    
    /**
     * Sets (as xml) the "evaluation-order" attribute
     */
    public void xsetEvaluationOrder(org.apache.xmlbeans.XmlInt evaluationOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(EVALUATIONORDER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(EVALUATIONORDER$2);
            }
            target.set(evaluationOrder);
        }
    }
}
