/*
 * XML Type:  models
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.Models
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config.impl;
/**
 * An XML models(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public class ModelsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.Models
{
    
    public ModelsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODEL$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "model");
    
    
    /**
     * Gets array of all "model" elements
     */
    public fr.expression4j.config.ModelDocument.Model[] getModelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODEL$0, targetList);
            fr.expression4j.config.ModelDocument.Model[] result = new fr.expression4j.config.ModelDocument.Model[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "model" element
     */
    public fr.expression4j.config.ModelDocument.Model getModelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ModelDocument.Model target = null;
            target = (fr.expression4j.config.ModelDocument.Model)get_store().find_element_user(MODEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "model" element
     */
    public int sizeOfModelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODEL$0);
        }
    }
    
    /**
     * Sets array of all "model" element
     */
    public void setModelArray(fr.expression4j.config.ModelDocument.Model[] modelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(modelArray, MODEL$0);
        }
    }
    
    /**
     * Sets ith "model" element
     */
    public void setModelArray(int i, fr.expression4j.config.ModelDocument.Model model)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ModelDocument.Model target = null;
            target = (fr.expression4j.config.ModelDocument.Model)get_store().find_element_user(MODEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(model);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "model" element
     */
    public fr.expression4j.config.ModelDocument.Model insertNewModel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ModelDocument.Model target = null;
            target = (fr.expression4j.config.ModelDocument.Model)get_store().insert_element_user(MODEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "model" element
     */
    public fr.expression4j.config.ModelDocument.Model addNewModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ModelDocument.Model target = null;
            target = (fr.expression4j.config.ModelDocument.Model)get_store().add_element_user(MODEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "model" element
     */
    public void removeModel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODEL$0, i);
        }
    }
}
