/**
 * DT_1082_OA2ERP_ZJZFSP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.jsgx.www.E4D.service;

public class DT_1082_OA2ERP_ZJZFSP  implements java.io.Serializable {
    private java.lang.String SYSTEM;

    private java.lang.String OUTPUT;

    public DT_1082_OA2ERP_ZJZFSP() {
    }

    public DT_1082_OA2ERP_ZJZFSP(
           java.lang.String SYSTEM,
           java.lang.String OUTPUT) {
           this.SYSTEM = SYSTEM;
           this.OUTPUT = OUTPUT;
    }


    /**
     * Gets the SYSTEM value for this DT_1082_OA2ERP_ZJZFSP.
     * 
     * @return SYSTEM
     */
    public java.lang.String getSYSTEM() {
        return SYSTEM;
    }


    /**
     * Sets the SYSTEM value for this DT_1082_OA2ERP_ZJZFSP.
     * 
     * @param SYSTEM
     */
    public void setSYSTEM(java.lang.String SYSTEM) {
        this.SYSTEM = SYSTEM;
    }


    /**
     * Gets the OUTPUT value for this DT_1082_OA2ERP_ZJZFSP.
     * 
     * @return OUTPUT
     */
    public java.lang.String getOUTPUT() {
        return OUTPUT;
    }


    /**
     * Sets the OUTPUT value for this DT_1082_OA2ERP_ZJZFSP.
     * 
     * @param OUTPUT
     */
    public void setOUTPUT(java.lang.String OUTPUT) {
        this.OUTPUT = OUTPUT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DT_1082_OA2ERP_ZJZFSP)) return false;
        DT_1082_OA2ERP_ZJZFSP other = (DT_1082_OA2ERP_ZJZFSP) obj;
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
        new org.apache.axis.description.TypeDesc(DT_1082_OA2ERP_ZJZFSP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.jsgx.net/E4D/service", "DT_1082_OA2ERP_ZJZFSP"));
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
