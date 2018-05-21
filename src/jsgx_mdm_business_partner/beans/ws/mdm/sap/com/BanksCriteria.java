/**
 * BanksCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class BanksCriteria  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String[] namedSearchCriteria;

    private java.lang.String[] maskCriteria;

    private java.lang.String logicalOperator;

    private beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria;

    private beans.ws.mdm.sap.com.NumericCriteria autoID;

    private beans.ws.mdm.sap.com.TextCriteria applyNumber;

    private beans.ws.mdm.sap.com.TextCriteria bANKL;

    private beans.ws.mdm.sap.com.PicklistCriteria bANKS;

    private beans.ws.mdm.sap.com.TextCriteria bANKA;

    private beans.ws.mdm.sap.com.PicklistCriteria pROVZ;

    private beans.ws.mdm.sap.com.TextCriteria sTRAS;

    private beans.ws.mdm.sap.com.TextCriteria oRT01;

    private beans.ws.mdm.sap.com.TextCriteria bRNCH;

    private beans.ws.mdm.sap.com.PicklistCriteria aPCOD;

    private beans.ws.mdm.sap.com.TextCriteria aPMEM;

    private beans.ws.mdm.sap.com.TextCriteria applicant;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyDate;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyTime;

    private beans.ws.mdm.sap.com.TextCriteria createBy;

    private beans.ws.mdm.sap.com.DateTimeCriteria createDate;

    private beans.ws.mdm.sap.com.TextCriteria updateBy;

    private beans.ws.mdm.sap.com.DateTimeCriteria updateDate;

    private beans.ws.mdm.sap.com.BooleanCriteria dATAC;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN;

    private beans.ws.mdm.sap.com.PicklistCriteria operation;

    private beans.ws.mdm.sap.com.TextCriteria hBKID;

    public BanksCriteria() {
    }

    public BanksCriteria(
           java.lang.String[] namedSearchCriteria,
           java.lang.String[] maskCriteria,
           java.lang.String logicalOperator,
           beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria,
           beans.ws.mdm.sap.com.NumericCriteria autoID,
           beans.ws.mdm.sap.com.TextCriteria applyNumber,
           beans.ws.mdm.sap.com.TextCriteria bANKL,
           beans.ws.mdm.sap.com.PicklistCriteria bANKS,
           beans.ws.mdm.sap.com.TextCriteria bANKA,
           beans.ws.mdm.sap.com.PicklistCriteria pROVZ,
           beans.ws.mdm.sap.com.TextCriteria sTRAS,
           beans.ws.mdm.sap.com.TextCriteria oRT01,
           beans.ws.mdm.sap.com.TextCriteria bRNCH,
           beans.ws.mdm.sap.com.PicklistCriteria aPCOD,
           beans.ws.mdm.sap.com.TextCriteria aPMEM,
           beans.ws.mdm.sap.com.TextCriteria applicant,
           beans.ws.mdm.sap.com.DateTimeCriteria applyDate,
           beans.ws.mdm.sap.com.DateTimeCriteria applyTime,
           beans.ws.mdm.sap.com.TextCriteria createBy,
           beans.ws.mdm.sap.com.DateTimeCriteria createDate,
           beans.ws.mdm.sap.com.TextCriteria updateBy,
           beans.ws.mdm.sap.com.DateTimeCriteria updateDate,
           beans.ws.mdm.sap.com.BooleanCriteria dATAC,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN,
           beans.ws.mdm.sap.com.PicklistCriteria operation,
           beans.ws.mdm.sap.com.TextCriteria hBKID) {
        this.namedSearchCriteria = namedSearchCriteria;
        this.maskCriteria = maskCriteria;
        this.logicalOperator = logicalOperator;
        this.keywordCriteria = keywordCriteria;
        this.autoID = autoID;
        this.applyNumber = applyNumber;
        this.bANKL = bANKL;
        this.bANKS = bANKS;
        this.bANKA = bANKA;
        this.pROVZ = pROVZ;
        this.sTRAS = sTRAS;
        this.oRT01 = oRT01;
        this.bRNCH = bRNCH;
        this.aPCOD = aPCOD;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.applyDate = applyDate;
        this.applyTime = applyTime;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.dATAC = dATAC;
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
        this.serviceRelationshipsTupleDGUID = serviceRelationshipsTupleDGUID;
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
        this.operation = operation;
        this.hBKID = hBKID;
    }


    /**
     * Gets the namedSearchCriteria value for this BanksCriteria.
     * 
     * @return namedSearchCriteria
     */
    public java.lang.String[] getNamedSearchCriteria() {
        return namedSearchCriteria;
    }


    /**
     * Sets the namedSearchCriteria value for this BanksCriteria.
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
     * Gets the maskCriteria value for this BanksCriteria.
     * 
     * @return maskCriteria
     */
    public java.lang.String[] getMaskCriteria() {
        return maskCriteria;
    }


    /**
     * Sets the maskCriteria value for this BanksCriteria.
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
     * Gets the logicalOperator value for this BanksCriteria.
     * 
     * @return logicalOperator
     */
    public java.lang.String getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this BanksCriteria.
     * 
     * @param logicalOperator
     */
    public void setLogicalOperator(java.lang.String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the keywordCriteria value for this BanksCriteria.
     * 
     * @return keywordCriteria
     */
    public beans.ws.mdm.sap.com.KeywordConstraint getKeywordCriteria() {
        return keywordCriteria;
    }


    /**
     * Sets the keywordCriteria value for this BanksCriteria.
     * 
     * @param keywordCriteria
     */
    public void setKeywordCriteria(beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria) {
        this.keywordCriteria = keywordCriteria;
    }


    /**
     * Gets the autoID value for this BanksCriteria.
     * 
     * @return autoID
     */
    public beans.ws.mdm.sap.com.NumericCriteria getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this BanksCriteria.
     * 
     * @param autoID
     */
    public void setAutoID(beans.ws.mdm.sap.com.NumericCriteria autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the applyNumber value for this BanksCriteria.
     * 
     * @return applyNumber
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this BanksCriteria.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(beans.ws.mdm.sap.com.TextCriteria applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the bANKL value for this BanksCriteria.
     * 
     * @return bANKL
     */
    public beans.ws.mdm.sap.com.TextCriteria getBANKL() {
        return bANKL;
    }


    /**
     * Sets the bANKL value for this BanksCriteria.
     * 
     * @param bANKL
     */
    public void setBANKL(beans.ws.mdm.sap.com.TextCriteria bANKL) {
        this.bANKL = bANKL;
    }


    /**
     * Gets the bANKS value for this BanksCriteria.
     * 
     * @return bANKS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getBANKS() {
        return bANKS;
    }


    /**
     * Sets the bANKS value for this BanksCriteria.
     * 
     * @param bANKS
     */
    public void setBANKS(beans.ws.mdm.sap.com.PicklistCriteria bANKS) {
        this.bANKS = bANKS;
    }


    /**
     * Gets the bANKA value for this BanksCriteria.
     * 
     * @return bANKA
     */
    public beans.ws.mdm.sap.com.TextCriteria getBANKA() {
        return bANKA;
    }


    /**
     * Sets the bANKA value for this BanksCriteria.
     * 
     * @param bANKA
     */
    public void setBANKA(beans.ws.mdm.sap.com.TextCriteria bANKA) {
        this.bANKA = bANKA;
    }


    /**
     * Gets the pROVZ value for this BanksCriteria.
     * 
     * @return pROVZ
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getPROVZ() {
        return pROVZ;
    }


    /**
     * Sets the pROVZ value for this BanksCriteria.
     * 
     * @param pROVZ
     */
    public void setPROVZ(beans.ws.mdm.sap.com.PicklistCriteria pROVZ) {
        this.pROVZ = pROVZ;
    }


    /**
     * Gets the sTRAS value for this BanksCriteria.
     * 
     * @return sTRAS
     */
    public beans.ws.mdm.sap.com.TextCriteria getSTRAS() {
        return sTRAS;
    }


    /**
     * Sets the sTRAS value for this BanksCriteria.
     * 
     * @param sTRAS
     */
    public void setSTRAS(beans.ws.mdm.sap.com.TextCriteria sTRAS) {
        this.sTRAS = sTRAS;
    }


    /**
     * Gets the oRT01 value for this BanksCriteria.
     * 
     * @return oRT01
     */
    public beans.ws.mdm.sap.com.TextCriteria getORT01() {
        return oRT01;
    }


    /**
     * Sets the oRT01 value for this BanksCriteria.
     * 
     * @param oRT01
     */
    public void setORT01(beans.ws.mdm.sap.com.TextCriteria oRT01) {
        this.oRT01 = oRT01;
    }


    /**
     * Gets the bRNCH value for this BanksCriteria.
     * 
     * @return bRNCH
     */
    public beans.ws.mdm.sap.com.TextCriteria getBRNCH() {
        return bRNCH;
    }


    /**
     * Sets the bRNCH value for this BanksCriteria.
     * 
     * @param bRNCH
     */
    public void setBRNCH(beans.ws.mdm.sap.com.TextCriteria bRNCH) {
        this.bRNCH = bRNCH;
    }


    /**
     * Gets the aPCOD value for this BanksCriteria.
     * 
     * @return aPCOD
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this BanksCriteria.
     * 
     * @param aPCOD
     */
    public void setAPCOD(beans.ws.mdm.sap.com.PicklistCriteria aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the aPMEM value for this BanksCriteria.
     * 
     * @return aPMEM
     */
    public beans.ws.mdm.sap.com.TextCriteria getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this BanksCriteria.
     * 
     * @param aPMEM
     */
    public void setAPMEM(beans.ws.mdm.sap.com.TextCriteria aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this BanksCriteria.
     * 
     * @return applicant
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this BanksCriteria.
     * 
     * @param applicant
     */
    public void setApplicant(beans.ws.mdm.sap.com.TextCriteria applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the applyDate value for this BanksCriteria.
     * 
     * @return applyDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this BanksCriteria.
     * 
     * @param applyDate
     */
    public void setApplyDate(beans.ws.mdm.sap.com.DateTimeCriteria applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this BanksCriteria.
     * 
     * @return applyTime
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this BanksCriteria.
     * 
     * @param applyTime
     */
    public void setApplyTime(beans.ws.mdm.sap.com.DateTimeCriteria applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the createBy value for this BanksCriteria.
     * 
     * @return createBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getCreateBy() {
        return createBy;
    }


    /**
     * Sets the createBy value for this BanksCriteria.
     * 
     * @param createBy
     */
    public void setCreateBy(beans.ws.mdm.sap.com.TextCriteria createBy) {
        this.createBy = createBy;
    }


    /**
     * Gets the createDate value for this BanksCriteria.
     * 
     * @return createDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this BanksCriteria.
     * 
     * @param createDate
     */
    public void setCreateDate(beans.ws.mdm.sap.com.DateTimeCriteria createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the updateBy value for this BanksCriteria.
     * 
     * @return updateBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this BanksCriteria.
     * 
     * @param updateBy
     */
    public void setUpdateBy(beans.ws.mdm.sap.com.TextCriteria updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the updateDate value for this BanksCriteria.
     * 
     * @return updateDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this BanksCriteria.
     * 
     * @param updateDate
     */
    public void setUpdateDate(beans.ws.mdm.sap.com.DateTimeCriteria updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the dATAC value for this BanksCriteria.
     * 
     * @return dATAC
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this BanksCriteria.
     * 
     * @param dATAC
     */
    public void setDATAC(beans.ws.mdm.sap.com.BooleanCriteria dATAC) {
        this.dATAC = dATAC;
    }


    /**
     * Gets the serviceRelationshipsTupleCLIENT_SYSTEM value for this BanksCriteria.
     * 
     * @return serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleCLIENT_SYSTEM() {
        return serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Sets the serviceRelationshipsTupleCLIENT_SYSTEM value for this BanksCriteria.
     * 
     * @param serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public void setServiceRelationshipsTupleCLIENT_SYSTEM(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM) {
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Gets the serviceRelationshipsTupleDISTUS value for this BanksCriteria.
     * 
     * @return serviceRelationshipsTupleDISTUS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleDISTUS() {
        return serviceRelationshipsTupleDISTUS;
    }


    /**
     * Sets the serviceRelationshipsTupleDISTUS value for this BanksCriteria.
     * 
     * @param serviceRelationshipsTupleDISTUS
     */
    public void setServiceRelationshipsTupleDISTUS(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS) {
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
    }


    /**
     * Gets the serviceRelationshipsTupleDGUID value for this BanksCriteria.
     * 
     * @return serviceRelationshipsTupleDGUID
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleDGUID() {
        return serviceRelationshipsTupleDGUID;
    }


    /**
     * Sets the serviceRelationshipsTupleDGUID value for this BanksCriteria.
     * 
     * @param serviceRelationshipsTupleDGUID
     */
    public void setServiceRelationshipsTupleDGUID(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID) {
        this.serviceRelationshipsTupleDGUID = serviceRelationshipsTupleDGUID;
    }


    /**
     * Gets the serviceRelationshipsTupleRETURN value for this BanksCriteria.
     * 
     * @return serviceRelationshipsTupleRETURN
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleRETURN() {
        return serviceRelationshipsTupleRETURN;
    }


    /**
     * Sets the serviceRelationshipsTupleRETURN value for this BanksCriteria.
     * 
     * @param serviceRelationshipsTupleRETURN
     */
    public void setServiceRelationshipsTupleRETURN(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN) {
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
    }


    /**
     * Gets the operation value for this BanksCriteria.
     * 
     * @return operation
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this BanksCriteria.
     * 
     * @param operation
     */
    public void setOperation(beans.ws.mdm.sap.com.PicklistCriteria operation) {
        this.operation = operation;
    }


    /**
     * Gets the hBKID value for this BanksCriteria.
     * 
     * @return hBKID
     */
    public beans.ws.mdm.sap.com.TextCriteria getHBKID() {
        return hBKID;
    }


    /**
     * Sets the hBKID value for this BanksCriteria.
     * 
     * @param hBKID
     */
    public void setHBKID(beans.ws.mdm.sap.com.TextCriteria hBKID) {
        this.hBKID = hBKID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BanksCriteria)) return false;
        BanksCriteria other = (BanksCriteria) obj;
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
            ((this.bANKL==null && other.getBANKL()==null) || 
             (this.bANKL!=null &&
              this.bANKL.equals(other.getBANKL()))) &&
            ((this.bANKS==null && other.getBANKS()==null) || 
             (this.bANKS!=null &&
              this.bANKS.equals(other.getBANKS()))) &&
            ((this.bANKA==null && other.getBANKA()==null) || 
             (this.bANKA!=null &&
              this.bANKA.equals(other.getBANKA()))) &&
            ((this.pROVZ==null && other.getPROVZ()==null) || 
             (this.pROVZ!=null &&
              this.pROVZ.equals(other.getPROVZ()))) &&
            ((this.sTRAS==null && other.getSTRAS()==null) || 
             (this.sTRAS!=null &&
              this.sTRAS.equals(other.getSTRAS()))) &&
            ((this.oRT01==null && other.getORT01()==null) || 
             (this.oRT01!=null &&
              this.oRT01.equals(other.getORT01()))) &&
            ((this.bRNCH==null && other.getBRNCH()==null) || 
             (this.bRNCH!=null &&
              this.bRNCH.equals(other.getBRNCH()))) &&
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
            ((this.serviceRelationshipsTupleDGUID==null && other.getServiceRelationshipsTupleDGUID()==null) || 
             (this.serviceRelationshipsTupleDGUID!=null &&
              this.serviceRelationshipsTupleDGUID.equals(other.getServiceRelationshipsTupleDGUID()))) &&
            ((this.serviceRelationshipsTupleRETURN==null && other.getServiceRelationshipsTupleRETURN()==null) || 
             (this.serviceRelationshipsTupleRETURN!=null &&
              this.serviceRelationshipsTupleRETURN.equals(other.getServiceRelationshipsTupleRETURN()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.hBKID==null && other.getHBKID()==null) || 
             (this.hBKID!=null &&
              this.hBKID.equals(other.getHBKID())));
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
        if (getBANKL() != null) {
            _hashCode += getBANKL().hashCode();
        }
        if (getBANKS() != null) {
            _hashCode += getBANKS().hashCode();
        }
        if (getBANKA() != null) {
            _hashCode += getBANKA().hashCode();
        }
        if (getPROVZ() != null) {
            _hashCode += getPROVZ().hashCode();
        }
        if (getSTRAS() != null) {
            _hashCode += getSTRAS().hashCode();
        }
        if (getORT01() != null) {
            _hashCode += getORT01().hashCode();
        }
        if (getBRNCH() != null) {
            _hashCode += getBRNCH().hashCode();
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
        if (getServiceRelationshipsTupleDGUID() != null) {
            _hashCode += getServiceRelationshipsTupleDGUID().hashCode();
        }
        if (getServiceRelationshipsTupleRETURN() != null) {
            _hashCode += getServiceRelationshipsTupleRETURN().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getHBKID() != null) {
            _hashCode += getHBKID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BanksCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksCriteria"));
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
        elemField.setFieldName("BANKL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bANKL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bANKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bANKA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROVZ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "pROVZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STRAS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTRAS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
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
        elemField.setFieldName("BRNCH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bRNCH"));
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
        elemField.setFieldName("DATAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "dATAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
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
        elemField.setFieldName("HBKID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "hBKID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
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
