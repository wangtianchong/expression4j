/*
 * An XML document type.
 * Localname: catalog
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.CatalogDocument
 *
 * Automatically generated - do not modify.
 */
package com.rongdu.expression4j.config.impl;
/**
 * A document containing one catalog(@http://expression4j.fr/config) element.
 *
 * This is a complex type.
 */
public class CatalogDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rongdu.expression4j.config.CatalogDocument
{
    
    public CatalogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOG$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "catalog");
    
    
    /**
     * Gets the "catalog" element
     */
    public com.rongdu.expression4j.config.CatalogDocument.Catalog getCatalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.CatalogDocument.Catalog target = null;
            target = (com.rongdu.expression4j.config.CatalogDocument.Catalog)get_store().find_element_user(CATALOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "catalog" element
     */
    public void setCatalog(com.rongdu.expression4j.config.CatalogDocument.Catalog catalog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.CatalogDocument.Catalog target = null;
            target = (com.rongdu.expression4j.config.CatalogDocument.Catalog)get_store().find_element_user(CATALOG$0, 0);
            if (target == null)
            {
                target = (com.rongdu.expression4j.config.CatalogDocument.Catalog)get_store().add_element_user(CATALOG$0);
            }
            target.set(catalog);
        }
    }
    
    /**
     * Appends and returns a new empty "catalog" element
     */
    public com.rongdu.expression4j.config.CatalogDocument.Catalog addNewCatalog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.CatalogDocument.Catalog target = null;
            target = (com.rongdu.expression4j.config.CatalogDocument.Catalog)get_store().add_element_user(CATALOG$0);
            return target;
        }
    }
    /**
     * An XML catalog(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public static class CatalogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rongdu.expression4j.config.CatalogDocument.Catalog
    {
        
        public CatalogImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXPRESSION$0 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "expression");
        private static final javax.xml.namespace.QName CONSTANT$2 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "constant");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets array of all "expression" elements
         */
        public com.rongdu.expression4j.config.Expression[] getExpressionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXPRESSION$0, targetList);
                com.rongdu.expression4j.config.Expression[] result = new com.rongdu.expression4j.config.Expression[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "expression" element
         */
        public com.rongdu.expression4j.config.Expression getExpressionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.rongdu.expression4j.config.Expression target = null;
                target = (com.rongdu.expression4j.config.Expression)get_store().find_element_user(EXPRESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "expression" element
         */
        public int sizeOfExpressionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPRESSION$0);
            }
        }
        
        /**
         * Sets array of all "expression" element
         */
        public void setExpressionArray(com.rongdu.expression4j.config.Expression[] expressionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(expressionArray, EXPRESSION$0);
            }
        }
        
        /**
         * Sets ith "expression" element
         */
        public void setExpressionArray(int i, com.rongdu.expression4j.config.Expression expression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.rongdu.expression4j.config.Expression target = null;
                target = (com.rongdu.expression4j.config.Expression)get_store().find_element_user(EXPRESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(expression);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "expression" element
         */
        public com.rongdu.expression4j.config.Expression insertNewExpression(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.rongdu.expression4j.config.Expression target = null;
                target = (com.rongdu.expression4j.config.Expression)get_store().insert_element_user(EXPRESSION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "expression" element
         */
        public com.rongdu.expression4j.config.Expression addNewExpression()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.rongdu.expression4j.config.Expression target = null;
                target = (com.rongdu.expression4j.config.Expression)get_store().add_element_user(EXPRESSION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "expression" element
         */
        public void removeExpression(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPRESSION$0, i);
            }
        }
        
        /**
         * Gets array of all "constant" elements
         */
        public com.rongdu.expression4j.config.Constant[] getConstantArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONSTANT$2, targetList);
                com.rongdu.expression4j.config.Constant[] result = new com.rongdu.expression4j.config.Constant[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "constant" element
         */
        public com.rongdu.expression4j.config.Constant getConstantArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.rongdu.expression4j.config.Constant target = null;
                target = (com.rongdu.expression4j.config.Constant)get_store().find_element_user(CONSTANT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "constant" element
         */
        public int sizeOfConstantArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONSTANT$2);
            }
        }
        
        /**
         * Sets array of all "constant" element
         */
        public void setConstantArray(com.rongdu.expression4j.config.Constant[] constantArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(constantArray, CONSTANT$2);
            }
        }
        
        /**
         * Sets ith "constant" element
         */
        public void setConstantArray(int i, com.rongdu.expression4j.config.Constant constant)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.rongdu.expression4j.config.Constant target = null;
                target = (com.rongdu.expression4j.config.Constant)get_store().find_element_user(CONSTANT$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(constant);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "constant" element
         */
        public com.rongdu.expression4j.config.Constant insertNewConstant(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.rongdu.expression4j.config.Constant target = null;
                target = (com.rongdu.expression4j.config.Constant)get_store().insert_element_user(CONSTANT$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "constant" element
         */
        public com.rongdu.expression4j.config.Constant addNewConstant()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.rongdu.expression4j.config.Constant target = null;
                target = (com.rongdu.expression4j.config.Constant)get_store().add_element_user(CONSTANT$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "constant" element
         */
        public void removeConstant(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONSTANT$2, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
    }
}
