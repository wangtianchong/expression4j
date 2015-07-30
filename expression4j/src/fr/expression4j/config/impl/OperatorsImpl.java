/*
 * XML Type:  operators
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.Operators
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config.impl;
/**
 * An XML operators(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public class OperatorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.Operators
{
    
    public OperatorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATOR$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "operator");
    
    
    /**
     * Gets array of all "operator" elements
     */
    public fr.expression4j.config.OperatorDocument.Operator[] getOperatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATOR$0, targetList);
            fr.expression4j.config.OperatorDocument.Operator[] result = new fr.expression4j.config.OperatorDocument.Operator[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operator" element
     */
    public fr.expression4j.config.OperatorDocument.Operator getOperatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.OperatorDocument.Operator target = null;
            target = (fr.expression4j.config.OperatorDocument.Operator)get_store().find_element_user(OPERATOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "operator" element
     */
    public int sizeOfOperatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATOR$0);
        }
    }
    
    /**
     * Sets array of all "operator" element
     */
    public void setOperatorArray(fr.expression4j.config.OperatorDocument.Operator[] operatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operatorArray, OPERATOR$0);
        }
    }
    
    /**
     * Sets ith "operator" element
     */
    public void setOperatorArray(int i, fr.expression4j.config.OperatorDocument.Operator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.OperatorDocument.Operator target = null;
            target = (fr.expression4j.config.OperatorDocument.Operator)get_store().find_element_user(OPERATOR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operator);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operator" element
     */
    public fr.expression4j.config.OperatorDocument.Operator insertNewOperator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.OperatorDocument.Operator target = null;
            target = (fr.expression4j.config.OperatorDocument.Operator)get_store().insert_element_user(OPERATOR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operator" element
     */
    public fr.expression4j.config.OperatorDocument.Operator addNewOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.OperatorDocument.Operator target = null;
            target = (fr.expression4j.config.OperatorDocument.Operator)get_store().add_element_user(OPERATOR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "operator" element
     */
    public void removeOperator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATOR$0, i);
        }
    }
}
