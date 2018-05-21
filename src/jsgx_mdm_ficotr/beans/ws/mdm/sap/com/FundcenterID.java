/**
 * FundcenterID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class FundcenterID  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.math.BigInteger internalID;

    private beans.ws.mdm.sap.com.KeyMapping keyMapping;

    private java.math.BigInteger autoID;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUniqueConstraint1 uniqueConstraint1;

    public FundcenterID() {
    }

    public FundcenterID(
           java.math.BigInteger internalID,
           beans.ws.mdm.sap.com.KeyMapping keyMapping,
           java.math.BigInteger autoID,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUniqueConstraint1 uniqueConstraint1) {
        this.internalID = internalID;
        this.keyMapping = keyMapping;
        this.autoID = autoID;
        this.uniqueConstraint1 = uniqueConstraint1;
    }


    /**
     * Gets the internalID value for this FundcenterID.
     * 
     * @return internalID
     */
    public java.math.BigInteger getInternalID() {
        return internalID;
    }


    /**
     * Sets the internalID value for this FundcenterID.
     * 
     * @param internalID
     */
    public void setInternalID(java.math.BigInteger internalID) {
        this.internalID = internalID;
    }


    /**
     * Gets the keyMapping value for this FundcenterID.
     * 
     * @return keyMapping
     */
    public beans.ws.mdm.sap.com.KeyMapping getKeyMapping() {
        return keyMapping;
    }


    /**
     * Sets the keyMapping value for this FundcenterID.
     * 
     * @param keyMapping
     */
    public void setKeyMapping(beans.ws.mdm.sap.com.KeyMapping keyMapping) {
        this.keyMapping = keyMapping;
    }


    /**
     * Gets the autoID value for this FundcenterID.
     * 
     * @return autoID
     */
    public java.math.BigInteger getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this FundcenterID.
     * 
     * @param autoID
     */
    public void setAutoID(java.math.BigInteger autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the uniqueConstraint1 value for this FundcenterID.
     * 
     * @return uniqueConstraint1
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUniqueConstraint1 getUniqueConstraint1() {
        return uniqueConstraint1;
    }


    /**
     * Sets the uniqueConstraint1 value for this FundcenterID.
     * 
     * @param uniqueConstraint1
     */
    public void setUniqueConstraint1(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUniqueConstraint1 uniqueConstraint1) {
        this.uniqueConstraint1 = uniqueConstraint1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundcenterID)) return false;
        FundcenterID other = (FundcenterID) obj;
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
            ((this.keyMapping==null && other.getKeyMapping()==null) || 
             (this.keyMapping!=null &&
              this.keyMapping.equals(other.getKeyMapping()))) &&
            ((this.autoID==null && other.getAutoID()==null) || 
             (this.autoID!=null &&
              this.autoID.equals(other.getAutoID()))) &&
            ((this.uniqueConstraint1==null && other.getUniqueConstraint1()==null) || 
             (this.uniqueConstraint1!=null &&
              this.uniqueConstraint1.equals(other.getUniqueConstraint1())));
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
        if (getKeyMapping() != null) {
            _hashCode += getKeyMapping().hashCode();
        }
        if (getAutoID() != null) {
            _hashCode += getAutoID().hashCode();
        }
        if (getUniqueConstraint1() != null) {
            _hashCode += getUniqueConstraint1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FundcenterID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "internalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "keyMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "autoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueConstraint1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "uniqueConstraint1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterUniqueConstraint1"));
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
