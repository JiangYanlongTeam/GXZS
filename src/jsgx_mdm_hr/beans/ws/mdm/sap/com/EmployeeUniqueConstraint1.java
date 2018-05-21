/**
 * EmployeeUniqueConstraint1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EmployeeUniqueConstraint1  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String iCNUM;

    private beans.ws.mdm.sap.com.BasicRecordIdentification iCTYP;

    public EmployeeUniqueConstraint1() {
    }

    public EmployeeUniqueConstraint1(
           java.lang.String iCNUM,
           beans.ws.mdm.sap.com.BasicRecordIdentification iCTYP) {
        this.iCNUM = iCNUM;
        this.iCTYP = iCTYP;
    }


    /**
     * Gets the iCNUM value for this EmployeeUniqueConstraint1.
     * 
     * @return iCNUM
     */
    public java.lang.String getICNUM() {
        return iCNUM;
    }


    /**
     * Sets the iCNUM value for this EmployeeUniqueConstraint1.
     * 
     * @param iCNUM
     */
    public void setICNUM(java.lang.String iCNUM) {
        this.iCNUM = iCNUM;
    }


    /**
     * Gets the iCTYP value for this EmployeeUniqueConstraint1.
     * 
     * @return iCTYP
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getICTYP() {
        return iCTYP;
    }


    /**
     * Sets the iCTYP value for this EmployeeUniqueConstraint1.
     * 
     * @param iCTYP
     */
    public void setICTYP(beans.ws.mdm.sap.com.BasicRecordIdentification iCTYP) {
        this.iCTYP = iCTYP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeUniqueConstraint1)) return false;
        EmployeeUniqueConstraint1 other = (EmployeeUniqueConstraint1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.iCNUM==null && other.getICNUM()==null) || 
             (this.iCNUM!=null &&
              this.iCNUM.equals(other.getICNUM()))) &&
            ((this.iCTYP==null && other.getICTYP()==null) || 
             (this.iCTYP!=null &&
              this.iCTYP.equals(other.getICTYP())));
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
        if (getICNUM() != null) {
            _hashCode += getICNUM().hashCode();
        }
        if (getICTYP() != null) {
            _hashCode += getICTYP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeUniqueConstraint1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeUniqueConstraint1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "iCNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "iCTYP"));
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
