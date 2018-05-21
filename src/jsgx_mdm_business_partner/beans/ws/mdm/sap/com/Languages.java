/**
 * Languages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class Languages  extends jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesUpdate  implements java.io.Serializable {
    private java.lang.String displayValue;

    private java.lang.String checkoutStatus;

    private java.lang.Boolean isProtected;

    public Languages() {
    }

    public Languages(
           java.lang.String code,
           java.lang.String name,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesID recordIdentification,
           java.lang.String displayValue,
           java.lang.String checkoutStatus,
           java.lang.Boolean isProtected) {
        super(
            code,
            name,
            recordIdentification);
        this.displayValue = displayValue;
        this.checkoutStatus = checkoutStatus;
        this.isProtected = isProtected;
    }


    /**
     * Gets the displayValue value for this Languages.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this Languages.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the checkoutStatus value for this Languages.
     * 
     * @return checkoutStatus
     */
    public java.lang.String getCheckoutStatus() {
        return checkoutStatus;
    }


    /**
     * Sets the checkoutStatus value for this Languages.
     * 
     * @param checkoutStatus
     */
    public void setCheckoutStatus(java.lang.String checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }


    /**
     * Gets the isProtected value for this Languages.
     * 
     * @return isProtected
     */
    public java.lang.Boolean getIsProtected() {
        return isProtected;
    }


    /**
     * Sets the isProtected value for this Languages.
     * 
     * @param isProtected
     */
    public void setIsProtected(java.lang.Boolean isProtected) {
        this.isProtected = isProtected;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Languages)) return false;
        Languages other = (Languages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.checkoutStatus==null && other.getCheckoutStatus()==null) || 
             (this.checkoutStatus!=null &&
              this.checkoutStatus.equals(other.getCheckoutStatus()))) &&
            ((this.isProtected==null && other.getIsProtected()==null) || 
             (this.isProtected!=null &&
              this.isProtected.equals(other.getIsProtected())));
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
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getCheckoutStatus() != null) {
            _hashCode += getCheckoutStatus().hashCode();
        }
        if (getIsProtected() != null) {
            _hashCode += getIsProtected().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Languages.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Languages"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkoutStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "checkoutStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProtected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "isProtected"));
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
