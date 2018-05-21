/**
 * AttributeValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class AttributeValue  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private beans.ws.mdm.sap.com.AttributeValueValue value;

    private beans.ws.mdm.sap.com.KeyMapping keyMapping;

    public AttributeValue() {
    }

    public AttributeValue(
           beans.ws.mdm.sap.com.AttributeValueValue value,
           beans.ws.mdm.sap.com.KeyMapping keyMapping) {
        this.value = value;
        this.keyMapping = keyMapping;
    }


    /**
     * Gets the value value for this AttributeValue.
     * 
     * @return value
     */
    public beans.ws.mdm.sap.com.AttributeValueValue getValue() {
        return value;
    }


    /**
     * Sets the value value for this AttributeValue.
     * 
     * @param value
     */
    public void setValue(beans.ws.mdm.sap.com.AttributeValueValue value) {
        this.value = value;
    }


    /**
     * Gets the keyMapping value for this AttributeValue.
     * 
     * @return keyMapping
     */
    public beans.ws.mdm.sap.com.KeyMapping getKeyMapping() {
        return keyMapping;
    }


    /**
     * Sets the keyMapping value for this AttributeValue.
     * 
     * @param keyMapping
     */
    public void setKeyMapping(beans.ws.mdm.sap.com.KeyMapping keyMapping) {
        this.keyMapping = keyMapping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeValue)) return false;
        AttributeValue other = (AttributeValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.keyMapping==null && other.getKeyMapping()==null) || 
             (this.keyMapping!=null &&
              this.keyMapping.equals(other.getKeyMapping())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getKeyMapping() != null) {
            _hashCode += getKeyMapping().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValueValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "keyMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
