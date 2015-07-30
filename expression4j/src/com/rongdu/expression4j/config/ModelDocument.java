/*
 * An XML document type.
 * Localname: model
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.ModelDocument
 *
 * Automatically generated - do not modify.
 */
package com.rongdu.expression4j.config;


/**
 * A document containing one model(@http://expression4j.fr/config) element.
 *
 * This is a complex type.
 */
public interface ModelDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ModelDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("model39e7doctype");
    
    /**
     * Gets the "model" element
     */
    com.rongdu.expression4j.config.ModelDocument.Model getModel();
    
    /**
     * Sets the "model" element
     */
    void setModel(com.rongdu.expression4j.config.ModelDocument.Model model);
    
    /**
     * Appends and returns a new empty "model" element
     */
    com.rongdu.expression4j.config.ModelDocument.Model addNewModel();
    
    /**
     * An XML model(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public interface Model extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Model.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("modelf3bcelemtype");
        
        /**
         * Gets array of all "unary-operator-class-name" elements
         */
        java.lang.String[] getUnaryOperatorClassNameArray();
        
        /**
         * Gets ith "unary-operator-class-name" element
         */
        java.lang.String getUnaryOperatorClassNameArray(int i);
        
        /**
         * Gets (as xml) array of all "unary-operator-class-name" elements
         */
        org.apache.xmlbeans.XmlString[] xgetUnaryOperatorClassNameArray();
        
        /**
         * Gets (as xml) ith "unary-operator-class-name" element
         */
        org.apache.xmlbeans.XmlString xgetUnaryOperatorClassNameArray(int i);
        
        /**
         * Returns number of "unary-operator-class-name" element
         */
        int sizeOfUnaryOperatorClassNameArray();
        
        /**
         * Sets array of all "unary-operator-class-name" element
         */
        void setUnaryOperatorClassNameArray(java.lang.String[] unaryOperatorClassNameArray);
        
        /**
         * Sets ith "unary-operator-class-name" element
         */
        void setUnaryOperatorClassNameArray(int i, java.lang.String unaryOperatorClassName);
        
        /**
         * Sets (as xml) array of all "unary-operator-class-name" element
         */
        void xsetUnaryOperatorClassNameArray(org.apache.xmlbeans.XmlString[] unaryOperatorClassNameArray);
        
        /**
         * Sets (as xml) ith "unary-operator-class-name" element
         */
        void xsetUnaryOperatorClassNameArray(int i, org.apache.xmlbeans.XmlString unaryOperatorClassName);
        
        /**
         * Inserts the value as the ith "unary-operator-class-name" element
         */
        void insertUnaryOperatorClassName(int i, java.lang.String unaryOperatorClassName);
        
        /**
         * Appends the value as the last "unary-operator-class-name" element
         */
        void addUnaryOperatorClassName(java.lang.String unaryOperatorClassName);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "unary-operator-class-name" element
         */
        org.apache.xmlbeans.XmlString insertNewUnaryOperatorClassName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "unary-operator-class-name" element
         */
        org.apache.xmlbeans.XmlString addNewUnaryOperatorClassName();
        
        /**
         * Removes the ith "unary-operator-class-name" element
         */
        void removeUnaryOperatorClassName(int i);
        
        /**
         * Gets array of all "binary-operator" elements
         */
        com.rongdu.expression4j.config.BinaryOperator[] getBinaryOperatorArray();
        
        /**
         * Gets ith "binary-operator" element
         */
        com.rongdu.expression4j.config.BinaryOperator getBinaryOperatorArray(int i);
        
        /**
         * Returns number of "binary-operator" element
         */
        int sizeOfBinaryOperatorArray();
        
        /**
         * Sets array of all "binary-operator" element
         */
        void setBinaryOperatorArray(com.rongdu.expression4j.config.BinaryOperator[] binaryOperatorArray);
        
        /**
         * Sets ith "binary-operator" element
         */
        void setBinaryOperatorArray(int i, com.rongdu.expression4j.config.BinaryOperator binaryOperator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "binary-operator" element
         */
        com.rongdu.expression4j.config.BinaryOperator insertNewBinaryOperator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "binary-operator" element
         */
        com.rongdu.expression4j.config.BinaryOperator addNewBinaryOperator();
        
        /**
         * Removes the ith "binary-operator" element
         */
        void removeBinaryOperator(int i);
        
        /**
         * Gets array of all "expression-element" elements
         */
        com.rongdu.expression4j.config.ExpressionElement[] getExpressionElementArray();
        
        /**
         * Gets ith "expression-element" element
         */
        com.rongdu.expression4j.config.ExpressionElement getExpressionElementArray(int i);
        
        /**
         * Returns number of "expression-element" element
         */
        int sizeOfExpressionElementArray();
        
        /**
         * Sets array of all "expression-element" element
         */
        void setExpressionElementArray(com.rongdu.expression4j.config.ExpressionElement[] expressionElementArray);
        
        /**
         * Sets ith "expression-element" element
         */
        void setExpressionElementArray(int i, com.rongdu.expression4j.config.ExpressionElement expressionElement);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "expression-element" element
         */
        com.rongdu.expression4j.config.ExpressionElement insertNewExpressionElement(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "expression-element" element
         */
        com.rongdu.expression4j.config.ExpressionElement addNewExpressionElement();
        
        /**
         * Removes the ith "expression-element" element
         */
        void removeExpressionElement(int i);
        
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
            public static com.rongdu.expression4j.config.ModelDocument.Model newInstance() {
              return (com.rongdu.expression4j.config.ModelDocument.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.rongdu.expression4j.config.ModelDocument.Model newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.rongdu.expression4j.config.ModelDocument.Model) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.rongdu.expression4j.config.ModelDocument newInstance() {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.rongdu.expression4j.config.ModelDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.rongdu.expression4j.config.ModelDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.rongdu.expression4j.config.ModelDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.rongdu.expression4j.config.ModelDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.ModelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static com.rongdu.expression4j.config.ModelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.rongdu.expression4j.config.ModelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
