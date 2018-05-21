/**
 * SortField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class SortField  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private java.lang.String fieldCode;

    private java.lang.Boolean isAscending;

    public SortField() {
    }

    public SortField(
           java.lang.String fieldCode,
           java.lang.Boolean isAscending) {
        this.fieldCode = fieldCode;
        this.isAscending = isAscending;
    }


    /**
     * Gets the fieldCode value for this SortField.
     * 
     * @return fieldCode
     */
    public java.lang.String getFieldCode() {
        return fieldCode;
    }


    /**
     * Sets the fieldCode value for this SortField.
     * 
     * @param fieldCode
     */
    public void setFieldCode(java.lang.String fieldCode) {
        this.fieldCode = fieldCode;
    }


    /**
     * Gets the isAscending value for this SortField.
     * 
     * @return isAscending
     */
    public java.lang.Boolean getIsAscending() {
        return isAscending;
    }


    /**
     * Sets the isAscending value for this SortField.
     * 
     * @param isAscending
     */
    public void setIsAscending(java.lang.Boolean isAscending) {
        this.isAscending = isAscending;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SortField)) return false;
        SortField other = (SortField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fieldCode==null && other.getFieldCode()==null) || 
             (this.fieldCode!=null &&
              this.fieldCode.equals(other.getFieldCode()))) &&
            ((this.isAscending==null && other.getIsAscending()==null) || 
             (this.isAscending!=null &&
              this.isAscending.equals(other.getIsAscending())));
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
        if (getFieldCode() != null) {
            _hashCode += getFieldCode().hashCode();
        }
        if (getIsAscending() != null) {
            _hashCode += getIsAscending().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SortField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "SortField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "fieldCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAscending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "isAscending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
