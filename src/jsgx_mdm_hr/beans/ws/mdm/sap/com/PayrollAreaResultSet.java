/**
 * PayrollAreaResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class PayrollAreaResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollArea[] payrollArea;

    public PayrollAreaResultSet() {
    }

    public PayrollAreaResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollArea[] payrollArea) {
        super(
            executionStatus);
        this.payrollArea = payrollArea;
    }


    /**
     * Gets the payrollArea value for this PayrollAreaResultSet.
     * 
     * @return payrollArea
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollArea[] getPayrollArea() {
        return payrollArea;
    }


    /**
     * Sets the payrollArea value for this PayrollAreaResultSet.
     * 
     * @param payrollArea
     */
    public void setPayrollArea(jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollArea[] payrollArea) {
        this.payrollArea = payrollArea;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollArea getPayrollArea(int i) {
        return this.payrollArea[i];
    }

    public void setPayrollArea(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollArea _value) {
        this.payrollArea[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayrollAreaResultSet)) return false;
        PayrollAreaResultSet other = (PayrollAreaResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.payrollArea==null && other.getPayrollArea()==null) || 
             (this.payrollArea!=null &&
              java.util.Arrays.equals(this.payrollArea, other.getPayrollArea())));
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
        if (getPayrollArea() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollArea());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollArea(), i);
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
        new org.apache.axis.description.TypeDesc(PayrollAreaResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollArea");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "payrollArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollArea"));
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
