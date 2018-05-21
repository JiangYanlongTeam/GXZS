/**
 * VendorsUniqueConstraint3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class VendorsUniqueConstraint3  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String sTCD1;

    public VendorsUniqueConstraint3() {
    }

    public VendorsUniqueConstraint3(
           java.lang.String sTCD1) {
        this.sTCD1 = sTCD1;
    }


    /**
     * Gets the sTCD1 value for this VendorsUniqueConstraint3.
     * 
     * @return sTCD1
     */
    public java.lang.String getSTCD1() {
        return sTCD1;
    }


    /**
     * Sets the sTCD1 value for this VendorsUniqueConstraint3.
     * 
     * @param sTCD1
     */
    public void setSTCD1(java.lang.String sTCD1) {
        this.sTCD1 = sTCD1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorsUniqueConstraint3)) return false;
        VendorsUniqueConstraint3 other = (VendorsUniqueConstraint3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sTCD1==null && other.getSTCD1()==null) || 
             (this.sTCD1!=null &&
              this.sTCD1.equals(other.getSTCD1())));
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
        if (getSTCD1() != null) {
            _hashCode += getSTCD1().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorsUniqueConstraint3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsUniqueConstraint3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCD1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTCD1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
