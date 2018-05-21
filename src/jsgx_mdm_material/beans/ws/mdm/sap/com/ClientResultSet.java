/**
 * ClientResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_material.beans.ws.mdm.sap.com;

public class ClientResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_material.beans.ws.mdm.sap.com.Client[] client;

    public ClientResultSet() {
    }

    public ClientResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_material.beans.ws.mdm.sap.com.Client[] client) {
        super(
            executionStatus);
        this.client = client;
    }


    /**
     * Gets the client value for this ClientResultSet.
     * 
     * @return client
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.Client[] getClient() {
        return client;
    }


    /**
     * Sets the client value for this ClientResultSet.
     * 
     * @param client
     */
    public void setClient(jsgx_mdm_material.beans.ws.mdm.sap.com.Client[] client) {
        this.client = client;
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.Client getClient(int i) {
        return this.client[i];
    }

    public void setClient(int i, jsgx_mdm_material.beans.ws.mdm.sap.com.Client _value) {
        this.client[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientResultSet)) return false;
        ClientResultSet other = (ClientResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              java.util.Arrays.equals(this.client, other.getClient())));
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
        if (getClient() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClient());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClient(), i);
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
        new org.apache.axis.description.TypeDesc(ClientResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "Client"));
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
