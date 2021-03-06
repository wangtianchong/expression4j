/*
 * XML Type:  operators
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.Operators
 *
 * Automatically generated - do not modify.
 */
package com.rongdu.expression4j.config;


/**
 * An XML operators(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public interface Operators extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Operators.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("operators091dtype");
    
    /**
     * Gets array of all "operator" elements
     */
    com.rongdu.expression4j.config.OperatorDocument.Operator[] getOperatorArray();
    
    /**
     * Gets ith "operator" element
     */
    com.rongdu.expression4j.config.OperatorDocument.Operator getOperatorArray(int i);
    
    /**
     * Returns number of "operator" element
     */
    int sizeOfOperatorArray();
    
    /**
     * Sets array of all "operator" element
     */
    void setOperatorArray(com.rongdu.expression4j.config.OperatorDocument.Operator[] operatorArray);
    
    /**
     * Sets ith "operator" element
     */
    void setOperatorArray(int i, com.rongdu.expression4j.config.OperatorDocument.Operator operator);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operator" element
     */
    com.rongdu.expression4j.config.OperatorDocument.Operator insertNewOperator(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operator" element
     */
    com.rongdu.expression4j.config.OperatorDocument.Operator addNewOperator();
    
    /**
     * Removes the ith "operator" element
     */
    void removeOperator(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.rongdu.expression4j.config.Operators newInstance() {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.rongdu.expression4j.config.Operators newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.rongdu.expression4j.config.Operators parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.rongdu.expression4j.config.Operators parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.rongdu.expression4j.config.Operators parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.rongdu.expression4j.config.Operators parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.rongdu.expression4j.config.Operators parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.rongdu.expression4j.config.Operators parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.rongdu.expression4j.config.Operators parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.rongdu.expression4j.config.Operators parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.rongdu.expression4j.config.Operators parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.rongdu.expression4j.config.Operators parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.rongdu.expression4j.config.Operators parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.rongdu.expression4j.config.Operators parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.rongdu.expression4j.config.Operators parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.rongdu.expression4j.config.Operators parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.Operators parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.Operators parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.Operators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
