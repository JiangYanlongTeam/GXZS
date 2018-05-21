/**
 * OperationReasonResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class OperationReasonResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReason[] operationReason;

    public OperationReasonResultSet() {
    }

    public OperationReasonResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReason[] operationReason) {
        super(
            executionStatus);
        this.operationReason = operationReason;
    }


    /**
     * Gets the operationReason value for this OperationReasonResultSet.
     * 
     * @return operationReason
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReason[] getOperationReason() {
        return operationReason;
    }


    /**
     * Sets the operationReason value for this OperationReasonResultSet.
     * 
     * @param operationReason
     */
    public void setOperationReason(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReason[] operationReason) {
        this.operationReason = operationReason;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReason getOperationReason(int i) {
        return this.operationReason[i];
    }

    public void setOperationReason(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReason _value) {
        this.operationReason[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationReasonResultSet)) return false;
        OperationReasonResultSet other = (OperationReasonResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operationReason==null && other.getOperationReason()==null) || 
             (this.operationReason!=null &&
              java.util.Arrays.equals(this.operationReason, other.getOperationReason())));
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
        if (getOperationReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationReason(), i);
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
        new org.apache.axis.description.TypeDesc(OperationReasonResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "operationReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReason"));
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
