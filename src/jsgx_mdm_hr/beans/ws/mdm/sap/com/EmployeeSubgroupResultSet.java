/**
 * EmployeeSubgroupResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EmployeeSubgroupResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroup[] employeeSubgroup;

    public EmployeeSubgroupResultSet() {
    }

    public EmployeeSubgroupResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroup[] employeeSubgroup) {
        super(
            executionStatus);
        this.employeeSubgroup = employeeSubgroup;
    }


    /**
     * Gets the employeeSubgroup value for this EmployeeSubgroupResultSet.
     * 
     * @return employeeSubgroup
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroup[] getEmployeeSubgroup() {
        return employeeSubgroup;
    }


    /**
     * Sets the employeeSubgroup value for this EmployeeSubgroupResultSet.
     * 
     * @param employeeSubgroup
     */
    public void setEmployeeSubgroup(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroup[] employeeSubgroup) {
        this.employeeSubgroup = employeeSubgroup;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroup getEmployeeSubgroup(int i) {
        return this.employeeSubgroup[i];
    }

    public void setEmployeeSubgroup(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroup _value) {
        this.employeeSubgroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeSubgroupResultSet)) return false;
        EmployeeSubgroupResultSet other = (EmployeeSubgroupResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.employeeSubgroup==null && other.getEmployeeSubgroup()==null) || 
             (this.employeeSubgroup!=null &&
              java.util.Arrays.equals(this.employeeSubgroup, other.getEmployeeSubgroup())));
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
        if (getEmployeeSubgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeSubgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeSubgroup(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeSubgroupResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeSubgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "employeeSubgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroup"));
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
