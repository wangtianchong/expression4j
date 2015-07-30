/*
 * An XML document type.
 * Localname: configuration
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.ConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config.impl;
/**
 * A document containing one configuration(@http://expression4j.fr/config) element.
 *
 * This is a complex type.
 */
public class ConfigurationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.ConfigurationDocument
{
    
    public ConfigurationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIGURATION$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "configuration");
    
    
    /**
     * Gets the "configuration" element
     */
    public fr.expression4j.config.ConfigurationDocument.Configuration getConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ConfigurationDocument.Configuration target = null;
            target = (fr.expression4j.config.ConfigurationDocument.Configuration)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "configuration" element
     */
    public void setConfiguration(fr.expression4j.config.ConfigurationDocument.Configuration configuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ConfigurationDocument.Configuration target = null;
            target = (fr.expression4j.config.ConfigurationDocument.Configuration)get_store().find_element_user(CONFIGURATION$0, 0);
            if (target == null)
            {
                target = (fr.expression4j.config.ConfigurationDocument.Configuration)get_store().add_element_user(CONFIGURATION$0);
            }
            target.set(configuration);
        }
    }
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    public fr.expression4j.config.ConfigurationDocument.Configuration addNewConfiguration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ConfigurationDocument.Configuration target = null;
            target = (fr.expression4j.config.ConfigurationDocument.Configuration)get_store().add_element_user(CONFIGURATION$0);
            return target;
        }
    }
    /**
     * An XML configuration(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public static class ConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.ConfigurationDocument.Configuration
    {
        
        public ConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPERATORS$0 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "operators");
        private static final javax.xml.namespace.QName OPERATORMANAGERS$2 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "operator-managers");
        private static final javax.xml.namespace.QName MODELS$4 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "models");
        private static final javax.xml.namespace.QName CATALOGS$6 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "catalogs");
        
        
        /**
         * Gets the "operators" element
         */
        public fr.expression4j.config.Operators getOperators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.Operators target = null;
                target = (fr.expression4j.config.Operators)get_store().find_element_user(OPERATORS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "operators" element
         */
        public void setOperators(fr.expression4j.config.Operators operators)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.Operators target = null;
                target = (fr.expression4j.config.Operators)get_store().find_element_user(OPERATORS$0, 0);
                if (target == null)
                {
                    target = (fr.expression4j.config.Operators)get_store().add_element_user(OPERATORS$0);
                }
                target.set(operators);
            }
        }
        
        /**
         * Appends and returns a new empty "operators" element
         */
        public fr.expression4j.config.Operators addNewOperators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.Operators target = null;
                target = (fr.expression4j.config.Operators)get_store().add_element_user(OPERATORS$0);
                return target;
            }
        }
        
        /**
         * Gets the "operator-managers" element
         */
        public fr.expression4j.config.OperatorManagers getOperatorManagers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.OperatorManagers target = null;
                target = (fr.expression4j.config.OperatorManagers)get_store().find_element_user(OPERATORMANAGERS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "operator-managers" element
         */
        public void setOperatorManagers(fr.expression4j.config.OperatorManagers operatorManagers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.OperatorManagers target = null;
                target = (fr.expression4j.config.OperatorManagers)get_store().find_element_user(OPERATORMANAGERS$2, 0);
                if (target == null)
                {
                    target = (fr.expression4j.config.OperatorManagers)get_store().add_element_user(OPERATORMANAGERS$2);
                }
                target.set(operatorManagers);
            }
        }
        
        /**
         * Appends and returns a new empty "operator-managers" element
         */
        public fr.expression4j.config.OperatorManagers addNewOperatorManagers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.OperatorManagers target = null;
                target = (fr.expression4j.config.OperatorManagers)get_store().add_element_user(OPERATORMANAGERS$2);
                return target;
            }
        }
        
        /**
         * Gets the "models" element
         */
        public fr.expression4j.config.Models getModels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.Models target = null;
                target = (fr.expression4j.config.Models)get_store().find_element_user(MODELS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "models" element
         */
        public void setModels(fr.expression4j.config.Models models)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.Models target = null;
                target = (fr.expression4j.config.Models)get_store().find_element_user(MODELS$4, 0);
                if (target == null)
                {
                    target = (fr.expression4j.config.Models)get_store().add_element_user(MODELS$4);
                }
                target.set(models);
            }
        }
        
        /**
         * Appends and returns a new empty "models" element
         */
        public fr.expression4j.config.Models addNewModels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.Models target = null;
                target = (fr.expression4j.config.Models)get_store().add_element_user(MODELS$4);
                return target;
            }
        }
        
        /**
         * Gets the "catalogs" element
         */
        public fr.expression4j.config.Catalogs getCatalogs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.Catalogs target = null;
                target = (fr.expression4j.config.Catalogs)get_store().find_element_user(CATALOGS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "catalogs" element
         */
        public void setCatalogs(fr.expression4j.config.Catalogs catalogs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.Catalogs target = null;
                target = (fr.expression4j.config.Catalogs)get_store().find_element_user(CATALOGS$6, 0);
                if (target == null)
                {
                    target = (fr.expression4j.config.Catalogs)get_store().add_element_user(CATALOGS$6);
                }
                target.set(catalogs);
            }
        }
        
        /**
         * Appends and returns a new empty "catalogs" element
         */
        public fr.expression4j.config.Catalogs addNewCatalogs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.Catalogs target = null;
                target = (fr.expression4j.config.Catalogs)get_store().add_element_user(CATALOGS$6);
                return target;
            }
        }
    }
}
