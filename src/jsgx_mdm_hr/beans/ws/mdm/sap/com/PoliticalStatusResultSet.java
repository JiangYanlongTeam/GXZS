/**
 * PoliticalStatusResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class PoliticalStatusResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatus[] politicalStatus;

    public PoliticalStatusResultSet() {
    }

    public PoliticalStatusResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatus[] politicalStatus) {
        super(
            executionStatus);
        this.politicalStatus = politicalStatus;
    }


    /**
     * Gets the politicalStatus value for this PoliticalStatusResultSet.
     * 
     * @return politicalStatus
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatus[] getPoliticalStatus() {
        return politicalStatus;
    }


    /**
     * Sets the politicalStatus value for this PoliticalStatusResultSet.
     * 
     * @param politicalStatus
     */
    public void setPoliticalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatus[] politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatus getPoliticalStatus(int i) {
        return this.politicalStatus[i];
    }

    public void setPoliticalStatus(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatus _value) {
        this.politicalStatus[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PoliticalStatusResultSet)) return false;
        PoliticalStatusResultSet other = (PoliticalStatusResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.politicalStatus==null && other.getPoliticalStatus()==null) || 
             (this.politicalStatus!=null &&
              java.util.Arrays.equals(this.politicalStatus, other.getPoliticalStatus())));
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
        if (getPoliticalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoliticalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoliticalStatus(), i);
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
        new org.apache.axis.description.TypeDesc(PoliticalStatusResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("politicalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "politicalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatus"));
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
