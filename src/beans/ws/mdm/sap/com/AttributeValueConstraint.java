/**
 * AttributeValueConstraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class AttributeValueConstraint  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private java.lang.String expressionOperator;

    private beans.ws.mdm.sap.com.AttributeValueValue value;

    public AttributeValueConstraint() {
    }

    public AttributeValueConstraint(
           java.lang.String expressionOperator,
           beans.ws.mdm.sap.com.AttributeValueValue value) {
        this.expressionOperator = expressionOperator;
        this.value = value;
    }


    /**
     * Gets the expressionOperator value for this AttributeValueConstraint.
     * 
     * @return expressionOperator
     */
    public java.lang.String getExpressionOperator() {
        return expressionOperator;
    }


    /**
     * Sets the expressionOperator value for this AttributeValueConstraint.
     * 
     * @param expressionOperator
     */
    public void setExpressionOperator(java.lang.String expressionOperator) {
        this.expressionOperator = expressionOperator;
    }


    /**
     * Gets the value value for this AttributeValueConstraint.
     * 
     * @return value
     */
    public beans.ws.mdm.sap.com.AttributeValueValue getValue() {
        return value;
    }


    /**
     * Sets the value value for this AttributeValueConstraint.
     * 
     * @param value
     */
    public void setValue(beans.ws.mdm.sap.com.AttributeValueValue value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeValueConstraint)) return false;
        AttributeValueConstraint other = (AttributeValueConstraint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expressionOperator==null && other.getExpressionOperator()==null) || 
             (this.expressionOperator!=null &&
              this.expressionOperator.equals(other.getExpressionOperator()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getExpressionOperator() != null) {
            _hashCode += getExpressionOperator().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeValueConstraint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValueConstraint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressionOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "expressionOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValueValue"));
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
