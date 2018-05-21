/**
 * BankAccountUniqueConstraint1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class BankAccountUniqueConstraint1  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String hKTID;

    private beans.ws.mdm.sap.com.BasicRecordIdentificationWithKeyMapping bANKL;

    private beans.ws.mdm.sap.com.BasicRecordIdentification bUKRS;

    public BankAccountUniqueConstraint1() {
    }

    public BankAccountUniqueConstraint1(
           java.lang.String hKTID,
           beans.ws.mdm.sap.com.BasicRecordIdentificationWithKeyMapping bANKL,
           beans.ws.mdm.sap.com.BasicRecordIdentification bUKRS) {
        this.hKTID = hKTID;
        this.bANKL = bANKL;
        this.bUKRS = bUKRS;
    }


    /**
     * Gets the hKTID value for this BankAccountUniqueConstraint1.
     * 
     * @return hKTID
     */
    public java.lang.String getHKTID() {
        return hKTID;
    }


    /**
     * Sets the hKTID value for this BankAccountUniqueConstraint1.
     * 
     * @param hKTID
     */
    public void setHKTID(java.lang.String hKTID) {
        this.hKTID = hKTID;
    }


    /**
     * Gets the bANKL value for this BankAccountUniqueConstraint1.
     * 
     * @return bANKL
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentificationWithKeyMapping getBANKL() {
        return bANKL;
    }


    /**
     * Sets the bANKL value for this BankAccountUniqueConstraint1.
     * 
     * @param bANKL
     */
    public void setBANKL(beans.ws.mdm.sap.com.BasicRecordIdentificationWithKeyMapping bANKL) {
        this.bANKL = bANKL;
    }


    /**
     * Gets the bUKRS value for this BankAccountUniqueConstraint1.
     * 
     * @return bUKRS
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getBUKRS() {
        return bUKRS;
    }


    /**
     * Sets the bUKRS value for this BankAccountUniqueConstraint1.
     * 
     * @param bUKRS
     */
    public void setBUKRS(beans.ws.mdm.sap.com.BasicRecordIdentification bUKRS) {
        this.bUKRS = bUKRS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccountUniqueConstraint1)) return false;
        BankAccountUniqueConstraint1 other = (BankAccountUniqueConstraint1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hKTID==null && other.getHKTID()==null) || 
             (this.hKTID!=null &&
              this.hKTID.equals(other.getHKTID()))) &&
            ((this.bANKL==null && other.getBANKL()==null) || 
             (this.bANKL!=null &&
              this.bANKL.equals(other.getBANKL()))) &&
            ((this.bUKRS==null && other.getBUKRS()==null) || 
             (this.bUKRS!=null &&
              this.bUKRS.equals(other.getBUKRS())));
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
        if (getHKTID() != null) {
            _hashCode += getHKTID().hashCode();
        }
        if (getBANKL() != null) {
            _hashCode += getBANKL().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccountUniqueConstraint1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountUniqueConstraint1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HKTID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "hKTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bANKL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BasicRecordIdentificationWithKeyMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BasicRecordIdentification"));
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
