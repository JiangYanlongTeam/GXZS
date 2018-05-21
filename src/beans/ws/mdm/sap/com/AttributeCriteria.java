/**
 * AttributeCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class AttributeCriteria  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private beans.ws.mdm.sap.com.AttributeID attribute;

    private beans.ws.mdm.sap.com.AttributeValueCriteria criteria;

    public AttributeCriteria() {
    }

    public AttributeCriteria(
           beans.ws.mdm.sap.com.AttributeID attribute,
           beans.ws.mdm.sap.com.AttributeValueCriteria criteria) {
        this.attribute = attribute;
        this.criteria = criteria;
    }


    /**
     * Gets the attribute value for this AttributeCriteria.
     * 
     * @return attribute
     */
    public beans.ws.mdm.sap.com.AttributeID getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this AttributeCriteria.
     * 
     * @param attribute
     */
    public void setAttribute(beans.ws.mdm.sap.com.AttributeID attribute) {
        this.attribute = attribute;
    }


    /**
     * Gets the criteria value for this AttributeCriteria.
     * 
     * @return criteria
     */
    public beans.ws.mdm.sap.com.AttributeValueCriteria getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this AttributeCriteria.
     * 
     * @param criteria
     */
    public void setCriteria(beans.ws.mdm.sap.com.AttributeValueCriteria criteria) {
        this.criteria = criteria;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeCriteria)) return false;
        AttributeCriteria other = (AttributeCriteria) obj;
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
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              this.criteria.equals(other.getCriteria())));
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
        if (getCriteria() != null) {
            _hashCode += getCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeID"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValueCriteria"));
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
