/**
 * SchoolTypeResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class SchoolTypeResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolType[] schoolType;

    public SchoolTypeResultSet() {
    }

    public SchoolTypeResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolType[] schoolType) {
        super(
            executionStatus);
        this.schoolType = schoolType;
    }


    /**
     * Gets the schoolType value for this SchoolTypeResultSet.
     * 
     * @return schoolType
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolType[] getSchoolType() {
        return schoolType;
    }


    /**
     * Sets the schoolType value for this SchoolTypeResultSet.
     * 
     * @param schoolType
     */
    public void setSchoolType(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolType[] schoolType) {
        this.schoolType = schoolType;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolType getSchoolType(int i) {
        return this.schoolType[i];
    }

    public void setSchoolType(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolType _value) {
        this.schoolType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchoolTypeResultSet)) return false;
        SchoolTypeResultSet other = (SchoolTypeResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.schoolType==null && other.getSchoolType()==null) || 
             (this.schoolType!=null &&
              java.util.Arrays.equals(this.schoolType, other.getSchoolType())));
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
        if (getSchoolType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchoolType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchoolType(), i);
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
        new org.apache.axis.description.TypeDesc(SchoolTypeResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schoolType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "schoolType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolType"));
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
