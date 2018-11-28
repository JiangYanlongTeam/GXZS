/**
 * DT_1104_ALL2ERP_FPJY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.jsgx.www.E1D.service;

public class DT_1104_ALL2ERP_FPJY  implements java.io.Serializable {
    private String SYSTEM;

    private String OUTPUT;

    public DT_1104_ALL2ERP_FPJY() {
    }

    public DT_1104_ALL2ERP_FPJY(
           String SYSTEM,
           String OUTPUT) {
           this.SYSTEM = SYSTEM;
           this.OUTPUT = OUTPUT;
    }


    /**
     * Gets the SYSTEM value for this DT_1104_ALL2ERP_FPJY.
     * 
     * @return SYSTEM
     */
    public String getSYSTEM() {
        return SYSTEM;
    }


    /**
     * Sets the SYSTEM value for this DT_1104_ALL2ERP_FPJY.
     * 
     * @param SYSTEM
     */
    public void setSYSTEM(String SYSTEM) {
        this.SYSTEM = SYSTEM;
    }


    /**
     * Gets the OUTPUT value for this DT_1104_ALL2ERP_FPJY.
     * 
     * @return OUTPUT
     */
    public String getOUTPUT() {
        return OUTPUT;
    }


    /**
     * Sets the OUTPUT value for this DT_1104_ALL2ERP_FPJY.
     * 
     * @param OUTPUT
     */
    public void setOUTPUT(String OUTPUT) {
        this.OUTPUT = OUTPUT;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DT_1104_ALL2ERP_FPJY)) return false;
        DT_1104_ALL2ERP_FPJY other = (DT_1104_ALL2ERP_FPJY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SYSTEM==null && other.getSYSTEM()==null) || 
             (this.SYSTEM!=null &&
              this.SYSTEM.equals(other.getSYSTEM()))) &&
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
        if (getSYSTEM() != null) {
            _hashCode += getSYSTEM().hashCode();
        }
        if (getOUTPUT() != null) {
            _hashCode += getOUTPUT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DT_1104_ALL2ERP_FPJY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.jsgx.net/E1D/service", "DT_1104_ALL2ERP_FPJY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SYSTEM"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
