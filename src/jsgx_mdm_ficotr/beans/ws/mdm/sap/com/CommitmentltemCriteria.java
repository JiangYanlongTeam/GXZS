/**
 * CommitmentltemCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class CommitmentltemCriteria  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String[] namedSearchCriteria;

    private java.lang.String[] maskCriteria;

    private java.lang.String logicalOperator;

    private beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria;

    private beans.ws.mdm.sap.com.NumericCriteria autoID;

    private beans.ws.mdm.sap.com.TextCriteria applyNumber;

    private beans.ws.mdm.sap.com.TextCriteria fIKRS;

    private beans.ws.mdm.sap.com.TextCriteria fIPOS;

    private beans.ws.mdm.sap.com.TextCriteria bEZEICH;

    private beans.ws.mdm.sap.com.TextCriteria bESCHR;

    private beans.ws.mdm.sap.com.PicklistCriteria fIVOR;

    private beans.ws.mdm.sap.com.PicklistCriteria kNZAEPO;

    private beans.ws.mdm.sap.com.PicklistCriteria fICPOS;

    private beans.ws.mdm.sap.com.BooleanCriteria cOMCAT;

    private beans.ws.mdm.sap.com.BooleanCriteria sTATS;

    private beans.ws.mdm.sap.com.BooleanCriteria lVOMA;

    private beans.ws.mdm.sap.com.PicklistCriteria aPCOD;

    private beans.ws.mdm.sap.com.TextCriteria aPMEM;

    private beans.ws.mdm.sap.com.TextCriteria applicant;

    private beans.ws.mdm.sap.com.TextCriteria applyReason;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyDate;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyTime;

    private beans.ws.mdm.sap.com.TextCriteria createBy;

    private beans.ws.mdm.sap.com.DateTimeCriteria createDate;

    private beans.ws.mdm.sap.com.TextCriteria updateBy;

    private beans.ws.mdm.sap.com.TextCriteria updateDate;

    private beans.ws.mdm.sap.com.BooleanCriteria dATAC;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleGUID;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN;

    private beans.ws.mdm.sap.com.PicklistCriteria operation;

    public CommitmentltemCriteria() {
    }

    public CommitmentltemCriteria(
           java.lang.String[] namedSearchCriteria,
           java.lang.String[] maskCriteria,
           java.lang.String logicalOperator,
           beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria,
           beans.ws.mdm.sap.com.NumericCriteria autoID,
           beans.ws.mdm.sap.com.TextCriteria applyNumber,
           beans.ws.mdm.sap.com.TextCriteria fIKRS,
           beans.ws.mdm.sap.com.TextCriteria fIPOS,
           beans.ws.mdm.sap.com.TextCriteria bEZEICH,
           beans.ws.mdm.sap.com.TextCriteria bESCHR,
           beans.ws.mdm.sap.com.PicklistCriteria fIVOR,
           beans.ws.mdm.sap.com.PicklistCriteria kNZAEPO,
           beans.ws.mdm.sap.com.PicklistCriteria fICPOS,
           beans.ws.mdm.sap.com.BooleanCriteria cOMCAT,
           beans.ws.mdm.sap.com.BooleanCriteria sTATS,
           beans.ws.mdm.sap.com.BooleanCriteria lVOMA,
           beans.ws.mdm.sap.com.PicklistCriteria aPCOD,
           beans.ws.mdm.sap.com.TextCriteria aPMEM,
           beans.ws.mdm.sap.com.TextCriteria applicant,
           beans.ws.mdm.sap.com.TextCriteria applyReason,
           beans.ws.mdm.sap.com.DateTimeCriteria applyDate,
           beans.ws.mdm.sap.com.DateTimeCriteria applyTime,
           beans.ws.mdm.sap.com.TextCriteria createBy,
           beans.ws.mdm.sap.com.DateTimeCriteria createDate,
           beans.ws.mdm.sap.com.TextCriteria updateBy,
           beans.ws.mdm.sap.com.TextCriteria updateDate,
           beans.ws.mdm.sap.com.BooleanCriteria dATAC,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleGUID,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN,
           beans.ws.mdm.sap.com.PicklistCriteria operation) {
        this.namedSearchCriteria = namedSearchCriteria;
        this.maskCriteria = maskCriteria;
        this.logicalOperator = logicalOperator;
        this.keywordCriteria = keywordCriteria;
        this.autoID = autoID;
        this.applyNumber = applyNumber;
        this.fIKRS = fIKRS;
        this.fIPOS = fIPOS;
        this.bEZEICH = bEZEICH;
        this.bESCHR = bESCHR;
        this.fIVOR = fIVOR;
        this.kNZAEPO = kNZAEPO;
        this.fICPOS = fICPOS;
        this.cOMCAT = cOMCAT;
        this.sTATS = sTATS;
        this.lVOMA = lVOMA;
        this.aPCOD = aPCOD;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.applyReason = applyReason;
        this.applyDate = applyDate;
        this.applyTime = applyTime;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.dATAC = dATAC;
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
        this.serviceRelationshipsTupleGUID = serviceRelationshipsTupleGUID;
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
        this.operation = operation;
    }


    /**
     * Gets the namedSearchCriteria value for this CommitmentltemCriteria.
     * 
     * @return namedSearchCriteria
     */
    public java.lang.String[] getNamedSearchCriteria() {
        return namedSearchCriteria;
    }


    /**
     * Sets the namedSearchCriteria value for this CommitmentltemCriteria.
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
     * Gets the maskCriteria value for this CommitmentltemCriteria.
     * 
     * @return maskCriteria
     */
    public java.lang.String[] getMaskCriteria() {
        return maskCriteria;
    }


    /**
     * Sets the maskCriteria value for this CommitmentltemCriteria.
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
     * Gets the logicalOperator value for this CommitmentltemCriteria.
     * 
     * @return logicalOperator
     */
    public java.lang.String getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this CommitmentltemCriteria.
     * 
     * @param logicalOperator
     */
    public void setLogicalOperator(java.lang.String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the keywordCriteria value for this CommitmentltemCriteria.
     * 
     * @return keywordCriteria
     */
    public beans.ws.mdm.sap.com.KeywordConstraint getKeywordCriteria() {
        return keywordCriteria;
    }


    /**
     * Sets the keywordCriteria value for this CommitmentltemCriteria.
     * 
     * @param keywordCriteria
     */
    public void setKeywordCriteria(beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria) {
        this.keywordCriteria = keywordCriteria;
    }


    /**
     * Gets the autoID value for this CommitmentltemCriteria.
     * 
     * @return autoID
     */
    public beans.ws.mdm.sap.com.NumericCriteria getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this CommitmentltemCriteria.
     * 
     * @param autoID
     */
    public void setAutoID(beans.ws.mdm.sap.com.NumericCriteria autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the applyNumber value for this CommitmentltemCriteria.
     * 
     * @return applyNumber
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this CommitmentltemCriteria.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(beans.ws.mdm.sap.com.TextCriteria applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the fIKRS value for this CommitmentltemCriteria.
     * 
     * @return fIKRS
     */
    public beans.ws.mdm.sap.com.TextCriteria getFIKRS() {
        return fIKRS;
    }


    /**
     * Sets the fIKRS value for this CommitmentltemCriteria.
     * 
     * @param fIKRS
     */
    public void setFIKRS(beans.ws.mdm.sap.com.TextCriteria fIKRS) {
        this.fIKRS = fIKRS;
    }


    /**
     * Gets the fIPOS value for this CommitmentltemCriteria.
     * 
     * @return fIPOS
     */
    public beans.ws.mdm.sap.com.TextCriteria getFIPOS() {
        return fIPOS;
    }


    /**
     * Sets the fIPOS value for this CommitmentltemCriteria.
     * 
     * @param fIPOS
     */
    public void setFIPOS(beans.ws.mdm.sap.com.TextCriteria fIPOS) {
        this.fIPOS = fIPOS;
    }


    /**
     * Gets the bEZEICH value for this CommitmentltemCriteria.
     * 
     * @return bEZEICH
     */
    public beans.ws.mdm.sap.com.TextCriteria getBEZEICH() {
        return bEZEICH;
    }


    /**
     * Sets the bEZEICH value for this CommitmentltemCriteria.
     * 
     * @param bEZEICH
     */
    public void setBEZEICH(beans.ws.mdm.sap.com.TextCriteria bEZEICH) {
        this.bEZEICH = bEZEICH;
    }


    /**
     * Gets the bESCHR value for this CommitmentltemCriteria.
     * 
     * @return bESCHR
     */
    public beans.ws.mdm.sap.com.TextCriteria getBESCHR() {
        return bESCHR;
    }


    /**
     * Sets the bESCHR value for this CommitmentltemCriteria.
     * 
     * @param bESCHR
     */
    public void setBESCHR(beans.ws.mdm.sap.com.TextCriteria bESCHR) {
        this.bESCHR = bESCHR;
    }


    /**
     * Gets the fIVOR value for this CommitmentltemCriteria.
     * 
     * @return fIVOR
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getFIVOR() {
        return fIVOR;
    }


    /**
     * Sets the fIVOR value for this CommitmentltemCriteria.
     * 
     * @param fIVOR
     */
    public void setFIVOR(beans.ws.mdm.sap.com.PicklistCriteria fIVOR) {
        this.fIVOR = fIVOR;
    }


    /**
     * Gets the kNZAEPO value for this CommitmentltemCriteria.
     * 
     * @return kNZAEPO
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getKNZAEPO() {
        return kNZAEPO;
    }


    /**
     * Sets the kNZAEPO value for this CommitmentltemCriteria.
     * 
     * @param kNZAEPO
     */
    public void setKNZAEPO(beans.ws.mdm.sap.com.PicklistCriteria kNZAEPO) {
        this.kNZAEPO = kNZAEPO;
    }


    /**
     * Gets the fICPOS value for this CommitmentltemCriteria.
     * 
     * @return fICPOS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getFICPOS() {
        return fICPOS;
    }


    /**
     * Sets the fICPOS value for this CommitmentltemCriteria.
     * 
     * @param fICPOS
     */
    public void setFICPOS(beans.ws.mdm.sap.com.PicklistCriteria fICPOS) {
        this.fICPOS = fICPOS;
    }


    /**
     * Gets the cOMCAT value for this CommitmentltemCriteria.
     * 
     * @return cOMCAT
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getCOMCAT() {
        return cOMCAT;
    }


    /**
     * Sets the cOMCAT value for this CommitmentltemCriteria.
     * 
     * @param cOMCAT
     */
    public void setCOMCAT(beans.ws.mdm.sap.com.BooleanCriteria cOMCAT) {
        this.cOMCAT = cOMCAT;
    }


    /**
     * Gets the sTATS value for this CommitmentltemCriteria.
     * 
     * @return sTATS
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getSTATS() {
        return sTATS;
    }


    /**
     * Sets the sTATS value for this CommitmentltemCriteria.
     * 
     * @param sTATS
     */
    public void setSTATS(beans.ws.mdm.sap.com.BooleanCriteria sTATS) {
        this.sTATS = sTATS;
    }


    /**
     * Gets the lVOMA value for this CommitmentltemCriteria.
     * 
     * @return lVOMA
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getLVOMA() {
        return lVOMA;
    }


    /**
     * Sets the lVOMA value for this CommitmentltemCriteria.
     * 
     * @param lVOMA
     */
    public void setLVOMA(beans.ws.mdm.sap.com.BooleanCriteria lVOMA) {
        this.lVOMA = lVOMA;
    }


    /**
     * Gets the aPCOD value for this CommitmentltemCriteria.
     * 
     * @return aPCOD
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this CommitmentltemCriteria.
     * 
     * @param aPCOD
     */
    public void setAPCOD(beans.ws.mdm.sap.com.PicklistCriteria aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the aPMEM value for this CommitmentltemCriteria.
     * 
     * @return aPMEM
     */
    public beans.ws.mdm.sap.com.TextCriteria getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this CommitmentltemCriteria.
     * 
     * @param aPMEM
     */
    public void setAPMEM(beans.ws.mdm.sap.com.TextCriteria aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this CommitmentltemCriteria.
     * 
     * @return applicant
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this CommitmentltemCriteria.
     * 
     * @param applicant
     */
    public void setApplicant(beans.ws.mdm.sap.com.TextCriteria applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the applyReason value for this CommitmentltemCriteria.
     * 
     * @return applyReason
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplyReason() {
        return applyReason;
    }


    /**
     * Sets the applyReason value for this CommitmentltemCriteria.
     * 
     * @param applyReason
     */
    public void setApplyReason(beans.ws.mdm.sap.com.TextCriteria applyReason) {
        this.applyReason = applyReason;
    }


    /**
     * Gets the applyDate value for this CommitmentltemCriteria.
     * 
     * @return applyDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this CommitmentltemCriteria.
     * 
     * @param applyDate
     */
    public void setApplyDate(beans.ws.mdm.sap.com.DateTimeCriteria applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this CommitmentltemCriteria.
     * 
     * @return applyTime
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this CommitmentltemCriteria.
     * 
     * @param applyTime
     */
    public void setApplyTime(beans.ws.mdm.sap.com.DateTimeCriteria applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the createBy value for this CommitmentltemCriteria.
     * 
     * @return createBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getCreateBy() {
        return createBy;
    }


    /**
     * Sets the createBy value for this CommitmentltemCriteria.
     * 
     * @param createBy
     */
    public void setCreateBy(beans.ws.mdm.sap.com.TextCriteria createBy) {
        this.createBy = createBy;
    }


    /**
     * Gets the createDate value for this CommitmentltemCriteria.
     * 
     * @return createDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this CommitmentltemCriteria.
     * 
     * @param createDate
     */
    public void setCreateDate(beans.ws.mdm.sap.com.DateTimeCriteria createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the updateBy value for this CommitmentltemCriteria.
     * 
     * @return updateBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this CommitmentltemCriteria.
     * 
     * @param updateBy
     */
    public void setUpdateBy(beans.ws.mdm.sap.com.TextCriteria updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the updateDate value for this CommitmentltemCriteria.
     * 
     * @return updateDate
     */
    public beans.ws.mdm.sap.com.TextCriteria getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this CommitmentltemCriteria.
     * 
     * @param updateDate
     */
    public void setUpdateDate(beans.ws.mdm.sap.com.TextCriteria updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the dATAC value for this CommitmentltemCriteria.
     * 
     * @return dATAC
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this CommitmentltemCriteria.
     * 
     * @param dATAC
     */
    public void setDATAC(beans.ws.mdm.sap.com.BooleanCriteria dATAC) {
        this.dATAC = dATAC;
    }


    /**
     * Gets the serviceRelationshipsTupleCLIENT_SYSTEM value for this CommitmentltemCriteria.
     * 
     * @return serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleCLIENT_SYSTEM() {
        return serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Sets the serviceRelationshipsTupleCLIENT_SYSTEM value for this CommitmentltemCriteria.
     * 
     * @param serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public void setServiceRelationshipsTupleCLIENT_SYSTEM(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM) {
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Gets the serviceRelationshipsTupleDISTUS value for this CommitmentltemCriteria.
     * 
     * @return serviceRelationshipsTupleDISTUS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleDISTUS() {
        return serviceRelationshipsTupleDISTUS;
    }


    /**
     * Sets the serviceRelationshipsTupleDISTUS value for this CommitmentltemCriteria.
     * 
     * @param serviceRelationshipsTupleDISTUS
     */
    public void setServiceRelationshipsTupleDISTUS(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS) {
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
    }


    /**
     * Gets the serviceRelationshipsTupleGUID value for this CommitmentltemCriteria.
     * 
     * @return serviceRelationshipsTupleGUID
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleGUID() {
        return serviceRelationshipsTupleGUID;
    }


    /**
     * Sets the serviceRelationshipsTupleGUID value for this CommitmentltemCriteria.
     * 
     * @param serviceRelationshipsTupleGUID
     */
    public void setServiceRelationshipsTupleGUID(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleGUID) {
        this.serviceRelationshipsTupleGUID = serviceRelationshipsTupleGUID;
    }


    /**
     * Gets the serviceRelationshipsTupleRETURN value for this CommitmentltemCriteria.
     * 
     * @return serviceRelationshipsTupleRETURN
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleRETURN() {
        return serviceRelationshipsTupleRETURN;
    }


    /**
     * Sets the serviceRelationshipsTupleRETURN value for this CommitmentltemCriteria.
     * 
     * @param serviceRelationshipsTupleRETURN
     */
    public void setServiceRelationshipsTupleRETURN(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN) {
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
    }


    /**
     * Gets the operation value for this CommitmentltemCriteria.
     * 
     * @return operation
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this CommitmentltemCriteria.
     * 
     * @param operation
     */
    public void setOperation(beans.ws.mdm.sap.com.PicklistCriteria operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommitmentltemCriteria)) return false;
        CommitmentltemCriteria other = (CommitmentltemCriteria) obj;
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
            ((this.fIKRS==null && other.getFIKRS()==null) || 
             (this.fIKRS!=null &&
              this.fIKRS.equals(other.getFIKRS()))) &&
            ((this.fIPOS==null && other.getFIPOS()==null) || 
             (this.fIPOS!=null &&
              this.fIPOS.equals(other.getFIPOS()))) &&
            ((this.bEZEICH==null && other.getBEZEICH()==null) || 
             (this.bEZEICH!=null &&
              this.bEZEICH.equals(other.getBEZEICH()))) &&
            ((this.bESCHR==null && other.getBESCHR()==null) || 
             (this.bESCHR!=null &&
              this.bESCHR.equals(other.getBESCHR()))) &&
            ((this.fIVOR==null && other.getFIVOR()==null) || 
             (this.fIVOR!=null &&
              this.fIVOR.equals(other.getFIVOR()))) &&
            ((this.kNZAEPO==null && other.getKNZAEPO()==null) || 
             (this.kNZAEPO!=null &&
              this.kNZAEPO.equals(other.getKNZAEPO()))) &&
            ((this.fICPOS==null && other.getFICPOS()==null) || 
             (this.fICPOS!=null &&
              this.fICPOS.equals(other.getFICPOS()))) &&
            ((this.cOMCAT==null && other.getCOMCAT()==null) || 
             (this.cOMCAT!=null &&
              this.cOMCAT.equals(other.getCOMCAT()))) &&
            ((this.sTATS==null && other.getSTATS()==null) || 
             (this.sTATS!=null &&
              this.sTATS.equals(other.getSTATS()))) &&
            ((this.lVOMA==null && other.getLVOMA()==null) || 
             (this.lVOMA!=null &&
              this.lVOMA.equals(other.getLVOMA()))) &&
            ((this.aPCOD==null && other.getAPCOD()==null) || 
             (this.aPCOD!=null &&
              this.aPCOD.equals(other.getAPCOD()))) &&
            ((this.aPMEM==null && other.getAPMEM()==null) || 
             (this.aPMEM!=null &&
              this.aPMEM.equals(other.getAPMEM()))) &&
            ((this.applicant==null && other.getApplicant()==null) || 
             (this.applicant!=null &&
              this.applicant.equals(other.getApplicant()))) &&
            ((this.applyReason==null && other.getApplyReason()==null) || 
             (this.applyReason!=null &&
              this.applyReason.equals(other.getApplyReason()))) &&
            ((this.applyDate==null && other.getApplyDate()==null) || 
             (this.applyDate!=null &&
              this.applyDate.equals(other.getApplyDate()))) &&
            ((this.applyTime==null && other.getApplyTime()==null) || 
             (this.applyTime!=null &&
              this.applyTime.equals(other.getApplyTime()))) &&
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
            ((this.dATAC==null && other.getDATAC()==null) || 
             (this.dATAC!=null &&
              this.dATAC.equals(other.getDATAC()))) &&
            ((this.serviceRelationshipsTupleCLIENT_SYSTEM==null && other.getServiceRelationshipsTupleCLIENT_SYSTEM()==null) || 
             (this.serviceRelationshipsTupleCLIENT_SYSTEM!=null &&
              this.serviceRelationshipsTupleCLIENT_SYSTEM.equals(other.getServiceRelationshipsTupleCLIENT_SYSTEM()))) &&
            ((this.serviceRelationshipsTupleDISTUS==null && other.getServiceRelationshipsTupleDISTUS()==null) || 
             (this.serviceRelationshipsTupleDISTUS!=null &&
              this.serviceRelationshipsTupleDISTUS.equals(other.getServiceRelationshipsTupleDISTUS()))) &&
            ((this.serviceRelationshipsTupleGUID==null && other.getServiceRelationshipsTupleGUID()==null) || 
             (this.serviceRelationshipsTupleGUID!=null &&
              this.serviceRelationshipsTupleGUID.equals(other.getServiceRelationshipsTupleGUID()))) &&
            ((this.serviceRelationshipsTupleRETURN==null && other.getServiceRelationshipsTupleRETURN()==null) || 
             (this.serviceRelationshipsTupleRETURN!=null &&
              this.serviceRelationshipsTupleRETURN.equals(other.getServiceRelationshipsTupleRETURN()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
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
        if (getFIKRS() != null) {
            _hashCode += getFIKRS().hashCode();
        }
        if (getFIPOS() != null) {
            _hashCode += getFIPOS().hashCode();
        }
        if (getBEZEICH() != null) {
            _hashCode += getBEZEICH().hashCode();
        }
        if (getBESCHR() != null) {
            _hashCode += getBESCHR().hashCode();
        }
        if (getFIVOR() != null) {
            _hashCode += getFIVOR().hashCode();
        }
        if (getKNZAEPO() != null) {
            _hashCode += getKNZAEPO().hashCode();
        }
        if (getFICPOS() != null) {
            _hashCode += getFICPOS().hashCode();
        }
        if (getCOMCAT() != null) {
            _hashCode += getCOMCAT().hashCode();
        }
        if (getSTATS() != null) {
            _hashCode += getSTATS().hashCode();
        }
        if (getLVOMA() != null) {
            _hashCode += getLVOMA().hashCode();
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
        if (getApplyReason() != null) {
            _hashCode += getApplyReason().hashCode();
        }
        if (getApplyDate() != null) {
            _hashCode += getApplyDate().hashCode();
        }
        if (getApplyTime() != null) {
            _hashCode += getApplyTime().hashCode();
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
        if (getDATAC() != null) {
            _hashCode += getDATAC().hashCode();
        }
        if (getServiceRelationshipsTupleCLIENT_SYSTEM() != null) {
            _hashCode += getServiceRelationshipsTupleCLIENT_SYSTEM().hashCode();
        }
        if (getServiceRelationshipsTupleDISTUS() != null) {
            _hashCode += getServiceRelationshipsTupleDISTUS().hashCode();
        }
        if (getServiceRelationshipsTupleGUID() != null) {
            _hashCode += getServiceRelationshipsTupleGUID().hashCode();
        }
        if (getServiceRelationshipsTupleRETURN() != null) {
            _hashCode += getServiceRelationshipsTupleRETURN().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommitmentltemCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "namedSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "maskCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "logicalOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "keywordCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeywordConstraint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "autoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "NumericCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "fIKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "fIPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEZEICH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "bEZEICH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BESCHR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "bESCHR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIVOR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "fIVOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KNZAEPO");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "kNZAEPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FICPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "fICPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMCAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "cOMCAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "sTATS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LVOMA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "lVOMA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "aPCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APMEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "aPMEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applyReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "createBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "updateBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "dATAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleCLIENT_SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "serviceRelationshipsTupleCLIENT_SYSTEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleDISTUS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "serviceRelationshipsTupleDISTUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "serviceRelationshipsTupleGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleRETURN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "serviceRelationshipsTupleRETURN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
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
