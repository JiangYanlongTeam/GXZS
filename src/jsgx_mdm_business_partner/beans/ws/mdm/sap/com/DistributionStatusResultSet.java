/**
 * DistributionStatusResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class DistributionStatusResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatus[] distributionStatus;

    public DistributionStatusResultSet() {
    }

    public DistributionStatusResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatus[] distributionStatus) {
        super(
            executionStatus);
        this.distributionStatus = distributionStatus;
    }


    /**
     * Gets the distributionStatus value for this DistributionStatusResultSet.
     * 
     * @return distributionStatus
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatus[] getDistributionStatus() {
        return distributionStatus;
    }


    /**
     * Sets the distributionStatus value for this DistributionStatusResultSet.
     * 
     * @param distributionStatus
     */
    public void setDistributionStatus(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatus[] distributionStatus) {
        this.distributionStatus = distributionStatus;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatus getDistributionStatus(int i) {
        return this.distributionStatus[i];
    }

    public void setDistributionStatus(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatus _value) {
        this.distributionStatus[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributionStatusResultSet)) return false;
        DistributionStatusResultSet other = (DistributionStatusResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.distributionStatus==null && other.getDistributionStatus()==null) || 
             (this.distributionStatus!=null &&
              java.util.Arrays.equals(this.distributionStatus, other.getDistributionStatus())));
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
        if (getDistributionStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributionStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributionStatus(), i);
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
        new org.apache.axis.description.TypeDesc(DistributionStatusResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "distributionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatus"));
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
