/*
 * XML Type:  models
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.Models
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config;


/**
 * An XML models(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public interface Models extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Models.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("models6e6atype");
    
    /**
     * Gets array of all "model" elements
     */
    fr.expression4j.config.ModelDocument.Model[] getModelArray();
    
    /**
     * Gets ith "model" element
     */
    fr.expression4j.config.ModelDocument.Model getModelArray(int i);
    
    /**
     * Returns number of "model" element
     */
    int sizeOfModelArray();
    
    /**
     * Sets array of all "model" element
     */
    void setModelArray(fr.expression4j.config.ModelDocument.Model[] modelArray);
    
    /**
     * Sets ith "model" element
     */
    void setModelArray(int i, fr.expression4j.config.ModelDocument.Model model);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "model" element
     */
    fr.expression4j.config.ModelDocument.Model insertNewModel(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "model" element
     */
    fr.expression4j.config.ModelDocument.Model addNewModel();
    
    /**
     * Removes the ith "model" element
     */
    void removeModel(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static fr.expression4j.config.Models newInstance() {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static fr.expression4j.config.Models newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static fr.expression4j.config.Models parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static fr.expression4j.config.Models parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static fr.expression4j.config.Models parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static fr.expression4j.config.Models parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static fr.expression4j.config.Models parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static fr.expression4j.config.Models parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static fr.expression4j.config.Models parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static fr.expression4j.config.Models parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static fr.expression4j.config.Models parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static fr.expression4j.config.Models parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static fr.expression4j.config.Models parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static fr.expression4j.config.Models parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static fr.expression4j.config.Models parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static fr.expression4j.config.Models parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.Models parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.Models parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.Models) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
