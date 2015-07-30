/*
 * An XML document type.
 * Localname: catalog
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.CatalogDocument
 *
 * Automatically generated - do not modify.
 */
package com.rongdu.expression4j.config;


/**
 * A document containing one catalog(@http://expression4j.fr/config) element.
 *
 * This is a complex type.
 */
public interface CatalogDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CatalogDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("catalogbd17doctype");
    
    /**
     * Gets the "catalog" element
     */
    com.rongdu.expression4j.config.CatalogDocument.Catalog getCatalog();
    
    /**
     * Sets the "catalog" element
     */
    void setCatalog(com.rongdu.expression4j.config.CatalogDocument.Catalog catalog);
    
    /**
     * Appends and returns a new empty "catalog" element
     */
    com.rongdu.expression4j.config.CatalogDocument.Catalog addNewCatalog();
    
    /**
     * An XML catalog(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public interface Catalog extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Catalog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("catalog109celemtype");
        
        /**
         * Gets array of all "expression" elements
         */
        com.rongdu.expression4j.config.Expression[] getExpressionArray();
        
        /**
         * Gets ith "expression" element
         */
        com.rongdu.expression4j.config.Expression getExpressionArray(int i);
        
        /**
         * Returns number of "expression" element
         */
        int sizeOfExpressionArray();
        
        /**
         * Sets array of all "expression" element
         */
        void setExpressionArray(com.rongdu.expression4j.config.Expression[] expressionArray);
        
        /**
         * Sets ith "expression" element
         */
        void setExpressionArray(int i, com.rongdu.expression4j.config.Expression expression);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "expression" element
         */
        com.rongdu.expression4j.config.Expression insertNewExpression(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "expression" element
         */
        com.rongdu.expression4j.config.Expression addNewExpression();
        
        /**
         * Removes the ith "expression" element
         */
        void removeExpression(int i);
        
        /**
         * Gets array of all "constant" elements
         */
        com.rongdu.expression4j.config.Constant[] getConstantArray();
        
        /**
         * Gets ith "constant" element
         */
        com.rongdu.expression4j.config.Constant getConstantArray(int i);
        
        /**
         * Returns number of "constant" element
         */
        int sizeOfConstantArray();
        
        /**
         * Sets array of all "constant" element
         */
        void setConstantArray(com.rongdu.expression4j.config.Constant[] constantArray);
        
        /**
         * Sets ith "constant" element
         */
        void setConstantArray(int i, com.rongdu.expression4j.config.Constant constant);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "constant" element
         */
        com.rongdu.expression4j.config.Constant insertNewConstant(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "constant" element
         */
        com.rongdu.expression4j.config.Constant addNewConstant();
        
        /**
         * Removes the ith "constant" element
         */
        void removeConstant(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.rongdu.expression4j.config.CatalogDocument.Catalog newInstance() {
              return (com.rongdu.expression4j.config.CatalogDocument.Catalog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.rongdu.expression4j.config.CatalogDocument.Catalog newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.rongdu.expression4j.config.CatalogDocument.Catalog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.rongdu.expression4j.config.CatalogDocument newInstance() {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.rongdu.expression4j.config.CatalogDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.CatalogDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.CatalogDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.CatalogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
