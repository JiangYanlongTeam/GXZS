/**
 * EthnicGroupsResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EthnicGroupsResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroups[] ethnicGroups;

    public EthnicGroupsResultSet() {
    }

    public EthnicGroupsResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroups[] ethnicGroups) {
        super(
            executionStatus);
        this.ethnicGroups = ethnicGroups;
    }


    /**
     * Gets the ethnicGroups value for this EthnicGroupsResultSet.
     * 
     * @return ethnicGroups
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroups[] getEthnicGroups() {
        return ethnicGroups;
    }


    /**
     * Sets the ethnicGroups value for this EthnicGroupsResultSet.
     * 
     * @param ethnicGroups
     */
    public void setEthnicGroups(jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroups[] ethnicGroups) {
        this.ethnicGroups = ethnicGroups;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroups getEthnicGroups(int i) {
        return this.ethnicGroups[i];
    }

    public void setEthnicGroups(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroups _value) {
        this.ethnicGroups[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EthnicGroupsResultSet)) return false;
        EthnicGroupsResultSet other = (EthnicGroupsResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ethnicGroups==null && other.getEthnicGroups()==null) || 
             (this.ethnicGroups!=null &&
              java.util.Arrays.equals(this.ethnicGroups, other.getEthnicGroups())));
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
        if (getEthnicGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEthnicGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEthnicGroups(), i);
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
        new org.apache.axis.description.TypeDesc(EthnicGroupsResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnicGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ethnicGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroups"));
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
