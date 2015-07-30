/*
 * XML Type:  operator-managers
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.OperatorManagers
 *
 * Automatically generated - do not modify.
 */
package com.rongdu.expression4j.config.impl;
/**
 * An XML operator-managers(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public class OperatorManagersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rongdu.expression4j.config.OperatorManagers
{
    
    public OperatorManagersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATORMANAGER$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "operator-manager");
    
    
    /**
     * Gets array of all "operator-manager" elements
     */
    public com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager[] getOperatorManagerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATORMANAGER$0, targetList);
            com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager[] result = new com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operator-manager" element
     */
    public com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager getOperatorManagerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager target = null;
            target = (com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager)get_store().find_element_user(OPERATORMANAGER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "operator-manager" element
     */
    public int sizeOfOperatorManagerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATORMANAGER$0);
        }
    }
    
    /**
     * Sets array of all "operator-manager" element
     */
    public void setOperatorManagerArray(com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager[] operatorManagerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operatorManagerArray, OPERATORMANAGER$0);
        }
    }
    
    /**
     * Sets ith "operator-manager" element
     */
    public void setOperatorManagerArray(int i, com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager operatorManager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager target = null;
            target = (com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager)get_store().find_element_user(OPERATORMANAGER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operatorManager);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operator-manager" element
     */
    public com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager insertNewOperatorManager(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager target = null;
            target = (com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager)get_store().insert_element_user(OPERATORMANAGER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operator-manager" element
     */
    public com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager addNewOperatorManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager target = null;
            target = (com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager)get_store().add_element_user(OPERATORMANAGER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "operator-manager" element
     */
    public void removeOperatorManager(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATORMANAGER$0, i);
        }
    }
}
