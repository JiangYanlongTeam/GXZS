/**
 * DT_1057_OA2ERP_KJPZ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.jsgx.www.E5D.service;


/**
 * OA传输至ERP系统创建财务凭证
 */
public class DT_1057_OA2ERP_KJPZ  implements java.io.Serializable {
    private java.lang.String SYSID;

    private java.lang.String OUTPUT;

    public DT_1057_OA2ERP_KJPZ() {
    }

    public DT_1057_OA2ERP_KJPZ(
           java.lang.String SYSID,
           java.lang.String OUTPUT) {
           this.SYSID = SYSID;
           this.OUTPUT = OUTPUT;
    }


    /**
     * Gets the SYSID value for this DT_1057_OA2ERP_KJPZ.
     * 
     * @return SYSID
     */
    public java.lang.String getSYSID() {
        return SYSID;
    }


    /**
     * Sets the SYSID value for this DT_1057_OA2ERP_KJPZ.
     * 
     * @param SYSID
     */
    public void setSYSID(java.lang.String SYSID) {
        this.SYSID = SYSID;
    }


    /**
     * Gets the OUTPUT value for this DT_1057_OA2ERP_KJPZ.
     * 
     * @return OUTPUT
     */
    public java.lang.String getOUTPUT() {
        return OUTPUT;
    }


    /**
     * Sets the OUTPUT value for this DT_1057_OA2ERP_KJPZ.
     * 
     * @param OUTPUT
     */
    public void setOUTPUT(java.lang.String OUTPUT) {
        this.OUTPUT = OUTPUT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_1057_OA2ERP_KJPZ)) return false;
        DT_1057_OA2ERP_KJPZ other = (DT_1057_OA2ERP_KJPZ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SYSID==null && other.getSYSID()==null) || 
             (this.SYSID!=null &&
              this.SYSID.equals(other.getSYSID()))) &&
            ((this.OUTPUT==null && other.getOUTPUT()==null) || 
             (this.OUTPUT!=null &&
              this.OUTPUT.equals(other.getOUTPUT())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSYSID() != null) {
            _hashCode += getSYSID().hashCode();
        }
        if (getOUTPUT() != null) {
            _hashCode += getOUTPUT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_1057_OA2ERP_KJPZ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.jsgx.net/E5D/service", "DT_1057_OA2ERP_KJPZ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYSID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SYSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUTPUT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OUTPUT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
