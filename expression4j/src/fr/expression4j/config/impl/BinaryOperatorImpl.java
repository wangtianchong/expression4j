/*
 * XML Type:  binary-operator
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.BinaryOperator
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config.impl;
/**
 * An XML binary-operator(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public class BinaryOperatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.BinaryOperator
{
    
    public BinaryOperatorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATORCLASSNAME$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "operator-class-name");
    private static final javax.xml.namespace.QName PRIORITY$2 = 
        new javax.xml.namespace.QName("", "priority");
    
    
    /**
     * Gets array of all "operator-class-name" elements
     */
    public java.lang.String[] getOperatorClassNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATORCLASSNAME$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "operator-class-name" element
     */
    public java.lang.String getOperatorClassNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORCLASSNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "operator-class-name" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetOperatorClassNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATORCLASSNAME$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "operator-class-name" element
     */
    public org.apache.xmlbeans.XmlString xgetOperatorClassNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATORCLASSNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "operator-class-name" element
     */
    public int sizeOfOperatorClassNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATORCLASSNAME$0);
        }
    }
    
    /**
     * Sets array of all "operator-class-name" element
     */
    public void setOperatorClassNameArray(java.lang.String[] operatorClassNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operatorClassNameArray, OPERATORCLASSNAME$0);
        }
    }
    
    /**
     * Sets ith "operator-class-name" element
     */
    public void setOperatorClassNameArray(int i, java.lang.String operatorClassName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORCLASSNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(operatorClassName);
        }
    }
    
    /**
     * Sets (as xml) array of all "operator-class-name" element
     */
    public void xsetOperatorClassNameArray(org.apache.xmlbeans.XmlString[]operatorClassNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operatorClassNameArray, OPERATORCLASSNAME$0);
        }
    }
    
    /**
     * Sets (as xml) ith "operator-class-name" element
     */
    public void xsetOperatorClassNameArray(int i, org.apache.xmlbeans.XmlString operatorClassName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATORCLASSNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operatorClassName);
        }
    }
    
    /**
     * Inserts the value as the ith "operator-class-name" element
     */
    public void insertOperatorClassName(int i, java.lang.String operatorClassName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OPERATORCLASSNAME$0, i);
            target.setStringValue(operatorClassName);
        }
    }
    
    /**
     * Appends the value as the last "operator-class-name" element
     */
    public void addOperatorClassName(java.lang.String operatorClassName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATORCLASSNAME$0);
            target.setStringValue(operatorClassName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operator-class-name" element
     */
    public org.apache.xmlbeans.XmlString insertNewOperatorClassName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OPERATORCLASSNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operator-class-name" element
     */
    public org.apache.xmlbeans.XmlString addNewOperatorClassName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATORCLASSNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "operator-class-name" element
     */
    public void removeOperatorClassName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATORCLASSNAME$0, i);
        }
    }
    
    /**
     * Gets the "priority" attribute
     */
    public int getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "priority" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRIORITY$2);
            return target;
        }
    }
    
    /**
     * Sets the "priority" attribute
     */
    public void setPriority(int priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIORITY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIORITY$2);
            }
            target.setIntValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "priority" attribute
     */
    public void xsetPriority(org.apache.xmlbeans.XmlInt priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(PRIORITY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(PRIORITY$2);
            }
            target.set(priority);
        }
    }
}
