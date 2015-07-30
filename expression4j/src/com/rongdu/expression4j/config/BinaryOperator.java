/*
 * XML Type:  binary-operator
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.BinaryOperator
 *
 * Automatically generated - do not modify.
 */
package com.rongdu.expression4j.config;


/**
 * An XML binary-operator(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public interface BinaryOperator extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BinaryOperator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("binaryoperator68betype");
    
    /**
     * Gets array of all "operator-class-name" elements
     */
    java.lang.String[] getOperatorClassNameArray();
    
    /**
     * Gets ith "operator-class-name" element
     */
    java.lang.String getOperatorClassNameArray(int i);
    
    /**
     * Gets (as xml) array of all "operator-class-name" elements
     */
    org.apache.xmlbeans.XmlString[] xgetOperatorClassNameArray();
    
    /**
     * Gets (as xml) ith "operator-class-name" element
     */
    org.apache.xmlbeans.XmlString xgetOperatorClassNameArray(int i);
    
    /**
     * Returns number of "operator-class-name" element
     */
    int sizeOfOperatorClassNameArray();
    
    /**
     * Sets array of all "operator-class-name" element
     */
    void setOperatorClassNameArray(java.lang.String[] operatorClassNameArray);
    
    /**
     * Sets ith "operator-class-name" element
     */
    void setOperatorClassNameArray(int i, java.lang.String operatorClassName);
    
    /**
     * Sets (as xml) array of all "operator-class-name" element
     */
    void xsetOperatorClassNameArray(org.apache.xmlbeans.XmlString[] operatorClassNameArray);
    
    /**
     * Sets (as xml) ith "operator-class-name" element
     */
    void xsetOperatorClassNameArray(int i, org.apache.xmlbeans.XmlString operatorClassName);
    
    /**
     * Inserts the value as the ith "operator-class-name" element
     */
    void insertOperatorClassName(int i, java.lang.String operatorClassName);
    
    /**
     * Appends the value as the last "operator-class-name" element
     */
    void addOperatorClassName(java.lang.String operatorClassName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operator-class-name" element
     */
    org.apache.xmlbeans.XmlString insertNewOperatorClassName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operator-class-name" element
     */
    org.apache.xmlbeans.XmlString addNewOperatorClassName();
    
    /**
     * Removes the ith "operator-class-name" element
     */
    void removeOperatorClassName(int i);
    
    /**
     * Gets the "priority" attribute
     */
    int getPriority();
    
    /**
     * Gets (as xml) the "priority" attribute
     */
    org.apache.xmlbeans.XmlInt xgetPriority();
    
    /**
     * Sets the "priority" attribute
     */
    void setPriority(int priority);
    
    /**
     * Sets (as xml) the "priority" attribute
     */
    void xsetPriority(org.apache.xmlbeans.XmlInt priority);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.rongdu.expression4j.config.BinaryOperator newInstance() {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.rongdu.expression4j.config.BinaryOperator parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.BinaryOperator parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.BinaryOperator parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.BinaryOperator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
