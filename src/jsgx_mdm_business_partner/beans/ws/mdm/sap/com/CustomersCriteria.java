/**
 * CustomersCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class CustomersCriteria  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String[] namedSearchCriteria;

    private java.lang.String[] maskCriteria;

    private java.lang.String logicalOperator;

    private beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria;

    private beans.ws.mdm.sap.com.NumericCriteria autoID;

    private beans.ws.mdm.sap.com.TextCriteria applyNumber;

    private beans.ws.mdm.sap.com.PicklistCriteria kTOKD;

    private beans.ws.mdm.sap.com.TextCriteria kUNNR;

    private beans.ws.mdm.sap.com.PicklistCriteria aNRED;

    private beans.ws.mdm.sap.com.PicklistCriteria kUKLA;

    private beans.ws.mdm.sap.com.TextCriteria nAME1;

    private beans.ws.mdm.sap.com.TextCriteria fULL_NAME;

    private beans.ws.mdm.sap.com.TextCriteria sTCEG;

    private beans.ws.mdm.sap.com.TextCriteria sTCD1;

    private beans.ws.mdm.sap.com.TextCriteria sTCD5;

    private beans.ws.mdm.sap.com.TextCriteria sORT1;

    private beans.ws.mdm.sap.com.TextCriteria sORT2;

    private beans.ws.mdm.sap.com.PicklistCriteria sPRAS;

    private beans.ws.mdm.sap.com.PicklistCriteria lAND1;

    private beans.ws.mdm.sap.com.PicklistCriteria rEGIO;

    private beans.ws.mdm.sap.com.TextCriteria oRT01;

    private beans.ws.mdm.sap.com.TextCriteria sTREET;

    private beans.ws.mdm.sap.com.TextCriteria pSTLZ;

    private beans.ws.mdm.sap.com.TextCriteria tEL_NUMBER;

    private beans.ws.mdm.sap.com.TextCriteria tEL_EXTENS;

    private beans.ws.mdm.sap.com.TextCriteria fAX_NUMBER;

    private beans.ws.mdm.sap.com.TextCriteria fAX_EXTENS;

    private beans.ws.mdm.sap.com.TextCriteria sMTP_ADDR;

    private beans.ws.mdm.sap.com.BooleanCriteria sPERM;

    private beans.ws.mdm.sap.com.PicklistCriteria vBUND;

    private beans.ws.mdm.sap.com.BooleanCriteria sTKZU;

    private beans.ws.mdm.sap.com.TextCriteria lIFNR;

    private beans.ws.mdm.sap.com.PicklistCriteria aPCOD;

    private beans.ws.mdm.sap.com.TextCriteria aPMEM;

    private beans.ws.mdm.sap.com.TextCriteria applicant;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyDate;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyTime;

    private beans.ws.mdm.sap.com.PicklistCriteria bankDetailsBANKS;

    private beans.ws.mdm.sap.com.PicklistCriteria bankDetailsBANKL;

    private beans.ws.mdm.sap.com.TextCriteria bankDetailsBANKN;

    private beans.ws.mdm.sap.com.TextCriteria bankDetailsKOINH;

    private beans.ws.mdm.sap.com.TextCriteria createBy;

    private beans.ws.mdm.sap.com.DateTimeCriteria createDate;

    private beans.ws.mdm.sap.com.TextCriteria updateBy;

    private beans.ws.mdm.sap.com.DateTimeCriteria updateDate;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN;

    private beans.ws.mdm.sap.com.PicklistCriteria operation;

    private beans.ws.mdm.sap.com.BooleanCriteria dATAC;

    public CustomersCriteria() {
    }

    public CustomersCriteria(
           java.lang.String[] namedSearchCriteria,
           java.lang.String[] maskCriteria,
           java.lang.String logicalOperator,
           beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria,
           beans.ws.mdm.sap.com.NumericCriteria autoID,
           beans.ws.mdm.sap.com.TextCriteria applyNumber,
           beans.ws.mdm.sap.com.PicklistCriteria kTOKD,
           beans.ws.mdm.sap.com.TextCriteria kUNNR,
           beans.ws.mdm.sap.com.PicklistCriteria aNRED,
           beans.ws.mdm.sap.com.PicklistCriteria kUKLA,
           beans.ws.mdm.sap.com.TextCriteria nAME1,
           beans.ws.mdm.sap.com.TextCriteria fULL_NAME,
           beans.ws.mdm.sap.com.TextCriteria sTCEG,
           beans.ws.mdm.sap.com.TextCriteria sTCD1,
           beans.ws.mdm.sap.com.TextCriteria sTCD5,
           beans.ws.mdm.sap.com.TextCriteria sORT1,
           beans.ws.mdm.sap.com.TextCriteria sORT2,
           beans.ws.mdm.sap.com.PicklistCriteria sPRAS,
           beans.ws.mdm.sap.com.PicklistCriteria lAND1,
           beans.ws.mdm.sap.com.PicklistCriteria rEGIO,
           beans.ws.mdm.sap.com.TextCriteria oRT01,
           beans.ws.mdm.sap.com.TextCriteria sTREET,
           beans.ws.mdm.sap.com.TextCriteria pSTLZ,
           beans.ws.mdm.sap.com.TextCriteria tEL_NUMBER,
           beans.ws.mdm.sap.com.TextCriteria tEL_EXTENS,
           beans.ws.mdm.sap.com.TextCriteria fAX_NUMBER,
           beans.ws.mdm.sap.com.TextCriteria fAX_EXTENS,
           beans.ws.mdm.sap.com.TextCriteria sMTP_ADDR,
           beans.ws.mdm.sap.com.BooleanCriteria sPERM,
           beans.ws.mdm.sap.com.PicklistCriteria vBUND,
           beans.ws.mdm.sap.com.BooleanCriteria sTKZU,
           beans.ws.mdm.sap.com.TextCriteria lIFNR,
           beans.ws.mdm.sap.com.PicklistCriteria aPCOD,
           beans.ws.mdm.sap.com.TextCriteria aPMEM,
           beans.ws.mdm.sap.com.TextCriteria applicant,
           beans.ws.mdm.sap.com.DateTimeCriteria applyDate,
           beans.ws.mdm.sap.com.DateTimeCriteria applyTime,
           beans.ws.mdm.sap.com.PicklistCriteria bankDetailsBANKS,
           beans.ws.mdm.sap.com.PicklistCriteria bankDetailsBANKL,
           beans.ws.mdm.sap.com.TextCriteria bankDetailsBANKN,
           beans.ws.mdm.sap.com.TextCriteria bankDetailsKOINH,
           beans.ws.mdm.sap.com.TextCriteria createBy,
           beans.ws.mdm.sap.com.DateTimeCriteria createDate,
           beans.ws.mdm.sap.com.TextCriteria updateBy,
           beans.ws.mdm.sap.com.DateTimeCriteria updateDate,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN,
           beans.ws.mdm.sap.com.PicklistCriteria operation,
           beans.ws.mdm.sap.com.BooleanCriteria dATAC) {
        this.namedSearchCriteria = namedSearchCriteria;
        this.maskCriteria = maskCriteria;
        this.logicalOperator = logicalOperator;
        this.keywordCriteria = keywordCriteria;
        this.autoID = autoID;
        this.applyNumber = applyNumber;
        this.kTOKD = kTOKD;
        this.kUNNR = kUNNR;
        this.aNRED = aNRED;
        this.kUKLA = kUKLA;
        this.nAME1 = nAME1;
        this.fULL_NAME = fULL_NAME;
        this.sTCEG = sTCEG;
        this.sTCD1 = sTCD1;
        this.sTCD5 = sTCD5;
        this.sORT1 = sORT1;
        this.sORT2 = sORT2;
        this.sPRAS = sPRAS;
        this.lAND1 = lAND1;
        this.rEGIO = rEGIO;
        this.oRT01 = oRT01;
        this.sTREET = sTREET;
        this.pSTLZ = pSTLZ;
        this.tEL_NUMBER = tEL_NUMBER;
        this.tEL_EXTENS = tEL_EXTENS;
        this.fAX_NUMBER = fAX_NUMBER;
        this.fAX_EXTENS = fAX_EXTENS;
        this.sMTP_ADDR = sMTP_ADDR;
        this.sPERM = sPERM;
        this.vBUND = vBUND;
        this.sTKZU = sTKZU;
        this.lIFNR = lIFNR;
        this.aPCOD = aPCOD;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.applyDate = applyDate;
        this.applyTime = applyTime;
        this.bankDetailsBANKS = bankDetailsBANKS;
        this.bankDetailsBANKL = bankDetailsBANKL;
        this.bankDetailsBANKN = bankDetailsBANKN;
        this.bankDetailsKOINH = bankDetailsKOINH;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
        this.serviceRelationshipsTupleDGUID = serviceRelationshipsTupleDGUID;
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
        this.operation = operation;
        this.dATAC = dATAC;
    }


    /**
     * Gets the namedSearchCriteria value for this CustomersCriteria.
     * 
     * @return namedSearchCriteria
     */
    public java.lang.String[] getNamedSearchCriteria() {
        return namedSearchCriteria;
    }


    /**
     * Sets the namedSearchCriteria value for this CustomersCriteria.
     * 
     * @param namedSearchCriteria
     */
    public void setNamedSearchCriteria(java.lang.String[] namedSearchCriteria) {
        this.namedSearchCriteria = namedSearchCriteria;
    }

    public java.lang.String getNamedSearchCriteria(int i) {
        return this.namedSearchCriteria[i];
    }

    public void setNamedSearchCriteria(int i, java.lang.String _value) {
        this.namedSearchCriteria[i] = _value;
    }


    /**
     * Gets the maskCriteria value for this CustomersCriteria.
     * 
     * @return maskCriteria
     */
    public java.lang.String[] getMaskCriteria() {
        return maskCriteria;
    }


    /**
     * Sets the maskCriteria value for this CustomersCriteria.
     * 
     * @param maskCriteria
     */
    public void setMaskCriteria(java.lang.String[] maskCriteria) {
        this.maskCriteria = maskCriteria;
    }

    public java.lang.String getMaskCriteria(int i) {
        return this.maskCriteria[i];
    }

    public void setMaskCriteria(int i, java.lang.String _value) {
        this.maskCriteria[i] = _value;
    }


    /**
     * Gets the logicalOperator value for this CustomersCriteria.
     * 
     * @return logicalOperator
     */
    public java.lang.String getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this CustomersCriteria.
     * 
     * @param logicalOperator
     */
    public void setLogicalOperator(java.lang.String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the keywordCriteria value for this CustomersCriteria.
     * 
     * @return keywordCriteria
     */
    public beans.ws.mdm.sap.com.KeywordConstraint getKeywordCriteria() {
        return keywordCriteria;
    }


    /**
     * Sets the keywordCriteria value for this CustomersCriteria.
     * 
     * @param keywordCriteria
     */
    public void setKeywordCriteria(beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria) {
        this.keywordCriteria = keywordCriteria;
    }


    /**
     * Gets the autoID value for this CustomersCriteria.
     * 
     * @return autoID
     */
    public beans.ws.mdm.sap.com.NumericCriteria getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this CustomersCriteria.
     * 
     * @param autoID
     */
    public void setAutoID(beans.ws.mdm.sap.com.NumericCriteria autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the applyNumber value for this CustomersCriteria.
     * 
     * @return applyNumber
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this CustomersCriteria.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(beans.ws.mdm.sap.com.TextCriteria applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the kTOKD value for this CustomersCriteria.
     * 
     * @return kTOKD
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getKTOKD() {
        return kTOKD;
    }


    /**
     * Sets the kTOKD value for this CustomersCriteria.
     * 
     * @param kTOKD
     */
    public void setKTOKD(beans.ws.mdm.sap.com.PicklistCriteria kTOKD) {
        this.kTOKD = kTOKD;
    }


    /**
     * Gets the kUNNR value for this CustomersCriteria.
     * 
     * @return kUNNR
     */
    public beans.ws.mdm.sap.com.TextCriteria getKUNNR() {
        return kUNNR;
    }


    /**
     * Sets the kUNNR value for this CustomersCriteria.
     * 
     * @param kUNNR
     */
    public void setKUNNR(beans.ws.mdm.sap.com.TextCriteria kUNNR) {
        this.kUNNR = kUNNR;
    }


    /**
     * Gets the aNRED value for this CustomersCriteria.
     * 
     * @return aNRED
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getANRED() {
        return aNRED;
    }


    /**
     * Sets the aNRED value for this CustomersCriteria.
     * 
     * @param aNRED
     */
    public void setANRED(beans.ws.mdm.sap.com.PicklistCriteria aNRED) {
        this.aNRED = aNRED;
    }


    /**
     * Gets the kUKLA value for this CustomersCriteria.
     * 
     * @return kUKLA
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getKUKLA() {
        return kUKLA;
    }


    /**
     * Sets the kUKLA value for this CustomersCriteria.
     * 
     * @param kUKLA
     */
    public void setKUKLA(beans.ws.mdm.sap.com.PicklistCriteria kUKLA) {
        this.kUKLA = kUKLA;
    }


    /**
     * Gets the nAME1 value for this CustomersCriteria.
     * 
     * @return nAME1
     */
    public beans.ws.mdm.sap.com.TextCriteria getNAME1() {
        return nAME1;
    }


    /**
     * Sets the nAME1 value for this CustomersCriteria.
     * 
     * @param nAME1
     */
    public void setNAME1(beans.ws.mdm.sap.com.TextCriteria nAME1) {
        this.nAME1 = nAME1;
    }


    /**
     * Gets the fULL_NAME value for this CustomersCriteria.
     * 
     * @return fULL_NAME
     */
    public beans.ws.mdm.sap.com.TextCriteria getFULL_NAME() {
        return fULL_NAME;
    }


    /**
     * Sets the fULL_NAME value for this CustomersCriteria.
     * 
     * @param fULL_NAME
     */
    public void setFULL_NAME(beans.ws.mdm.sap.com.TextCriteria fULL_NAME) {
        this.fULL_NAME = fULL_NAME;
    }


    /**
     * Gets the sTCEG value for this CustomersCriteria.
     * 
     * @return sTCEG
     */
    public beans.ws.mdm.sap.com.TextCriteria getSTCEG() {
        return sTCEG;
    }


    /**
     * Sets the sTCEG value for this CustomersCriteria.
     * 
     * @param sTCEG
     */
    public void setSTCEG(beans.ws.mdm.sap.com.TextCriteria sTCEG) {
        this.sTCEG = sTCEG;
    }


    /**
     * Gets the sTCD1 value for this CustomersCriteria.
     * 
     * @return sTCD1
     */
    public beans.ws.mdm.sap.com.TextCriteria getSTCD1() {
        return sTCD1;
    }


    /**
     * Sets the sTCD1 value for this CustomersCriteria.
     * 
     * @param sTCD1
     */
    public void setSTCD1(beans.ws.mdm.sap.com.TextCriteria sTCD1) {
        this.sTCD1 = sTCD1;
    }


    /**
     * Gets the sTCD5 value for this CustomersCriteria.
     * 
     * @return sTCD5
     */
    public beans.ws.mdm.sap.com.TextCriteria getSTCD5() {
        return sTCD5;
    }


    /**
     * Sets the sTCD5 value for this CustomersCriteria.
     * 
     * @param sTCD5
     */
    public void setSTCD5(beans.ws.mdm.sap.com.TextCriteria sTCD5) {
        this.sTCD5 = sTCD5;
    }


    /**
     * Gets the sORT1 value for this CustomersCriteria.
     * 
     * @return sORT1
     */
    public beans.ws.mdm.sap.com.TextCriteria getSORT1() {
        return sORT1;
    }


    /**
     * Sets the sORT1 value for this CustomersCriteria.
     * 
     * @param sORT1
     */
    public void setSORT1(beans.ws.mdm.sap.com.TextCriteria sORT1) {
        this.sORT1 = sORT1;
    }


    /**
     * Gets the sORT2 value for this CustomersCriteria.
     * 
     * @return sORT2
     */
    public beans.ws.mdm.sap.com.TextCriteria getSORT2() {
        return sORT2;
    }


    /**
     * Sets the sORT2 value for this CustomersCriteria.
     * 
     * @param sORT2
     */
    public void setSORT2(beans.ws.mdm.sap.com.TextCriteria sORT2) {
        this.sORT2 = sORT2;
    }


    /**
     * Gets the sPRAS value for this CustomersCriteria.
     * 
     * @return sPRAS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getSPRAS() {
        return sPRAS;
    }


    /**
     * Sets the sPRAS value for this CustomersCriteria.
     * 
     * @param sPRAS
     */
    public void setSPRAS(beans.ws.mdm.sap.com.PicklistCriteria sPRAS) {
        this.sPRAS = sPRAS;
    }


    /**
     * Gets the lAND1 value for this CustomersCriteria.
     * 
     * @return lAND1
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getLAND1() {
        return lAND1;
    }


    /**
     * Sets the lAND1 value for this CustomersCriteria.
     * 
     * @param lAND1
     */
    public void setLAND1(beans.ws.mdm.sap.com.PicklistCriteria lAND1) {
        this.lAND1 = lAND1;
    }


    /**
     * Gets the rEGIO value for this CustomersCriteria.
     * 
     * @return rEGIO
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getREGIO() {
        return rEGIO;
    }


    /**
     * Sets the rEGIO value for this CustomersCriteria.
     * 
     * @param rEGIO
     */
    public void setREGIO(beans.ws.mdm.sap.com.PicklistCriteria rEGIO) {
        this.rEGIO = rEGIO;
    }


    /**
     * Gets the oRT01 value for this CustomersCriteria.
     * 
     * @return oRT01
     */
    public beans.ws.mdm.sap.com.TextCriteria getORT01() {
        return oRT01;
    }


    /**
     * Sets the oRT01 value for this CustomersCriteria.
     * 
     * @param oRT01
     */
    public void setORT01(beans.ws.mdm.sap.com.TextCriteria oRT01) {
        this.oRT01 = oRT01;
    }


    /**
     * Gets the sTREET value for this CustomersCriteria.
     * 
     * @return sTREET
     */
    public beans.ws.mdm.sap.com.TextCriteria getSTREET() {
        return sTREET;
    }


    /**
     * Sets the sTREET value for this CustomersCriteria.
     * 
     * @param sTREET
     */
    public void setSTREET(beans.ws.mdm.sap.com.TextCriteria sTREET) {
        this.sTREET = sTREET;
    }


    /**
     * Gets the pSTLZ value for this CustomersCriteria.
     * 
     * @return pSTLZ
     */
    public beans.ws.mdm.sap.com.TextCriteria getPSTLZ() {
        return pSTLZ;
    }


    /**
     * Sets the pSTLZ value for this CustomersCriteria.
     * 
     * @param pSTLZ
     */
    public void setPSTLZ(beans.ws.mdm.sap.com.TextCriteria pSTLZ) {
        this.pSTLZ = pSTLZ;
    }


    /**
     * Gets the tEL_NUMBER value for this CustomersCriteria.
     * 
     * @return tEL_NUMBER
     */
    public beans.ws.mdm.sap.com.TextCriteria getTEL_NUMBER() {
        return tEL_NUMBER;
    }


    /**
     * Sets the tEL_NUMBER value for this CustomersCriteria.
     * 
     * @param tEL_NUMBER
     */
    public void setTEL_NUMBER(beans.ws.mdm.sap.com.TextCriteria tEL_NUMBER) {
        this.tEL_NUMBER = tEL_NUMBER;
    }


    /**
     * Gets the tEL_EXTENS value for this CustomersCriteria.
     * 
     * @return tEL_EXTENS
     */
    public beans.ws.mdm.sap.com.TextCriteria getTEL_EXTENS() {
        return tEL_EXTENS;
    }


    /**
     * Sets the tEL_EXTENS value for this CustomersCriteria.
     * 
     * @param tEL_EXTENS
     */
    public void setTEL_EXTENS(beans.ws.mdm.sap.com.TextCriteria tEL_EXTENS) {
        this.tEL_EXTENS = tEL_EXTENS;
    }


    /**
     * Gets the fAX_NUMBER value for this CustomersCriteria.
     * 
     * @return fAX_NUMBER
     */
    public beans.ws.mdm.sap.com.TextCriteria getFAX_NUMBER() {
        return fAX_NUMBER;
    }


    /**
     * Sets the fAX_NUMBER value for this CustomersCriteria.
     * 
     * @param fAX_NUMBER
     */
    public void setFAX_NUMBER(beans.ws.mdm.sap.com.TextCriteria fAX_NUMBER) {
        this.fAX_NUMBER = fAX_NUMBER;
    }


    /**
     * Gets the fAX_EXTENS value for this CustomersCriteria.
     * 
     * @return fAX_EXTENS
     */
    public beans.ws.mdm.sap.com.TextCriteria getFAX_EXTENS() {
        return fAX_EXTENS;
    }


    /**
     * Sets the fAX_EXTENS value for this CustomersCriteria.
     * 
     * @param fAX_EXTENS
     */
    public void setFAX_EXTENS(beans.ws.mdm.sap.com.TextCriteria fAX_EXTENS) {
        this.fAX_EXTENS = fAX_EXTENS;
    }


    /**
     * Gets the sMTP_ADDR value for this CustomersCriteria.
     * 
     * @return sMTP_ADDR
     */
    public beans.ws.mdm.sap.com.TextCriteria getSMTP_ADDR() {
        return sMTP_ADDR;
    }


    /**
     * Sets the sMTP_ADDR value for this CustomersCriteria.
     * 
     * @param sMTP_ADDR
     */
    public void setSMTP_ADDR(beans.ws.mdm.sap.com.TextCriteria sMTP_ADDR) {
        this.sMTP_ADDR = sMTP_ADDR;
    }


    /**
     * Gets the sPERM value for this CustomersCriteria.
     * 
     * @return sPERM
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getSPERM() {
        return sPERM;
    }


    /**
     * Sets the sPERM value for this CustomersCriteria.
     * 
     * @param sPERM
     */
    public void setSPERM(beans.ws.mdm.sap.com.BooleanCriteria sPERM) {
        this.sPERM = sPERM;
    }


    /**
     * Gets the vBUND value for this CustomersCriteria.
     * 
     * @return vBUND
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getVBUND() {
        return vBUND;
    }


    /**
     * Sets the vBUND value for this CustomersCriteria.
     * 
     * @param vBUND
     */
    public void setVBUND(beans.ws.mdm.sap.com.PicklistCriteria vBUND) {
        this.vBUND = vBUND;
    }


    /**
     * Gets the sTKZU value for this CustomersCriteria.
     * 
     * @return sTKZU
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getSTKZU() {
        return sTKZU;
    }


    /**
     * Sets the sTKZU value for this CustomersCriteria.
     * 
     * @param sTKZU
     */
    public void setSTKZU(beans.ws.mdm.sap.com.BooleanCriteria sTKZU) {
        this.sTKZU = sTKZU;
    }


    /**
     * Gets the lIFNR value for this CustomersCriteria.
     * 
     * @return lIFNR
     */
    public beans.ws.mdm.sap.com.TextCriteria getLIFNR() {
        return lIFNR;
    }


    /**
     * Sets the lIFNR value for this CustomersCriteria.
     * 
     * @param lIFNR
     */
    public void setLIFNR(beans.ws.mdm.sap.com.TextCriteria lIFNR) {
        this.lIFNR = lIFNR;
    }


    /**
     * Gets the aPCOD value for this CustomersCriteria.
     * 
     * @return aPCOD
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this CustomersCriteria.
     * 
     * @param aPCOD
     */
    public void setAPCOD(beans.ws.mdm.sap.com.PicklistCriteria aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the aPMEM value for this CustomersCriteria.
     * 
     * @return aPMEM
     */
    public beans.ws.mdm.sap.com.TextCriteria getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this CustomersCriteria.
     * 
     * @param aPMEM
     */
    public void setAPMEM(beans.ws.mdm.sap.com.TextCriteria aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this CustomersCriteria.
     * 
     * @return applicant
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this CustomersCriteria.
     * 
     * @param applicant
     */
    public void setApplicant(beans.ws.mdm.sap.com.TextCriteria applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the applyDate value for this CustomersCriteria.
     * 
     * @return applyDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this CustomersCriteria.
     * 
     * @param applyDate
     */
    public void setApplyDate(beans.ws.mdm.sap.com.DateTimeCriteria applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this CustomersCriteria.
     * 
     * @return applyTime
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this CustomersCriteria.
     * 
     * @param applyTime
     */
    public void setApplyTime(beans.ws.mdm.sap.com.DateTimeCriteria applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the bankDetailsBANKS value for this CustomersCriteria.
     * 
     * @return bankDetailsBANKS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getBankDetailsBANKS() {
        return bankDetailsBANKS;
    }


    /**
     * Sets the bankDetailsBANKS value for this CustomersCriteria.
     * 
     * @param bankDetailsBANKS
     */
    public void setBankDetailsBANKS(beans.ws.mdm.sap.com.PicklistCriteria bankDetailsBANKS) {
        this.bankDetailsBANKS = bankDetailsBANKS;
    }


    /**
     * Gets the bankDetailsBANKL value for this CustomersCriteria.
     * 
     * @return bankDetailsBANKL
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getBankDetailsBANKL() {
        return bankDetailsBANKL;
    }


    /**
     * Sets the bankDetailsBANKL value for this CustomersCriteria.
     * 
     * @param bankDetailsBANKL
     */
    public void setBankDetailsBANKL(beans.ws.mdm.sap.com.PicklistCriteria bankDetailsBANKL) {
        this.bankDetailsBANKL = bankDetailsBANKL;
    }


    /**
     * Gets the bankDetailsBANKN value for this CustomersCriteria.
     * 
     * @return bankDetailsBANKN
     */
    public beans.ws.mdm.sap.com.TextCriteria getBankDetailsBANKN() {
        return bankDetailsBANKN;
    }


    /**
     * Sets the bankDetailsBANKN value for this CustomersCriteria.
     * 
     * @param bankDetailsBANKN
     */
    public void setBankDetailsBANKN(beans.ws.mdm.sap.com.TextCriteria bankDetailsBANKN) {
        this.bankDetailsBANKN = bankDetailsBANKN;
    }


    /**
     * Gets the bankDetailsKOINH value for this CustomersCriteria.
     * 
     * @return bankDetailsKOINH
     */
    public beans.ws.mdm.sap.com.TextCriteria getBankDetailsKOINH() {
        return bankDetailsKOINH;
    }


    /**
     * Sets the bankDetailsKOINH value for this CustomersCriteria.
     * 
     * @param bankDetailsKOINH
     */
    public void setBankDetailsKOINH(beans.ws.mdm.sap.com.TextCriteria bankDetailsKOINH) {
        this.bankDetailsKOINH = bankDetailsKOINH;
    }


    /**
     * Gets the createBy value for this CustomersCriteria.
     * 
     * @return createBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getCreateBy() {
        return createBy;
    }


    /**
     * Sets the createBy value for this CustomersCriteria.
     * 
     * @param createBy
     */
    public void setCreateBy(beans.ws.mdm.sap.com.TextCriteria createBy) {
        this.createBy = createBy;
    }


    /**
     * Gets the createDate value for this CustomersCriteria.
     * 
     * @return createDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this CustomersCriteria.
     * 
     * @param createDate
     */
    public void setCreateDate(beans.ws.mdm.sap.com.DateTimeCriteria createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the updateBy value for this CustomersCriteria.
     * 
     * @return updateBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this CustomersCriteria.
     * 
     * @param updateBy
     */
    public void setUpdateBy(beans.ws.mdm.sap.com.TextCriteria updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the updateDate value for this CustomersCriteria.
     * 
     * @return updateDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this CustomersCriteria.
     * 
     * @param updateDate
     */
    public void setUpdateDate(beans.ws.mdm.sap.com.DateTimeCriteria updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the serviceRelationshipsTupleCLIENT_SYSTEM value for this CustomersCriteria.
     * 
     * @return serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleCLIENT_SYSTEM() {
        return serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Sets the serviceRelationshipsTupleCLIENT_SYSTEM value for this CustomersCriteria.
     * 
     * @param serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public void setServiceRelationshipsTupleCLIENT_SYSTEM(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM) {
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Gets the serviceRelationshipsTupleDISTUS value for this CustomersCriteria.
     * 
     * @return serviceRelationshipsTupleDISTUS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleDISTUS() {
        return serviceRelationshipsTupleDISTUS;
    }


    /**
     * Sets the serviceRelationshipsTupleDISTUS value for this CustomersCriteria.
     * 
     * @param serviceRelationshipsTupleDISTUS
     */
    public void setServiceRelationshipsTupleDISTUS(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS) {
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
    }


    /**
     * Gets the serviceRelationshipsTupleDGUID value for this CustomersCriteria.
     * 
     * @return serviceRelationshipsTupleDGUID
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleDGUID() {
        return serviceRelationshipsTupleDGUID;
    }


    /**
     * Sets the serviceRelationshipsTupleDGUID value for this CustomersCriteria.
     * 
     * @param serviceRelationshipsTupleDGUID
     */
    public void setServiceRelationshipsTupleDGUID(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID) {
        this.serviceRelationshipsTupleDGUID = serviceRelationshipsTupleDGUID;
    }


    /**
     * Gets the serviceRelationshipsTupleRETURN value for this CustomersCriteria.
     * 
     * @return serviceRelationshipsTupleRETURN
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleRETURN() {
        return serviceRelationshipsTupleRETURN;
    }


    /**
     * Sets the serviceRelationshipsTupleRETURN value for this CustomersCriteria.
     * 
     * @param serviceRelationshipsTupleRETURN
     */
    public void setServiceRelationshipsTupleRETURN(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN) {
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
    }


    /**
     * Gets the operation value for this CustomersCriteria.
     * 
     * @return operation
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this CustomersCriteria.
     * 
     * @param operation
     */
    public void setOperation(beans.ws.mdm.sap.com.PicklistCriteria operation) {
        this.operation = operation;
    }


    /**
     * Gets the dATAC value for this CustomersCriteria.
     * 
     * @return dATAC
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this CustomersCriteria.
     * 
     * @param dATAC
     */
    public void setDATAC(beans.ws.mdm.sap.com.BooleanCriteria dATAC) {
        this.dATAC = dATAC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomersCriteria)) return false;
        CustomersCriteria other = (CustomersCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.namedSearchCriteria==null && other.getNamedSearchCriteria()==null) || 
             (this.namedSearchCriteria!=null &&
              java.util.Arrays.equals(this.namedSearchCriteria, other.getNamedSearchCriteria()))) &&
            ((this.maskCriteria==null && other.getMaskCriteria()==null) || 
             (this.maskCriteria!=null &&
              java.util.Arrays.equals(this.maskCriteria, other.getMaskCriteria()))) &&
            ((this.logicalOperator==null && other.getLogicalOperator()==null) || 
             (this.logicalOperator!=null &&
              this.logicalOperator.equals(other.getLogicalOperator()))) &&
            ((this.keywordCriteria==null && other.getKeywordCriteria()==null) || 
             (this.keywordCriteria!=null &&
              this.keywordCriteria.equals(other.getKeywordCriteria()))) &&
            ((this.autoID==null && other.getAutoID()==null) || 
             (this.autoID!=null &&
              this.autoID.equals(other.getAutoID()))) &&
            ((this.applyNumber==null && other.getApplyNumber()==null) || 
             (this.applyNumber!=null &&
              this.applyNumber.equals(other.getApplyNumber()))) &&
            ((this.kTOKD==null && other.getKTOKD()==null) || 
             (this.kTOKD!=null &&
              this.kTOKD.equals(other.getKTOKD()))) &&
            ((this.kUNNR==null && other.getKUNNR()==null) || 
             (this.kUNNR!=null &&
              this.kUNNR.equals(other.getKUNNR()))) &&
            ((this.aNRED==null && other.getANRED()==null) || 
             (this.aNRED!=null &&
              this.aNRED.equals(other.getANRED()))) &&
            ((this.kUKLA==null && other.getKUKLA()==null) || 
             (this.kUKLA!=null &&
              this.kUKLA.equals(other.getKUKLA()))) &&
            ((this.nAME1==null && other.getNAME1()==null) || 
             (this.nAME1!=null &&
              this.nAME1.equals(other.getNAME1()))) &&
            ((this.fULL_NAME==null && other.getFULL_NAME()==null) || 
             (this.fULL_NAME!=null &&
              this.fULL_NAME.equals(other.getFULL_NAME()))) &&
            ((this.sTCEG==null && other.getSTCEG()==null) || 
             (this.sTCEG!=null &&
              this.sTCEG.equals(other.getSTCEG()))) &&
            ((this.sTCD1==null && other.getSTCD1()==null) || 
             (this.sTCD1!=null &&
              this.sTCD1.equals(other.getSTCD1()))) &&
            ((this.sTCD5==null && other.getSTCD5()==null) || 
             (this.sTCD5!=null &&
              this.sTCD5.equals(other.getSTCD5()))) &&
            ((this.sORT1==null && other.getSORT1()==null) || 
             (this.sORT1!=null &&
              this.sORT1.equals(other.getSORT1()))) &&
            ((this.sORT2==null && other.getSORT2()==null) || 
             (this.sORT2!=null &&
              this.sORT2.equals(other.getSORT2()))) &&
            ((this.sPRAS==null && other.getSPRAS()==null) || 
             (this.sPRAS!=null &&
              this.sPRAS.equals(other.getSPRAS()))) &&
            ((this.lAND1==null && other.getLAND1()==null) || 
             (this.lAND1!=null &&
              this.lAND1.equals(other.getLAND1()))) &&
            ((this.rEGIO==null && other.getREGIO()==null) || 
             (this.rEGIO!=null &&
              this.rEGIO.equals(other.getREGIO()))) &&
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
            ((this.vBUND==null && other.getVBUND()==null) || 
             (this.vBUND!=null &&
              this.vBUND.equals(other.getVBUND()))) &&
            ((this.sTKZU==null && other.getSTKZU()==null) || 
             (this.sTKZU!=null &&
              this.sTKZU.equals(other.getSTKZU()))) &&
            ((this.lIFNR==null && other.getLIFNR()==null) || 
             (this.lIFNR!=null &&
              this.lIFNR.equals(other.getLIFNR()))) &&
            ((this.aPCOD==null && other.getAPCOD()==null) || 
             (this.aPCOD!=null &&
              this.aPCOD.equals(other.getAPCOD()))) &&
            ((this.aPMEM==null && other.getAPMEM()==null) || 
             (this.aPMEM!=null &&
              this.aPMEM.equals(other.getAPMEM()))) &&
            ((this.applicant==null && other.getApplicant()==null) || 
             (this.applicant!=null &&
              this.applicant.equals(other.getApplicant()))) &&
            ((this.applyDate==null && other.getApplyDate()==null) || 
             (this.applyDate!=null &&
              this.applyDate.equals(other.getApplyDate()))) &&
            ((this.applyTime==null && other.getApplyTime()==null) || 
             (this.applyTime!=null &&
              this.applyTime.equals(other.getApplyTime()))) &&
            ((this.bankDetailsBANKS==null && other.getBankDetailsBANKS()==null) || 
             (this.bankDetailsBANKS!=null &&
              this.bankDetailsBANKS.equals(other.getBankDetailsBANKS()))) &&
            ((this.bankDetailsBANKL==null && other.getBankDetailsBANKL()==null) || 
             (this.bankDetailsBANKL!=null &&
              this.bankDetailsBANKL.equals(other.getBankDetailsBANKL()))) &&
            ((this.bankDetailsBANKN==null && other.getBankDetailsBANKN()==null) || 
             (this.bankDetailsBANKN!=null &&
              this.bankDetailsBANKN.equals(other.getBankDetailsBANKN()))) &&
            ((this.bankDetailsKOINH==null && other.getBankDetailsKOINH()==null) || 
             (this.bankDetailsKOINH!=null &&
              this.bankDetailsKOINH.equals(other.getBankDetailsKOINH()))) &&
            ((this.createBy==null && other.getCreateBy()==null) || 
             (this.createBy!=null &&
              this.createBy.equals(other.getCreateBy()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.updateBy==null && other.getUpdateBy()==null) || 
             (this.updateBy!=null &&
              this.updateBy.equals(other.getUpdateBy()))) &&
            ((this.updateDate==null && other.getUpdateDate()==null) || 
             (this.updateDate!=null &&
              this.updateDate.equals(other.getUpdateDate()))) &&
            ((this.serviceRelationshipsTupleCLIENT_SYSTEM==null && other.getServiceRelationshipsTupleCLIENT_SYSTEM()==null) || 
             (this.serviceRelationshipsTupleCLIENT_SYSTEM!=null &&
              this.serviceRelationshipsTupleCLIENT_SYSTEM.equals(other.getServiceRelationshipsTupleCLIENT_SYSTEM()))) &&
            ((this.serviceRelationshipsTupleDISTUS==null && other.getServiceRelationshipsTupleDISTUS()==null) || 
             (this.serviceRelationshipsTupleDISTUS!=null &&
              this.serviceRelationshipsTupleDISTUS.equals(other.getServiceRelationshipsTupleDISTUS()))) &&
            ((this.serviceRelationshipsTupleDGUID==null && other.getServiceRelationshipsTupleDGUID()==null) || 
             (this.serviceRelationshipsTupleDGUID!=null &&
              this.serviceRelationshipsTupleDGUID.equals(other.getServiceRelationshipsTupleDGUID()))) &&
            ((this.serviceRelationshipsTupleRETURN==null && other.getServiceRelationshipsTupleRETURN()==null) || 
             (this.serviceRelationshipsTupleRETURN!=null &&
              this.serviceRelationshipsTupleRETURN.equals(other.getServiceRelationshipsTupleRETURN()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.dATAC==null && other.getDATAC()==null) || 
             (this.dATAC!=null &&
              this.dATAC.equals(other.getDATAC())));
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
        if (getNamedSearchCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNamedSearchCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNamedSearchCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaskCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaskCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaskCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogicalOperator() != null) {
            _hashCode += getLogicalOperator().hashCode();
        }
        if (getKeywordCriteria() != null) {
            _hashCode += getKeywordCriteria().hashCode();
        }
        if (getAutoID() != null) {
            _hashCode += getAutoID().hashCode();
        }
        if (getApplyNumber() != null) {
            _hashCode += getApplyNumber().hashCode();
        }
        if (getKTOKD() != null) {
            _hashCode += getKTOKD().hashCode();
        }
        if (getKUNNR() != null) {
            _hashCode += getKUNNR().hashCode();
        }
        if (getANRED() != null) {
            _hashCode += getANRED().hashCode();
        }
        if (getKUKLA() != null) {
            _hashCode += getKUKLA().hashCode();
        }
        if (getNAME1() != null) {
            _hashCode += getNAME1().hashCode();
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
        if (getSTCD5() != null) {
            _hashCode += getSTCD5().hashCode();
        }
        if (getSORT1() != null) {
            _hashCode += getSORT1().hashCode();
        }
        if (getSORT2() != null) {
            _hashCode += getSORT2().hashCode();
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
        if (getVBUND() != null) {
            _hashCode += getVBUND().hashCode();
        }
        if (getSTKZU() != null) {
            _hashCode += getSTKZU().hashCode();
        }
        if (getLIFNR() != null) {
            _hashCode += getLIFNR().hashCode();
        }
        if (getAPCOD() != null) {
            _hashCode += getAPCOD().hashCode();
        }
        if (getAPMEM() != null) {
            _hashCode += getAPMEM().hashCode();
        }
        if (getApplicant() != null) {
            _hashCode += getApplicant().hashCode();
        }
        if (getApplyDate() != null) {
            _hashCode += getApplyDate().hashCode();
        }
        if (getApplyTime() != null) {
            _hashCode += getApplyTime().hashCode();
        }
        if (getBankDetailsBANKS() != null) {
            _hashCode += getBankDetailsBANKS().hashCode();
        }
        if (getBankDetailsBANKL() != null) {
            _hashCode += getBankDetailsBANKL().hashCode();
        }
        if (getBankDetailsBANKN() != null) {
            _hashCode += getBankDetailsBANKN().hashCode();
        }
        if (getBankDetailsKOINH() != null) {
            _hashCode += getBankDetailsKOINH().hashCode();
        }
        if (getCreateBy() != null) {
            _hashCode += getCreateBy().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getUpdateBy() != null) {
            _hashCode += getUpdateBy().hashCode();
        }
        if (getUpdateDate() != null) {
            _hashCode += getUpdateDate().hashCode();
        }
        if (getServiceRelationshipsTupleCLIENT_SYSTEM() != null) {
            _hashCode += getServiceRelationshipsTupleCLIENT_SYSTEM().hashCode();
        }
        if (getServiceRelationshipsTupleDISTUS() != null) {
            _hashCode += getServiceRelationshipsTupleDISTUS().hashCode();
        }
        if (getServiceRelationshipsTupleDGUID() != null) {
            _hashCode += getServiceRelationshipsTupleDGUID().hashCode();
        }
        if (getServiceRelationshipsTupleRETURN() != null) {
            _hashCode += getServiceRelationshipsTupleRETURN().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getDATAC() != null) {
            _hashCode += getDATAC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomersCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "namedSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "maskCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "logicalOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "keywordCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeywordConstraint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "autoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "NumericCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KTOKD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "kTOKD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KUNNR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "kUNNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANRED");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "aNRED"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KUKLA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "kUKLA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAME1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "nAME1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FULL_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "fULL_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCEG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTCEG"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCD1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTCD1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STCD5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTCD5"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SORT1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sORT1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SORT2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sORT2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPRAS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sPRAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LAND1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "lAND1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGIO");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "rEGIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORT01");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "oRT01"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STREET");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTREET"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSTLZ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "pSTLZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TEL_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "tEL_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TEL_EXTENS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "tEL_EXTENS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAX_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "fAX_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAX_EXTENS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "fAX_EXTENS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMTP_ADDR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sMTP_ADDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPERM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sPERM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VBUND");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "vBUND"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STKZU");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTKZU"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIFNR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "lIFNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "aPCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APMEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "aPMEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "applyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "applyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankDetailsBANKS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bankDetailsBANKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankDetailsBANKL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bankDetailsBANKL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankDetailsBANKN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bankDetailsBANKN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankDetailsKOINH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bankDetailsKOINH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "createBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "updateBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleCLIENT_SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "serviceRelationshipsTupleCLIENT_SYSTEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleDISTUS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "serviceRelationshipsTupleDISTUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleDGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "serviceRelationshipsTupleDGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleRETURN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "serviceRelationshipsTupleRETURN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "dATAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
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
