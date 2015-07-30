/*
 * XML Type:  expression
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.Expression
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config.impl;
/**
 * An XML expression(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public class ExpressionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.Expression
{
    
    public ExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPRESSIONNAME$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "expression-name");
    private static final javax.xml.namespace.QName EXPRESSIONVALUE$2 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "expression-value");
    private static final javax.xml.namespace.QName EXPRESSIONMODEL$4 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "expression-model");
    private static final javax.xml.namespace.QName EXPRESSIONCLASS$6 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "expression-class");
    private static final javax.xml.namespace.QName PROPERTY$8 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "property");
    
    
    /**
     * Gets the "expression-name" element
     */
    public java.lang.String getExpressionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expression-name" element
     */
    public org.apache.xmlbeans.XmlString xgetExpressionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expression-name" element
     */
    public void setExpressionName(java.lang.String expressionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPRESSIONNAME$0);
            }
            target.setStringValue(expressionName);
        }
    }
    
    /**
     * Sets (as xml) the "expression-name" element
     */
    public void xsetExpressionName(org.apache.xmlbeans.XmlString expressionName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPRESSIONNAME$0);
            }
            target.set(expressionName);
        }
    }
    
    /**
     * Gets the "expression-value" element
     */
    public java.lang.String getExpressionValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expression-value" element
     */
    public org.apache.xmlbeans.XmlString xgetExpressionValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expression-value" element
     */
    public void setExpressionValue(java.lang.String expressionValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPRESSIONVALUE$2);
            }
            target.setStringValue(expressionValue);
        }
    }
    
    /**
     * Sets (as xml) the "expression-value" element
     */
    public void xsetExpressionValue(org.apache.xmlbeans.XmlString expressionValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPRESSIONVALUE$2);
            }
            target.set(expressionValue);
        }
    }
    
    /**
     * Gets the "expression-model" element
     */
    public java.lang.String getExpressionModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONMODEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expression-model" element
     */
    public org.apache.xmlbeans.XmlString xgetExpressionModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONMODEL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expression-model" element
     */
    public void setExpressionModel(java.lang.String expressionModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONMODEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPRESSIONMODEL$4);
            }
            target.setStringValue(expressionModel);
        }
    }
    
    /**
     * Sets (as xml) the "expression-model" element
     */
    public void xsetExpressionModel(org.apache.xmlbeans.XmlString expressionModel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONMODEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPRESSIONMODEL$4);
            }
            target.set(expressionModel);
        }
    }
    
    /**
     * Gets the "expression-class" element
     */
    public java.lang.String getExpressionClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONCLASS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expression-class" element
     */
    public org.apache.xmlbeans.XmlString xgetExpressionClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONCLASS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expression-class" element
     */
    public void setExpressionClass(java.lang.String expressionClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPRESSIONCLASS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPRESSIONCLASS$6);
            }
            target.setStringValue(expressionClass);
        }
    }
    
    /**
     * Sets (as xml) the "expression-class" element
     */
    public void xsetExpressionClass(org.apache.xmlbeans.XmlString expressionClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPRESSIONCLASS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPRESSIONCLASS$6);
            }
            target.set(expressionClass);
        }
    }
    
    /**
     * Gets array of all "property" elements
     */
    public fr.expression4j.config.Expression.Property[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$8, targetList);
            fr.expression4j.config.Expression.Property[] result = new fr.expression4j.config.Expression.Property[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public fr.expression4j.config.Expression.Property getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.Expression.Property target = null;
            target = (fr.expression4j.config.Expression.Property)get_store().find_element_user(PROPERTY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$8);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(fr.expression4j.config.Expression.Property[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$8);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, fr.expression4j.config.Expression.Property property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.Expression.Property target = null;
            target = (fr.expression4j.config.Expression.Property)get_store().find_element_user(PROPERTY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public fr.expression4j.config.Expression.Property insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.Expression.Property target = null;
            target = (fr.expression4j.config.Expression.Property)get_store().insert_element_user(PROPERTY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public fr.expression4j.config.Expression.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.Expression.Property target = null;
            target = (fr.expression4j.config.Expression.Property)get_store().add_element_user(PROPERTY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$8, i);
        }
    }
    /**
     * An XML property(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.Expression.Property
    {
        
        public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "value");
        
        
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
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
                }
                target.set(value);
            }
        }
    }
}
