/**
 * CustomerAccountGroupsResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class CustomerAccountGroupsResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroups[] customerAccountGroups;

    public CustomerAccountGroupsResultSet() {
    }

    public CustomerAccountGroupsResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroups[] customerAccountGroups) {
        super(
            executionStatus);
        this.customerAccountGroups = customerAccountGroups;
    }


    /**
     * Gets the customerAccountGroups value for this CustomerAccountGroupsResultSet.
     * 
     * @return customerAccountGroups
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroups[] getCustomerAccountGroups() {
        return customerAccountGroups;
    }


    /**
     * Sets the customerAccountGroups value for this CustomerAccountGroupsResultSet.
     * 
     * @param customerAccountGroups
     */
    public void setCustomerAccountGroups(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroups[] customerAccountGroups) {
        this.customerAccountGroups = customerAccountGroups;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroups getCustomerAccountGroups(int i) {
        return this.customerAccountGroups[i];
    }

    public void setCustomerAccountGroups(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroups _value) {
        this.customerAccountGroups[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerAccountGroupsResultSet)) return false;
        CustomerAccountGroupsResultSet other = (CustomerAccountGroupsResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customerAccountGroups==null && other.getCustomerAccountGroups()==null) || 
             (this.customerAccountGroups!=null &&
              java.util.Arrays.equals(this.customerAccountGroups, other.getCustomerAccountGroups())));
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
        if (getCustomerAccountGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerAccountGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerAccountGroups(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerAccountGroupsResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAccountGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "customerAccountGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroups"));
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
