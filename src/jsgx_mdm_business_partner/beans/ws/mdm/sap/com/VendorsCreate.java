/**
 * VendorsCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class VendorsCreate  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String applyNumber;

    private java.lang.String lIFNR;

    private java.lang.String sORT1;

    private java.lang.String fULL_NAME;

    private java.lang.String sTCEG;

    private java.lang.String sTCD1;

    private java.lang.String sTCD2;

    private java.lang.String sTCD3;

    private java.lang.String oRT01;

    private java.lang.String sTREET;

    private java.lang.String pSTLZ;

    private java.lang.String tEL_NUMBER;

    private java.lang.String tEL_EXTENS;

    private java.lang.String fAX_NUMBER;

    private java.lang.String fAX_EXTENS;

    private java.lang.String sMTP_ADDR;

    private java.lang.Boolean sPERM;

    private java.lang.String aPMEM;

    private java.lang.String applicant;

    private java.lang.String updateBy;

    private java.lang.Boolean dATAC;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup aNRED;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsLookup kTOKK;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup sPRAS;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup lAND1;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup rEGIO;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup vBUND;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple[] bankDetails;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD;

    private java.util.Calendar applyDate;

    private java.util.Calendar applyTime;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup operation;

    private beans.ws.mdm.sap.com.KeyMapping[] keyMapping;

    public VendorsCreate() {
    }

    public VendorsCreate(
           java.lang.String applyNumber,
           java.lang.String lIFNR,
           java.lang.String sORT1,
           java.lang.String fULL_NAME,
           java.lang.String sTCEG,
           java.lang.String sTCD1,
           java.lang.String sTCD2,
           java.lang.String sTCD3,
           java.lang.String oRT01,
           java.lang.String sTREET,
           java.lang.String pSTLZ,
           java.lang.String tEL_NUMBER,
           java.lang.String tEL_EXTENS,
           java.lang.String fAX_NUMBER,
           java.lang.String fAX_EXTENS,
           java.lang.String sMTP_ADDR,
           java.lang.Boolean sPERM,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String updateBy,
           java.lang.Boolean dATAC,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup aNRED,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsLookup kTOKK,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup sPRAS,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup lAND1,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup rEGIO,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup vBUND,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple[] bankDetails,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping) {
        this.applyNumber = applyNumber;
        this.lIFNR = lIFNR;
        this.sORT1 = sORT1;
        this.fULL_NAME = fULL_NAME;
        this.sTCEG = sTCEG;
        this.sTCD1 = sTCD1;
        this.sTCD2 = sTCD2;
        this.sTCD3 = sTCD3;
        this.oRT01 = oRT01;
        this.sTREET = sTREET;
        this.pSTLZ = pSTLZ;
        this.tEL_NUMBER = tEL_NUMBER;
        this.tEL_EXTENS = tEL_EXTENS;
        this.fAX_NUMBER = fAX_NUMBER;
        this.fAX_EXTENS = fAX_EXTENS;
        this.sMTP_ADDR = sMTP_ADDR;
        this.sPERM = sPERM;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.updateBy = updateBy;
        this.dATAC = dATAC;
        this.aNRED = aNRED;
        this.kTOKK = kTOKK;
        this.sPRAS = sPRAS;
        this.lAND1 = lAND1;
        this.rEGIO = rEGIO;
        this.vBUND = vBUND;
        this.bankDetails = bankDetails;
        this.aPCOD = aPCOD;
        this.applyDate = applyDate;
        this.applyTime = applyTime;
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
        this.operation = operation;
        this.keyMapping = keyMapping;
    }


    /**
     * Gets the applyNumber value for this VendorsCreate.
     * 
     * @return applyNumber
     */
    public java.lang.String getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this VendorsCreate.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(java.lang.String applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the lIFNR value for this VendorsCreate.
     * 
     * @return lIFNR
     */
    public java.lang.String getLIFNR() {
        return lIFNR;
    }


    /**
     * Sets the lIFNR value for this VendorsCreate.
     * 
     * @param lIFNR
     */
    public void setLIFNR(java.lang.String lIFNR) {
        this.lIFNR = lIFNR;
    }


    /**
     * Gets the sORT1 value for this VendorsCreate.
     * 
     * @return sORT1
     */
    public java.lang.String getSORT1() {
        return sORT1;
    }


    /**
     * Sets the sORT1 value for this VendorsCreate.
     * 
     * @param sORT1
     */
    public void setSORT1(java.lang.String sORT1) {
        this.sORT1 = sORT1;
    }


    /**
     * Gets the fULL_NAME value for this VendorsCreate.
     * 
     * @return fULL_NAME
     */
    public java.lang.String getFULL_NAME() {
        return fULL_NAME;
    }


    /**
     * Sets the fULL_NAME value for this VendorsCreate.
     * 
     * @param fULL_NAME
     */
    public void setFULL_NAME(java.lang.String fULL_NAME) {
        this.fULL_NAME = fULL_NAME;
    }


    /**
     * Gets the sTCEG value for this VendorsCreate.
     * 
     * @return sTCEG
     */
    public java.lang.String getSTCEG() {
        return sTCEG;
    }


    /**
     * Sets the sTCEG value for this VendorsCreate.
     * 
     * @param sTCEG
     */
    public void setSTCEG(java.lang.String sTCEG) {
        this.sTCEG = sTCEG;
    }


    /**
     * Gets the sTCD1 value for this VendorsCreate.
     * 
     * @return sTCD1
     */
    public java.lang.String getSTCD1() {
        return sTCD1;
    }


    /**
     * Sets the sTCD1 value for this VendorsCreate.
     * 
     * @param sTCD1
     */
    public void setSTCD1(java.lang.String sTCD1) {
        this.sTCD1 = sTCD1;
    }


    /**
     * Gets the sTCD2 value for this VendorsCreate.
     * 
     * @return sTCD2
     */
    public java.lang.String getSTCD2() {
        return sTCD2;
    }


    /**
     * Sets the sTCD2 value for this VendorsCreate.
     * 
     * @param sTCD2
     */
    public void setSTCD2(java.lang.String sTCD2) {
        this.sTCD2 = sTCD2;
    }


    /**
     * Gets the sTCD3 value for this VendorsCreate.
     * 
     * @return sTCD3
     */
    public java.lang.String getSTCD3() {
        return sTCD3;
    }


    /**
     * Sets the sTCD3 value for this VendorsCreate.
     * 
     * @param sTCD3
     */
    public void setSTCD3(java.lang.String sTCD3) {
        this.sTCD3 = sTCD3;
    }


    /**
     * Gets the oRT01 value for this VendorsCreate.
     * 
     * @return oRT01
     */
    public java.lang.String getORT01() {
        return oRT01;
    }


    /**
     * Sets the oRT01 value for this VendorsCreate.
     * 
     * @param oRT01
     */
    public void setORT01(java.lang.String oRT01) {
        this.oRT01 = oRT01;
    }


    /**
     * Gets the sTREET value for this VendorsCreate.
     * 
     * @return sTREET
     */
    public java.lang.String getSTREET() {
        return sTREET;
    }


    /**
     * Sets the sTREET value for this VendorsCreate.
     * 
     * @param sTREET
     */
    public void setSTREET(java.lang.String sTREET) {
        this.sTREET = sTREET;
    }


    /**
     * Gets the pSTLZ value for this VendorsCreate.
     * 
     * @return pSTLZ
     */
    public java.lang.String getPSTLZ() {
        return pSTLZ;
    }


    /**
     * Sets the pSTLZ value for this VendorsCreate.
     * 
     * @param pSTLZ
     */
    public void setPSTLZ(java.lang.String pSTLZ) {
        this.pSTLZ = pSTLZ;
    }


    /**
     * Gets the tEL_NUMBER value for this VendorsCreate.
     * 
     * @return tEL_NUMBER
     */
    public java.lang.String getTEL_NUMBER() {
        return tEL_NUMBER;
    }


    /**
     * Sets the tEL_NUMBER value for this VendorsCreate.
     * 
     * @param tEL_NUMBER
     */
    public void setTEL_NUMBER(java.lang.String tEL_NUMBER) {
        this.tEL_NUMBER = tEL_NUMBER;
    }


    /**
     * Gets the tEL_EXTENS value for this VendorsCreate.
     * 
     * @return tEL_EXTENS
     */
    public java.lang.String getTEL_EXTENS() {
        return tEL_EXTENS;
    }


    /**
     * Sets the tEL_EXTENS value for this VendorsCreate.
     * 
     * @param tEL_EXTENS
     */
    public void setTEL_EXTENS(java.lang.String tEL_EXTENS) {
        this.tEL_EXTENS = tEL_EXTENS;
    }


    /**
     * Gets the fAX_NUMBER value for this VendorsCreate.
     * 
     * @return fAX_NUMBER
     */
    public java.lang.String getFAX_NUMBER() {
        return fAX_NUMBER;
    }


    /**
     * Sets the fAX_NUMBER value for this VendorsCreate.
     * 
     * @param fAX_NUMBER
     */
    public void setFAX_NUMBER(java.lang.String fAX_NUMBER) {
        this.fAX_NUMBER = fAX_NUMBER;
    }


    /**
     * Gets the fAX_EXTENS value for this VendorsCreate.
     * 
     * @return fAX_EXTENS
     */
    public java.lang.String getFAX_EXTENS() {
        return fAX_EXTENS;
    }


    /**
     * Sets the fAX_EXTENS value for this VendorsCreate.
     * 
     * @param fAX_EXTENS
     */
    public void setFAX_EXTENS(java.lang.String fAX_EXTENS) {
        this.fAX_EXTENS = fAX_EXTENS;
    }


    /**
     * Gets the sMTP_ADDR value for this VendorsCreate.
     * 
     * @return sMTP_ADDR
     */
    public java.lang.String getSMTP_ADDR() {
        return sMTP_ADDR;
    }


    /**
     * Sets the sMTP_ADDR value for this VendorsCreate.
     * 
     * @param sMTP_ADDR
     */
    public void setSMTP_ADDR(java.lang.String sMTP_ADDR) {
        this.sMTP_ADDR = sMTP_ADDR;
    }


    /**
     * Gets the sPERM value for this VendorsCreate.
     * 
     * @return sPERM
     */
    public java.lang.Boolean getSPERM() {
        return sPERM;
    }


    /**
     * Sets the sPERM value for this VendorsCreate.
     * 
     * @param sPERM
     */
    public void setSPERM(java.lang.Boolean sPERM) {
        this.sPERM = sPERM;
    }


    /**
     * Gets the aPMEM value for this VendorsCreate.
     * 
     * @return aPMEM
     */
    public java.lang.String getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this VendorsCreate.
     * 
     * @param aPMEM
     */
    public void setAPMEM(java.lang.String aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this VendorsCreate.
     * 
     * @return applicant
     */
    public java.lang.String getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this VendorsCreate.
     * 
     * @param applicant
     */
    public void setApplicant(java.lang.String applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the updateBy value for this VendorsCreate.
     * 
     * @return updateBy
     */
    public java.lang.String getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this VendorsCreate.
     * 
     * @param updateBy
     */
    public void setUpdateBy(java.lang.String updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the dATAC value for this VendorsCreate.
     * 
     * @return dATAC
     */
    public java.lang.Boolean getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this VendorsCreate.
     * 
     * @param dATAC
     */
    public void setDATAC(java.lang.Boolean dATAC) {
        this.dATAC = dATAC;
    }


    /**
     * Gets the aNRED value for this VendorsCreate.
     * 
     * @return aNRED
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup getANRED() {
        return aNRED;
    }


    /**
     * Sets the aNRED value for this VendorsCreate.
     * 
     * @param aNRED
     */
    public void setANRED(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup aNRED) {
        this.aNRED = aNRED;
    }


    /**
     * Gets the kTOKK value for this VendorsCreate.
     * 
     * @return kTOKK
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsLookup getKTOKK() {
        return kTOKK;
    }


    /**
     * Sets the kTOKK value for this VendorsCreate.
     * 
     * @param kTOKK
     */
    public void setKTOKK(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsLookup kTOKK) {
        this.kTOKK = kTOKK;
    }


    /**
     * Gets the sPRAS value for this VendorsCreate.
     * 
     * @return sPRAS
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup getSPRAS() {
        return sPRAS;
    }


    /**
     * Sets the sPRAS value for this VendorsCreate.
     * 
     * @param sPRAS
     */
    public void setSPRAS(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup sPRAS) {
        this.sPRAS = sPRAS;
    }


    /**
     * Gets the lAND1 value for this VendorsCreate.
     * 
     * @return lAND1
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup getLAND1() {
        return lAND1;
    }


    /**
     * Sets the lAND1 value for this VendorsCreate.
     * 
     * @param lAND1
     */
    public void setLAND1(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup lAND1) {
        this.lAND1 = lAND1;
    }


    /**
     * Gets the rEGIO value for this VendorsCreate.
     * 
     * @return rEGIO
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup getREGIO() {
        return rEGIO;
    }


    /**
     * Sets the rEGIO value for this VendorsCreate.
     * 
     * @param rEGIO
     */
    public void setREGIO(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup rEGIO) {
        this.rEGIO = rEGIO;
    }


    /**
     * Gets the vBUND value for this VendorsCreate.
     * 
     * @return vBUND
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup getVBUND() {
        return vBUND;
    }


    /**
     * Sets the vBUND value for this VendorsCreate.
     * 
     * @param vBUND
     */
    public void setVBUND(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup vBUND) {
        this.vBUND = vBUND;
    }


    /**
     * Gets the bankDetails value for this VendorsCreate.
     * 
     * @return bankDetails
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple[] getBankDetails() {
        return bankDetails;
    }


    /**
     * Sets the bankDetails value for this VendorsCreate.
     * 
     * @param bankDetails
     */
    public void setBankDetails(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple[] bankDetails) {
        this.bankDetails = bankDetails;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple getBankDetails(int i) {
        return this.bankDetails[i];
    }

    public void setBankDetails(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple _value) {
        this.bankDetails[i] = _value;
    }


    /**
     * Gets the aPCOD value for this VendorsCreate.
     * 
     * @return aPCOD
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this VendorsCreate.
     * 
     * @param aPCOD
     */
    public void setAPCOD(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the applyDate value for this VendorsCreate.
     * 
     * @return applyDate
     */
    public java.util.Calendar getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this VendorsCreate.
     * 
     * @param applyDate
     */
    public void setApplyDate(java.util.Calendar applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this VendorsCreate.
     * 
     * @return applyTime
     */
    public java.util.Calendar getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this VendorsCreate.
     * 
     * @param applyTime
     */
    public void setApplyTime(java.util.Calendar applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the serviceRelationshipsTuple value for this VendorsCreate.
     * 
     * @return serviceRelationshipsTuple
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] getServiceRelationshipsTuple() {
        return serviceRelationshipsTuple;
    }


    /**
     * Sets the serviceRelationshipsTuple value for this VendorsCreate.
     * 
     * @param serviceRelationshipsTuple
     */
    public void setServiceRelationshipsTuple(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple) {
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple getServiceRelationshipsTuple(int i) {
        return this.serviceRelationshipsTuple[i];
    }

    public void setServiceRelationshipsTuple(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple _value) {
        this.serviceRelationshipsTuple[i] = _value;
    }


    /**
     * Gets the operation value for this VendorsCreate.
     * 
     * @return operation
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this VendorsCreate.
     * 
     * @param operation
     */
    public void setOperation(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup operation) {
        this.operation = operation;
    }


    /**
     * Gets the keyMapping value for this VendorsCreate.
     * 
     * @return keyMapping
     */
    public beans.ws.mdm.sap.com.KeyMapping[] getKeyMapping() {
        return keyMapping;
    }


    /**
     * Sets the keyMapping value for this VendorsCreate.
     * 
     * @param keyMapping
     */
    public void setKeyMapping(beans.ws.mdm.sap.com.KeyMapping[] keyMapping) {
        this.keyMapping = keyMapping;
    }

    public beans.ws.mdm.sap.com.KeyMapping getKeyMapping(int i) {
        return this.keyMapping[i];
    }

    public void setKeyMapping(int i, beans.ws.mdm.sap.com.KeyMapping _value) {
        this.keyMapping[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorsCreate)) return false;
        VendorsCreate other = (VendorsCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.applyNumber==null && other.getApplyNumber()==null) || 
             (this.applyNumber!=null &&
              this.applyNumber.equals(other.getApplyNumber()))) &&
            ((this.lIFNR==null && other.getLIFNR()==null) || 
             (this.lIFNR!=null &&
              this.lIFNR.equals(other.getLIFNR()))) &&
            ((this.sORT1==null && other.getSORT1()==null) || 
             (this.sORT1!=null &&
              this.sORT1.equals(other.getSORT1()))) &&
            ((this.fULL_NAME==null && other.getFULL_NAME()==null) || 
             (this.fULL_NAME!=null &&
              this.fULL_NAME.equals(other.getFULL_NAME()))) &&
            ((this.sTCEG==null && other.getSTCEG()==null) || 
             (this.sTCEG!=null &&
              this.sTCEG.equals(other.getSTCEG()))) &&
            ((this.sTCD1==null && other.getSTCD1()==null) || 
             (this.sTCD1!=null &&
              this.sTCD1.equals(other.getSTCD1()))) &&
            ((this.sTCD2==null && other.getSTCD2()==null) || 
             (this.sTCD2!=null &&
              this.sTCD2.equals(other.getSTCD2()))) &&
            ((this.sTCD3==null && other.getSTCD3()==null) || 
             (this.sTCD3!=null &&
              this.sTCD3.equals(other.getSTCD3()))) &&
            ((this.oRT01==null && other.getORT01()==null) || 
             (this.oRT01!=null &&
              this.oRT01.equals(other.getORT01()))) &&
            ((this.sTREET==null && other.getSTREET()==null) || 
             (this.sTREET!=null &&
              this.sTREET.equals(other.getSTREET()))) &&
            ((this.pSTLZ==null && other.getPSTLZ()==null) || 
             (this.pSTLZ!=null &&
              this.pSTLZ.equals(other.getPSTLZ()))) &&
            ((this.tEL_NUMBER==null && other.getTEL_NUMBER()==null) || 
             (this.tEL_NUMBER!=null &&
              this.tEL_NUMBER.equals(other.getTEL_NUMBER()))) &&
            ((this.tEL_EXTENS==null && other.getTEL_EXTENS()==null) || 
             (this.tEL_EXTENS!=null &&
              this.tEL_EXTENS.equals(other.getTEL_EXTENS()))) &&
            ((this.fAX_NUMBER==null && other.getFAX_NUMBER()==null) || 
             (this.fAX_NUMBER!=null &&
              this.fAX_NUMBER.equals(other.getFAX_NUMBER()))) &&
            ((this.fAX_EXTENS==null && other.getFAX_EXTENS()==null) || 
             (this.fAX_EXTENS!=null &&
              this.fAX_EXTENS.equals(other.getFAX_EXTENS()))) &&
            ((this.sMTP_ADDR==null && other.getSMTP_ADDR()==null) || 
             (this.sMTP_ADDR!=null &&
              this.sMTP_ADDR.equals(other.getSMTP_ADDR()))) &&
            ((this.sPERM==null && other.getSPERM()==null) || 
             (this.sPERM!=null &&
              this.sPERM.equals(other.getSPERM()))) &&
            ((this.aPMEM==null && other.getAPMEM()==null) || 
             (this.aPMEM!=null &&
              this.aPMEM.equals(other.getAPMEM()))) &&
            ((this.applicant==null && other.getApplicant()==null) || 
             (this.applicant!=null &&
              this.applicant.equals(other.getApplicant()))) &&
            ((this.updateBy==null && other.getUpdateBy()==null) || 
             (this.updateBy!=null &&
              this.updateBy.equals(other.getUpdateBy()))) &&
            ((this.dATAC==null && other.getDATAC()==null) || 
             (this.dATAC!=null &&
              this.dATAC.equals(other.getDATAC()))) &&
            ((this.aNRED==null && other.getANRED()==null) || 
             (this.aNRED!=null &&
              this.aNRED.equals(other.getANRED()))) &&
            ((this.kTOKK==null && other.getKTOKK()==null) || 
             (this.kTOKK!=null &&
              this.kTOKK.equals(other.getKTOKK()))) &&
            ((this.sPRAS==null && other.getSPRAS()==null) || 
             (this.sPRAS!=null &&
              this.sPRAS.equals(other.getSPRAS()))) &&
            ((this.lAND1==null && other.getLAND1()==null) || 
             (this.lAND1!=null &&
              this.lAND1.equals(other.getLAND1()))) &&
            ((this.rEGIO==null && other.getREGIO()==null) || 
             (this.rEGIO!=null &&
              this.rEGIO.equals(other.getREGIO()))) &&
            ((this.vBUND==null && other.getVBUND()==null) || 
             (this.vBUND!=null &&
              this.vBUND.equals(other.getVBUND()))) &&
            ((this.bankDetails==null && other.getBankDetails()==null) || 
             (this.bankDetails!=null &&
              java.util.Arrays.equals(this.bankDetails, other.getBankDetails()))) &&
            ((this.aPCOD==null && other.getAPCOD()==null) || 
             (this.aPCOD!=null &&
              this.aPCOD.equals(other.getAPCOD()))) &&
            ((this.applyDate==null && other.getApplyDate()==null) || 
             (this.applyDate!=null &&
              this.applyDate.equals(other.getApplyDate()))) &&
            ((this.applyTime==null && other.getApplyTime()==null) || 
             (this.applyTime!=null &&
              this.applyTime.equals(other.getApplyTime()))) &&
            ((this.serviceRelationshipsTuple==null && other.getServiceRelationshipsTuple()==null) || 
             (this.serviceRelationshipsTuple!=null &&
              java.util.Arrays.equals(this.serviceRelationshipsTuple, other.getServiceRelationshipsTuple()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.keyMapping==null && other.getKeyMapping()==null) || 
             (this.keyMapping!=null &&
              java.util.Arrays.equals(this.keyMapping, other.getKeyMapping())));
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
        if (getApplyNumber() != null) {
            _hashCode += getApplyNumber().hashCode();
        }
        if (getLIFNR() != null) {
            _hashCode += getLIFNR().hashCode();
        }
        if (getSORT1() != null) {
            _hashCode += getSORT1().hashCode();
        }
        if (getFULL_NAME() != null) {
            _hashCode += getFULL_NAME().hashCode();
        }
        if (getSTCEG() != null) {
            _hashCode += getSTCEG().hashCode();
        }
        if (getSTCD1() != null) {
            _hashCode += getSTCD1().hashCode();
        }
        if (getSTCD2() != null) {
            _hashCode += getSTCD2().hashCode();
        }
        if (getSTCD3() != null) {
            _hashCode += getSTCD3().hashCode();
        }
        if (getORT01() != null) {
            _hashCode += getORT01().hashCode();
        }
        if (getSTREET() != null) {
            _hashCode += getSTREET().hashCode();
        }
        if (getPSTLZ() != null) {
            _hashCode += getPSTLZ().hashCode();
        }
        if (getTEL_NUMBER() != null) {
            _hashCode += getTEL_NUMBER().hashCode();
        }
        if (getTEL_EXTENS() != null) {
            _hashCode += getTEL_EXTENS().hashCode();
        }
        if (getFAX_NUMBER() != null) {
            _hashCode += getFAX_NUMBER().hashCode();
        }
        if (getFAX_EXTENS() != null) {
            _hashCode += getFAX_EXTENS().hashCode();
        }
        if (getSMTP_ADDR() != null) {
            _hashCode += getSMTP_ADDR().hashCode();
        }
        if (getSPERM() != null) {
            _hashCode += getSPERM().hashCode();
        }
        if (getAPMEM() != null) {
            _hashCode += getAPMEM().hashCode();
        }
        if (getApplicant() != null) {
            _hashCode += getApplicant().hashCode();
        }
        if (getUpdateBy() != null) {
            _hashCode += getUpdateBy().hashCode();
        }
        if (getDATAC() != null) {
            _hashCode += getDATAC().hashCode();
        }
        if (getANRED() != null) {
            _hashCode += getANRED().hashCode();
        }
        if (getKTOKK() != null) {
            _hashCode += getKTOKK().hashCode();
        }
        if (getSPRAS() != null) {
            _hashCode += getSPRAS().hashCode();
        }
        if (getLAND1() != null) {
            _hashCode += getLAND1().hashCode();
        }
        if (getREGIO() != null) {
            _hashCode += getREGIO().hashCode();
        }
        if (getVBUND() != null) {
            _hashCode += getVBUND().hashCode();
        }
        if (getBankDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAPCOD() != null) {
            _hashCode += getAPCOD().hashCode();
        }
        if (getApplyDate() != null) {
            _hashCode += getApplyDate().hashCode();
        }
        if (getApplyTime() != null) {
            _hashCode += getApplyTime().hashCode();
        }
        if (getServiceRelationshipsTuple() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceRelationshipsTuple());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceRelationshipsTuple(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getKeyMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyMapping(), i);
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
        new org.apache.axis.description.TypeDesc(VendorsCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIFNR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "lIFNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SORT1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sORT1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FULL_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "fULL_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCEG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTCEG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCD1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTCD1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCD2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTCD2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCD3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTCD3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORT01");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "oRT01"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STREET");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTREET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSTLZ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "pSTLZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TEL_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "tEL_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TEL_EXTENS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "tEL_EXTENS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAX_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "fAX_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAX_EXTENS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "fAX_EXTENS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMTP_ADDR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sMTP_ADDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPERM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sPERM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APMEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "aPMEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "updateBy"));
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
        elemField.setFieldName("ANRED");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "aNRED"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KTOKK");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "kTOKK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPRAS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sPRAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LAND1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "lAND1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIO");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "rEGIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VBUND");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "vBUND"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bankDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountsTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "aPCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "applyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "applyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTuple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "serviceRelationshipsTuple"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsTupleTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "keyMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMapping"));
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
