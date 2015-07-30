/*
 * An XML document type.
 * Localname: operator
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.OperatorDocument
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config;


/**
 * A document containing one operator(@http://expression4j.fr/config) element.
 *
 * This is a complex type.
 */
public interface OperatorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperatorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("operator26f4doctype");
    
    /**
     * Gets the "operator" element
     */
    fr.expression4j.config.OperatorDocument.Operator getOperator();
    
    /**
     * Sets the "operator" element
     */
    void setOperator(fr.expression4j.config.OperatorDocument.Operator operator);
    
    /**
     * Appends and returns a new empty "operator" element
     */
    fr.expression4j.config.OperatorDocument.Operator addNewOperator();
    
    /**
     * An XML operator(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public interface Operator extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Operator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("operator75b4elemtype");
        
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
         * Gets the "symbol" attribute
         */
        java.lang.String getSymbol();
        
        /**
         * Gets (as xml) the "symbol" attribute
         */
        org.apache.xmlbeans.XmlString xgetSymbol();
        
        /**
         * Sets the "symbol" attribute
         */
        void setSymbol(java.lang.String symbol);
        
        /**
         * Sets (as xml) the "symbol" attribute
         */
        void xsetSymbol(org.apache.xmlbeans.XmlString symbol);
        
        /**
         * Gets the "unary" attribute
         */
        boolean getUnary();
        
        /**
         * Gets (as xml) the "unary" attribute
         */
        org.apache.xmlbeans.XmlBoolean xgetUnary();
        
        /**
         * Sets the "unary" attribute
         */
        void setUnary(boolean unary);
        
        /**
         * Sets (as xml) the "unary" attribute
         */
        void xsetUnary(org.apache.xmlbeans.XmlBoolean unary);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static fr.expression4j.config.OperatorDocument.Operator newInstance() {
              return (fr.expression4j.config.OperatorDocument.Operator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static fr.expression4j.config.OperatorDocument.Operator newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (fr.expression4j.config.OperatorDocument.Operator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static fr.expression4j.config.OperatorDocument newInstance() {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static fr.expression4j.config.OperatorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static fr.expression4j.config.OperatorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static fr.expression4j.config.OperatorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static fr.expression4j.config.OperatorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static fr.expression4j.config.OperatorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static fr.expression4j.config.OperatorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static fr.expression4j.config.OperatorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static fr.expression4j.config.OperatorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static fr.expression4j.config.OperatorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static fr.expression4j.config.OperatorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static fr.expression4j.config.OperatorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static fr.expression4j.config.OperatorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static fr.expression4j.config.OperatorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static fr.expression4j.config.OperatorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static fr.expression4j.config.OperatorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.OperatorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.OperatorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.OperatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
