/**
 * AccountsUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class AccountsUpdate  extends jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCreate  implements java.io.Serializable {
    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsID recordIdentification;

    public AccountsUpdate() {
    }

    public AccountsUpdate(
           java.lang.String applyNumber,
           java.lang.String sAKNR,
           java.lang.String tXT20_ML,
           java.lang.String tXT50_ML,
           java.lang.Boolean xSPEB,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String applyReason,
           java.lang.String updateBy,
           java.lang.Boolean dATAC,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupLookup kTOKS,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeLookup accountType,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsID recordIdentification) {
        super(
            applyNumber,
            sAKNR,
            tXT20_ML,
            tXT50_ML,
            xSPEB,
            aPMEM,
            applicant,
            applyReason,
            updateBy,
            dATAC,
            kTOKS,
            accountType,
            aPCOD,
            applyDate,
            applyTime,
            serviceRelationshipsTuple,
            operation,
            keyMapping);
        this.recordIdentification = recordIdentification;
    }


    /**
     * Gets the recordIdentification value for this AccountsUpdate.
     * 
     * @return recordIdentification
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsID getRecordIdentification() {
        return recordIdentification;
    }


    /**
     * Sets the recordIdentification value for this AccountsUpdate.
     * 
     * @param recordIdentification
     */
    public void setRecordIdentification(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsID recordIdentification) {
        this.recordIdentification = recordIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountsUpdate)) return false;
        AccountsUpdate other = (AccountsUpdate) obj;
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
        new org.apache.axis.description.TypeDesc(AccountsUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "recordIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsID"));
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
