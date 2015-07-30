/*
 * An XML document type.
 * Localname: operator-manager
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.OperatorManagerDocument
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config.impl;
/**
 * A document containing one operator-manager(@http://expression4j.fr/config) element.
 *
 * This is a complex type.
 */
public class OperatorManagerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.OperatorManagerDocument
{
    
    public OperatorManagerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATORMANAGER$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "operator-manager");
    
    
    /**
     * Gets the "operator-manager" element
     */
    public fr.expression4j.config.OperatorManagerDocument.OperatorManager getOperatorManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.OperatorManagerDocument.OperatorManager target = null;
            target = (fr.expression4j.config.OperatorManagerDocument.OperatorManager)get_store().find_element_user(OPERATORMANAGER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operator-manager" element
     */
    public void setOperatorManager(fr.expression4j.config.OperatorManagerDocument.OperatorManager operatorManager)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.OperatorManagerDocument.OperatorManager target = null;
            target = (fr.expression4j.config.OperatorManagerDocument.OperatorManager)get_store().find_element_user(OPERATORMANAGER$0, 0);
            if (target == null)
            {
                target = (fr.expression4j.config.OperatorManagerDocument.OperatorManager)get_store().add_element_user(OPERATORMANAGER$0);
            }
            target.set(operatorManager);
        }
    }
    
    /**
     * Appends and returns a new empty "operator-manager" element
     */
    public fr.expression4j.config.OperatorManagerDocument.OperatorManager addNewOperatorManager()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.OperatorManagerDocument.OperatorManager target = null;
            target = (fr.expression4j.config.OperatorManagerDocument.OperatorManager)get_store().add_element_user(OPERATORMANAGER$0);
            return target;
        }
    }
    /**
     * An XML operator-manager(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public static class OperatorManagerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.OperatorManagerDocument.OperatorManager
    {
        
        public OperatorManagerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPERATORIMPLCLASS$0 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "operator-impl-class");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets array of all "operator-impl-class" elements
         */
        public java.lang.String[] getOperatorImplClassArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OPERATORIMPLCLASS$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "operator-impl-class" element
         */
        public java.lang.String getOperatorImplClassArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORIMPLCLASS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "operator-impl-class" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetOperatorImplClassArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OPERATORIMPLCLASS$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "operator-impl-class" element
         */
        public org.apache.xmlbeans.XmlString xgetOperatorImplClassArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATORIMPLCLASS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "operator-impl-class" element
         */
        public int sizeOfOperatorImplClassArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPERATORIMPLCLASS$0);
            }
        }
        
        /**
         * Sets array of all "operator-impl-class" element
         */
        public void setOperatorImplClassArray(java.lang.String[] operatorImplClassArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(operatorImplClassArray, OPERATORIMPLCLASS$0);
            }
        }
        
        /**
         * Sets ith "operator-impl-class" element
         */
        public void setOperatorImplClassArray(int i, java.lang.String operatorImplClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATORIMPLCLASS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(operatorImplClass);
            }
        }
        
        /**
         * Sets (as xml) array of all "operator-impl-class" element
         */
        public void xsetOperatorImplClassArray(org.apache.xmlbeans.XmlString[]operatorImplClassArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(operatorImplClassArray, OPERATORIMPLCLASS$0);
            }
        }
        
        /**
         * Sets (as xml) ith "operator-impl-class" element
         */
        public void xsetOperatorImplClassArray(int i, org.apache.xmlbeans.XmlString operatorImplClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATORIMPLCLASS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(operatorImplClass);
            }
        }
        
        /**
         * Inserts the value as the ith "operator-impl-class" element
         */
        public void insertOperatorImplClass(int i, java.lang.String operatorImplClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OPERATORIMPLCLASS$0, i);
                target.setStringValue(operatorImplClass);
            }
        }
        
        /**
         * Appends the value as the last "operator-impl-class" element
         */
        public void addOperatorImplClass(java.lang.String operatorImplClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATORIMPLCLASS$0);
                target.setStringValue(operatorImplClass);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "operator-impl-class" element
         */
        public org.apache.xmlbeans.XmlString insertNewOperatorImplClass(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OPERATORIMPLCLASS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "operator-impl-class" element
         */
        public org.apache.xmlbeans.XmlString addNewOperatorImplClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATORIMPLCLASS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "operator-impl-class" element
         */
        public void removeOperatorImplClass(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPERATORIMPLCLASS$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
    }
}
