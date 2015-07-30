/*
 * XML Type:  expression
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.Expression
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config;


/**
 * An XML expression(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public interface Expression extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Expression.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("expression7598type");
    
    /**
     * Gets the "expression-name" element
     */
    java.lang.String getExpressionName();
    
    /**
     * Gets (as xml) the "expression-name" element
     */
    org.apache.xmlbeans.XmlString xgetExpressionName();
    
    /**
     * Sets the "expression-name" element
     */
    void setExpressionName(java.lang.String expressionName);
    
    /**
     * Sets (as xml) the "expression-name" element
     */
    void xsetExpressionName(org.apache.xmlbeans.XmlString expressionName);
    
    /**
     * Gets the "expression-value" element
     */
    java.lang.String getExpressionValue();
    
    /**
     * Gets (as xml) the "expression-value" element
     */
    org.apache.xmlbeans.XmlString xgetExpressionValue();
    
    /**
     * Sets the "expression-value" element
     */
    void setExpressionValue(java.lang.String expressionValue);
    
    /**
     * Sets (as xml) the "expression-value" element
     */
    void xsetExpressionValue(org.apache.xmlbeans.XmlString expressionValue);
    
    /**
     * Gets the "expression-model" element
     */
    java.lang.String getExpressionModel();
    
    /**
     * Gets (as xml) the "expression-model" element
     */
    org.apache.xmlbeans.XmlString xgetExpressionModel();
    
    /**
     * Sets the "expression-model" element
     */
    void setExpressionModel(java.lang.String expressionModel);
    
    /**
     * Sets (as xml) the "expression-model" element
     */
    void xsetExpressionModel(org.apache.xmlbeans.XmlString expressionModel);
    
    /**
     * Gets the "expression-class" element
     */
    java.lang.String getExpressionClass();
    
    /**
     * Gets (as xml) the "expression-class" element
     */
    org.apache.xmlbeans.XmlString xgetExpressionClass();
    
    /**
     * Sets the "expression-class" element
     */
    void setExpressionClass(java.lang.String expressionClass);
    
    /**
     * Sets (as xml) the "expression-class" element
     */
    void xsetExpressionClass(org.apache.xmlbeans.XmlString expressionClass);
    
    /**
     * Gets array of all "property" elements
     */
    fr.expression4j.config.Expression.Property[] getPropertyArray();
    
    /**
     * Gets ith "property" element
     */
    fr.expression4j.config.Expression.Property getPropertyArray(int i);
    
    /**
     * Returns number of "property" element
     */
    int sizeOfPropertyArray();
    
    /**
     * Sets array of all "property" element
     */
    void setPropertyArray(fr.expression4j.config.Expression.Property[] propertyArray);
    
    /**
     * Sets ith "property" element
     */
    void setPropertyArray(int i, fr.expression4j.config.Expression.Property property);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    fr.expression4j.config.Expression.Property insertNewProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    fr.expression4j.config.Expression.Property addNewProperty();
    
    /**
     * Removes the ith "property" element
     */
    void removeProperty(int i);
    
    /**
     * An XML property(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public interface Property extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Property.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("property6a87elemtype");
        
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
         * Gets the "value" attribute
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static fr.expression4j.config.Expression.Property newInstance() {
              return (fr.expression4j.config.Expression.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static fr.expression4j.config.Expression.Property newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (fr.expression4j.config.Expression.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static fr.expression4j.config.Expression newInstance() {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static fr.expression4j.config.Expression newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static fr.expression4j.config.Expression parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static fr.expression4j.config.Expression parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static fr.expression4j.config.Expression parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static fr.expression4j.config.Expression parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static fr.expression4j.config.Expression parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static fr.expression4j.config.Expression parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static fr.expression4j.config.Expression parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static fr.expression4j.config.Expression parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static fr.expression4j.config.Expression parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static fr.expression4j.config.Expression parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static fr.expression4j.config.Expression parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static fr.expression4j.config.Expression parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static fr.expression4j.config.Expression parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static fr.expression4j.config.Expression parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.Expression parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.Expression parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.Expression) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
