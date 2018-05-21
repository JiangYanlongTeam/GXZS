/**
 * JobPositionResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class JobPositionResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPosition[] jobPosition;

    public JobPositionResultSet() {
    }

    public JobPositionResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPosition[] jobPosition) {
        super(
            executionStatus);
        this.jobPosition = jobPosition;
    }


    /**
     * Gets the jobPosition value for this JobPositionResultSet.
     * 
     * @return jobPosition
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPosition[] getJobPosition() {
        return jobPosition;
    }


    /**
     * Sets the jobPosition value for this JobPositionResultSet.
     * 
     * @param jobPosition
     */
    public void setJobPosition(jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPosition[] jobPosition) {
        this.jobPosition = jobPosition;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPosition getJobPosition(int i) {
        return this.jobPosition[i];
    }

    public void setJobPosition(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPosition _value) {
        this.jobPosition[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobPositionResultSet)) return false;
        JobPositionResultSet other = (JobPositionResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.jobPosition==null && other.getJobPosition()==null) || 
             (this.jobPosition!=null &&
              java.util.Arrays.equals(this.jobPosition, other.getJobPosition())));
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
        if (getJobPosition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobPosition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobPosition(), i);
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
        new org.apache.axis.description.TypeDesc(JobPositionResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "jobPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPosition"));
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
