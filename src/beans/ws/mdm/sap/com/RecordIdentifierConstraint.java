/**
 * RecordIdentifierConstraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class RecordIdentifierConstraint  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private java.math.BigInteger internalID;

    private beans.ws.mdm.sap.com.KeyMappingConstraint keyMappingConstraint;

    public RecordIdentifierConstraint() {
    }

    public RecordIdentifierConstraint(
           java.math.BigInteger internalID,
           beans.ws.mdm.sap.com.KeyMappingConstraint keyMappingConstraint) {
        this.internalID = internalID;
        this.keyMappingConstraint = keyMappingConstraint;
    }


    /**
     * Gets the internalID value for this RecordIdentifierConstraint.
     * 
     * @return internalID
     */
    public java.math.BigInteger getInternalID() {
        return internalID;
    }


    /**
     * Sets the internalID value for this RecordIdentifierConstraint.
     * 
     * @param internalID
     */
    public void setInternalID(java.math.BigInteger internalID) {
        this.internalID = internalID;
    }


    /**
     * Gets the keyMappingConstraint value for this RecordIdentifierConstraint.
     * 
     * @return keyMappingConstraint
     */
    public beans.ws.mdm.sap.com.KeyMappingConstraint getKeyMappingConstraint() {
        return keyMappingConstraint;
    }


    /**
     * Sets the keyMappingConstraint value for this RecordIdentifierConstraint.
     * 
     * @param keyMappingConstraint
     */
    public void setKeyMappingConstraint(beans.ws.mdm.sap.com.KeyMappingConstraint keyMappingConstraint) {
        this.keyMappingConstraint = keyMappingConstraint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordIdentifierConstraint)) return false;
        RecordIdentifierConstraint other = (RecordIdentifierConstraint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.internalID==null && other.getInternalID()==null) || 
             (this.internalID!=null &&
              this.internalID.equals(other.getInternalID()))) &&
            ((this.keyMappingConstraint==null && other.getKeyMappingConstraint()==null) || 
             (this.keyMappingConstraint!=null &&
              this.keyMappingConstraint.equals(other.getKeyMappingConstraint())));
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
        if (getInternalID() != null) {
            _hashCode += getInternalID().hashCode();
        }
        if (getKeyMappingConstraint() != null) {
            _hashCode += getKeyMappingConstraint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecordIdentifierConstraint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "RecordIdentifierConstraint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "internalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMappingConstraint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "keyMappingConstraint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMappingConstraint"));
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
