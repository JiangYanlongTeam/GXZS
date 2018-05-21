/**
 * MaterialsUniqueConstraint1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_material.beans.ws.mdm.sap.com;

public class MaterialsUniqueConstraint1  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String mAKTX;

    private beans.ws.mdm.sap.com.BasicRecordIdentification mBRSH;

    public MaterialsUniqueConstraint1() {
    }

    public MaterialsUniqueConstraint1(
           java.lang.String mAKTX,
           beans.ws.mdm.sap.com.BasicRecordIdentification mBRSH) {
        this.mAKTX = mAKTX;
        this.mBRSH = mBRSH;
    }


    /**
     * Gets the mAKTX value for this MaterialsUniqueConstraint1.
     * 
     * @return mAKTX
     */
    public java.lang.String getMAKTX() {
        return mAKTX;
    }


    /**
     * Sets the mAKTX value for this MaterialsUniqueConstraint1.
     * 
     * @param mAKTX
     */
    public void setMAKTX(java.lang.String mAKTX) {
        this.mAKTX = mAKTX;
    }


    /**
     * Gets the mBRSH value for this MaterialsUniqueConstraint1.
     * 
     * @return mBRSH
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getMBRSH() {
        return mBRSH;
    }


    /**
     * Sets the mBRSH value for this MaterialsUniqueConstraint1.
     * 
     * @param mBRSH
     */
    public void setMBRSH(beans.ws.mdm.sap.com.BasicRecordIdentification mBRSH) {
        this.mBRSH = mBRSH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaterialsUniqueConstraint1)) return false;
        MaterialsUniqueConstraint1 other = (MaterialsUniqueConstraint1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mAKTX==null && other.getMAKTX()==null) || 
             (this.mAKTX!=null &&
              this.mAKTX.equals(other.getMAKTX()))) &&
            ((this.mBRSH==null && other.getMBRSH()==null) || 
             (this.mBRSH!=null &&
              this.mBRSH.equals(other.getMBRSH())));
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
        if (getMAKTX() != null) {
            _hashCode += getMAKTX().hashCode();
        }
        if (getMBRSH() != null) {
            _hashCode += getMBRSH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaterialsUniqueConstraint1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsUniqueConstraint1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAKTX");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mAKTX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MBRSH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mBRSH"));
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
