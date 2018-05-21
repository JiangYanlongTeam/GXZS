/**
 * UpdateConfigurationParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class UpdateConfigurationParameters  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private java.lang.Boolean applyNullValuesToMdm;

    public UpdateConfigurationParameters() {
    }

    public UpdateConfigurationParameters(
           java.lang.Boolean applyNullValuesToMdm) {
        this.applyNullValuesToMdm = applyNullValuesToMdm;
    }


    /**
     * Gets the applyNullValuesToMdm value for this UpdateConfigurationParameters.
     * 
     * @return applyNullValuesToMdm
     */
    public java.lang.Boolean getApplyNullValuesToMdm() {
        return applyNullValuesToMdm;
    }


    /**
     * Sets the applyNullValuesToMdm value for this UpdateConfigurationParameters.
     * 
     * @param applyNullValuesToMdm
     */
    public void setApplyNullValuesToMdm(java.lang.Boolean applyNullValuesToMdm) {
        this.applyNullValuesToMdm = applyNullValuesToMdm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateConfigurationParameters)) return false;
        UpdateConfigurationParameters other = (UpdateConfigurationParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applyNullValuesToMdm==null && other.getApplyNullValuesToMdm()==null) || 
             (this.applyNullValuesToMdm!=null &&
              this.applyNullValuesToMdm.equals(other.getApplyNullValuesToMdm())));
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
        if (getApplyNullValuesToMdm() != null) {
            _hashCode += getApplyNullValuesToMdm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateConfigurationParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNullValuesToMdm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "applyNullValuesToMdm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
