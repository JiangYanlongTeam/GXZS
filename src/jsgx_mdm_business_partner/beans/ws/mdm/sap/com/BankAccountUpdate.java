/**
 * BankAccountUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class BankAccountUpdate  extends jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCreate  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountID recordIdentification;

    public BankAccountUpdate() {
    }

    public BankAccountUpdate(
           java.lang.String applyNumber,
           java.lang.String hBKID,
           java.lang.String hKTID,
           java.lang.String tEXT1,
           java.lang.String bANKN,
           java.lang.String hKONT,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String updateBy,
           java.lang.Boolean dATAC,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup bUKRS,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup bANKS,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksLookup bANKL,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyLookup wAERS,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountID recordIdentification) {
        super(
            applyNumber,
            hBKID,
            hKTID,
            tEXT1,
            bANKN,
            hKONT,
            aPMEM,
            applicant,
            updateBy,
            dATAC,
            bUKRS,
            bANKS,
            bANKL,
            wAERS,
            aPCOD,
            applyDate,
            applyTime,
            serviceRelationshipsTuple,
            operation,
            keyMapping);
        this.recordIdentification = recordIdentification;
    }


    /**
     * Gets the recordIdentification value for this BankAccountUpdate.
     * 
     * @return recordIdentification
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountID getRecordIdentification() {
        return recordIdentification;
    }


    /**
     * Sets the recordIdentification value for this BankAccountUpdate.
     * 
     * @param recordIdentification
     */
    public void setRecordIdentification(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountID recordIdentification) {
        this.recordIdentification = recordIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccountUpdate)) return false;
        BankAccountUpdate other = (BankAccountUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recordIdentification==null && other.getRecordIdentification()==null) || 
             (this.recordIdentification!=null &&
              this.recordIdentification.equals(other.getRecordIdentification())));
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
        if (getRecordIdentification() != null) {
            _hashCode += getRecordIdentification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccountUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "recordIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountID"));
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
