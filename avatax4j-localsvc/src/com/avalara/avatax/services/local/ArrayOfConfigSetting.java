/**
 * ArrayOfConfigSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.local;

public class ArrayOfConfigSetting  implements java.io.Serializable {
    private com.avalara.avatax.services.local.ConfigSetting[] configSetting;

    public ArrayOfConfigSetting() {
    }

    public ArrayOfConfigSetting(
           com.avalara.avatax.services.local.ConfigSetting[] configSetting) {
           this.configSetting = configSetting;
    }

    /**
     * Gets the configSetting value for this ArrayOfConfigSetting.
     * 
     * @return configSetting
     */
    public com.avalara.avatax.services.local.ConfigSetting[] getConfigSetting() {
        return configSetting;
    }
    /**
     * Sets the configSetting value for this ArrayOfConfigSetting.
     * 
     * @param configSetting
     */
    public void setConfigSetting(com.avalara.avatax.services.local.ConfigSetting[] configSetting) {
        this.configSetting = configSetting;
    }
    public com.avalara.avatax.services.local.ConfigSetting getConfigSetting(int i) {
        return this.configSetting[i];
    }
    public void setConfigSetting(int i, com.avalara.avatax.services.local.ConfigSetting _value) {
        this.configSetting[i] = _value;
    }
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfConfigSetting)) return false;
        ArrayOfConfigSetting other = (ArrayOfConfigSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.configSetting==null && other.getConfigSetting()==null) || 
             (this.configSetting!=null &&
              java.util.Arrays.equals(this.configSetting, other.getConfigSetting())));
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
        if (getConfigSetting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfigSetting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfigSetting(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfConfigSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfConfigSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ConfigSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ConfigSetting"));
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
