/**
 * NameValuePair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class NameValuePair  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private beans.ws.mdm.sap.com.AttributeID attribute;

    private beans.ws.mdm.sap.com.AttributeValue[] attributeValue;

    public NameValuePair() {
    }

    public NameValuePair(
           beans.ws.mdm.sap.com.AttributeID attribute,
           beans.ws.mdm.sap.com.AttributeValue[] attributeValue) {
        this.attribute = attribute;
        this.attributeValue = attributeValue;
    }


    /**
     * Gets the attribute value for this NameValuePair.
     * 
     * @return attribute
     */
    public beans.ws.mdm.sap.com.AttributeID getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this NameValuePair.
     * 
     * @param attribute
     */
    public void setAttribute(beans.ws.mdm.sap.com.AttributeID attribute) {
        this.attribute = attribute;
    }


    /**
     * Gets the attributeValue value for this NameValuePair.
     * 
     * @return attributeValue
     */
    public beans.ws.mdm.sap.com.AttributeValue[] getAttributeValue() {
        return attributeValue;
    }


    /**
     * Sets the attributeValue value for this NameValuePair.
     * 
     * @param attributeValue
     */
    public void setAttributeValue(beans.ws.mdm.sap.com.AttributeValue[] attributeValue) {
        this.attributeValue = attributeValue;
    }

    public beans.ws.mdm.sap.com.AttributeValue getAttributeValue(int i) {
        return this.attributeValue[i];
    }

    public void setAttributeValue(int i, beans.ws.mdm.sap.com.AttributeValue _value) {
        this.attributeValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameValuePair)) return false;
        NameValuePair other = (NameValuePair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              this.attribute.equals(other.getAttribute()))) &&
            ((this.attributeValue==null && other.getAttributeValue()==null) || 
             (this.attributeValue!=null &&
              java.util.Arrays.equals(this.attributeValue, other.getAttributeValue())));
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
        if (getAttribute() != null) {
            _hashCode += getAttribute().hashCode();
        }
        if (getAttributeValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeValue(), i);
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
        new org.apache.axis.description.TypeDesc(NameValuePair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "NameValuePair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "attributeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValue"));
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
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
