/**
 * IndustrySectorResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_material.beans.ws.mdm.sap.com;

public class IndustrySectorResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySector[] industrySector;

    public IndustrySectorResultSet() {
    }

    public IndustrySectorResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySector[] industrySector) {
        super(
            executionStatus);
        this.industrySector = industrySector;
    }


    /**
     * Gets the industrySector value for this IndustrySectorResultSet.
     * 
     * @return industrySector
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySector[] getIndustrySector() {
        return industrySector;
    }


    /**
     * Sets the industrySector value for this IndustrySectorResultSet.
     * 
     * @param industrySector
     */
    public void setIndustrySector(jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySector[] industrySector) {
        this.industrySector = industrySector;
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySector getIndustrySector(int i) {
        return this.industrySector[i];
    }

    public void setIndustrySector(int i, jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySector _value) {
        this.industrySector[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndustrySectorResultSet)) return false;
        IndustrySectorResultSet other = (IndustrySectorResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.industrySector==null && other.getIndustrySector()==null) || 
             (this.industrySector!=null &&
              java.util.Arrays.equals(this.industrySector, other.getIndustrySector())));
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
        if (getIndustrySector() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndustrySector());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndustrySector(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndustrySectorResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industrySector");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "industrySector"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySector"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
