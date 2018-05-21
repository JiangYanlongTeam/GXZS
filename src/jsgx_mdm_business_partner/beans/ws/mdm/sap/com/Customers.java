/**
 * Customers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class Customers  extends jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUpdate  implements java.io.Serializable {
    private java.lang.String createBy;

    private java.lang.Boolean dATAC;

    private java.lang.String displayValue;

    private java.lang.String checkoutStatus;

    private java.lang.Boolean isProtected;

    private java.math.BigInteger autoID;

    private java.util.Calendar createDate;

    private java.util.Calendar updateDate;

    public Customers() {
    }

    public Customers(
           java.lang.String applyNumber,
           java.lang.String kUNNR,
           java.lang.String nAME1,
           java.lang.String fULL_NAME,
           java.lang.String sTCEG,
           java.lang.String sTCD1,
           java.lang.String sTCD5,
           java.lang.String sORT1,
           java.lang.String sORT2,
           java.lang.String oRT01,
           java.lang.String sTREET,
           java.lang.String pSTLZ,
           java.lang.String tEL_NUMBER,
           java.lang.String tEL_EXTENS,
           java.lang.String fAX_NUMBER,
           java.lang.String fAX_EXTENS,
           java.lang.String sMTP_ADDR,
           java.lang.Boolean sPERM,
           java.lang.Boolean sTKZU,
           java.lang.String lIFNR,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String updateBy,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsLookup kTOKD,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup aNRED,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeLookup kUKLA,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup sPRAS,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup lAND1,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup rEGIO,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup vBUND,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple[] bankDetails,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersID recordIdentification,
           java.lang.String createBy,
           java.lang.Boolean dATAC,
           java.lang.String displayValue,
           java.lang.String checkoutStatus,
           java.lang.Boolean isProtected,
           java.math.BigInteger autoID,
           java.util.Calendar createDate,
           java.util.Calendar updateDate) {
        super(
            applyNumber,
            kUNNR,
            nAME1,
            fULL_NAME,
            sTCEG,
            sTCD1,
            sTCD5,
            sORT1,
            sORT2,
            oRT01,
            sTREET,
            pSTLZ,
            tEL_NUMBER,
            tEL_EXTENS,
            fAX_NUMBER,
            fAX_EXTENS,
            sMTP_ADDR,
            sPERM,
            sTKZU,
            lIFNR,
            aPMEM,
            applicant,
            updateBy,
            kTOKD,
            aNRED,
            kUKLA,
            sPRAS,
            lAND1,
            rEGIO,
            vBUND,
            aPCOD,
            applyDate,
            applyTime,
            bankDetails,
            serviceRelationshipsTuple,
            operation,
            keyMapping,
            recordIdentification);
        this.createBy = createBy;
        this.dATAC = dATAC;
        this.displayValue = displayValue;
        this.checkoutStatus = checkoutStatus;
        this.isProtected = isProtected;
        this.autoID = autoID;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }


    /**
     * Gets the createBy value for this Customers.
     * 
     * @return createBy
     */
    public java.lang.String getCreateBy() {
        return createBy;
    }


    /**
     * Sets the createBy value for this Customers.
     * 
     * @param createBy
     */
    public void setCreateBy(java.lang.String createBy) {
        this.createBy = createBy;
    }


    /**
     * Gets the dATAC value for this Customers.
     * 
     * @return dATAC
     */
    public java.lang.Boolean getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this Customers.
     * 
     * @param dATAC
     */
    public void setDATAC(java.lang.Boolean dATAC) {
        this.dATAC = dATAC;
    }


    /**
     * Gets the displayValue value for this Customers.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this Customers.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the checkoutStatus value for this Customers.
     * 
     * @return checkoutStatus
     */
    public java.lang.String getCheckoutStatus() {
        return checkoutStatus;
    }


    /**
     * Sets the checkoutStatus value for this Customers.
     * 
     * @param checkoutStatus
     */
    public void setCheckoutStatus(java.lang.String checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }


    /**
     * Gets the isProtected value for this Customers.
     * 
     * @return isProtected
     */
    public java.lang.Boolean getIsProtected() {
        return isProtected;
    }


    /**
     * Sets the isProtected value for this Customers.
     * 
     * @param isProtected
     */
    public void setIsProtected(java.lang.Boolean isProtected) {
        this.isProtected = isProtected;
    }


    /**
     * Gets the autoID value for this Customers.
     * 
     * @return autoID
     */
    public java.math.BigInteger getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this Customers.
     * 
     * @param autoID
     */
    public void setAutoID(java.math.BigInteger autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the createDate value for this Customers.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this Customers.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the updateDate value for this Customers.
     * 
     * @return updateDate
     */
    public java.util.Calendar getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this Customers.
     * 
     * @param updateDate
     */
    public void setUpdateDate(java.util.Calendar updateDate) {
        this.updateDate = updateDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customers)) return false;
        Customers other = (Customers) obj;
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
            ((this.dATAC==null && other.getDATAC()==null) || 
             (this.dATAC!=null &&
              this.dATAC.equals(other.getDATAC()))) &&
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
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.updateDate==null && other.getUpdateDate()==null) || 
             (this.updateDate!=null &&
              this.updateDate.equals(other.getUpdateDate())));
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
        if (getDATAC() != null) {
            _hashCode += getDATAC().hashCode();
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
        if (getUpdateDate() != null) {
            _hashCode += getUpdateDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Customers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "createBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "dATAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "autoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "updateDate"));
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
