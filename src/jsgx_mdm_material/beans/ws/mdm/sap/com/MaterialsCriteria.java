/**
 * MaterialsCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_material.beans.ws.mdm.sap.com;

public class MaterialsCriteria  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String[] namedSearchCriteria;

    private java.lang.String[] maskCriteria;

    private java.lang.String logicalOperator;

    private beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria;

    private beans.ws.mdm.sap.com.NumericCriteria autoID;

    private beans.ws.mdm.sap.com.TextCriteria applyNumber;

    private beans.ws.mdm.sap.com.PicklistCriteria mATKL;

    private beans.ws.mdm.sap.com.TextCriteria mATNR;

    private beans.ws.mdm.sap.com.PicklistCriteria mEINS;

    private beans.ws.mdm.sap.com.TextCriteria mAKTX;

    private beans.ws.mdm.sap.com.TextCriteria _char;

    private beans.ws.mdm.sap.com.TextCriteria char1;

    private beans.ws.mdm.sap.com.TextCriteria char2;

    private beans.ws.mdm.sap.com.TextCriteria char3;

    private beans.ws.mdm.sap.com.TextCriteria char4;

    private beans.ws.mdm.sap.com.TextCriteria char5;

    private beans.ws.mdm.sap.com.TextCriteria char6;

    private beans.ws.mdm.sap.com.TextCriteria char7;

    private beans.ws.mdm.sap.com.TextCriteria char8;

    private beans.ws.mdm.sap.com.TextCriteria char9;

    private beans.ws.mdm.sap.com.TextCriteria char10;

    private beans.ws.mdm.sap.com.TextCriteria char11;

    private beans.ws.mdm.sap.com.PicklistCriteria mBRSH;

    private beans.ws.mdm.sap.com.PicklistCriteria mTART;

    private beans.ws.mdm.sap.com.PicklistCriteria sPART;

    private beans.ws.mdm.sap.com.BooleanCriteria lVOMA;

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

    private beans.ws.mdm.sap.com.PicklistCriteria mTPOS;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN;

    private beans.ws.mdm.sap.com.PicklistCriteria operation;

    public MaterialsCriteria() {
    }

    public MaterialsCriteria(
           java.lang.String[] namedSearchCriteria,
           java.lang.String[] maskCriteria,
           java.lang.String logicalOperator,
           beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria,
           beans.ws.mdm.sap.com.NumericCriteria autoID,
           beans.ws.mdm.sap.com.TextCriteria applyNumber,
           beans.ws.mdm.sap.com.PicklistCriteria mATKL,
           beans.ws.mdm.sap.com.TextCriteria mATNR,
           beans.ws.mdm.sap.com.PicklistCriteria mEINS,
           beans.ws.mdm.sap.com.TextCriteria mAKTX,
           beans.ws.mdm.sap.com.TextCriteria _char,
           beans.ws.mdm.sap.com.TextCriteria char1,
           beans.ws.mdm.sap.com.TextCriteria char2,
           beans.ws.mdm.sap.com.TextCriteria char3,
           beans.ws.mdm.sap.com.TextCriteria char4,
           beans.ws.mdm.sap.com.TextCriteria char5,
           beans.ws.mdm.sap.com.TextCriteria char6,
           beans.ws.mdm.sap.com.TextCriteria char7,
           beans.ws.mdm.sap.com.TextCriteria char8,
           beans.ws.mdm.sap.com.TextCriteria char9,
           beans.ws.mdm.sap.com.TextCriteria char10,
           beans.ws.mdm.sap.com.TextCriteria char11,
           beans.ws.mdm.sap.com.PicklistCriteria mBRSH,
           beans.ws.mdm.sap.com.PicklistCriteria mTART,
           beans.ws.mdm.sap.com.PicklistCriteria sPART,
           beans.ws.mdm.sap.com.BooleanCriteria lVOMA,
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
           beans.ws.mdm.sap.com.PicklistCriteria mTPOS,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN,
           beans.ws.mdm.sap.com.PicklistCriteria operation) {
        this.namedSearchCriteria = namedSearchCriteria;
        this.maskCriteria = maskCriteria;
        this.logicalOperator = logicalOperator;
        this.keywordCriteria = keywordCriteria;
        this.autoID = autoID;
        this.applyNumber = applyNumber;
        this.mATKL = mATKL;
        this.mATNR = mATNR;
        this.mEINS = mEINS;
        this.mAKTX = mAKTX;
        this._char = _char;
        this.char1 = char1;
        this.char2 = char2;
        this.char3 = char3;
        this.char4 = char4;
        this.char5 = char5;
        this.char6 = char6;
        this.char7 = char7;
        this.char8 = char8;
        this.char9 = char9;
        this.char10 = char10;
        this.char11 = char11;
        this.mBRSH = mBRSH;
        this.mTART = mTART;
        this.sPART = sPART;
        this.lVOMA = lVOMA;
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
        this.mTPOS = mTPOS;
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
        this.serviceRelationshipsTupleDGUID = serviceRelationshipsTupleDGUID;
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
        this.operation = operation;
    }


    /**
     * Gets the namedSearchCriteria value for this MaterialsCriteria.
     * 
     * @return namedSearchCriteria
     */
    public java.lang.String[] getNamedSearchCriteria() {
        return namedSearchCriteria;
    }


    /**
     * Sets the namedSearchCriteria value for this MaterialsCriteria.
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
     * Gets the maskCriteria value for this MaterialsCriteria.
     * 
     * @return maskCriteria
     */
    public java.lang.String[] getMaskCriteria() {
        return maskCriteria;
    }


    /**
     * Sets the maskCriteria value for this MaterialsCriteria.
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
     * Gets the logicalOperator value for this MaterialsCriteria.
     * 
     * @return logicalOperator
     */
    public java.lang.String getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this MaterialsCriteria.
     * 
     * @param logicalOperator
     */
    public void setLogicalOperator(java.lang.String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the keywordCriteria value for this MaterialsCriteria.
     * 
     * @return keywordCriteria
     */
    public beans.ws.mdm.sap.com.KeywordConstraint getKeywordCriteria() {
        return keywordCriteria;
    }


    /**
     * Sets the keywordCriteria value for this MaterialsCriteria.
     * 
     * @param keywordCriteria
     */
    public void setKeywordCriteria(beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria) {
        this.keywordCriteria = keywordCriteria;
    }


    /**
     * Gets the autoID value for this MaterialsCriteria.
     * 
     * @return autoID
     */
    public beans.ws.mdm.sap.com.NumericCriteria getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this MaterialsCriteria.
     * 
     * @param autoID
     */
    public void setAutoID(beans.ws.mdm.sap.com.NumericCriteria autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the applyNumber value for this MaterialsCriteria.
     * 
     * @return applyNumber
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this MaterialsCriteria.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(beans.ws.mdm.sap.com.TextCriteria applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the mATKL value for this MaterialsCriteria.
     * 
     * @return mATKL
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getMATKL() {
        return mATKL;
    }


    /**
     * Sets the mATKL value for this MaterialsCriteria.
     * 
     * @param mATKL
     */
    public void setMATKL(beans.ws.mdm.sap.com.PicklistCriteria mATKL) {
        this.mATKL = mATKL;
    }


    /**
     * Gets the mATNR value for this MaterialsCriteria.
     * 
     * @return mATNR
     */
    public beans.ws.mdm.sap.com.TextCriteria getMATNR() {
        return mATNR;
    }


    /**
     * Sets the mATNR value for this MaterialsCriteria.
     * 
     * @param mATNR
     */
    public void setMATNR(beans.ws.mdm.sap.com.TextCriteria mATNR) {
        this.mATNR = mATNR;
    }


    /**
     * Gets the mEINS value for this MaterialsCriteria.
     * 
     * @return mEINS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getMEINS() {
        return mEINS;
    }


    /**
     * Sets the mEINS value for this MaterialsCriteria.
     * 
     * @param mEINS
     */
    public void setMEINS(beans.ws.mdm.sap.com.PicklistCriteria mEINS) {
        this.mEINS = mEINS;
    }


    /**
     * Gets the mAKTX value for this MaterialsCriteria.
     * 
     * @return mAKTX
     */
    public beans.ws.mdm.sap.com.TextCriteria getMAKTX() {
        return mAKTX;
    }


    /**
     * Sets the mAKTX value for this MaterialsCriteria.
     * 
     * @param mAKTX
     */
    public void setMAKTX(beans.ws.mdm.sap.com.TextCriteria mAKTX) {
        this.mAKTX = mAKTX;
    }


    /**
     * Gets the _char value for this MaterialsCriteria.
     * 
     * @return _char
     */
    public beans.ws.mdm.sap.com.TextCriteria get_char() {
        return _char;
    }


    /**
     * Sets the _char value for this MaterialsCriteria.
     * 
     * @param _char
     */
    public void set_char(beans.ws.mdm.sap.com.TextCriteria _char) {
        this._char = _char;
    }


    /**
     * Gets the char1 value for this MaterialsCriteria.
     * 
     * @return char1
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar1() {
        return char1;
    }


    /**
     * Sets the char1 value for this MaterialsCriteria.
     * 
     * @param char1
     */
    public void setChar1(beans.ws.mdm.sap.com.TextCriteria char1) {
        this.char1 = char1;
    }


    /**
     * Gets the char2 value for this MaterialsCriteria.
     * 
     * @return char2
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar2() {
        return char2;
    }


    /**
     * Sets the char2 value for this MaterialsCriteria.
     * 
     * @param char2
     */
    public void setChar2(beans.ws.mdm.sap.com.TextCriteria char2) {
        this.char2 = char2;
    }


    /**
     * Gets the char3 value for this MaterialsCriteria.
     * 
     * @return char3
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar3() {
        return char3;
    }


    /**
     * Sets the char3 value for this MaterialsCriteria.
     * 
     * @param char3
     */
    public void setChar3(beans.ws.mdm.sap.com.TextCriteria char3) {
        this.char3 = char3;
    }


    /**
     * Gets the char4 value for this MaterialsCriteria.
     * 
     * @return char4
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar4() {
        return char4;
    }


    /**
     * Sets the char4 value for this MaterialsCriteria.
     * 
     * @param char4
     */
    public void setChar4(beans.ws.mdm.sap.com.TextCriteria char4) {
        this.char4 = char4;
    }


    /**
     * Gets the char5 value for this MaterialsCriteria.
     * 
     * @return char5
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar5() {
        return char5;
    }


    /**
     * Sets the char5 value for this MaterialsCriteria.
     * 
     * @param char5
     */
    public void setChar5(beans.ws.mdm.sap.com.TextCriteria char5) {
        this.char5 = char5;
    }


    /**
     * Gets the char6 value for this MaterialsCriteria.
     * 
     * @return char6
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar6() {
        return char6;
    }


    /**
     * Sets the char6 value for this MaterialsCriteria.
     * 
     * @param char6
     */
    public void setChar6(beans.ws.mdm.sap.com.TextCriteria char6) {
        this.char6 = char6;
    }


    /**
     * Gets the char7 value for this MaterialsCriteria.
     * 
     * @return char7
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar7() {
        return char7;
    }


    /**
     * Sets the char7 value for this MaterialsCriteria.
     * 
     * @param char7
     */
    public void setChar7(beans.ws.mdm.sap.com.TextCriteria char7) {
        this.char7 = char7;
    }


    /**
     * Gets the char8 value for this MaterialsCriteria.
     * 
     * @return char8
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar8() {
        return char8;
    }


    /**
     * Sets the char8 value for this MaterialsCriteria.
     * 
     * @param char8
     */
    public void setChar8(beans.ws.mdm.sap.com.TextCriteria char8) {
        this.char8 = char8;
    }


    /**
     * Gets the char9 value for this MaterialsCriteria.
     * 
     * @return char9
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar9() {
        return char9;
    }


    /**
     * Sets the char9 value for this MaterialsCriteria.
     * 
     * @param char9
     */
    public void setChar9(beans.ws.mdm.sap.com.TextCriteria char9) {
        this.char9 = char9;
    }


    /**
     * Gets the char10 value for this MaterialsCriteria.
     * 
     * @return char10
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar10() {
        return char10;
    }


    /**
     * Sets the char10 value for this MaterialsCriteria.
     * 
     * @param char10
     */
    public void setChar10(beans.ws.mdm.sap.com.TextCriteria char10) {
        this.char10 = char10;
    }


    /**
     * Gets the char11 value for this MaterialsCriteria.
     * 
     * @return char11
     */
    public beans.ws.mdm.sap.com.TextCriteria getChar11() {
        return char11;
    }


    /**
     * Sets the char11 value for this MaterialsCriteria.
     * 
     * @param char11
     */
    public void setChar11(beans.ws.mdm.sap.com.TextCriteria char11) {
        this.char11 = char11;
    }


    /**
     * Gets the mBRSH value for this MaterialsCriteria.
     * 
     * @return mBRSH
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getMBRSH() {
        return mBRSH;
    }


    /**
     * Sets the mBRSH value for this MaterialsCriteria.
     * 
     * @param mBRSH
     */
    public void setMBRSH(beans.ws.mdm.sap.com.PicklistCriteria mBRSH) {
        this.mBRSH = mBRSH;
    }


    /**
     * Gets the mTART value for this MaterialsCriteria.
     * 
     * @return mTART
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getMTART() {
        return mTART;
    }


    /**
     * Sets the mTART value for this MaterialsCriteria.
     * 
     * @param mTART
     */
    public void setMTART(beans.ws.mdm.sap.com.PicklistCriteria mTART) {
        this.mTART = mTART;
    }


    /**
     * Gets the sPART value for this MaterialsCriteria.
     * 
     * @return sPART
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getSPART() {
        return sPART;
    }


    /**
     * Sets the sPART value for this MaterialsCriteria.
     * 
     * @param sPART
     */
    public void setSPART(beans.ws.mdm.sap.com.PicklistCriteria sPART) {
        this.sPART = sPART;
    }


    /**
     * Gets the lVOMA value for this MaterialsCriteria.
     * 
     * @return lVOMA
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getLVOMA() {
        return lVOMA;
    }


    /**
     * Sets the lVOMA value for this MaterialsCriteria.
     * 
     * @param lVOMA
     */
    public void setLVOMA(beans.ws.mdm.sap.com.BooleanCriteria lVOMA) {
        this.lVOMA = lVOMA;
    }


    /**
     * Gets the aPCOD value for this MaterialsCriteria.
     * 
     * @return aPCOD
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this MaterialsCriteria.
     * 
     * @param aPCOD
     */
    public void setAPCOD(beans.ws.mdm.sap.com.PicklistCriteria aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the aPMEM value for this MaterialsCriteria.
     * 
     * @return aPMEM
     */
    public beans.ws.mdm.sap.com.TextCriteria getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this MaterialsCriteria.
     * 
     * @param aPMEM
     */
    public void setAPMEM(beans.ws.mdm.sap.com.TextCriteria aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this MaterialsCriteria.
     * 
     * @return applicant
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this MaterialsCriteria.
     * 
     * @param applicant
     */
    public void setApplicant(beans.ws.mdm.sap.com.TextCriteria applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the applyDate value for this MaterialsCriteria.
     * 
     * @return applyDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this MaterialsCriteria.
     * 
     * @param applyDate
     */
    public void setApplyDate(beans.ws.mdm.sap.com.DateTimeCriteria applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this MaterialsCriteria.
     * 
     * @return applyTime
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this MaterialsCriteria.
     * 
     * @param applyTime
     */
    public void setApplyTime(beans.ws.mdm.sap.com.DateTimeCriteria applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the createBy value for this MaterialsCriteria.
     * 
     * @return createBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getCreateBy() {
        return createBy;
    }


    /**
     * Sets the createBy value for this MaterialsCriteria.
     * 
     * @param createBy
     */
    public void setCreateBy(beans.ws.mdm.sap.com.TextCriteria createBy) {
        this.createBy = createBy;
    }


    /**
     * Gets the createDate value for this MaterialsCriteria.
     * 
     * @return createDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this MaterialsCriteria.
     * 
     * @param createDate
     */
    public void setCreateDate(beans.ws.mdm.sap.com.DateTimeCriteria createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the updateBy value for this MaterialsCriteria.
     * 
     * @return updateBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this MaterialsCriteria.
     * 
     * @param updateBy
     */
    public void setUpdateBy(beans.ws.mdm.sap.com.TextCriteria updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the updateDate value for this MaterialsCriteria.
     * 
     * @return updateDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this MaterialsCriteria.
     * 
     * @param updateDate
     */
    public void setUpdateDate(beans.ws.mdm.sap.com.DateTimeCriteria updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the dATAC value for this MaterialsCriteria.
     * 
     * @return dATAC
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this MaterialsCriteria.
     * 
     * @param dATAC
     */
    public void setDATAC(beans.ws.mdm.sap.com.BooleanCriteria dATAC) {
        this.dATAC = dATAC;
    }


    /**
     * Gets the mTPOS value for this MaterialsCriteria.
     * 
     * @return mTPOS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getMTPOS() {
        return mTPOS;
    }


    /**
     * Sets the mTPOS value for this MaterialsCriteria.
     * 
     * @param mTPOS
     */
    public void setMTPOS(beans.ws.mdm.sap.com.PicklistCriteria mTPOS) {
        this.mTPOS = mTPOS;
    }


    /**
     * Gets the serviceRelationshipsTupleCLIENT_SYSTEM value for this MaterialsCriteria.
     * 
     * @return serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleCLIENT_SYSTEM() {
        return serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Sets the serviceRelationshipsTupleCLIENT_SYSTEM value for this MaterialsCriteria.
     * 
     * @param serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public void setServiceRelationshipsTupleCLIENT_SYSTEM(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM) {
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Gets the serviceRelationshipsTupleDISTUS value for this MaterialsCriteria.
     * 
     * @return serviceRelationshipsTupleDISTUS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleDISTUS() {
        return serviceRelationshipsTupleDISTUS;
    }


    /**
     * Sets the serviceRelationshipsTupleDISTUS value for this MaterialsCriteria.
     * 
     * @param serviceRelationshipsTupleDISTUS
     */
    public void setServiceRelationshipsTupleDISTUS(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS) {
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
    }


    /**
     * Gets the serviceRelationshipsTupleDGUID value for this MaterialsCriteria.
     * 
     * @return serviceRelationshipsTupleDGUID
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleDGUID() {
        return serviceRelationshipsTupleDGUID;
    }


    /**
     * Sets the serviceRelationshipsTupleDGUID value for this MaterialsCriteria.
     * 
     * @param serviceRelationshipsTupleDGUID
     */
    public void setServiceRelationshipsTupleDGUID(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID) {
        this.serviceRelationshipsTupleDGUID = serviceRelationshipsTupleDGUID;
    }


    /**
     * Gets the serviceRelationshipsTupleRETURN value for this MaterialsCriteria.
     * 
     * @return serviceRelationshipsTupleRETURN
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleRETURN() {
        return serviceRelationshipsTupleRETURN;
    }


    /**
     * Sets the serviceRelationshipsTupleRETURN value for this MaterialsCriteria.
     * 
     * @param serviceRelationshipsTupleRETURN
     */
    public void setServiceRelationshipsTupleRETURN(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN) {
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
    }


    /**
     * Gets the operation value for this MaterialsCriteria.
     * 
     * @return operation
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this MaterialsCriteria.
     * 
     * @param operation
     */
    public void setOperation(beans.ws.mdm.sap.com.PicklistCriteria operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaterialsCriteria)) return false;
        MaterialsCriteria other = (MaterialsCriteria) obj;
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
            ((this.mATKL==null && other.getMATKL()==null) || 
             (this.mATKL!=null &&
              this.mATKL.equals(other.getMATKL()))) &&
            ((this.mATNR==null && other.getMATNR()==null) || 
             (this.mATNR!=null &&
              this.mATNR.equals(other.getMATNR()))) &&
            ((this.mEINS==null && other.getMEINS()==null) || 
             (this.mEINS!=null &&
              this.mEINS.equals(other.getMEINS()))) &&
            ((this.mAKTX==null && other.getMAKTX()==null) || 
             (this.mAKTX!=null &&
              this.mAKTX.equals(other.getMAKTX()))) &&
            ((this._char==null && other.get_char()==null) || 
             (this._char!=null &&
              this._char.equals(other.get_char()))) &&
            ((this.char1==null && other.getChar1()==null) || 
             (this.char1!=null &&
              this.char1.equals(other.getChar1()))) &&
            ((this.char2==null && other.getChar2()==null) || 
             (this.char2!=null &&
              this.char2.equals(other.getChar2()))) &&
            ((this.char3==null && other.getChar3()==null) || 
             (this.char3!=null &&
              this.char3.equals(other.getChar3()))) &&
            ((this.char4==null && other.getChar4()==null) || 
             (this.char4!=null &&
              this.char4.equals(other.getChar4()))) &&
            ((this.char5==null && other.getChar5()==null) || 
             (this.char5!=null &&
              this.char5.equals(other.getChar5()))) &&
            ((this.char6==null && other.getChar6()==null) || 
             (this.char6!=null &&
              this.char6.equals(other.getChar6()))) &&
            ((this.char7==null && other.getChar7()==null) || 
             (this.char7!=null &&
              this.char7.equals(other.getChar7()))) &&
            ((this.char8==null && other.getChar8()==null) || 
             (this.char8!=null &&
              this.char8.equals(other.getChar8()))) &&
            ((this.char9==null && other.getChar9()==null) || 
             (this.char9!=null &&
              this.char9.equals(other.getChar9()))) &&
            ((this.char10==null && other.getChar10()==null) || 
             (this.char10!=null &&
              this.char10.equals(other.getChar10()))) &&
            ((this.char11==null && other.getChar11()==null) || 
             (this.char11!=null &&
              this.char11.equals(other.getChar11()))) &&
            ((this.mBRSH==null && other.getMBRSH()==null) || 
             (this.mBRSH!=null &&
              this.mBRSH.equals(other.getMBRSH()))) &&
            ((this.mTART==null && other.getMTART()==null) || 
             (this.mTART!=null &&
              this.mTART.equals(other.getMTART()))) &&
            ((this.sPART==null && other.getSPART()==null) || 
             (this.sPART!=null &&
              this.sPART.equals(other.getSPART()))) &&
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
            ((this.mTPOS==null && other.getMTPOS()==null) || 
             (this.mTPOS!=null &&
              this.mTPOS.equals(other.getMTPOS()))) &&
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
        if (getMATKL() != null) {
            _hashCode += getMATKL().hashCode();
        }
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        if (getMAKTX() != null) {
            _hashCode += getMAKTX().hashCode();
        }
        if (get_char() != null) {
            _hashCode += get_char().hashCode();
        }
        if (getChar1() != null) {
            _hashCode += getChar1().hashCode();
        }
        if (getChar2() != null) {
            _hashCode += getChar2().hashCode();
        }
        if (getChar3() != null) {
            _hashCode += getChar3().hashCode();
        }
        if (getChar4() != null) {
            _hashCode += getChar4().hashCode();
        }
        if (getChar5() != null) {
            _hashCode += getChar5().hashCode();
        }
        if (getChar6() != null) {
            _hashCode += getChar6().hashCode();
        }
        if (getChar7() != null) {
            _hashCode += getChar7().hashCode();
        }
        if (getChar8() != null) {
            _hashCode += getChar8().hashCode();
        }
        if (getChar9() != null) {
            _hashCode += getChar9().hashCode();
        }
        if (getChar10() != null) {
            _hashCode += getChar10().hashCode();
        }
        if (getChar11() != null) {
            _hashCode += getChar11().hashCode();
        }
        if (getMBRSH() != null) {
            _hashCode += getMBRSH().hashCode();
        }
        if (getMTART() != null) {
            _hashCode += getMTART().hashCode();
        }
        if (getSPART() != null) {
            _hashCode += getSPART().hashCode();
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
        if (getMTPOS() != null) {
            _hashCode += getMTPOS().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaterialsCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "namedSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "maskCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "logicalOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "keywordCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeywordConstraint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "autoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "NumericCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATKL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mATKL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEINS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mEINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAKTX");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mAKTX"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_char");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char4"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char5"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char6");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char6"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char7");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char7"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char8"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char9");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char9"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char10");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char10"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char11");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char11"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MBRSH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mBRSH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTART");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mTART"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPART");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "sPART"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LVOMA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "lVOMA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "aPCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APMEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "aPMEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "applyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "applyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "createBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "updateBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "dATAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mTPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleCLIENT_SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "serviceRelationshipsTupleCLIENT_SYSTEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleDISTUS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "serviceRelationshipsTupleDISTUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleDGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "serviceRelationshipsTupleDGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleRETURN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "serviceRelationshipsTupleRETURN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "operation"));
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
