/**
 * ClientSystemsResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class ClientSystemsResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems[] clientSystems;

    public ClientSystemsResultSet() {
    }

    public ClientSystemsResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems[] clientSystems) {
        super(
            executionStatus);
        this.clientSystems = clientSystems;
    }


    /**
     * Gets the clientSystems value for this ClientSystemsResultSet.
     * 
     * @return clientSystems
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems[] getClientSystems() {
        return clientSystems;
    }


    /**
     * Sets the clientSystems value for this ClientSystemsResultSet.
     * 
     * @param clientSystems
     */
    public void setClientSystems(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems[] clientSystems) {
        this.clientSystems = clientSystems;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems getClientSystems(int i) {
        return this.clientSystems[i];
    }

    public void setClientSystems(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems _value) {
        this.clientSystems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientSystemsResultSet)) return false;
        ClientSystemsResultSet other = (ClientSystemsResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.clientSystems==null && other.getClientSystems()==null) || 
             (this.clientSystems!=null &&
              java.util.Arrays.equals(this.clientSystems, other.getClientSystems())));
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
        if (getClientSystems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientSystems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientSystems(), i);
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
        new org.apache.axis.description.TypeDesc(ClientSystemsResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSystems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "clientSystems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystems"));
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
