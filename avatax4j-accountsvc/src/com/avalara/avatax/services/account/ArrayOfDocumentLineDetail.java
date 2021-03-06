/**
 * ArrayOfDocumentLineDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ArrayOfDocumentLineDetail  implements java.io.Serializable {
    private com.avalara.avatax.services.account.DocumentLineDetail[] documentLineDetail;

    public ArrayOfDocumentLineDetail() {
    }

    public ArrayOfDocumentLineDetail(
           com.avalara.avatax.services.account.DocumentLineDetail[] documentLineDetail) {
           this.documentLineDetail = documentLineDetail;
    }


    /**
     * Gets the documentLineDetail value for this ArrayOfDocumentLineDetail.
     * 
     * @return documentLineDetail
     */
    public com.avalara.avatax.services.account.DocumentLineDetail[] getDocumentLineDetail() {
        return documentLineDetail;
    }


    /**
     * Sets the documentLineDetail value for this ArrayOfDocumentLineDetail.
     * 
     * @param documentLineDetail
     */
    public void setDocumentLineDetail(com.avalara.avatax.services.account.DocumentLineDetail[] documentLineDetail) {
        this.documentLineDetail = documentLineDetail;
    }

    public com.avalara.avatax.services.account.DocumentLineDetail getDocumentLineDetail(int i) {
        return this.documentLineDetail[i];
    }

    public void setDocumentLineDetail(int i, com.avalara.avatax.services.account.DocumentLineDetail _value) {
        this.documentLineDetail[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDocumentLineDetail)) return false;
        ArrayOfDocumentLineDetail other = (ArrayOfDocumentLineDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentLineDetail==null && other.getDocumentLineDetail()==null) || 
             (this.documentLineDetail!=null &&
              java.util.Arrays.equals(this.documentLineDetail, other.getDocumentLineDetail())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDocumentLineDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentLineDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentLineDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArrayOfDocumentLineDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfDocumentLineDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentLineDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentLineDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentLineDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  com.avalara.avatax.services.base.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
