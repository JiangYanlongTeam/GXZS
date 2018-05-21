/**
 * EducationSystemUnitResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EducationSystemUnitResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnit[] educationSystemUnit;

    public EducationSystemUnitResultSet() {
    }

    public EducationSystemUnitResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnit[] educationSystemUnit) {
        super(
            executionStatus);
        this.educationSystemUnit = educationSystemUnit;
    }


    /**
     * Gets the educationSystemUnit value for this EducationSystemUnitResultSet.
     * 
     * @return educationSystemUnit
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnit[] getEducationSystemUnit() {
        return educationSystemUnit;
    }


    /**
     * Sets the educationSystemUnit value for this EducationSystemUnitResultSet.
     * 
     * @param educationSystemUnit
     */
    public void setEducationSystemUnit(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnit[] educationSystemUnit) {
        this.educationSystemUnit = educationSystemUnit;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnit getEducationSystemUnit(int i) {
        return this.educationSystemUnit[i];
    }

    public void setEducationSystemUnit(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnit _value) {
        this.educationSystemUnit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EducationSystemUnitResultSet)) return false;
        EducationSystemUnitResultSet other = (EducationSystemUnitResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.educationSystemUnit==null && other.getEducationSystemUnit()==null) || 
             (this.educationSystemUnit!=null &&
              java.util.Arrays.equals(this.educationSystemUnit, other.getEducationSystemUnit())));
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
        if (getEducationSystemUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEducationSystemUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEducationSystemUnit(), i);
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
        new org.apache.axis.description.TypeDesc(EducationSystemUnitResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationSystemUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationSystemUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnit"));
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
