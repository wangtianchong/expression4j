/*
 * XML Type:  operator-managers
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.OperatorManagers
 *
 * Automatically generated - do not modify.
 */
package com.rongdu.expression4j.config;


/**
 * An XML operator-managers(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public interface OperatorManagers extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperatorManagers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("operatormanagersb73dtype");
    
    /**
     * Gets array of all "operator-manager" elements
     */
    com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager[] getOperatorManagerArray();
    
    /**
     * Gets ith "operator-manager" element
     */
    com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager getOperatorManagerArray(int i);
    
    /**
     * Returns number of "operator-manager" element
     */
    int sizeOfOperatorManagerArray();
    
    /**
     * Sets array of all "operator-manager" element
     */
    void setOperatorManagerArray(com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager[] operatorManagerArray);
    
    /**
     * Sets ith "operator-manager" element
     */
    void setOperatorManagerArray(int i, com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager operatorManager);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operator-manager" element
     */
    com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager insertNewOperatorManager(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operator-manager" element
     */
    com.rongdu.expression4j.config.OperatorManagerDocument.OperatorManager addNewOperatorManager();
    
    /**
     * Removes the ith "operator-manager" element
     */
    void removeOperatorManager(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.rongdu.expression4j.config.OperatorManagers newInstance() {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.rongdu.expression4j.config.OperatorManagers parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.OperatorManagers parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.OperatorManagers parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.OperatorManagers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
