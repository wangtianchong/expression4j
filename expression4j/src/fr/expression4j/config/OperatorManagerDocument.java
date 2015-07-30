/*
 * An XML document type.
 * Localname: operator-manager
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.OperatorManagerDocument
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config;


/**
 * A document containing one operator-manager(@http://expression4j.fr/config) element.
 *
 * This is a complex type.
 */
public interface OperatorManagerDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperatorManagerDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("operatormanager24d4doctype");
    
    /**
     * Gets the "operator-manager" element
     */
    fr.expression4j.config.OperatorManagerDocument.OperatorManager getOperatorManager();
    
    /**
     * Sets the "operator-manager" element
     */
    void setOperatorManager(fr.expression4j.config.OperatorManagerDocument.OperatorManager operatorManager);
    
    /**
     * Appends and returns a new empty "operator-manager" element
     */
    fr.expression4j.config.OperatorManagerDocument.OperatorManager addNewOperatorManager();
    
    /**
     * An XML operator-manager(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public interface OperatorManager extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperatorManager.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("operatormanagerd8b4elemtype");
        
        /**
         * Gets array of all "operator-impl-class" elements
         */
        java.lang.String[] getOperatorImplClassArray();
        
        /**
         * Gets ith "operator-impl-class" element
         */
        java.lang.String getOperatorImplClassArray(int i);
        
        /**
         * Gets (as xml) array of all "operator-impl-class" elements
         */
        org.apache.xmlbeans.XmlString[] xgetOperatorImplClassArray();
        
        /**
         * Gets (as xml) ith "operator-impl-class" element
         */
        org.apache.xmlbeans.XmlString xgetOperatorImplClassArray(int i);
        
        /**
         * Returns number of "operator-impl-class" element
         */
        int sizeOfOperatorImplClassArray();
        
        /**
         * Sets array of all "operator-impl-class" element
         */
        void setOperatorImplClassArray(java.lang.String[] operatorImplClassArray);
        
        /**
         * Sets ith "operator-impl-class" element
         */
        void setOperatorImplClassArray(int i, java.lang.String operatorImplClass);
        
        /**
         * Sets (as xml) array of all "operator-impl-class" element
         */
        void xsetOperatorImplClassArray(org.apache.xmlbeans.XmlString[] operatorImplClassArray);
        
        /**
         * Sets (as xml) ith "operator-impl-class" element
         */
        void xsetOperatorImplClassArray(int i, org.apache.xmlbeans.XmlString operatorImplClass);
        
        /**
         * Inserts the value as the ith "operator-impl-class" element
         */
        void insertOperatorImplClass(int i, java.lang.String operatorImplClass);
        
        /**
         * Appends the value as the last "operator-impl-class" element
         */
        void addOperatorImplClass(java.lang.String operatorImplClass);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "operator-impl-class" element
         */
        org.apache.xmlbeans.XmlString insertNewOperatorImplClass(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "operator-impl-class" element
         */
        org.apache.xmlbeans.XmlString addNewOperatorImplClass();
        
        /**
         * Removes the ith "operator-impl-class" element
         */
        void removeOperatorImplClass(int i);
        
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
            public static fr.expression4j.config.OperatorManagerDocument.OperatorManager newInstance() {
              return (fr.expression4j.config.OperatorManagerDocument.OperatorManager) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static fr.expression4j.config.OperatorManagerDocument.OperatorManager newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (fr.expression4j.config.OperatorManagerDocument.OperatorManager) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static fr.expression4j.config.OperatorManagerDocument newInstance() {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static fr.expression4j.config.OperatorManagerDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static fr.expression4j.config.OperatorManagerDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static fr.expression4j.config.OperatorManagerDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static fr.expression4j.config.OperatorManagerDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.OperatorManagerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.OperatorManagerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.OperatorManagerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
