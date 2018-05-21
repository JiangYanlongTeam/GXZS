/**
 * EmployeeCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EmployeeCriteria  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String[] namedSearchCriteria;

    private java.lang.String[] maskCriteria;

    private java.lang.String logicalOperator;

    private beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria;

    private beans.ws.mdm.sap.com.NumericCriteria autoID;

    private beans.ws.mdm.sap.com.TextCriteria applyNumber;

    private beans.ws.mdm.sap.com.TextCriteria pERNR;

    private beans.ws.mdm.sap.com.PicklistCriteria mASSN;

    private beans.ws.mdm.sap.com.PicklistCriteria mASSG;

    private beans.ws.mdm.sap.com.DateTimeCriteria eINDA;

    private beans.ws.mdm.sap.com.TextCriteria nACHN;

    private beans.ws.mdm.sap.com.PicklistCriteria gESCH;

    private beans.ws.mdm.sap.com.DateTimeCriteria gBDAT;

    private beans.ws.mdm.sap.com.PicklistCriteria nATIO;

    private beans.ws.mdm.sap.com.PicklistCriteria fAMST;

    private beans.ws.mdm.sap.com.PicklistCriteria workType;

    private beans.ws.mdm.sap.com.PicklistCriteria pERSG;

    private beans.ws.mdm.sap.com.PicklistCriteria pERSK;

    private beans.ws.mdm.sap.com.PicklistCriteria wERKS;

    private beans.ws.mdm.sap.com.PicklistCriteria bTRTL;

    private beans.ws.mdm.sap.com.PicklistCriteria aBKRS;

    private beans.ws.mdm.sap.com.TextCriteria pLANS;

    private beans.ws.mdm.sap.com.TextCriteria pLANS_NAME;

    private beans.ws.mdm.sap.com.PicklistCriteria iCTYP;

    private beans.ws.mdm.sap.com.TextCriteria iCNUM;

    private beans.ws.mdm.sap.com.TextCriteria zTYE_JG;

    private beans.ws.mdm.sap.com.PicklistCriteria pCN_RACKY;

    private beans.ws.mdm.sap.com.PicklistCriteria educationSLART;

    private beans.ws.mdm.sap.com.DateTimeCriteria educationBEGDA;

    private beans.ws.mdm.sap.com.DateTimeCriteria educationENDDA;

    private beans.ws.mdm.sap.com.PicklistCriteria educationINSMO;

    private beans.ws.mdm.sap.com.TextCriteria educationANZKL;

    private beans.ws.mdm.sap.com.PicklistCriteria educationEINHT;

    private beans.ws.mdm.sap.com.DateTimeCriteria educationBYSJ;

    private beans.ws.mdm.sap.com.PicklistCriteria educationYXMC;

    private beans.ws.mdm.sap.com.TextCriteria educationYXMCQC;

    private beans.ws.mdm.sap.com.PicklistCriteria educationINSAT;

    private beans.ws.mdm.sap.com.TextCriteria educationZTYE_XYX;

    private beans.ws.mdm.sap.com.PicklistCriteria educationSXZY;

    private beans.ws.mdm.sap.com.TextCriteria educationZYMC;

    private beans.ws.mdm.sap.com.BooleanCriteria educationSFZGXL;

    private beans.ws.mdm.sap.com.BooleanCriteria educationACAQM;

    private beans.ws.mdm.sap.com.PicklistCriteria languageYZMC;

    private beans.ws.mdm.sap.com.PicklistCriteria languageSPDJ;

    private beans.ws.mdm.sap.com.PicklistCriteria aNSSA;

    private beans.ws.mdm.sap.com.TextCriteria lOCAT;

    private beans.ws.mdm.sap.com.TextCriteria pSTLZ;

    private beans.ws.mdm.sap.com.TextCriteria zUSRID;

    private beans.ws.mdm.sap.com.TextCriteria zTYE_LXR;

    private beans.ws.mdm.sap.com.TextCriteria zTYE_LXRGX;

    private beans.ws.mdm.sap.com.PicklistCriteria contactUSRTY;

    private beans.ws.mdm.sap.com.TextCriteria contactUSRID;

    private beans.ws.mdm.sap.com.DateTimeCriteria workExperienceBEGDA;

    private beans.ws.mdm.sap.com.DateTimeCriteria workExperienceENDDA;

    private beans.ws.mdm.sap.com.TextCriteria workExperienceVORAG;

    private beans.ws.mdm.sap.com.PicklistCriteria workExperienceBRSCH;

    private beans.ws.mdm.sap.com.TextCriteria workExperienceZTYE_BM;

    private beans.ws.mdm.sap.com.TextCriteria workExperienceZTYE_BZXX;

    private beans.ws.mdm.sap.com.TextCriteria workExperienceZTYE_GW;

    private beans.ws.mdm.sap.com.PicklistCriteria aNSVH;

    private beans.ws.mdm.sap.com.PicklistCriteria familyMembersFAMSA;

    private beans.ws.mdm.sap.com.TextCriteria familyMembersPAD_NACHN;

    private beans.ws.mdm.sap.com.DateTimeCriteria familyMembersGBDAT;

    private beans.ws.mdm.sap.com.PicklistCriteria familyMembersFANAT;

    private beans.ws.mdm.sap.com.PicklistCriteria aPCOD;

    private beans.ws.mdm.sap.com.TextCriteria aPMEM;

    private beans.ws.mdm.sap.com.TextCriteria applicant;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyDate;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyTime;

    private beans.ws.mdm.sap.com.TextCriteria applyReason;

    private beans.ws.mdm.sap.com.TextCriteria createBy;

    private beans.ws.mdm.sap.com.DateTimeCriteria createDate;

    private beans.ws.mdm.sap.com.TextCriteria updateBy;

    private beans.ws.mdm.sap.com.DateTimeCriteria updateDate;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN;

    private beans.ws.mdm.sap.com.PicklistCriteria operation;

    public EmployeeCriteria() {
    }

    public EmployeeCriteria(
           java.lang.String[] namedSearchCriteria,
           java.lang.String[] maskCriteria,
           java.lang.String logicalOperator,
           beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria,
           beans.ws.mdm.sap.com.NumericCriteria autoID,
           beans.ws.mdm.sap.com.TextCriteria applyNumber,
           beans.ws.mdm.sap.com.TextCriteria pERNR,
           beans.ws.mdm.sap.com.PicklistCriteria mASSN,
           beans.ws.mdm.sap.com.PicklistCriteria mASSG,
           beans.ws.mdm.sap.com.DateTimeCriteria eINDA,
           beans.ws.mdm.sap.com.TextCriteria nACHN,
           beans.ws.mdm.sap.com.PicklistCriteria gESCH,
           beans.ws.mdm.sap.com.DateTimeCriteria gBDAT,
           beans.ws.mdm.sap.com.PicklistCriteria nATIO,
           beans.ws.mdm.sap.com.PicklistCriteria fAMST,
           beans.ws.mdm.sap.com.PicklistCriteria workType,
           beans.ws.mdm.sap.com.PicklistCriteria pERSG,
           beans.ws.mdm.sap.com.PicklistCriteria pERSK,
           beans.ws.mdm.sap.com.PicklistCriteria wERKS,
           beans.ws.mdm.sap.com.PicklistCriteria bTRTL,
           beans.ws.mdm.sap.com.PicklistCriteria aBKRS,
           beans.ws.mdm.sap.com.TextCriteria pLANS,
           beans.ws.mdm.sap.com.TextCriteria pLANS_NAME,
           beans.ws.mdm.sap.com.PicklistCriteria iCTYP,
           beans.ws.mdm.sap.com.TextCriteria iCNUM,
           beans.ws.mdm.sap.com.TextCriteria zTYE_JG,
           beans.ws.mdm.sap.com.PicklistCriteria pCN_RACKY,
           beans.ws.mdm.sap.com.PicklistCriteria educationSLART,
           beans.ws.mdm.sap.com.DateTimeCriteria educationBEGDA,
           beans.ws.mdm.sap.com.DateTimeCriteria educationENDDA,
           beans.ws.mdm.sap.com.PicklistCriteria educationINSMO,
           beans.ws.mdm.sap.com.TextCriteria educationANZKL,
           beans.ws.mdm.sap.com.PicklistCriteria educationEINHT,
           beans.ws.mdm.sap.com.DateTimeCriteria educationBYSJ,
           beans.ws.mdm.sap.com.PicklistCriteria educationYXMC,
           beans.ws.mdm.sap.com.TextCriteria educationYXMCQC,
           beans.ws.mdm.sap.com.PicklistCriteria educationINSAT,
           beans.ws.mdm.sap.com.TextCriteria educationZTYE_XYX,
           beans.ws.mdm.sap.com.PicklistCriteria educationSXZY,
           beans.ws.mdm.sap.com.TextCriteria educationZYMC,
           beans.ws.mdm.sap.com.BooleanCriteria educationSFZGXL,
           beans.ws.mdm.sap.com.BooleanCriteria educationACAQM,
           beans.ws.mdm.sap.com.PicklistCriteria languageYZMC,
           beans.ws.mdm.sap.com.PicklistCriteria languageSPDJ,
           beans.ws.mdm.sap.com.PicklistCriteria aNSSA,
           beans.ws.mdm.sap.com.TextCriteria lOCAT,
           beans.ws.mdm.sap.com.TextCriteria pSTLZ,
           beans.ws.mdm.sap.com.TextCriteria zUSRID,
           beans.ws.mdm.sap.com.TextCriteria zTYE_LXR,
           beans.ws.mdm.sap.com.TextCriteria zTYE_LXRGX,
           beans.ws.mdm.sap.com.PicklistCriteria contactUSRTY,
           beans.ws.mdm.sap.com.TextCriteria contactUSRID,
           beans.ws.mdm.sap.com.DateTimeCriteria workExperienceBEGDA,
           beans.ws.mdm.sap.com.DateTimeCriteria workExperienceENDDA,
           beans.ws.mdm.sap.com.TextCriteria workExperienceVORAG,
           beans.ws.mdm.sap.com.PicklistCriteria workExperienceBRSCH,
           beans.ws.mdm.sap.com.TextCriteria workExperienceZTYE_BM,
           beans.ws.mdm.sap.com.TextCriteria workExperienceZTYE_BZXX,
           beans.ws.mdm.sap.com.TextCriteria workExperienceZTYE_GW,
           beans.ws.mdm.sap.com.PicklistCriteria aNSVH,
           beans.ws.mdm.sap.com.PicklistCriteria familyMembersFAMSA,
           beans.ws.mdm.sap.com.TextCriteria familyMembersPAD_NACHN,
           beans.ws.mdm.sap.com.DateTimeCriteria familyMembersGBDAT,
           beans.ws.mdm.sap.com.PicklistCriteria familyMembersFANAT,
           beans.ws.mdm.sap.com.PicklistCriteria aPCOD,
           beans.ws.mdm.sap.com.TextCriteria aPMEM,
           beans.ws.mdm.sap.com.TextCriteria applicant,
           beans.ws.mdm.sap.com.DateTimeCriteria applyDate,
           beans.ws.mdm.sap.com.DateTimeCriteria applyTime,
           beans.ws.mdm.sap.com.TextCriteria applyReason,
           beans.ws.mdm.sap.com.TextCriteria createBy,
           beans.ws.mdm.sap.com.DateTimeCriteria createDate,
           beans.ws.mdm.sap.com.TextCriteria updateBy,
           beans.ws.mdm.sap.com.DateTimeCriteria updateDate,
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
        this.pERNR = pERNR;
        this.mASSN = mASSN;
        this.mASSG = mASSG;
        this.eINDA = eINDA;
        this.nACHN = nACHN;
        this.gESCH = gESCH;
        this.gBDAT = gBDAT;
        this.nATIO = nATIO;
        this.fAMST = fAMST;
        this.workType = workType;
        this.pERSG = pERSG;
        this.pERSK = pERSK;
        this.wERKS = wERKS;
        this.bTRTL = bTRTL;
        this.aBKRS = aBKRS;
        this.pLANS = pLANS;
        this.pLANS_NAME = pLANS_NAME;
        this.iCTYP = iCTYP;
        this.iCNUM = iCNUM;
        this.zTYE_JG = zTYE_JG;
        this.pCN_RACKY = pCN_RACKY;
        this.educationSLART = educationSLART;
        this.educationBEGDA = educationBEGDA;
        this.educationENDDA = educationENDDA;
        this.educationINSMO = educationINSMO;
        this.educationANZKL = educationANZKL;
        this.educationEINHT = educationEINHT;
        this.educationBYSJ = educationBYSJ;
        this.educationYXMC = educationYXMC;
        this.educationYXMCQC = educationYXMCQC;
        this.educationINSAT = educationINSAT;
        this.educationZTYE_XYX = educationZTYE_XYX;
        this.educationSXZY = educationSXZY;
        this.educationZYMC = educationZYMC;
        this.educationSFZGXL = educationSFZGXL;
        this.educationACAQM = educationACAQM;
        this.languageYZMC = languageYZMC;
        this.languageSPDJ = languageSPDJ;
        this.aNSSA = aNSSA;
        this.lOCAT = lOCAT;
        this.pSTLZ = pSTLZ;
        this.zUSRID = zUSRID;
        this.zTYE_LXR = zTYE_LXR;
        this.zTYE_LXRGX = zTYE_LXRGX;
        this.contactUSRTY = contactUSRTY;
        this.contactUSRID = contactUSRID;
        this.workExperienceBEGDA = workExperienceBEGDA;
        this.workExperienceENDDA = workExperienceENDDA;
        this.workExperienceVORAG = workExperienceVORAG;
        this.workExperienceBRSCH = workExperienceBRSCH;
        this.workExperienceZTYE_BM = workExperienceZTYE_BM;
        this.workExperienceZTYE_BZXX = workExperienceZTYE_BZXX;
        this.workExperienceZTYE_GW = workExperienceZTYE_GW;
        this.aNSVH = aNSVH;
        this.familyMembersFAMSA = familyMembersFAMSA;
        this.familyMembersPAD_NACHN = familyMembersPAD_NACHN;
        this.familyMembersGBDAT = familyMembersGBDAT;
        this.familyMembersFANAT = familyMembersFANAT;
        this.aPCOD = aPCOD;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.applyDate = applyDate;
        this.applyTime = applyTime;
        this.applyReason = applyReason;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.updateDate = updateDate;
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
        this.serviceRelationshipsTupleDGUID = serviceRelationshipsTupleDGUID;
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
        this.operation = operation;
    }


    /**
     * Gets the namedSearchCriteria value for this EmployeeCriteria.
     * 
     * @return namedSearchCriteria
     */
    public java.lang.String[] getNamedSearchCriteria() {
        return namedSearchCriteria;
    }


    /**
     * Sets the namedSearchCriteria value for this EmployeeCriteria.
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
     * Gets the maskCriteria value for this EmployeeCriteria.
     * 
     * @return maskCriteria
     */
    public java.lang.String[] getMaskCriteria() {
        return maskCriteria;
    }


    /**
     * Sets the maskCriteria value for this EmployeeCriteria.
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
     * Gets the logicalOperator value for this EmployeeCriteria.
     * 
     * @return logicalOperator
     */
    public java.lang.String getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this EmployeeCriteria.
     * 
     * @param logicalOperator
     */
    public void setLogicalOperator(java.lang.String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the keywordCriteria value for this EmployeeCriteria.
     * 
     * @return keywordCriteria
     */
    public beans.ws.mdm.sap.com.KeywordConstraint getKeywordCriteria() {
        return keywordCriteria;
    }


    /**
     * Sets the keywordCriteria value for this EmployeeCriteria.
     * 
     * @param keywordCriteria
     */
    public void setKeywordCriteria(beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria) {
        this.keywordCriteria = keywordCriteria;
    }


    /**
     * Gets the autoID value for this EmployeeCriteria.
     * 
     * @return autoID
     */
    public beans.ws.mdm.sap.com.NumericCriteria getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this EmployeeCriteria.
     * 
     * @param autoID
     */
    public void setAutoID(beans.ws.mdm.sap.com.NumericCriteria autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the applyNumber value for this EmployeeCriteria.
     * 
     * @return applyNumber
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this EmployeeCriteria.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(beans.ws.mdm.sap.com.TextCriteria applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the pERNR value for this EmployeeCriteria.
     * 
     * @return pERNR
     */
    public beans.ws.mdm.sap.com.TextCriteria getPERNR() {
        return pERNR;
    }


    /**
     * Sets the pERNR value for this EmployeeCriteria.
     * 
     * @param pERNR
     */
    public void setPERNR(beans.ws.mdm.sap.com.TextCriteria pERNR) {
        this.pERNR = pERNR;
    }


    /**
     * Gets the mASSN value for this EmployeeCriteria.
     * 
     * @return mASSN
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getMASSN() {
        return mASSN;
    }


    /**
     * Sets the mASSN value for this EmployeeCriteria.
     * 
     * @param mASSN
     */
    public void setMASSN(beans.ws.mdm.sap.com.PicklistCriteria mASSN) {
        this.mASSN = mASSN;
    }


    /**
     * Gets the mASSG value for this EmployeeCriteria.
     * 
     * @return mASSG
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getMASSG() {
        return mASSG;
    }


    /**
     * Sets the mASSG value for this EmployeeCriteria.
     * 
     * @param mASSG
     */
    public void setMASSG(beans.ws.mdm.sap.com.PicklistCriteria mASSG) {
        this.mASSG = mASSG;
    }


    /**
     * Gets the eINDA value for this EmployeeCriteria.
     * 
     * @return eINDA
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getEINDA() {
        return eINDA;
    }


    /**
     * Sets the eINDA value for this EmployeeCriteria.
     * 
     * @param eINDA
     */
    public void setEINDA(beans.ws.mdm.sap.com.DateTimeCriteria eINDA) {
        this.eINDA = eINDA;
    }


    /**
     * Gets the nACHN value for this EmployeeCriteria.
     * 
     * @return nACHN
     */
    public beans.ws.mdm.sap.com.TextCriteria getNACHN() {
        return nACHN;
    }


    /**
     * Sets the nACHN value for this EmployeeCriteria.
     * 
     * @param nACHN
     */
    public void setNACHN(beans.ws.mdm.sap.com.TextCriteria nACHN) {
        this.nACHN = nACHN;
    }


    /**
     * Gets the gESCH value for this EmployeeCriteria.
     * 
     * @return gESCH
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getGESCH() {
        return gESCH;
    }


    /**
     * Sets the gESCH value for this EmployeeCriteria.
     * 
     * @param gESCH
     */
    public void setGESCH(beans.ws.mdm.sap.com.PicklistCriteria gESCH) {
        this.gESCH = gESCH;
    }


    /**
     * Gets the gBDAT value for this EmployeeCriteria.
     * 
     * @return gBDAT
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getGBDAT() {
        return gBDAT;
    }


    /**
     * Sets the gBDAT value for this EmployeeCriteria.
     * 
     * @param gBDAT
     */
    public void setGBDAT(beans.ws.mdm.sap.com.DateTimeCriteria gBDAT) {
        this.gBDAT = gBDAT;
    }


    /**
     * Gets the nATIO value for this EmployeeCriteria.
     * 
     * @return nATIO
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getNATIO() {
        return nATIO;
    }


    /**
     * Sets the nATIO value for this EmployeeCriteria.
     * 
     * @param nATIO
     */
    public void setNATIO(beans.ws.mdm.sap.com.PicklistCriteria nATIO) {
        this.nATIO = nATIO;
    }


    /**
     * Gets the fAMST value for this EmployeeCriteria.
     * 
     * @return fAMST
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getFAMST() {
        return fAMST;
    }


    /**
     * Sets the fAMST value for this EmployeeCriteria.
     * 
     * @param fAMST
     */
    public void setFAMST(beans.ws.mdm.sap.com.PicklistCriteria fAMST) {
        this.fAMST = fAMST;
    }


    /**
     * Gets the workType value for this EmployeeCriteria.
     * 
     * @return workType
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getWorkType() {
        return workType;
    }


    /**
     * Sets the workType value for this EmployeeCriteria.
     * 
     * @param workType
     */
    public void setWorkType(beans.ws.mdm.sap.com.PicklistCriteria workType) {
        this.workType = workType;
    }


    /**
     * Gets the pERSG value for this EmployeeCriteria.
     * 
     * @return pERSG
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getPERSG() {
        return pERSG;
    }


    /**
     * Sets the pERSG value for this EmployeeCriteria.
     * 
     * @param pERSG
     */
    public void setPERSG(beans.ws.mdm.sap.com.PicklistCriteria pERSG) {
        this.pERSG = pERSG;
    }


    /**
     * Gets the pERSK value for this EmployeeCriteria.
     * 
     * @return pERSK
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getPERSK() {
        return pERSK;
    }


    /**
     * Sets the pERSK value for this EmployeeCriteria.
     * 
     * @param pERSK
     */
    public void setPERSK(beans.ws.mdm.sap.com.PicklistCriteria pERSK) {
        this.pERSK = pERSK;
    }


    /**
     * Gets the wERKS value for this EmployeeCriteria.
     * 
     * @return wERKS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getWERKS() {
        return wERKS;
    }


    /**
     * Sets the wERKS value for this EmployeeCriteria.
     * 
     * @param wERKS
     */
    public void setWERKS(beans.ws.mdm.sap.com.PicklistCriteria wERKS) {
        this.wERKS = wERKS;
    }


    /**
     * Gets the bTRTL value for this EmployeeCriteria.
     * 
     * @return bTRTL
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getBTRTL() {
        return bTRTL;
    }


    /**
     * Sets the bTRTL value for this EmployeeCriteria.
     * 
     * @param bTRTL
     */
    public void setBTRTL(beans.ws.mdm.sap.com.PicklistCriteria bTRTL) {
        this.bTRTL = bTRTL;
    }


    /**
     * Gets the aBKRS value for this EmployeeCriteria.
     * 
     * @return aBKRS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getABKRS() {
        return aBKRS;
    }


    /**
     * Sets the aBKRS value for this EmployeeCriteria.
     * 
     * @param aBKRS
     */
    public void setABKRS(beans.ws.mdm.sap.com.PicklistCriteria aBKRS) {
        this.aBKRS = aBKRS;
    }


    /**
     * Gets the pLANS value for this EmployeeCriteria.
     * 
     * @return pLANS
     */
    public beans.ws.mdm.sap.com.TextCriteria getPLANS() {
        return pLANS;
    }


    /**
     * Sets the pLANS value for this EmployeeCriteria.
     * 
     * @param pLANS
     */
    public void setPLANS(beans.ws.mdm.sap.com.TextCriteria pLANS) {
        this.pLANS = pLANS;
    }


    /**
     * Gets the pLANS_NAME value for this EmployeeCriteria.
     * 
     * @return pLANS_NAME
     */
    public beans.ws.mdm.sap.com.TextCriteria getPLANS_NAME() {
        return pLANS_NAME;
    }


    /**
     * Sets the pLANS_NAME value for this EmployeeCriteria.
     * 
     * @param pLANS_NAME
     */
    public void setPLANS_NAME(beans.ws.mdm.sap.com.TextCriteria pLANS_NAME) {
        this.pLANS_NAME = pLANS_NAME;
    }


    /**
     * Gets the iCTYP value for this EmployeeCriteria.
     * 
     * @return iCTYP
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getICTYP() {
        return iCTYP;
    }


    /**
     * Sets the iCTYP value for this EmployeeCriteria.
     * 
     * @param iCTYP
     */
    public void setICTYP(beans.ws.mdm.sap.com.PicklistCriteria iCTYP) {
        this.iCTYP = iCTYP;
    }


    /**
     * Gets the iCNUM value for this EmployeeCriteria.
     * 
     * @return iCNUM
     */
    public beans.ws.mdm.sap.com.TextCriteria getICNUM() {
        return iCNUM;
    }


    /**
     * Sets the iCNUM value for this EmployeeCriteria.
     * 
     * @param iCNUM
     */
    public void setICNUM(beans.ws.mdm.sap.com.TextCriteria iCNUM) {
        this.iCNUM = iCNUM;
    }


    /**
     * Gets the zTYE_JG value for this EmployeeCriteria.
     * 
     * @return zTYE_JG
     */
    public beans.ws.mdm.sap.com.TextCriteria getZTYE_JG() {
        return zTYE_JG;
    }


    /**
     * Sets the zTYE_JG value for this EmployeeCriteria.
     * 
     * @param zTYE_JG
     */
    public void setZTYE_JG(beans.ws.mdm.sap.com.TextCriteria zTYE_JG) {
        this.zTYE_JG = zTYE_JG;
    }


    /**
     * Gets the pCN_RACKY value for this EmployeeCriteria.
     * 
     * @return pCN_RACKY
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getPCN_RACKY() {
        return pCN_RACKY;
    }


    /**
     * Sets the pCN_RACKY value for this EmployeeCriteria.
     * 
     * @param pCN_RACKY
     */
    public void setPCN_RACKY(beans.ws.mdm.sap.com.PicklistCriteria pCN_RACKY) {
        this.pCN_RACKY = pCN_RACKY;
    }


    /**
     * Gets the educationSLART value for this EmployeeCriteria.
     * 
     * @return educationSLART
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getEducationSLART() {
        return educationSLART;
    }


    /**
     * Sets the educationSLART value for this EmployeeCriteria.
     * 
     * @param educationSLART
     */
    public void setEducationSLART(beans.ws.mdm.sap.com.PicklistCriteria educationSLART) {
        this.educationSLART = educationSLART;
    }


    /**
     * Gets the educationBEGDA value for this EmployeeCriteria.
     * 
     * @return educationBEGDA
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getEducationBEGDA() {
        return educationBEGDA;
    }


    /**
     * Sets the educationBEGDA value for this EmployeeCriteria.
     * 
     * @param educationBEGDA
     */
    public void setEducationBEGDA(beans.ws.mdm.sap.com.DateTimeCriteria educationBEGDA) {
        this.educationBEGDA = educationBEGDA;
    }


    /**
     * Gets the educationENDDA value for this EmployeeCriteria.
     * 
     * @return educationENDDA
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getEducationENDDA() {
        return educationENDDA;
    }


    /**
     * Sets the educationENDDA value for this EmployeeCriteria.
     * 
     * @param educationENDDA
     */
    public void setEducationENDDA(beans.ws.mdm.sap.com.DateTimeCriteria educationENDDA) {
        this.educationENDDA = educationENDDA;
    }


    /**
     * Gets the educationINSMO value for this EmployeeCriteria.
     * 
     * @return educationINSMO
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getEducationINSMO() {
        return educationINSMO;
    }


    /**
     * Sets the educationINSMO value for this EmployeeCriteria.
     * 
     * @param educationINSMO
     */
    public void setEducationINSMO(beans.ws.mdm.sap.com.PicklistCriteria educationINSMO) {
        this.educationINSMO = educationINSMO;
    }


    /**
     * Gets the educationANZKL value for this EmployeeCriteria.
     * 
     * @return educationANZKL
     */
    public beans.ws.mdm.sap.com.TextCriteria getEducationANZKL() {
        return educationANZKL;
    }


    /**
     * Sets the educationANZKL value for this EmployeeCriteria.
     * 
     * @param educationANZKL
     */
    public void setEducationANZKL(beans.ws.mdm.sap.com.TextCriteria educationANZKL) {
        this.educationANZKL = educationANZKL;
    }


    /**
     * Gets the educationEINHT value for this EmployeeCriteria.
     * 
     * @return educationEINHT
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getEducationEINHT() {
        return educationEINHT;
    }


    /**
     * Sets the educationEINHT value for this EmployeeCriteria.
     * 
     * @param educationEINHT
     */
    public void setEducationEINHT(beans.ws.mdm.sap.com.PicklistCriteria educationEINHT) {
        this.educationEINHT = educationEINHT;
    }


    /**
     * Gets the educationBYSJ value for this EmployeeCriteria.
     * 
     * @return educationBYSJ
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getEducationBYSJ() {
        return educationBYSJ;
    }


    /**
     * Sets the educationBYSJ value for this EmployeeCriteria.
     * 
     * @param educationBYSJ
     */
    public void setEducationBYSJ(beans.ws.mdm.sap.com.DateTimeCriteria educationBYSJ) {
        this.educationBYSJ = educationBYSJ;
    }


    /**
     * Gets the educationYXMC value for this EmployeeCriteria.
     * 
     * @return educationYXMC
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getEducationYXMC() {
        return educationYXMC;
    }


    /**
     * Sets the educationYXMC value for this EmployeeCriteria.
     * 
     * @param educationYXMC
     */
    public void setEducationYXMC(beans.ws.mdm.sap.com.PicklistCriteria educationYXMC) {
        this.educationYXMC = educationYXMC;
    }


    /**
     * Gets the educationYXMCQC value for this EmployeeCriteria.
     * 
     * @return educationYXMCQC
     */
    public beans.ws.mdm.sap.com.TextCriteria getEducationYXMCQC() {
        return educationYXMCQC;
    }


    /**
     * Sets the educationYXMCQC value for this EmployeeCriteria.
     * 
     * @param educationYXMCQC
     */
    public void setEducationYXMCQC(beans.ws.mdm.sap.com.TextCriteria educationYXMCQC) {
        this.educationYXMCQC = educationYXMCQC;
    }


    /**
     * Gets the educationINSAT value for this EmployeeCriteria.
     * 
     * @return educationINSAT
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getEducationINSAT() {
        return educationINSAT;
    }


    /**
     * Sets the educationINSAT value for this EmployeeCriteria.
     * 
     * @param educationINSAT
     */
    public void setEducationINSAT(beans.ws.mdm.sap.com.PicklistCriteria educationINSAT) {
        this.educationINSAT = educationINSAT;
    }


    /**
     * Gets the educationZTYE_XYX value for this EmployeeCriteria.
     * 
     * @return educationZTYE_XYX
     */
    public beans.ws.mdm.sap.com.TextCriteria getEducationZTYE_XYX() {
        return educationZTYE_XYX;
    }


    /**
     * Sets the educationZTYE_XYX value for this EmployeeCriteria.
     * 
     * @param educationZTYE_XYX
     */
    public void setEducationZTYE_XYX(beans.ws.mdm.sap.com.TextCriteria educationZTYE_XYX) {
        this.educationZTYE_XYX = educationZTYE_XYX;
    }


    /**
     * Gets the educationSXZY value for this EmployeeCriteria.
     * 
     * @return educationSXZY
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getEducationSXZY() {
        return educationSXZY;
    }


    /**
     * Sets the educationSXZY value for this EmployeeCriteria.
     * 
     * @param educationSXZY
     */
    public void setEducationSXZY(beans.ws.mdm.sap.com.PicklistCriteria educationSXZY) {
        this.educationSXZY = educationSXZY;
    }


    /**
     * Gets the educationZYMC value for this EmployeeCriteria.
     * 
     * @return educationZYMC
     */
    public beans.ws.mdm.sap.com.TextCriteria getEducationZYMC() {
        return educationZYMC;
    }


    /**
     * Sets the educationZYMC value for this EmployeeCriteria.
     * 
     * @param educationZYMC
     */
    public void setEducationZYMC(beans.ws.mdm.sap.com.TextCriteria educationZYMC) {
        this.educationZYMC = educationZYMC;
    }


    /**
     * Gets the educationSFZGXL value for this EmployeeCriteria.
     * 
     * @return educationSFZGXL
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getEducationSFZGXL() {
        return educationSFZGXL;
    }


    /**
     * Sets the educationSFZGXL value for this EmployeeCriteria.
     * 
     * @param educationSFZGXL
     */
    public void setEducationSFZGXL(beans.ws.mdm.sap.com.BooleanCriteria educationSFZGXL) {
        this.educationSFZGXL = educationSFZGXL;
    }


    /**
     * Gets the educationACAQM value for this EmployeeCriteria.
     * 
     * @return educationACAQM
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getEducationACAQM() {
        return educationACAQM;
    }


    /**
     * Sets the educationACAQM value for this EmployeeCriteria.
     * 
     * @param educationACAQM
     */
    public void setEducationACAQM(beans.ws.mdm.sap.com.BooleanCriteria educationACAQM) {
        this.educationACAQM = educationACAQM;
    }


    /**
     * Gets the languageYZMC value for this EmployeeCriteria.
     * 
     * @return languageYZMC
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getLanguageYZMC() {
        return languageYZMC;
    }


    /**
     * Sets the languageYZMC value for this EmployeeCriteria.
     * 
     * @param languageYZMC
     */
    public void setLanguageYZMC(beans.ws.mdm.sap.com.PicklistCriteria languageYZMC) {
        this.languageYZMC = languageYZMC;
    }


    /**
     * Gets the languageSPDJ value for this EmployeeCriteria.
     * 
     * @return languageSPDJ
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getLanguageSPDJ() {
        return languageSPDJ;
    }


    /**
     * Sets the languageSPDJ value for this EmployeeCriteria.
     * 
     * @param languageSPDJ
     */
    public void setLanguageSPDJ(beans.ws.mdm.sap.com.PicklistCriteria languageSPDJ) {
        this.languageSPDJ = languageSPDJ;
    }


    /**
     * Gets the aNSSA value for this EmployeeCriteria.
     * 
     * @return aNSSA
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getANSSA() {
        return aNSSA;
    }


    /**
     * Sets the aNSSA value for this EmployeeCriteria.
     * 
     * @param aNSSA
     */
    public void setANSSA(beans.ws.mdm.sap.com.PicklistCriteria aNSSA) {
        this.aNSSA = aNSSA;
    }


    /**
     * Gets the lOCAT value for this EmployeeCriteria.
     * 
     * @return lOCAT
     */
    public beans.ws.mdm.sap.com.TextCriteria getLOCAT() {
        return lOCAT;
    }


    /**
     * Sets the lOCAT value for this EmployeeCriteria.
     * 
     * @param lOCAT
     */
    public void setLOCAT(beans.ws.mdm.sap.com.TextCriteria lOCAT) {
        this.lOCAT = lOCAT;
    }


    /**
     * Gets the pSTLZ value for this EmployeeCriteria.
     * 
     * @return pSTLZ
     */
    public beans.ws.mdm.sap.com.TextCriteria getPSTLZ() {
        return pSTLZ;
    }


    /**
     * Sets the pSTLZ value for this EmployeeCriteria.
     * 
     * @param pSTLZ
     */
    public void setPSTLZ(beans.ws.mdm.sap.com.TextCriteria pSTLZ) {
        this.pSTLZ = pSTLZ;
    }


    /**
     * Gets the zUSRID value for this EmployeeCriteria.
     * 
     * @return zUSRID
     */
    public beans.ws.mdm.sap.com.TextCriteria getZUSRID() {
        return zUSRID;
    }


    /**
     * Sets the zUSRID value for this EmployeeCriteria.
     * 
     * @param zUSRID
     */
    public void setZUSRID(beans.ws.mdm.sap.com.TextCriteria zUSRID) {
        this.zUSRID = zUSRID;
    }


    /**
     * Gets the zTYE_LXR value for this EmployeeCriteria.
     * 
     * @return zTYE_LXR
     */
    public beans.ws.mdm.sap.com.TextCriteria getZTYE_LXR() {
        return zTYE_LXR;
    }


    /**
     * Sets the zTYE_LXR value for this EmployeeCriteria.
     * 
     * @param zTYE_LXR
     */
    public void setZTYE_LXR(beans.ws.mdm.sap.com.TextCriteria zTYE_LXR) {
        this.zTYE_LXR = zTYE_LXR;
    }


    /**
     * Gets the zTYE_LXRGX value for this EmployeeCriteria.
     * 
     * @return zTYE_LXRGX
     */
    public beans.ws.mdm.sap.com.TextCriteria getZTYE_LXRGX() {
        return zTYE_LXRGX;
    }


    /**
     * Sets the zTYE_LXRGX value for this EmployeeCriteria.
     * 
     * @param zTYE_LXRGX
     */
    public void setZTYE_LXRGX(beans.ws.mdm.sap.com.TextCriteria zTYE_LXRGX) {
        this.zTYE_LXRGX = zTYE_LXRGX;
    }


    /**
     * Gets the contactUSRTY value for this EmployeeCriteria.
     * 
     * @return contactUSRTY
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getContactUSRTY() {
        return contactUSRTY;
    }


    /**
     * Sets the contactUSRTY value for this EmployeeCriteria.
     * 
     * @param contactUSRTY
     */
    public void setContactUSRTY(beans.ws.mdm.sap.com.PicklistCriteria contactUSRTY) {
        this.contactUSRTY = contactUSRTY;
    }


    /**
     * Gets the contactUSRID value for this EmployeeCriteria.
     * 
     * @return contactUSRID
     */
    public beans.ws.mdm.sap.com.TextCriteria getContactUSRID() {
        return contactUSRID;
    }


    /**
     * Sets the contactUSRID value for this EmployeeCriteria.
     * 
     * @param contactUSRID
     */
    public void setContactUSRID(beans.ws.mdm.sap.com.TextCriteria contactUSRID) {
        this.contactUSRID = contactUSRID;
    }


    /**
     * Gets the workExperienceBEGDA value for this EmployeeCriteria.
     * 
     * @return workExperienceBEGDA
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getWorkExperienceBEGDA() {
        return workExperienceBEGDA;
    }


    /**
     * Sets the workExperienceBEGDA value for this EmployeeCriteria.
     * 
     * @param workExperienceBEGDA
     */
    public void setWorkExperienceBEGDA(beans.ws.mdm.sap.com.DateTimeCriteria workExperienceBEGDA) {
        this.workExperienceBEGDA = workExperienceBEGDA;
    }


    /**
     * Gets the workExperienceENDDA value for this EmployeeCriteria.
     * 
     * @return workExperienceENDDA
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getWorkExperienceENDDA() {
        return workExperienceENDDA;
    }


    /**
     * Sets the workExperienceENDDA value for this EmployeeCriteria.
     * 
     * @param workExperienceENDDA
     */
    public void setWorkExperienceENDDA(beans.ws.mdm.sap.com.DateTimeCriteria workExperienceENDDA) {
        this.workExperienceENDDA = workExperienceENDDA;
    }


    /**
     * Gets the workExperienceVORAG value for this EmployeeCriteria.
     * 
     * @return workExperienceVORAG
     */
    public beans.ws.mdm.sap.com.TextCriteria getWorkExperienceVORAG() {
        return workExperienceVORAG;
    }


    /**
     * Sets the workExperienceVORAG value for this EmployeeCriteria.
     * 
     * @param workExperienceVORAG
     */
    public void setWorkExperienceVORAG(beans.ws.mdm.sap.com.TextCriteria workExperienceVORAG) {
        this.workExperienceVORAG = workExperienceVORAG;
    }


    /**
     * Gets the workExperienceBRSCH value for this EmployeeCriteria.
     * 
     * @return workExperienceBRSCH
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getWorkExperienceBRSCH() {
        return workExperienceBRSCH;
    }


    /**
     * Sets the workExperienceBRSCH value for this EmployeeCriteria.
     * 
     * @param workExperienceBRSCH
     */
    public void setWorkExperienceBRSCH(beans.ws.mdm.sap.com.PicklistCriteria workExperienceBRSCH) {
        this.workExperienceBRSCH = workExperienceBRSCH;
    }


    /**
     * Gets the workExperienceZTYE_BM value for this EmployeeCriteria.
     * 
     * @return workExperienceZTYE_BM
     */
    public beans.ws.mdm.sap.com.TextCriteria getWorkExperienceZTYE_BM() {
        return workExperienceZTYE_BM;
    }


    /**
     * Sets the workExperienceZTYE_BM value for this EmployeeCriteria.
     * 
     * @param workExperienceZTYE_BM
     */
    public void setWorkExperienceZTYE_BM(beans.ws.mdm.sap.com.TextCriteria workExperienceZTYE_BM) {
        this.workExperienceZTYE_BM = workExperienceZTYE_BM;
    }


    /**
     * Gets the workExperienceZTYE_BZXX value for this EmployeeCriteria.
     * 
     * @return workExperienceZTYE_BZXX
     */
    public beans.ws.mdm.sap.com.TextCriteria getWorkExperienceZTYE_BZXX() {
        return workExperienceZTYE_BZXX;
    }


    /**
     * Sets the workExperienceZTYE_BZXX value for this EmployeeCriteria.
     * 
     * @param workExperienceZTYE_BZXX
     */
    public void setWorkExperienceZTYE_BZXX(beans.ws.mdm.sap.com.TextCriteria workExperienceZTYE_BZXX) {
        this.workExperienceZTYE_BZXX = workExperienceZTYE_BZXX;
    }


    /**
     * Gets the workExperienceZTYE_GW value for this EmployeeCriteria.
     * 
     * @return workExperienceZTYE_GW
     */
    public beans.ws.mdm.sap.com.TextCriteria getWorkExperienceZTYE_GW() {
        return workExperienceZTYE_GW;
    }


    /**
     * Sets the workExperienceZTYE_GW value for this EmployeeCriteria.
     * 
     * @param workExperienceZTYE_GW
     */
    public void setWorkExperienceZTYE_GW(beans.ws.mdm.sap.com.TextCriteria workExperienceZTYE_GW) {
        this.workExperienceZTYE_GW = workExperienceZTYE_GW;
    }


    /**
     * Gets the aNSVH value for this EmployeeCriteria.
     * 
     * @return aNSVH
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getANSVH() {
        return aNSVH;
    }


    /**
     * Sets the aNSVH value for this EmployeeCriteria.
     * 
     * @param aNSVH
     */
    public void setANSVH(beans.ws.mdm.sap.com.PicklistCriteria aNSVH) {
        this.aNSVH = aNSVH;
    }


    /**
     * Gets the familyMembersFAMSA value for this EmployeeCriteria.
     * 
     * @return familyMembersFAMSA
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getFamilyMembersFAMSA() {
        return familyMembersFAMSA;
    }


    /**
     * Sets the familyMembersFAMSA value for this EmployeeCriteria.
     * 
     * @param familyMembersFAMSA
     */
    public void setFamilyMembersFAMSA(beans.ws.mdm.sap.com.PicklistCriteria familyMembersFAMSA) {
        this.familyMembersFAMSA = familyMembersFAMSA;
    }


    /**
     * Gets the familyMembersPAD_NACHN value for this EmployeeCriteria.
     * 
     * @return familyMembersPAD_NACHN
     */
    public beans.ws.mdm.sap.com.TextCriteria getFamilyMembersPAD_NACHN() {
        return familyMembersPAD_NACHN;
    }


    /**
     * Sets the familyMembersPAD_NACHN value for this EmployeeCriteria.
     * 
     * @param familyMembersPAD_NACHN
     */
    public void setFamilyMembersPAD_NACHN(beans.ws.mdm.sap.com.TextCriteria familyMembersPAD_NACHN) {
        this.familyMembersPAD_NACHN = familyMembersPAD_NACHN;
    }


    /**
     * Gets the familyMembersGBDAT value for this EmployeeCriteria.
     * 
     * @return familyMembersGBDAT
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getFamilyMembersGBDAT() {
        return familyMembersGBDAT;
    }


    /**
     * Sets the familyMembersGBDAT value for this EmployeeCriteria.
     * 
     * @param familyMembersGBDAT
     */
    public void setFamilyMembersGBDAT(beans.ws.mdm.sap.com.DateTimeCriteria familyMembersGBDAT) {
        this.familyMembersGBDAT = familyMembersGBDAT;
    }


    /**
     * Gets the familyMembersFANAT value for this EmployeeCriteria.
     * 
     * @return familyMembersFANAT
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getFamilyMembersFANAT() {
        return familyMembersFANAT;
    }


    /**
     * Sets the familyMembersFANAT value for this EmployeeCriteria.
     * 
     * @param familyMembersFANAT
     */
    public void setFamilyMembersFANAT(beans.ws.mdm.sap.com.PicklistCriteria familyMembersFANAT) {
        this.familyMembersFANAT = familyMembersFANAT;
    }


    /**
     * Gets the aPCOD value for this EmployeeCriteria.
     * 
     * @return aPCOD
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this EmployeeCriteria.
     * 
     * @param aPCOD
     */
    public void setAPCOD(beans.ws.mdm.sap.com.PicklistCriteria aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the aPMEM value for this EmployeeCriteria.
     * 
     * @return aPMEM
     */
    public beans.ws.mdm.sap.com.TextCriteria getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this EmployeeCriteria.
     * 
     * @param aPMEM
     */
    public void setAPMEM(beans.ws.mdm.sap.com.TextCriteria aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this EmployeeCriteria.
     * 
     * @return applicant
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this EmployeeCriteria.
     * 
     * @param applicant
     */
    public void setApplicant(beans.ws.mdm.sap.com.TextCriteria applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the applyDate value for this EmployeeCriteria.
     * 
     * @return applyDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this EmployeeCriteria.
     * 
     * @param applyDate
     */
    public void setApplyDate(beans.ws.mdm.sap.com.DateTimeCriteria applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this EmployeeCriteria.
     * 
     * @return applyTime
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this EmployeeCriteria.
     * 
     * @param applyTime
     */
    public void setApplyTime(beans.ws.mdm.sap.com.DateTimeCriteria applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the applyReason value for this EmployeeCriteria.
     * 
     * @return applyReason
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplyReason() {
        return applyReason;
    }


    /**
     * Sets the applyReason value for this EmployeeCriteria.
     * 
     * @param applyReason
     */
    public void setApplyReason(beans.ws.mdm.sap.com.TextCriteria applyReason) {
        this.applyReason = applyReason;
    }


    /**
     * Gets the createBy value for this EmployeeCriteria.
     * 
     * @return createBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getCreateBy() {
        return createBy;
    }


    /**
     * Sets the createBy value for this EmployeeCriteria.
     * 
     * @param createBy
     */
    public void setCreateBy(beans.ws.mdm.sap.com.TextCriteria createBy) {
        this.createBy = createBy;
    }


    /**
     * Gets the createDate value for this EmployeeCriteria.
     * 
     * @return createDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this EmployeeCriteria.
     * 
     * @param createDate
     */
    public void setCreateDate(beans.ws.mdm.sap.com.DateTimeCriteria createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the updateBy value for this EmployeeCriteria.
     * 
     * @return updateBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this EmployeeCriteria.
     * 
     * @param updateBy
     */
    public void setUpdateBy(beans.ws.mdm.sap.com.TextCriteria updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the updateDate value for this EmployeeCriteria.
     * 
     * @return updateDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getUpdateDate() {
        return updateDate;
    }


    /**
     * Sets the updateDate value for this EmployeeCriteria.
     * 
     * @param updateDate
     */
    public void setUpdateDate(beans.ws.mdm.sap.com.DateTimeCriteria updateDate) {
        this.updateDate = updateDate;
    }


    /**
     * Gets the serviceRelationshipsTupleCLIENT_SYSTEM value for this EmployeeCriteria.
     * 
     * @return serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleCLIENT_SYSTEM() {
        return serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Sets the serviceRelationshipsTupleCLIENT_SYSTEM value for this EmployeeCriteria.
     * 
     * @param serviceRelationshipsTupleCLIENT_SYSTEM
     */
    public void setServiceRelationshipsTupleCLIENT_SYSTEM(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleCLIENT_SYSTEM) {
        this.serviceRelationshipsTupleCLIENT_SYSTEM = serviceRelationshipsTupleCLIENT_SYSTEM;
    }


    /**
     * Gets the serviceRelationshipsTupleDISTUS value for this EmployeeCriteria.
     * 
     * @return serviceRelationshipsTupleDISTUS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleDISTUS() {
        return serviceRelationshipsTupleDISTUS;
    }


    /**
     * Sets the serviceRelationshipsTupleDISTUS value for this EmployeeCriteria.
     * 
     * @param serviceRelationshipsTupleDISTUS
     */
    public void setServiceRelationshipsTupleDISTUS(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDISTUS) {
        this.serviceRelationshipsTupleDISTUS = serviceRelationshipsTupleDISTUS;
    }


    /**
     * Gets the serviceRelationshipsTupleDGUID value for this EmployeeCriteria.
     * 
     * @return serviceRelationshipsTupleDGUID
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleDGUID() {
        return serviceRelationshipsTupleDGUID;
    }


    /**
     * Sets the serviceRelationshipsTupleDGUID value for this EmployeeCriteria.
     * 
     * @param serviceRelationshipsTupleDGUID
     */
    public void setServiceRelationshipsTupleDGUID(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleDGUID) {
        this.serviceRelationshipsTupleDGUID = serviceRelationshipsTupleDGUID;
    }


    /**
     * Gets the serviceRelationshipsTupleRETURN value for this EmployeeCriteria.
     * 
     * @return serviceRelationshipsTupleRETURN
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleRETURN() {
        return serviceRelationshipsTupleRETURN;
    }


    /**
     * Sets the serviceRelationshipsTupleRETURN value for this EmployeeCriteria.
     * 
     * @param serviceRelationshipsTupleRETURN
     */
    public void setServiceRelationshipsTupleRETURN(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleRETURN) {
        this.serviceRelationshipsTupleRETURN = serviceRelationshipsTupleRETURN;
    }


    /**
     * Gets the operation value for this EmployeeCriteria.
     * 
     * @return operation
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this EmployeeCriteria.
     * 
     * @param operation
     */
    public void setOperation(beans.ws.mdm.sap.com.PicklistCriteria operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeCriteria)) return false;
        EmployeeCriteria other = (EmployeeCriteria) obj;
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
            ((this.pERNR==null && other.getPERNR()==null) || 
             (this.pERNR!=null &&
              this.pERNR.equals(other.getPERNR()))) &&
            ((this.mASSN==null && other.getMASSN()==null) || 
             (this.mASSN!=null &&
              this.mASSN.equals(other.getMASSN()))) &&
            ((this.mASSG==null && other.getMASSG()==null) || 
             (this.mASSG!=null &&
              this.mASSG.equals(other.getMASSG()))) &&
            ((this.eINDA==null && other.getEINDA()==null) || 
             (this.eINDA!=null &&
              this.eINDA.equals(other.getEINDA()))) &&
            ((this.nACHN==null && other.getNACHN()==null) || 
             (this.nACHN!=null &&
              this.nACHN.equals(other.getNACHN()))) &&
            ((this.gESCH==null && other.getGESCH()==null) || 
             (this.gESCH!=null &&
              this.gESCH.equals(other.getGESCH()))) &&
            ((this.gBDAT==null && other.getGBDAT()==null) || 
             (this.gBDAT!=null &&
              this.gBDAT.equals(other.getGBDAT()))) &&
            ((this.nATIO==null && other.getNATIO()==null) || 
             (this.nATIO!=null &&
              this.nATIO.equals(other.getNATIO()))) &&
            ((this.fAMST==null && other.getFAMST()==null) || 
             (this.fAMST!=null &&
              this.fAMST.equals(other.getFAMST()))) &&
            ((this.workType==null && other.getWorkType()==null) || 
             (this.workType!=null &&
              this.workType.equals(other.getWorkType()))) &&
            ((this.pERSG==null && other.getPERSG()==null) || 
             (this.pERSG!=null &&
              this.pERSG.equals(other.getPERSG()))) &&
            ((this.pERSK==null && other.getPERSK()==null) || 
             (this.pERSK!=null &&
              this.pERSK.equals(other.getPERSK()))) &&
            ((this.wERKS==null && other.getWERKS()==null) || 
             (this.wERKS!=null &&
              this.wERKS.equals(other.getWERKS()))) &&
            ((this.bTRTL==null && other.getBTRTL()==null) || 
             (this.bTRTL!=null &&
              this.bTRTL.equals(other.getBTRTL()))) &&
            ((this.aBKRS==null && other.getABKRS()==null) || 
             (this.aBKRS!=null &&
              this.aBKRS.equals(other.getABKRS()))) &&
            ((this.pLANS==null && other.getPLANS()==null) || 
             (this.pLANS!=null &&
              this.pLANS.equals(other.getPLANS()))) &&
            ((this.pLANS_NAME==null && other.getPLANS_NAME()==null) || 
             (this.pLANS_NAME!=null &&
              this.pLANS_NAME.equals(other.getPLANS_NAME()))) &&
            ((this.iCTYP==null && other.getICTYP()==null) || 
             (this.iCTYP!=null &&
              this.iCTYP.equals(other.getICTYP()))) &&
            ((this.iCNUM==null && other.getICNUM()==null) || 
             (this.iCNUM!=null &&
              this.iCNUM.equals(other.getICNUM()))) &&
            ((this.zTYE_JG==null && other.getZTYE_JG()==null) || 
             (this.zTYE_JG!=null &&
              this.zTYE_JG.equals(other.getZTYE_JG()))) &&
            ((this.pCN_RACKY==null && other.getPCN_RACKY()==null) || 
             (this.pCN_RACKY!=null &&
              this.pCN_RACKY.equals(other.getPCN_RACKY()))) &&
            ((this.educationSLART==null && other.getEducationSLART()==null) || 
             (this.educationSLART!=null &&
              this.educationSLART.equals(other.getEducationSLART()))) &&
            ((this.educationBEGDA==null && other.getEducationBEGDA()==null) || 
             (this.educationBEGDA!=null &&
              this.educationBEGDA.equals(other.getEducationBEGDA()))) &&
            ((this.educationENDDA==null && other.getEducationENDDA()==null) || 
             (this.educationENDDA!=null &&
              this.educationENDDA.equals(other.getEducationENDDA()))) &&
            ((this.educationINSMO==null && other.getEducationINSMO()==null) || 
             (this.educationINSMO!=null &&
              this.educationINSMO.equals(other.getEducationINSMO()))) &&
            ((this.educationANZKL==null && other.getEducationANZKL()==null) || 
             (this.educationANZKL!=null &&
              this.educationANZKL.equals(other.getEducationANZKL()))) &&
            ((this.educationEINHT==null && other.getEducationEINHT()==null) || 
             (this.educationEINHT!=null &&
              this.educationEINHT.equals(other.getEducationEINHT()))) &&
            ((this.educationBYSJ==null && other.getEducationBYSJ()==null) || 
             (this.educationBYSJ!=null &&
              this.educationBYSJ.equals(other.getEducationBYSJ()))) &&
            ((this.educationYXMC==null && other.getEducationYXMC()==null) || 
             (this.educationYXMC!=null &&
              this.educationYXMC.equals(other.getEducationYXMC()))) &&
            ((this.educationYXMCQC==null && other.getEducationYXMCQC()==null) || 
             (this.educationYXMCQC!=null &&
              this.educationYXMCQC.equals(other.getEducationYXMCQC()))) &&
            ((this.educationINSAT==null && other.getEducationINSAT()==null) || 
             (this.educationINSAT!=null &&
              this.educationINSAT.equals(other.getEducationINSAT()))) &&
            ((this.educationZTYE_XYX==null && other.getEducationZTYE_XYX()==null) || 
             (this.educationZTYE_XYX!=null &&
              this.educationZTYE_XYX.equals(other.getEducationZTYE_XYX()))) &&
            ((this.educationSXZY==null && other.getEducationSXZY()==null) || 
             (this.educationSXZY!=null &&
              this.educationSXZY.equals(other.getEducationSXZY()))) &&
            ((this.educationZYMC==null && other.getEducationZYMC()==null) || 
             (this.educationZYMC!=null &&
              this.educationZYMC.equals(other.getEducationZYMC()))) &&
            ((this.educationSFZGXL==null && other.getEducationSFZGXL()==null) || 
             (this.educationSFZGXL!=null &&
              this.educationSFZGXL.equals(other.getEducationSFZGXL()))) &&
            ((this.educationACAQM==null && other.getEducationACAQM()==null) || 
             (this.educationACAQM!=null &&
              this.educationACAQM.equals(other.getEducationACAQM()))) &&
            ((this.languageYZMC==null && other.getLanguageYZMC()==null) || 
             (this.languageYZMC!=null &&
              this.languageYZMC.equals(other.getLanguageYZMC()))) &&
            ((this.languageSPDJ==null && other.getLanguageSPDJ()==null) || 
             (this.languageSPDJ!=null &&
              this.languageSPDJ.equals(other.getLanguageSPDJ()))) &&
            ((this.aNSSA==null && other.getANSSA()==null) || 
             (this.aNSSA!=null &&
              this.aNSSA.equals(other.getANSSA()))) &&
            ((this.lOCAT==null && other.getLOCAT()==null) || 
             (this.lOCAT!=null &&
              this.lOCAT.equals(other.getLOCAT()))) &&
            ((this.pSTLZ==null && other.getPSTLZ()==null) || 
             (this.pSTLZ!=null &&
              this.pSTLZ.equals(other.getPSTLZ()))) &&
            ((this.zUSRID==null && other.getZUSRID()==null) || 
             (this.zUSRID!=null &&
              this.zUSRID.equals(other.getZUSRID()))) &&
            ((this.zTYE_LXR==null && other.getZTYE_LXR()==null) || 
             (this.zTYE_LXR!=null &&
              this.zTYE_LXR.equals(other.getZTYE_LXR()))) &&
            ((this.zTYE_LXRGX==null && other.getZTYE_LXRGX()==null) || 
             (this.zTYE_LXRGX!=null &&
              this.zTYE_LXRGX.equals(other.getZTYE_LXRGX()))) &&
            ((this.contactUSRTY==null && other.getContactUSRTY()==null) || 
             (this.contactUSRTY!=null &&
              this.contactUSRTY.equals(other.getContactUSRTY()))) &&
            ((this.contactUSRID==null && other.getContactUSRID()==null) || 
             (this.contactUSRID!=null &&
              this.contactUSRID.equals(other.getContactUSRID()))) &&
            ((this.workExperienceBEGDA==null && other.getWorkExperienceBEGDA()==null) || 
             (this.workExperienceBEGDA!=null &&
              this.workExperienceBEGDA.equals(other.getWorkExperienceBEGDA()))) &&
            ((this.workExperienceENDDA==null && other.getWorkExperienceENDDA()==null) || 
             (this.workExperienceENDDA!=null &&
              this.workExperienceENDDA.equals(other.getWorkExperienceENDDA()))) &&
            ((this.workExperienceVORAG==null && other.getWorkExperienceVORAG()==null) || 
             (this.workExperienceVORAG!=null &&
              this.workExperienceVORAG.equals(other.getWorkExperienceVORAG()))) &&
            ((this.workExperienceBRSCH==null && other.getWorkExperienceBRSCH()==null) || 
             (this.workExperienceBRSCH!=null &&
              this.workExperienceBRSCH.equals(other.getWorkExperienceBRSCH()))) &&
            ((this.workExperienceZTYE_BM==null && other.getWorkExperienceZTYE_BM()==null) || 
             (this.workExperienceZTYE_BM!=null &&
              this.workExperienceZTYE_BM.equals(other.getWorkExperienceZTYE_BM()))) &&
            ((this.workExperienceZTYE_BZXX==null && other.getWorkExperienceZTYE_BZXX()==null) || 
             (this.workExperienceZTYE_BZXX!=null &&
              this.workExperienceZTYE_BZXX.equals(other.getWorkExperienceZTYE_BZXX()))) &&
            ((this.workExperienceZTYE_GW==null && other.getWorkExperienceZTYE_GW()==null) || 
             (this.workExperienceZTYE_GW!=null &&
              this.workExperienceZTYE_GW.equals(other.getWorkExperienceZTYE_GW()))) &&
            ((this.aNSVH==null && other.getANSVH()==null) || 
             (this.aNSVH!=null &&
              this.aNSVH.equals(other.getANSVH()))) &&
            ((this.familyMembersFAMSA==null && other.getFamilyMembersFAMSA()==null) || 
             (this.familyMembersFAMSA!=null &&
              this.familyMembersFAMSA.equals(other.getFamilyMembersFAMSA()))) &&
            ((this.familyMembersPAD_NACHN==null && other.getFamilyMembersPAD_NACHN()==null) || 
             (this.familyMembersPAD_NACHN!=null &&
              this.familyMembersPAD_NACHN.equals(other.getFamilyMembersPAD_NACHN()))) &&
            ((this.familyMembersGBDAT==null && other.getFamilyMembersGBDAT()==null) || 
             (this.familyMembersGBDAT!=null &&
              this.familyMembersGBDAT.equals(other.getFamilyMembersGBDAT()))) &&
            ((this.familyMembersFANAT==null && other.getFamilyMembersFANAT()==null) || 
             (this.familyMembersFANAT!=null &&
              this.familyMembersFANAT.equals(other.getFamilyMembersFANAT()))) &&
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
            ((this.applyReason==null && other.getApplyReason()==null) || 
             (this.applyReason!=null &&
              this.applyReason.equals(other.getApplyReason()))) &&
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
        if (getPERNR() != null) {
            _hashCode += getPERNR().hashCode();
        }
        if (getMASSN() != null) {
            _hashCode += getMASSN().hashCode();
        }
        if (getMASSG() != null) {
            _hashCode += getMASSG().hashCode();
        }
        if (getEINDA() != null) {
            _hashCode += getEINDA().hashCode();
        }
        if (getNACHN() != null) {
            _hashCode += getNACHN().hashCode();
        }
        if (getGESCH() != null) {
            _hashCode += getGESCH().hashCode();
        }
        if (getGBDAT() != null) {
            _hashCode += getGBDAT().hashCode();
        }
        if (getNATIO() != null) {
            _hashCode += getNATIO().hashCode();
        }
        if (getFAMST() != null) {
            _hashCode += getFAMST().hashCode();
        }
        if (getWorkType() != null) {
            _hashCode += getWorkType().hashCode();
        }
        if (getPERSG() != null) {
            _hashCode += getPERSG().hashCode();
        }
        if (getPERSK() != null) {
            _hashCode += getPERSK().hashCode();
        }
        if (getWERKS() != null) {
            _hashCode += getWERKS().hashCode();
        }
        if (getBTRTL() != null) {
            _hashCode += getBTRTL().hashCode();
        }
        if (getABKRS() != null) {
            _hashCode += getABKRS().hashCode();
        }
        if (getPLANS() != null) {
            _hashCode += getPLANS().hashCode();
        }
        if (getPLANS_NAME() != null) {
            _hashCode += getPLANS_NAME().hashCode();
        }
        if (getICTYP() != null) {
            _hashCode += getICTYP().hashCode();
        }
        if (getICNUM() != null) {
            _hashCode += getICNUM().hashCode();
        }
        if (getZTYE_JG() != null) {
            _hashCode += getZTYE_JG().hashCode();
        }
        if (getPCN_RACKY() != null) {
            _hashCode += getPCN_RACKY().hashCode();
        }
        if (getEducationSLART() != null) {
            _hashCode += getEducationSLART().hashCode();
        }
        if (getEducationBEGDA() != null) {
            _hashCode += getEducationBEGDA().hashCode();
        }
        if (getEducationENDDA() != null) {
            _hashCode += getEducationENDDA().hashCode();
        }
        if (getEducationINSMO() != null) {
            _hashCode += getEducationINSMO().hashCode();
        }
        if (getEducationANZKL() != null) {
            _hashCode += getEducationANZKL().hashCode();
        }
        if (getEducationEINHT() != null) {
            _hashCode += getEducationEINHT().hashCode();
        }
        if (getEducationBYSJ() != null) {
            _hashCode += getEducationBYSJ().hashCode();
        }
        if (getEducationYXMC() != null) {
            _hashCode += getEducationYXMC().hashCode();
        }
        if (getEducationYXMCQC() != null) {
            _hashCode += getEducationYXMCQC().hashCode();
        }
        if (getEducationINSAT() != null) {
            _hashCode += getEducationINSAT().hashCode();
        }
        if (getEducationZTYE_XYX() != null) {
            _hashCode += getEducationZTYE_XYX().hashCode();
        }
        if (getEducationSXZY() != null) {
            _hashCode += getEducationSXZY().hashCode();
        }
        if (getEducationZYMC() != null) {
            _hashCode += getEducationZYMC().hashCode();
        }
        if (getEducationSFZGXL() != null) {
            _hashCode += getEducationSFZGXL().hashCode();
        }
        if (getEducationACAQM() != null) {
            _hashCode += getEducationACAQM().hashCode();
        }
        if (getLanguageYZMC() != null) {
            _hashCode += getLanguageYZMC().hashCode();
        }
        if (getLanguageSPDJ() != null) {
            _hashCode += getLanguageSPDJ().hashCode();
        }
        if (getANSSA() != null) {
            _hashCode += getANSSA().hashCode();
        }
        if (getLOCAT() != null) {
            _hashCode += getLOCAT().hashCode();
        }
        if (getPSTLZ() != null) {
            _hashCode += getPSTLZ().hashCode();
        }
        if (getZUSRID() != null) {
            _hashCode += getZUSRID().hashCode();
        }
        if (getZTYE_LXR() != null) {
            _hashCode += getZTYE_LXR().hashCode();
        }
        if (getZTYE_LXRGX() != null) {
            _hashCode += getZTYE_LXRGX().hashCode();
        }
        if (getContactUSRTY() != null) {
            _hashCode += getContactUSRTY().hashCode();
        }
        if (getContactUSRID() != null) {
            _hashCode += getContactUSRID().hashCode();
        }
        if (getWorkExperienceBEGDA() != null) {
            _hashCode += getWorkExperienceBEGDA().hashCode();
        }
        if (getWorkExperienceENDDA() != null) {
            _hashCode += getWorkExperienceENDDA().hashCode();
        }
        if (getWorkExperienceVORAG() != null) {
            _hashCode += getWorkExperienceVORAG().hashCode();
        }
        if (getWorkExperienceBRSCH() != null) {
            _hashCode += getWorkExperienceBRSCH().hashCode();
        }
        if (getWorkExperienceZTYE_BM() != null) {
            _hashCode += getWorkExperienceZTYE_BM().hashCode();
        }
        if (getWorkExperienceZTYE_BZXX() != null) {
            _hashCode += getWorkExperienceZTYE_BZXX().hashCode();
        }
        if (getWorkExperienceZTYE_GW() != null) {
            _hashCode += getWorkExperienceZTYE_GW().hashCode();
        }
        if (getANSVH() != null) {
            _hashCode += getANSVH().hashCode();
        }
        if (getFamilyMembersFAMSA() != null) {
            _hashCode += getFamilyMembersFAMSA().hashCode();
        }
        if (getFamilyMembersPAD_NACHN() != null) {
            _hashCode += getFamilyMembersPAD_NACHN().hashCode();
        }
        if (getFamilyMembersGBDAT() != null) {
            _hashCode += getFamilyMembersGBDAT().hashCode();
        }
        if (getFamilyMembersFANAT() != null) {
            _hashCode += getFamilyMembersFANAT().hashCode();
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
        if (getApplyReason() != null) {
            _hashCode += getApplyReason().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "namedSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "maskCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "logicalOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "keywordCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeywordConstraint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "autoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "NumericCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERNR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pERNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MASSN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "mASSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MASSG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "mASSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EINDA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "eINDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NACHN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "nACHN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GESCH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "gESCH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "gBDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NATIO");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "nATIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAMST");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "fAMST"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pERSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSK");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pERSK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "wERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BTRTL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "bTRTL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aBKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLANS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pLANS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLANS_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pLANS_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "iCTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "iCNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_JG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_JG"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCN_RACKY");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pCN_RACKY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationSLART");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationSLART"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationBEGDA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationBEGDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationENDDA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationENDDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationINSMO");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationINSMO"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationANZKL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationANZKL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationEINHT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationEINHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationBYSJ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationBYSJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationYXMC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationYXMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationYXMCQC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationYXMCQC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationINSAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationINSAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationZTYE_XYX");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationZTYE_XYX"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationSXZY");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationSXZY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationZYMC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationZYMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationSFZGXL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationSFZGXL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationACAQM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationACAQM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageYZMC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "languageYZMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageSPDJ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "languageSPDJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANSSA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aNSSA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "lOCAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSTLZ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pSTLZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZUSRID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zUSRID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_LXR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_LXR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_LXRGX");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_LXRGX"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactUSRTY");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "contactUSRTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactUSRID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "contactUSRID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workExperienceBEGDA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workExperienceBEGDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workExperienceENDDA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workExperienceENDDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workExperienceVORAG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workExperienceVORAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workExperienceBRSCH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workExperienceBRSCH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workExperienceZTYE_BM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workExperienceZTYE_BM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workExperienceZTYE_BZXX");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workExperienceZTYE_BZXX"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workExperienceZTYE_GW");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workExperienceZTYE_GW"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANSVH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aNSVH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyMembersFAMSA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "familyMembersFAMSA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyMembersPAD_NACHN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "familyMembersPAD_NACHN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyMembersGBDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "familyMembersGBDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyMembersFANAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "familyMembersFANAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aPCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APMEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aPMEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applyReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "createBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "updateBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "updateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleCLIENT_SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "serviceRelationshipsTupleCLIENT_SYSTEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleDISTUS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "serviceRelationshipsTupleDISTUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleDGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "serviceRelationshipsTupleDGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleRETURN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "serviceRelationshipsTupleRETURN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "operation"));
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
