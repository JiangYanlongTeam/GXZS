/**
 * MaritalStatusResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class MaritalStatusResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatus[] maritalStatus;

    public MaritalStatusResultSet() {
    }

    public MaritalStatusResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatus[] maritalStatus) {
        super(
            executionStatus);
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the maritalStatus value for this MaritalStatusResultSet.
     * 
     * @return maritalStatus
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatus[] getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this MaritalStatusResultSet.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatus[] maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatus getMaritalStatus(int i) {
        return this.maritalStatus[i];
    }

    public void setMaritalStatus(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatus _value) {
        this.maritalStatus[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaritalStatusResultSet)) return false;
        MaritalStatusResultSet other = (MaritalStatusResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              java.util.Arrays.equals(this.maritalStatus, other.getMaritalStatus())));
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
        if (getMaritalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaritalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaritalStatus(), i);
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
        new org.apache.axis.description.TypeDesc(MaritalStatusResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "maritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatus"));
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
