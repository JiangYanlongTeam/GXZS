/**
 * CountriesResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class CountriesResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Countries[] countries;

    public CountriesResultSet() {
    }

    public CountriesResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Countries[] countries) {
        super(
            executionStatus);
        this.countries = countries;
    }


    /**
     * Gets the countries value for this CountriesResultSet.
     * 
     * @return countries
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Countries[] getCountries() {
        return countries;
    }


    /**
     * Sets the countries value for this CountriesResultSet.
     * 
     * @param countries
     */
    public void setCountries(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Countries[] countries) {
        this.countries = countries;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Countries getCountries(int i) {
        return this.countries[i];
    }

    public void setCountries(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Countries _value) {
        this.countries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountriesResultSet)) return false;
        CountriesResultSet other = (CountriesResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countries==null && other.getCountries()==null) || 
             (this.countries!=null &&
              java.util.Arrays.equals(this.countries, other.getCountries())));
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
        if (getCountries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountries(), i);
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
        new org.apache.axis.description.TypeDesc(CountriesResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "countries"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Countries"));
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
