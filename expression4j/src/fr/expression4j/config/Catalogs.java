/*
 * XML Type:  catalogs
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.Catalogs
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config;


/**
 * An XML catalogs(@http://expression4j.fr/config).
 *
 * This is a complex type.
 */
public interface Catalogs extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Catalogs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2F11EE70DCEAD41A9CDC843F763D282F").resolveHandle("catalogs953atype");
    
    /**
     * Gets array of all "catalog" elements
     */
    fr.expression4j.config.CatalogDocument.Catalog[] getCatalogArray();
    
    /**
     * Gets ith "catalog" element
     */
    fr.expression4j.config.CatalogDocument.Catalog getCatalogArray(int i);
    
    /**
     * Returns number of "catalog" element
     */
    int sizeOfCatalogArray();
    
    /**
     * Sets array of all "catalog" element
     */
    void setCatalogArray(fr.expression4j.config.CatalogDocument.Catalog[] catalogArray);
    
    /**
     * Sets ith "catalog" element
     */
    void setCatalogArray(int i, fr.expression4j.config.CatalogDocument.Catalog catalog);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catalog" element
     */
    fr.expression4j.config.CatalogDocument.Catalog insertNewCatalog(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catalog" element
     */
    fr.expression4j.config.CatalogDocument.Catalog addNewCatalog();
    
    /**
     * Removes the ith "catalog" element
     */
    void removeCatalog(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static fr.expression4j.config.Catalogs newInstance() {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static fr.expression4j.config.Catalogs newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static fr.expression4j.config.Catalogs parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static fr.expression4j.config.Catalogs parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static fr.expression4j.config.Catalogs parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static fr.expression4j.config.Catalogs parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static fr.expression4j.config.Catalogs parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static fr.expression4j.config.Catalogs parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static fr.expression4j.config.Catalogs parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static fr.expression4j.config.Catalogs parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static fr.expression4j.config.Catalogs parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static fr.expression4j.config.Catalogs parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static fr.expression4j.config.Catalogs parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static fr.expression4j.config.Catalogs parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static fr.expression4j.config.Catalogs parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static fr.expression4j.config.Catalogs parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.Catalogs parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static fr.expression4j.config.Catalogs parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (fr.expression4j.config.Catalogs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
