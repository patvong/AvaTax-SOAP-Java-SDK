/**
 * ExemptCertFetchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class ExemptCertFetchResult  extends com.avalara.avatax.services.account.BaseResult  implements java.io.Serializable {
    private com.avalara.avatax.services.account.ArrayOfExemptCert certificates;
    private int recordCount;

    public ExemptCertFetchResult() {
    }

    public ExemptCertFetchResult(
           com.avalara.avatax.services.account.ArrayOfExemptCert certificates,
           int recordCount) {
           this.certificates = certificates;
           this.recordCount = recordCount;
    }


    /**
     * Gets the certificates value for this ExemptCertFetchResult.
     * 
     * @return certificates
     */
    public com.avalara.avatax.services.account.ArrayOfExemptCert getCertificates() {
        return certificates;
    }


    /**
     * Sets the certificates value for this ExemptCertFetchResult.
     * 
     * @param certificates
     */
    public void setCertificates(com.avalara.avatax.services.account.ArrayOfExemptCert certificates) {
        this.certificates = certificates;
    }


    /**
     * Gets the recordCount value for this ExemptCertFetchResult.
     * 
     * @return recordCount
     */
    public int getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this ExemptCertFetchResult.
     * 
     * @param recordCount
     */
    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExemptCertFetchResult)) return false;
        ExemptCertFetchResult other = (ExemptCertFetchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.certificates==null && other.getCertificates()==null) || 
             (this.certificates!=null &&
              this.certificates.equals(other.getCertificates()))) &&
            this.recordCount == other.getRecordCount();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCertificates() != null) {
            _hashCode += getCertificates().hashCode();
        }
        _hashCode += getRecordCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExemptCertFetchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptCertFetchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Certificates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfExemptCert"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
