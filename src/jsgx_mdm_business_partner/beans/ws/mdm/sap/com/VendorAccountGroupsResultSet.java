/**
 * VendorAccountGroupsResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class VendorAccountGroupsResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroups[] vendorAccountGroups;

    public VendorAccountGroupsResultSet() {
    }

    public VendorAccountGroupsResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroups[] vendorAccountGroups) {
        super(
            executionStatus);
        this.vendorAccountGroups = vendorAccountGroups;
    }


    /**
     * Gets the vendorAccountGroups value for this VendorAccountGroupsResultSet.
     * 
     * @return vendorAccountGroups
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroups[] getVendorAccountGroups() {
        return vendorAccountGroups;
    }


    /**
     * Sets the vendorAccountGroups value for this VendorAccountGroupsResultSet.
     * 
     * @param vendorAccountGroups
     */
    public void setVendorAccountGroups(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroups[] vendorAccountGroups) {
        this.vendorAccountGroups = vendorAccountGroups;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroups getVendorAccountGroups(int i) {
        return this.vendorAccountGroups[i];
    }

    public void setVendorAccountGroups(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroups _value) {
        this.vendorAccountGroups[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorAccountGroupsResultSet)) return false;
        VendorAccountGroupsResultSet other = (VendorAccountGroupsResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vendorAccountGroups==null && other.getVendorAccountGroups()==null) || 
             (this.vendorAccountGroups!=null &&
              java.util.Arrays.equals(this.vendorAccountGroups, other.getVendorAccountGroups())));
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
        if (getVendorAccountGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorAccountGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorAccountGroups(), i);
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
        new org.apache.axis.description.TypeDesc(VendorAccountGroupsResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorAccountGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "vendorAccountGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroups"));
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
