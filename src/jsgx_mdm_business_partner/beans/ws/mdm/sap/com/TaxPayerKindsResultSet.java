/**
 * TaxPayerKindsResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class TaxPayerKindsResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKinds[] taxPayerKinds;

    public TaxPayerKindsResultSet() {
    }

    public TaxPayerKindsResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKinds[] taxPayerKinds) {
        super(
            executionStatus);
        this.taxPayerKinds = taxPayerKinds;
    }


    /**
     * Gets the taxPayerKinds value for this TaxPayerKindsResultSet.
     * 
     * @return taxPayerKinds
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKinds[] getTaxPayerKinds() {
        return taxPayerKinds;
    }


    /**
     * Sets the taxPayerKinds value for this TaxPayerKindsResultSet.
     * 
     * @param taxPayerKinds
     */
    public void setTaxPayerKinds(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKinds[] taxPayerKinds) {
        this.taxPayerKinds = taxPayerKinds;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKinds getTaxPayerKinds(int i) {
        return this.taxPayerKinds[i];
    }

    public void setTaxPayerKinds(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKinds _value) {
        this.taxPayerKinds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxPayerKindsResultSet)) return false;
        TaxPayerKindsResultSet other = (TaxPayerKindsResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.taxPayerKinds==null && other.getTaxPayerKinds()==null) || 
             (this.taxPayerKinds!=null &&
              java.util.Arrays.equals(this.taxPayerKinds, other.getTaxPayerKinds())));
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
        if (getTaxPayerKinds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxPayerKinds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxPayerKinds(), i);
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
        new org.apache.axis.description.TypeDesc(TaxPayerKindsResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPayerKinds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "taxPayerKinds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKinds"));
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
