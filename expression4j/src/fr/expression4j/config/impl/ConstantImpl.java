/*
 * XML Type:  constant
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.Constant
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config.impl;
/**
 * An XML constant(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public class ConstantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.Constant
{
    
    public ConstantImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTANTNAME$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "constant-name");
    private static final javax.xml.namespace.QName CONSTANTPROPERTY$2 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "constant-property");
    
    
    /**
     * Gets the "constant-name" element
     */
    public java.lang.String getConstantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTANTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "constant-name" element
     */
    public org.apache.xmlbeans.XmlString xgetConstantName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTANTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "constant-name" element
     */
    public void setConstantName(java.lang.String constantName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSTANTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSTANTNAME$0);
            }
            target.setStringValue(constantName);
        }
    }
    
    /**
     * Sets (as xml) the "constant-name" element
     */
    public void xsetConstantName(org.apache.xmlbeans.XmlString constantName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSTANTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSTANTNAME$0);
            }
            target.set(constantName);
        }
    }
    
    /**
     * Gets array of all "constant-property" elements
     */
    public fr.expression4j.config.Constant.ConstantProperty[] getConstantPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONSTANTPROPERTY$2, targetList);
            fr.expression4j.config.Constant.ConstantProperty[] result = new fr.expression4j.config.Constant.ConstantProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "constant-property" element
     */
    public fr.expression4j.config.Constant.ConstantProperty getConstantPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.Constant.ConstantProperty target = null;
            target = (fr.expression4j.config.Constant.ConstantProperty)get_store().find_element_user(CONSTANTPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "constant-property" element
     */
    public int sizeOfConstantPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTANTPROPERTY$2);
        }
    }
    
    /**
     * Sets array of all "constant-property" element
     */
    public void setConstantPropertyArray(fr.expression4j.config.Constant.ConstantProperty[] constantPropertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(constantPropertyArray, CONSTANTPROPERTY$2);
        }
    }
    
    /**
     * Sets ith "constant-property" element
     */
    public void setConstantPropertyArray(int i, fr.expression4j.config.Constant.ConstantProperty constantProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.Constant.ConstantProperty target = null;
            target = (fr.expression4j.config.Constant.ConstantProperty)get_store().find_element_user(CONSTANTPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(constantProperty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "constant-property" element
     */
    public fr.expression4j.config.Constant.ConstantProperty insertNewConstantProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.Constant.ConstantProperty target = null;
            target = (fr.expression4j.config.Constant.ConstantProperty)get_store().insert_element_user(CONSTANTPROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "constant-property" element
     */
    public fr.expression4j.config.Constant.ConstantProperty addNewConstantProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.Constant.ConstantProperty target = null;
            target = (fr.expression4j.config.Constant.ConstantProperty)get_store().add_element_user(CONSTANTPROPERTY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "constant-property" element
     */
    public void removeConstantProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTANTPROPERTY$2, i);
        }
    }
    /**
     * An XML constant-property(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public static class ConstantPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.Constant.ConstantProperty
    {
        
        public ConstantPropertyImpl(org.apache.xmlbeans.SchemaType sType)
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
