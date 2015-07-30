/*
 * An XML document type.
 * Localname: model
 * Namespace: http://expression4j.fr/config
 * Java type: fr.expression4j.config.ModelDocument
 *
 * Automatically generated - do not modify.
 */
package fr.expression4j.config.impl;
/**
 * A document containing one model(@http://expression4j.fr/config) element.
 *
 * This is a complex type.
 */
public class ModelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.ModelDocument
{
    
    public ModelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODEL$0 = 
        new javax.xml.namespace.QName("http://expression4j.fr/config", "model");
    
    
    /**
     * Gets the "model" element
     */
    public fr.expression4j.config.ModelDocument.Model getModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ModelDocument.Model target = null;
            target = (fr.expression4j.config.ModelDocument.Model)get_store().find_element_user(MODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "model" element
     */
    public void setModel(fr.expression4j.config.ModelDocument.Model model)
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ModelDocument.Model target = null;
            target = (fr.expression4j.config.ModelDocument.Model)get_store().find_element_user(MODEL$0, 0);
            if (target == null)
            {
                target = (fr.expression4j.config.ModelDocument.Model)get_store().add_element_user(MODEL$0);
            }
            target.set(model);
        }
    }
    
    /**
     * Appends and returns a new empty "model" element
     */
    public fr.expression4j.config.ModelDocument.Model addNewModel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            fr.expression4j.config.ModelDocument.Model target = null;
            target = (fr.expression4j.config.ModelDocument.Model)get_store().add_element_user(MODEL$0);
            return target;
        }
    }
    /**
     * An XML model(@http://expression4j.fr/config).
     *
     * This is a complex type.
     */
    public static class ModelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements fr.expression4j.config.ModelDocument.Model
    {
        
        public ModelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNARYOPERATORCLASSNAME$0 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "unary-operator-class-name");
        private static final javax.xml.namespace.QName BINARYOPERATOR$2 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "binary-operator");
        private static final javax.xml.namespace.QName EXPRESSIONELEMENT$4 = 
            new javax.xml.namespace.QName("http://expression4j.fr/config", "expression-element");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets array of all "unary-operator-class-name" elements
         */
        public java.lang.String[] getUnaryOperatorClassNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UNARYOPERATORCLASSNAME$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "unary-operator-class-name" element
         */
        public java.lang.String getUnaryOperatorClassNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNARYOPERATORCLASSNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "unary-operator-class-name" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetUnaryOperatorClassNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UNARYOPERATORCLASSNAME$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "unary-operator-class-name" element
         */
        public org.apache.xmlbeans.XmlString xgetUnaryOperatorClassNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNARYOPERATORCLASSNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "unary-operator-class-name" element
         */
        public int sizeOfUnaryOperatorClassNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNARYOPERATORCLASSNAME$0);
            }
        }
        
        /**
         * Sets array of all "unary-operator-class-name" element
         */
        public void setUnaryOperatorClassNameArray(java.lang.String[] unaryOperatorClassNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(unaryOperatorClassNameArray, UNARYOPERATORCLASSNAME$0);
            }
        }
        
        /**
         * Sets ith "unary-operator-class-name" element
         */
        public void setUnaryOperatorClassNameArray(int i, java.lang.String unaryOperatorClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNARYOPERATORCLASSNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(unaryOperatorClassName);
            }
        }
        
        /**
         * Sets (as xml) array of all "unary-operator-class-name" element
         */
        public void xsetUnaryOperatorClassNameArray(org.apache.xmlbeans.XmlString[]unaryOperatorClassNameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(unaryOperatorClassNameArray, UNARYOPERATORCLASSNAME$0);
            }
        }
        
        /**
         * Sets (as xml) ith "unary-operator-class-name" element
         */
        public void xsetUnaryOperatorClassNameArray(int i, org.apache.xmlbeans.XmlString unaryOperatorClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UNARYOPERATORCLASSNAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(unaryOperatorClassName);
            }
        }
        
        /**
         * Inserts the value as the ith "unary-operator-class-name" element
         */
        public void insertUnaryOperatorClassName(int i, java.lang.String unaryOperatorClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UNARYOPERATORCLASSNAME$0, i);
                target.setStringValue(unaryOperatorClassName);
            }
        }
        
        /**
         * Appends the value as the last "unary-operator-class-name" element
         */
        public void addUnaryOperatorClassName(java.lang.String unaryOperatorClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNARYOPERATORCLASSNAME$0);
                target.setStringValue(unaryOperatorClassName);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "unary-operator-class-name" element
         */
        public org.apache.xmlbeans.XmlString insertNewUnaryOperatorClassName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(UNARYOPERATORCLASSNAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "unary-operator-class-name" element
         */
        public org.apache.xmlbeans.XmlString addNewUnaryOperatorClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UNARYOPERATORCLASSNAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "unary-operator-class-name" element
         */
        public void removeUnaryOperatorClassName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNARYOPERATORCLASSNAME$0, i);
            }
        }
        
        /**
         * Gets array of all "binary-operator" elements
         */
        public fr.expression4j.config.BinaryOperator[] getBinaryOperatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BINARYOPERATOR$2, targetList);
                fr.expression4j.config.BinaryOperator[] result = new fr.expression4j.config.BinaryOperator[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "binary-operator" element
         */
        public fr.expression4j.config.BinaryOperator getBinaryOperatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.BinaryOperator target = null;
                target = (fr.expression4j.config.BinaryOperator)get_store().find_element_user(BINARYOPERATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "binary-operator" element
         */
        public int sizeOfBinaryOperatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BINARYOPERATOR$2);
            }
        }
        
        /**
         * Sets array of all "binary-operator" element
         */
        public void setBinaryOperatorArray(fr.expression4j.config.BinaryOperator[] binaryOperatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(binaryOperatorArray, BINARYOPERATOR$2);
            }
        }
        
        /**
         * Sets ith "binary-operator" element
         */
        public void setBinaryOperatorArray(int i, fr.expression4j.config.BinaryOperator binaryOperator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.BinaryOperator target = null;
                target = (fr.expression4j.config.BinaryOperator)get_store().find_element_user(BINARYOPERATOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(binaryOperator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "binary-operator" element
         */
        public fr.expression4j.config.BinaryOperator insertNewBinaryOperator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.BinaryOperator target = null;
                target = (fr.expression4j.config.BinaryOperator)get_store().insert_element_user(BINARYOPERATOR$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "binary-operator" element
         */
        public fr.expression4j.config.BinaryOperator addNewBinaryOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.BinaryOperator target = null;
                target = (fr.expression4j.config.BinaryOperator)get_store().add_element_user(BINARYOPERATOR$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "binary-operator" element
         */
        public void removeBinaryOperator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BINARYOPERATOR$2, i);
            }
        }
        
        /**
         * Gets array of all "expression-element" elements
         */
        public fr.expression4j.config.ExpressionElement[] getExpressionElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXPRESSIONELEMENT$4, targetList);
                fr.expression4j.config.ExpressionElement[] result = new fr.expression4j.config.ExpressionElement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "expression-element" element
         */
        public fr.expression4j.config.ExpressionElement getExpressionElementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.ExpressionElement target = null;
                target = (fr.expression4j.config.ExpressionElement)get_store().find_element_user(EXPRESSIONELEMENT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "expression-element" element
         */
        public int sizeOfExpressionElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPRESSIONELEMENT$4);
            }
        }
        
        /**
         * Sets array of all "expression-element" element
         */
        public void setExpressionElementArray(fr.expression4j.config.ExpressionElement[] expressionElementArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(expressionElementArray, EXPRESSIONELEMENT$4);
            }
        }
        
        /**
         * Sets ith "expression-element" element
         */
        public void setExpressionElementArray(int i, fr.expression4j.config.ExpressionElement expressionElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.ExpressionElement target = null;
                target = (fr.expression4j.config.ExpressionElement)get_store().find_element_user(EXPRESSIONELEMENT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(expressionElement);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "expression-element" element
         */
        public fr.expression4j.config.ExpressionElement insertNewExpressionElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.ExpressionElement target = null;
                target = (fr.expression4j.config.ExpressionElement)get_store().insert_element_user(EXPRESSIONELEMENT$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "expression-element" element
         */
        public fr.expression4j.config.ExpressionElement addNewExpressionElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                fr.expression4j.config.ExpressionElement target = null;
                target = (fr.expression4j.config.ExpressionElement)get_store().add_element_user(EXPRESSIONELEMENT$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "expression-element" element
         */
        public void removeExpressionElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPRESSIONELEMENT$4, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
                }
                target.set(name);
            }
        }
    }
}
