/*
 * An XML document type.
 * Localname: operator
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.OperatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.rongdu.expression4j.config.impl;
/**
 * A document containing one operator(@http://expression4j.fr/config) element.
 *
 * This is a complex type.
 */
public class OperatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rongdu.expression4j.config.OperatorDocument
{
    
    public OperatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATOR$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "operator");
    
    
    /**
     * Gets the "operator" element
     */
    public com.rongdu.expression4j.config.OperatorDocument.Operator getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.OperatorDocument.Operator target = null;
            target = (com.rongdu.expression4j.config.OperatorDocument.Operator)get_store().find_element_user(OPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operator" element
     */
    public void setOperator(com.rongdu.expression4j.config.OperatorDocument.Operator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.OperatorDocument.Operator target = null;
            target = (com.rongdu.expression4j.config.OperatorDocument.Operator)get_store().find_element_user(OPERATOR$0, 0);
            if (target == null)
            {
                target = (com.rongdu.expression4j.config.OperatorDocument.Operator)get_store().add_element_user(OPERATOR$0);
            }
            target.set(operator);
        }
    }
    
    /**
     * Appends and returns a new empty "operator" element
     */
    public com.rongdu.expression4j.config.OperatorDocument.Operator addNewOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.OperatorDocument.Operator target = null;
            target = (com.rongdu.expression4j.config.OperatorDocument.Operator)get_store().add_element_user(OPERATOR$0);
            return target;
        }
    }
    /**
     * An XML operator(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public static class OperatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rongdu.expression4j.config.OperatorDocument.Operator
    {
        
        public OperatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName SYMBOL$2 = 
            new javax.xml.namespace.QName("", "symbol");
        private static final javax.xml.namespace.QName UNARY$4 = 
            new javax.xml.namespace.QName("", "unary");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "symbol" attribute
         */
        public java.lang.String getSymbol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYMBOL$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "symbol" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSymbol()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYMBOL$2);
                return target;
            }
        }
        
        /**
         * Sets the "symbol" attribute
         */
        public void setSymbol(java.lang.String symbol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SYMBOL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SYMBOL$2);
                }
                target.setStringValue(symbol);
            }
        }
        
        /**
         * Sets (as xml) the "symbol" attribute
         */
        public void xsetSymbol(org.apache.xmlbeans.XmlString symbol)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SYMBOL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SYMBOL$2);
                }
                target.set(symbol);
            }
        }
        
        /**
         * Gets the "unary" attribute
         */
        public boolean getUnary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNARY$4);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "unary" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetUnary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNARY$4);
                return target;
            }
        }
        
        /**
         * Sets the "unary" attribute
         */
        public void setUnary(boolean unary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNARY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNARY$4);
                }
                target.setBooleanValue(unary);
            }
        }
        
        /**
         * Sets (as xml) the "unary" attribute
         */
        public void xsetUnary(org.apache.xmlbeans.XmlBoolean unary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNARY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNARY$4);
                }
                target.set(unary);
            }
        }
    }
}
