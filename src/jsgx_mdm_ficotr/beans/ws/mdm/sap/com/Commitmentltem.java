/**
 * Commitmentltem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class Commitmentltem  extends jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate  implements java.io.Serializable {
    private java.lang.String createBy;

    private java.lang.String updateDate;

    private java.lang.String displayValue;

    private java.lang.String checkoutStatus;

    private java.lang.Boolean isProtected;

    private java.math.BigInteger autoID;

    private java.util.Calendar createDate;

    public Commitmentltem() {
    }

    public Commitmentltem(
           java.lang.String applyNumber,
           java.lang.String fIKRS,
           java.lang.String fIPOS,
           java.lang.String bEZEICH,
           java.lang.String bESCHR,
           java.lang.Boolean cOMCAT,
           java.lang.Boolean sTATS,
           java.lang.Boolean lVOMA,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String applyReason,
           java.lang.String updateBy,
           java.lang.Boolean dATAC,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionLookup fIVOR,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryLookup kNZAEPO,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemLookup fICPOS,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemID recordIdentification,
           java.lang.String createBy,
           java.lang.String updateDate,
           java.lang.String displayValue,
           java.lang.String checkoutStatus,
           java.lang.Boolean isProtected,
           java.math.BigInteger autoID,
           java.util.Calendar createDate) {
        super(
            applyNumber,
            fIKRS,
            fIPOS,
            bEZEICH,
            bESCHR,
            cOMCAT,
            sTATS,
            lVOMA,
            aPMEM,
            applicant,
            applyReason,
            updateBy,
            dATAC,
            fIVOR,
            kNZAEPO,
            fICPOS,
            aPCOD,
            applyDate,
            applyTime,
            serviceRelationshipsTuple,
            operation,
            keyMapping,
            recordIdentification);
        this.createBy = createBy;
        this.updateDate = updateDate;
        this.displayValue = displayValue;
        this.checkoutStatus = checkoutStatus;
        this.isProtected = isProtected;
        this.autoID = autoID;
        this.createDate = createDate;
    }


    /**
     * Gets the createBy value for this Commitmentltem.
     * 
     * @return createBy
     */
    public java.lang.String getCreateBy() {
        return createBy;
    }


    /**
     * Sets the createBy value for this Commitmentltem.
     * 
     * @param createBy
     */
    public void setCreateBy(java.lang.String createBy) {
        this.createBy = createBy;
    }


    /**
     * Gets the updateDate value for this Commitmentltem.
     * 
     * @return updateDate
     */
    public java.lang.String getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this Commitmentltem.
     * 
     * @param updateDate
     */
    public void setUpdateDate(java.lang.String updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the displayValue value for this Commitmentltem.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this Commitmentltem.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the checkoutStatus value for this Commitmentltem.
     * 
     * @return checkoutStatus
     */
    public java.lang.String getCheckoutStatus() {
        return checkoutStatus;
    }


    /**
     * Sets the checkoutStatus value for this Commitmentltem.
     * 
     * @param checkoutStatus
     */
    public void setCheckoutStatus(java.lang.String checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }


    /**
     * Gets the isProtected value for this Commitmentltem.
     * 
     * @return isProtected
     */
    public java.lang.Boolean getIsProtected() {
        return isProtected;
    }


    /**
     * Sets the isProtected value for this Commitmentltem.
     * 
     * @param isProtected
     */
    public void setIsProtected(java.lang.Boolean isProtected) {
        this.isProtected = isProtected;
    }


    /**
     * Gets the autoID value for this Commitmentltem.
     * 
     * @return autoID
     */
    public java.math.BigInteger getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this Commitmentltem.
     * 
     * @param autoID
     */
    public void setAutoID(java.math.BigInteger autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the createDate value for this Commitmentltem.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this Commitmentltem.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Commitmentltem)) return false;
        Commitmentltem other = (Commitmentltem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createBy==null && other.getCreateBy()==null) || 
             (this.createBy!=null &&
              this.createBy.equals(other.getCreateBy()))) &&
            ((this.updateDate==null && other.getUpdateDate()==null) || 
             (this.updateDate!=null &&
              this.updateDate.equals(other.getUpdateDate()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.checkoutStatus==null && other.getCheckoutStatus()==null) || 
             (this.checkoutStatus!=null &&
              this.checkoutStatus.equals(other.getCheckoutStatus()))) &&
            ((this.isProtected==null && other.getIsProtected()==null) || 
             (this.isProtected!=null &&
              this.isProtected.equals(other.getIsProtected()))) &&
            ((this.autoID==null && other.getAutoID()==null) || 
             (this.autoID!=null &&
              this.autoID.equals(other.getAutoID()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate())));
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
        if (getCreateBy() != null) {
            _hashCode += getCreateBy().hashCode();
        }
        if (getUpdateDate() != null) {
            _hashCode += getUpdateDate().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getCheckoutStatus() != null) {
            _hashCode += getCheckoutStatus().hashCode();
        }
        if (getIsProtected() != null) {
            _hashCode += getIsProtected().hashCode();
        }
        if (getAutoID() != null) {
            _hashCode += getAutoID().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Commitmentltem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "Commitmentltem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "createBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkoutStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "checkoutStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProtected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "isProtected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "autoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
