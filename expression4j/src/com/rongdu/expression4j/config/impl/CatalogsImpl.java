/*
 * XML Type:  catalogs
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.Catalogs
 *
 * Automatically generated - do not modify.
 */
package com.rongdu.expression4j.config.impl;
/**
 * An XML catalogs(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public class CatalogsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.rongdu.expression4j.config.Catalogs
{
    
    public CatalogsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOG$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "catalog");
    
    
    /**
     * Gets array of all "catalog" elements
     */
    public com.rongdu.expression4j.config.CatalogDocument.Catalog[] getCatalogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATALOG$0, targetList);
            com.rongdu.expression4j.config.CatalogDocument.Catalog[] result = new com.rongdu.expression4j.config.CatalogDocument.Catalog[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "catalog" element
     */
    public com.rongdu.expression4j.config.CatalogDocument.Catalog getCatalogArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.CatalogDocument.Catalog target = null;
            target = (com.rongdu.expression4j.config.CatalogDocument.Catalog)get_store().find_element_user(CATALOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "catalog" element
     */
    public int sizeOfCatalogArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATALOG$0);
        }
    }
    
    /**
     * Sets array of all "catalog" element
     */
    public void setCatalogArray(com.rongdu.expression4j.config.CatalogDocument.Catalog[] catalogArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(catalogArray, CATALOG$0);
        }
    }
    
    /**
     * Sets ith "catalog" element
     */
    public void setCatalogArray(int i, com.rongdu.expression4j.config.CatalogDocument.Catalog catalog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.CatalogDocument.Catalog target = null;
            target = (com.rongdu.expression4j.config.CatalogDocument.Catalog)get_store().find_element_user(CATALOG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(catalog);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catalog" element
     */
    public com.rongdu.expression4j.config.CatalogDocument.Catalog insertNewCatalog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.rongdu.expression4j.config.CatalogDocument.Catalog target = null;
            target = (com.rongdu.expression4j.config.CatalogDocument.Catalog)get_store().insert_element_user(CATALOG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catalog" element
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
     * Removes the ith "catalog" element
     */
    public void removeCatalog(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATALOG$0, i);
        }
    }
}
