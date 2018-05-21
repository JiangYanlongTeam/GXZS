/**
 * OperationTypesResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class OperationTypesResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypes[] operationTypes;

    public OperationTypesResultSet() {
    }

    public OperationTypesResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypes[] operationTypes) {
        super(
            executionStatus);
        this.operationTypes = operationTypes;
    }


    /**
     * Gets the operationTypes value for this OperationTypesResultSet.
     * 
     * @return operationTypes
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypes[] getOperationTypes() {
        return operationTypes;
    }


    /**
     * Sets the operationTypes value for this OperationTypesResultSet.
     * 
     * @param operationTypes
     */
    public void setOperationTypes(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypes[] operationTypes) {
        this.operationTypes = operationTypes;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypes getOperationTypes(int i) {
        return this.operationTypes[i];
    }

    public void setOperationTypes(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypes _value) {
        this.operationTypes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationTypesResultSet)) return false;
        OperationTypesResultSet other = (OperationTypesResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.operationTypes==null && other.getOperationTypes()==null) || 
             (this.operationTypes!=null &&
              java.util.Arrays.equals(this.operationTypes, other.getOperationTypes())));
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
        if (getOperationTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationTypes(), i);
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
        new org.apache.axis.description.TypeDesc(OperationTypesResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "operationTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypes"));
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
