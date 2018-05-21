/**
 * EmployeeGroupResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EmployeeGroupResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroup[] employeeGroup;

    public EmployeeGroupResultSet() {
    }

    public EmployeeGroupResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroup[] employeeGroup) {
        super(
            executionStatus);
        this.employeeGroup = employeeGroup;
    }


    /**
     * Gets the employeeGroup value for this EmployeeGroupResultSet.
     * 
     * @return employeeGroup
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroup[] getEmployeeGroup() {
        return employeeGroup;
    }


    /**
     * Sets the employeeGroup value for this EmployeeGroupResultSet.
     * 
     * @param employeeGroup
     */
    public void setEmployeeGroup(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroup[] employeeGroup) {
        this.employeeGroup = employeeGroup;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroup getEmployeeGroup(int i) {
        return this.employeeGroup[i];
    }

    public void setEmployeeGroup(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroup _value) {
        this.employeeGroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeGroupResultSet)) return false;
        EmployeeGroupResultSet other = (EmployeeGroupResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.employeeGroup==null && other.getEmployeeGroup()==null) || 
             (this.employeeGroup!=null &&
              java.util.Arrays.equals(this.employeeGroup, other.getEmployeeGroup())));
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
        if (getEmployeeGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeGroup(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeGroupResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "employeeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroup"));
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
