/**
 * ConfigSettingFetchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.local;

public class ConfigSettingFetchResult  extends com.avalara.avatax.services.local.BaseResult  implements java.io.Serializable {
    private com.avalara.avatax.services.local.ArrayOfConfigSetting configSettings;

    public ConfigSettingFetchResult() {
    }

    public ConfigSettingFetchResult(
           com.avalara.avatax.services.local.ArrayOfConfigSetting configSettings) {
           this.configSettings = configSettings;
    }


    /**
     * Gets the configSettings value for this ConfigSettingFetchResult.
     * 
     * @return configSettings
     */
    public com.avalara.avatax.services.local.ArrayOfConfigSetting getConfigSettings() {
        return configSettings;
    }


    /**
     * Sets the configSettings value for this ConfigSettingFetchResult.
     * 
     * @param configSettings
     */
    public void setConfigSettings(com.avalara.avatax.services.local.ArrayOfConfigSetting configSettings) {
        this.configSettings = configSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigSettingFetchResult)) return false;
        ConfigSettingFetchResult other = (ConfigSettingFetchResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.configSettings==null && other.getConfigSettings()==null) || 
             (this.configSettings!=null &&
              this.configSettings.equals(other.getConfigSettings())));
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
        if (getConfigSettings() != null) {
            _hashCode += getConfigSettings().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigSettingFetchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ConfigSettingFetchResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ConfigSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfConfigSetting"));
        elemField.setMinOccurs(0);
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
