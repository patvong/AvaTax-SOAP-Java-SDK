/**
 * RegionFilingConfigSaveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.account;

public class RegionFilingConfigSaveResult  extends com.avalara.avatax.services.account.BaseResult  implements java.io.Serializable {
    private int regionFilingConfigId;

    public RegionFilingConfigSaveResult() {
    }

    public RegionFilingConfigSaveResult(
           int regionFilingConfigId) {
           this.regionFilingConfigId = regionFilingConfigId;
    }


    /**
     * Gets the regionFilingConfigId value for this RegionFilingConfigSaveResult.
     * 
     * @return regionFilingConfigId
     */
    public int getRegionFilingConfigId() {
        return regionFilingConfigId;
    }


    /**
     * Sets the regionFilingConfigId value for this RegionFilingConfigSaveResult.
     * 
     * @param regionFilingConfigId
     */
    public void setRegionFilingConfigId(int regionFilingConfigId) {
        this.regionFilingConfigId = regionFilingConfigId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegionFilingConfigSaveResult)) return false;
        RegionFilingConfigSaveResult other = (RegionFilingConfigSaveResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.regionFilingConfigId == other.getRegionFilingConfigId();
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
        _hashCode += getRegionFilingConfigId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegionFilingConfigSaveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RegionFilingConfigSaveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionFilingConfigId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "RegionFilingConfigId"));
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
