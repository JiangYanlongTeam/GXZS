/**
 * ID_TypeID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class ID_TypeID  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.math.BigInteger internalID;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint1 uniqueConstraint1;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint2 uniqueConstraint2;

    public ID_TypeID() {
    }

    public ID_TypeID(
           java.math.BigInteger internalID,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint1 uniqueConstraint1,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint2 uniqueConstraint2) {
        this.internalID = internalID;
        this.uniqueConstraint1 = uniqueConstraint1;
        this.uniqueConstraint2 = uniqueConstraint2;
    }


    /**
     * Gets the internalID value for this ID_TypeID.
     * 
     * @return internalID
     */
    public java.math.BigInteger getInternalID() {
        return internalID;
    }


    /**
     * Sets the internalID value for this ID_TypeID.
     * 
     * @param internalID
     */
    public void setInternalID(java.math.BigInteger internalID) {
        this.internalID = internalID;
    }


    /**
     * Gets the uniqueConstraint1 value for this ID_TypeID.
     * 
     * @return uniqueConstraint1
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint1 getUniqueConstraint1() {
        return uniqueConstraint1;
    }


    /**
     * Sets the uniqueConstraint1 value for this ID_TypeID.
     * 
     * @param uniqueConstraint1
     */
    public void setUniqueConstraint1(jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint1 uniqueConstraint1) {
        this.uniqueConstraint1 = uniqueConstraint1;
    }


    /**
     * Gets the uniqueConstraint2 value for this ID_TypeID.
     * 
     * @return uniqueConstraint2
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint2 getUniqueConstraint2() {
        return uniqueConstraint2;
    }


    /**
     * Sets the uniqueConstraint2 value for this ID_TypeID.
     * 
     * @param uniqueConstraint2
     */
    public void setUniqueConstraint2(jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint2 uniqueConstraint2) {
        this.uniqueConstraint2 = uniqueConstraint2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID_TypeID)) return false;
        ID_TypeID other = (ID_TypeID) obj;
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
            ((this.uniqueConstraint1==null && other.getUniqueConstraint1()==null) || 
             (this.uniqueConstraint1!=null &&
              this.uniqueConstraint1.equals(other.getUniqueConstraint1()))) &&
            ((this.uniqueConstraint2==null && other.getUniqueConstraint2()==null) || 
             (this.uniqueConstraint2!=null &&
              this.uniqueConstraint2.equals(other.getUniqueConstraint2())));
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
        if (getUniqueConstraint1() != null) {
            _hashCode += getUniqueConstraint1().hashCode();
        }
        if (getUniqueConstraint2() != null) {
            _hashCode += getUniqueConstraint2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ID_TypeID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "internalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueConstraint1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "uniqueConstraint1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeUniqueConstraint1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueConstraint2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "uniqueConstraint2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeUniqueConstraint2"));
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
