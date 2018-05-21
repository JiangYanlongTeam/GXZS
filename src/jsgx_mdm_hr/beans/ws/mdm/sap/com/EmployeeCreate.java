/**
 * EmployeeCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EmployeeCreate  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String applyNumber;

    private java.lang.String pERNR;

    private java.lang.String nACHN;

    private java.lang.String pLANS;

    private java.lang.String pLANS_NAME;

    private java.lang.String iCNUM;

    private java.lang.String zTYE_JG;

    private java.lang.String lOCAT;

    private java.lang.String pSTLZ;

    private java.lang.String zUSRID;

    private java.lang.String zTYE_LXR;

    private java.lang.String zTYE_LXRGX;

    private java.lang.String aPMEM;

    private java.lang.String applicant;

    private java.lang.String applyReason;

    private java.lang.String updateBy;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentLookup mASSN;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonLookup mASSG;

    private java.util.Calendar eINDA;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderLookup gESCH;

    private java.util.Calendar gBDAT;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup nATIO;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusLookup fAMST;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeLookup workType;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupLookup pERSG;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupLookup pERSK;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaLookup wERKS;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasLookup bTRTL;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaLookup aBKRS;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeLookup iCTYP;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsLookup pCN_RACKY;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple[] education;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCompetenceTuple[] language;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeLookup aNSSA;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple[] contact;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.PreviousEmployerTuple[] workExperience;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolLookup aNSVH;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.FamilyMemberTuple[] familyMembers;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD;

    private java.util.Calendar applyDate;

    private java.util.Calendar applyTime;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationLookup operation;

    private beans.ws.mdm.sap.com.KeyMapping[] keyMapping;

    public EmployeeCreate() {
    }

    public EmployeeCreate(
           java.lang.String applyNumber,
           java.lang.String pERNR,
           java.lang.String nACHN,
           java.lang.String pLANS,
           java.lang.String pLANS_NAME,
           java.lang.String iCNUM,
           java.lang.String zTYE_JG,
           java.lang.String lOCAT,
           java.lang.String pSTLZ,
           java.lang.String zUSRID,
           java.lang.String zTYE_LXR,
           java.lang.String zTYE_LXRGX,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String applyReason,
           java.lang.String updateBy,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentLookup mASSN,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonLookup mASSG,
           java.util.Calendar eINDA,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderLookup gESCH,
           java.util.Calendar gBDAT,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup nATIO,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusLookup fAMST,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeLookup workType,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupLookup pERSG,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupLookup pERSK,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaLookup wERKS,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasLookup bTRTL,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaLookup aBKRS,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeLookup iCTYP,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsLookup pCN_RACKY,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple[] education,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCompetenceTuple[] language,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeLookup aNSSA,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple[] contact,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PreviousEmployerTuple[] workExperience,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolLookup aNSVH,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.FamilyMemberTuple[] familyMembers,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping) {
        this.applyNumber = applyNumber;
        this.pERNR = pERNR;
        this.nACHN = nACHN;
        this.pLANS = pLANS;
        this.pLANS_NAME = pLANS_NAME;
        this.iCNUM = iCNUM;
        this.zTYE_JG = zTYE_JG;
        this.lOCAT = lOCAT;
        this.pSTLZ = pSTLZ;
        this.zUSRID = zUSRID;
        this.zTYE_LXR = zTYE_LXR;
        this.zTYE_LXRGX = zTYE_LXRGX;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.applyReason = applyReason;
        this.updateBy = updateBy;
        this.mASSN = mASSN;
        this.mASSG = mASSG;
        this.eINDA = eINDA;
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
        this.iCTYP = iCTYP;
        this.pCN_RACKY = pCN_RACKY;
        this.education = education;
        this.language = language;
        this.aNSSA = aNSSA;
        this.contact = contact;
        this.workExperience = workExperience;
        this.aNSVH = aNSVH;
        this.familyMembers = familyMembers;
        this.aPCOD = aPCOD;
        this.applyDate = applyDate;
        this.applyTime = applyTime;
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
        this.operation = operation;
        this.keyMapping = keyMapping;
    }


    /**
     * Gets the applyNumber value for this EmployeeCreate.
     * 
     * @return applyNumber
     */
    public java.lang.String getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this EmployeeCreate.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(java.lang.String applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the pERNR value for this EmployeeCreate.
     * 
     * @return pERNR
     */
    public java.lang.String getPERNR() {
        return pERNR;
    }


    /**
     * Sets the pERNR value for this EmployeeCreate.
     * 
     * @param pERNR
     */
    public void setPERNR(java.lang.String pERNR) {
        this.pERNR = pERNR;
    }


    /**
     * Gets the nACHN value for this EmployeeCreate.
     * 
     * @return nACHN
     */
    public java.lang.String getNACHN() {
        return nACHN;
    }


    /**
     * Sets the nACHN value for this EmployeeCreate.
     * 
     * @param nACHN
     */
    public void setNACHN(java.lang.String nACHN) {
        this.nACHN = nACHN;
    }


    /**
     * Gets the pLANS value for this EmployeeCreate.
     * 
     * @return pLANS
     */
    public java.lang.String getPLANS() {
        return pLANS;
    }


    /**
     * Sets the pLANS value for this EmployeeCreate.
     * 
     * @param pLANS
     */
    public void setPLANS(java.lang.String pLANS) {
        this.pLANS = pLANS;
    }


    /**
     * Gets the pLANS_NAME value for this EmployeeCreate.
     * 
     * @return pLANS_NAME
     */
    public java.lang.String getPLANS_NAME() {
        return pLANS_NAME;
    }


    /**
     * Sets the pLANS_NAME value for this EmployeeCreate.
     * 
     * @param pLANS_NAME
     */
    public void setPLANS_NAME(java.lang.String pLANS_NAME) {
        this.pLANS_NAME = pLANS_NAME;
    }


    /**
     * Gets the iCNUM value for this EmployeeCreate.
     * 
     * @return iCNUM
     */
    public java.lang.String getICNUM() {
        return iCNUM;
    }


    /**
     * Sets the iCNUM value for this EmployeeCreate.
     * 
     * @param iCNUM
     */
    public void setICNUM(java.lang.String iCNUM) {
        this.iCNUM = iCNUM;
    }


    /**
     * Gets the zTYE_JG value for this EmployeeCreate.
     * 
     * @return zTYE_JG
     */
    public java.lang.String getZTYE_JG() {
        return zTYE_JG;
    }


    /**
     * Sets the zTYE_JG value for this EmployeeCreate.
     * 
     * @param zTYE_JG
     */
    public void setZTYE_JG(java.lang.String zTYE_JG) {
        this.zTYE_JG = zTYE_JG;
    }


    /**
     * Gets the lOCAT value for this EmployeeCreate.
     * 
     * @return lOCAT
     */
    public java.lang.String getLOCAT() {
        return lOCAT;
    }


    /**
     * Sets the lOCAT value for this EmployeeCreate.
     * 
     * @param lOCAT
     */
    public void setLOCAT(java.lang.String lOCAT) {
        this.lOCAT = lOCAT;
    }


    /**
     * Gets the pSTLZ value for this EmployeeCreate.
     * 
     * @return pSTLZ
     */
    public java.lang.String getPSTLZ() {
        return pSTLZ;
    }


    /**
     * Sets the pSTLZ value for this EmployeeCreate.
     * 
     * @param pSTLZ
     */
    public void setPSTLZ(java.lang.String pSTLZ) {
        this.pSTLZ = pSTLZ;
    }


    /**
     * Gets the zUSRID value for this EmployeeCreate.
     * 
     * @return zUSRID
     */
    public java.lang.String getZUSRID() {
        return zUSRID;
    }


    /**
     * Sets the zUSRID value for this EmployeeCreate.
     * 
     * @param zUSRID
     */
    public void setZUSRID(java.lang.String zUSRID) {
        this.zUSRID = zUSRID;
    }


    /**
     * Gets the zTYE_LXR value for this EmployeeCreate.
     * 
     * @return zTYE_LXR
     */
    public java.lang.String getZTYE_LXR() {
        return zTYE_LXR;
    }


    /**
     * Sets the zTYE_LXR value for this EmployeeCreate.
     * 
     * @param zTYE_LXR
     */
    public void setZTYE_LXR(java.lang.String zTYE_LXR) {
        this.zTYE_LXR = zTYE_LXR;
    }


    /**
     * Gets the zTYE_LXRGX value for this EmployeeCreate.
     * 
     * @return zTYE_LXRGX
     */
    public java.lang.String getZTYE_LXRGX() {
        return zTYE_LXRGX;
    }


    /**
     * Sets the zTYE_LXRGX value for this EmployeeCreate.
     * 
     * @param zTYE_LXRGX
     */
    public void setZTYE_LXRGX(java.lang.String zTYE_LXRGX) {
        this.zTYE_LXRGX = zTYE_LXRGX;
    }


    /**
     * Gets the aPMEM value for this EmployeeCreate.
     * 
     * @return aPMEM
     */
    public java.lang.String getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this EmployeeCreate.
     * 
     * @param aPMEM
     */
    public void setAPMEM(java.lang.String aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this EmployeeCreate.
     * 
     * @return applicant
     */
    public java.lang.String getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this EmployeeCreate.
     * 
     * @param applicant
     */
    public void setApplicant(java.lang.String applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the applyReason value for this EmployeeCreate.
     * 
     * @return applyReason
     */
    public java.lang.String getApplyReason() {
        return applyReason;
    }


    /**
     * Sets the applyReason value for this EmployeeCreate.
     * 
     * @param applyReason
     */
    public void setApplyReason(java.lang.String applyReason) {
        this.applyReason = applyReason;
    }


    /**
     * Gets the updateBy value for this EmployeeCreate.
     * 
     * @return updateBy
     */
    public java.lang.String getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this EmployeeCreate.
     * 
     * @param updateBy
     */
    public void setUpdateBy(java.lang.String updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the mASSN value for this EmployeeCreate.
     * 
     * @return mASSN
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentLookup getMASSN() {
        return mASSN;
    }


    /**
     * Sets the mASSN value for this EmployeeCreate.
     * 
     * @param mASSN
     */
    public void setMASSN(jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentLookup mASSN) {
        this.mASSN = mASSN;
    }


    /**
     * Gets the mASSG value for this EmployeeCreate.
     * 
     * @return mASSG
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonLookup getMASSG() {
        return mASSG;
    }


    /**
     * Sets the mASSG value for this EmployeeCreate.
     * 
     * @param mASSG
     */
    public void setMASSG(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonLookup mASSG) {
        this.mASSG = mASSG;
    }


    /**
     * Gets the eINDA value for this EmployeeCreate.
     * 
     * @return eINDA
     */
    public java.util.Calendar getEINDA() {
        return eINDA;
    }


    /**
     * Sets the eINDA value for this EmployeeCreate.
     * 
     * @param eINDA
     */
    public void setEINDA(java.util.Calendar eINDA) {
        this.eINDA = eINDA;
    }


    /**
     * Gets the gESCH value for this EmployeeCreate.
     * 
     * @return gESCH
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderLookup getGESCH() {
        return gESCH;
    }


    /**
     * Sets the gESCH value for this EmployeeCreate.
     * 
     * @param gESCH
     */
    public void setGESCH(jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderLookup gESCH) {
        this.gESCH = gESCH;
    }


    /**
     * Gets the gBDAT value for this EmployeeCreate.
     * 
     * @return gBDAT
     */
    public java.util.Calendar getGBDAT() {
        return gBDAT;
    }


    /**
     * Sets the gBDAT value for this EmployeeCreate.
     * 
     * @param gBDAT
     */
    public void setGBDAT(java.util.Calendar gBDAT) {
        this.gBDAT = gBDAT;
    }


    /**
     * Gets the nATIO value for this EmployeeCreate.
     * 
     * @return nATIO
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup getNATIO() {
        return nATIO;
    }


    /**
     * Sets the nATIO value for this EmployeeCreate.
     * 
     * @param nATIO
     */
    public void setNATIO(jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup nATIO) {
        this.nATIO = nATIO;
    }


    /**
     * Gets the fAMST value for this EmployeeCreate.
     * 
     * @return fAMST
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusLookup getFAMST() {
        return fAMST;
    }


    /**
     * Sets the fAMST value for this EmployeeCreate.
     * 
     * @param fAMST
     */
    public void setFAMST(jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusLookup fAMST) {
        this.fAMST = fAMST;
    }


    /**
     * Gets the workType value for this EmployeeCreate.
     * 
     * @return workType
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeLookup getWorkType() {
        return workType;
    }


    /**
     * Sets the workType value for this EmployeeCreate.
     * 
     * @param workType
     */
    public void setWorkType(jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeLookup workType) {
        this.workType = workType;
    }


    /**
     * Gets the pERSG value for this EmployeeCreate.
     * 
     * @return pERSG
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupLookup getPERSG() {
        return pERSG;
    }


    /**
     * Sets the pERSG value for this EmployeeCreate.
     * 
     * @param pERSG
     */
    public void setPERSG(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupLookup pERSG) {
        this.pERSG = pERSG;
    }


    /**
     * Gets the pERSK value for this EmployeeCreate.
     * 
     * @return pERSK
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupLookup getPERSK() {
        return pERSK;
    }


    /**
     * Sets the pERSK value for this EmployeeCreate.
     * 
     * @param pERSK
     */
    public void setPERSK(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupLookup pERSK) {
        this.pERSK = pERSK;
    }


    /**
     * Gets the wERKS value for this EmployeeCreate.
     * 
     * @return wERKS
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaLookup getWERKS() {
        return wERKS;
    }


    /**
     * Sets the wERKS value for this EmployeeCreate.
     * 
     * @param wERKS
     */
    public void setWERKS(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaLookup wERKS) {
        this.wERKS = wERKS;
    }


    /**
     * Gets the bTRTL value for this EmployeeCreate.
     * 
     * @return bTRTL
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasLookup getBTRTL() {
        return bTRTL;
    }


    /**
     * Sets the bTRTL value for this EmployeeCreate.
     * 
     * @param bTRTL
     */
    public void setBTRTL(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasLookup bTRTL) {
        this.bTRTL = bTRTL;
    }


    /**
     * Gets the aBKRS value for this EmployeeCreate.
     * 
     * @return aBKRS
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaLookup getABKRS() {
        return aBKRS;
    }


    /**
     * Sets the aBKRS value for this EmployeeCreate.
     * 
     * @param aBKRS
     */
    public void setABKRS(jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaLookup aBKRS) {
        this.aBKRS = aBKRS;
    }


    /**
     * Gets the iCTYP value for this EmployeeCreate.
     * 
     * @return iCTYP
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeLookup getICTYP() {
        return iCTYP;
    }


    /**
     * Sets the iCTYP value for this EmployeeCreate.
     * 
     * @param iCTYP
     */
    public void setICTYP(jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeLookup iCTYP) {
        this.iCTYP = iCTYP;
    }


    /**
     * Gets the pCN_RACKY value for this EmployeeCreate.
     * 
     * @return pCN_RACKY
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsLookup getPCN_RACKY() {
        return pCN_RACKY;
    }


    /**
     * Sets the pCN_RACKY value for this EmployeeCreate.
     * 
     * @param pCN_RACKY
     */
    public void setPCN_RACKY(jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsLookup pCN_RACKY) {
        this.pCN_RACKY = pCN_RACKY;
    }


    /**
     * Gets the education value for this EmployeeCreate.
     * 
     * @return education
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple[] getEducation() {
        return education;
    }


    /**
     * Sets the education value for this EmployeeCreate.
     * 
     * @param education
     */
    public void setEducation(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple[] education) {
        this.education = education;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple getEducation(int i) {
        return this.education[i];
    }

    public void setEducation(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple _value) {
        this.education[i] = _value;
    }


    /**
     * Gets the language value for this EmployeeCreate.
     * 
     * @return language
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCompetenceTuple[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this EmployeeCreate.
     * 
     * @param language
     */
    public void setLanguage(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCompetenceTuple[] language) {
        this.language = language;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCompetenceTuple getLanguage(int i) {
        return this.language[i];
    }

    public void setLanguage(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCompetenceTuple _value) {
        this.language[i] = _value;
    }


    /**
     * Gets the aNSSA value for this EmployeeCreate.
     * 
     * @return aNSSA
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeLookup getANSSA() {
        return aNSSA;
    }


    /**
     * Sets the aNSSA value for this EmployeeCreate.
     * 
     * @param aNSSA
     */
    public void setANSSA(jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeLookup aNSSA) {
        this.aNSSA = aNSSA;
    }


    /**
     * Gets the contact value for this EmployeeCreate.
     * 
     * @return contact
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this EmployeeCreate.
     * 
     * @param contact
     */
    public void setContact(jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple[] contact) {
        this.contact = contact;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple getContact(int i) {
        return this.contact[i];
    }

    public void setContact(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple _value) {
        this.contact[i] = _value;
    }


    /**
     * Gets the workExperience value for this EmployeeCreate.
     * 
     * @return workExperience
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PreviousEmployerTuple[] getWorkExperience() {
        return workExperience;
    }


    /**
     * Sets the workExperience value for this EmployeeCreate.
     * 
     * @param workExperience
     */
    public void setWorkExperience(jsgx_mdm_hr.beans.ws.mdm.sap.com.PreviousEmployerTuple[] workExperience) {
        this.workExperience = workExperience;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PreviousEmployerTuple getWorkExperience(int i) {
        return this.workExperience[i];
    }

    public void setWorkExperience(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.PreviousEmployerTuple _value) {
        this.workExperience[i] = _value;
    }


    /**
     * Gets the aNSVH value for this EmployeeCreate.
     * 
     * @return aNSVH
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolLookup getANSVH() {
        return aNSVH;
    }


    /**
     * Sets the aNSVH value for this EmployeeCreate.
     * 
     * @param aNSVH
     */
    public void setANSVH(jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolLookup aNSVH) {
        this.aNSVH = aNSVH;
    }


    /**
     * Gets the familyMembers value for this EmployeeCreate.
     * 
     * @return familyMembers
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.FamilyMemberTuple[] getFamilyMembers() {
        return familyMembers;
    }


    /**
     * Sets the familyMembers value for this EmployeeCreate.
     * 
     * @param familyMembers
     */
    public void setFamilyMembers(jsgx_mdm_hr.beans.ws.mdm.sap.com.FamilyMemberTuple[] familyMembers) {
        this.familyMembers = familyMembers;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.FamilyMemberTuple getFamilyMembers(int i) {
        return this.familyMembers[i];
    }

    public void setFamilyMembers(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.FamilyMemberTuple _value) {
        this.familyMembers[i] = _value;
    }


    /**
     * Gets the aPCOD value for this EmployeeCreate.
     * 
     * @return aPCOD
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusLookup getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this EmployeeCreate.
     * 
     * @param aPCOD
     */
    public void setAPCOD(jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the applyDate value for this EmployeeCreate.
     * 
     * @return applyDate
     */
    public java.util.Calendar getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this EmployeeCreate.
     * 
     * @param applyDate
     */
    public void setApplyDate(java.util.Calendar applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this EmployeeCreate.
     * 
     * @return applyTime
     */
    public java.util.Calendar getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this EmployeeCreate.
     * 
     * @param applyTime
     */
    public void setApplyTime(java.util.Calendar applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the serviceRelationshipsTuple value for this EmployeeCreate.
     * 
     * @return serviceRelationshipsTuple
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] getServiceRelationshipsTuple() {
        return serviceRelationshipsTuple;
    }


    /**
     * Sets the serviceRelationshipsTuple value for this EmployeeCreate.
     * 
     * @param serviceRelationshipsTuple
     */
    public void setServiceRelationshipsTuple(jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple) {
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple getServiceRelationshipsTuple(int i) {
        return this.serviceRelationshipsTuple[i];
    }

    public void setServiceRelationshipsTuple(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple _value) {
        this.serviceRelationshipsTuple[i] = _value;
    }


    /**
     * Gets the operation value for this EmployeeCreate.
     * 
     * @return operation
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationLookup getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this EmployeeCreate.
     * 
     * @param operation
     */
    public void setOperation(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationLookup operation) {
        this.operation = operation;
    }


    /**
     * Gets the keyMapping value for this EmployeeCreate.
     * 
     * @return keyMapping
     */
    public beans.ws.mdm.sap.com.KeyMapping[] getKeyMapping() {
        return keyMapping;
    }


    /**
     * Sets the keyMapping value for this EmployeeCreate.
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
        if (!(obj instanceof EmployeeCreate)) return false;
        EmployeeCreate other = (EmployeeCreate) obj;
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
            ((this.pERNR==null && other.getPERNR()==null) || 
             (this.pERNR!=null &&
              this.pERNR.equals(other.getPERNR()))) &&
            ((this.nACHN==null && other.getNACHN()==null) || 
             (this.nACHN!=null &&
              this.nACHN.equals(other.getNACHN()))) &&
            ((this.pLANS==null && other.getPLANS()==null) || 
             (this.pLANS!=null &&
              this.pLANS.equals(other.getPLANS()))) &&
            ((this.pLANS_NAME==null && other.getPLANS_NAME()==null) || 
             (this.pLANS_NAME!=null &&
              this.pLANS_NAME.equals(other.getPLANS_NAME()))) &&
            ((this.iCNUM==null && other.getICNUM()==null) || 
             (this.iCNUM!=null &&
              this.iCNUM.equals(other.getICNUM()))) &&
            ((this.zTYE_JG==null && other.getZTYE_JG()==null) || 
             (this.zTYE_JG!=null &&
              this.zTYE_JG.equals(other.getZTYE_JG()))) &&
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
            ((this.aPMEM==null && other.getAPMEM()==null) || 
             (this.aPMEM!=null &&
              this.aPMEM.equals(other.getAPMEM()))) &&
            ((this.applicant==null && other.getApplicant()==null) || 
             (this.applicant!=null &&
              this.applicant.equals(other.getApplicant()))) &&
            ((this.applyReason==null && other.getApplyReason()==null) || 
             (this.applyReason!=null &&
              this.applyReason.equals(other.getApplyReason()))) &&
            ((this.updateBy==null && other.getUpdateBy()==null) || 
             (this.updateBy!=null &&
              this.updateBy.equals(other.getUpdateBy()))) &&
            ((this.mASSN==null && other.getMASSN()==null) || 
             (this.mASSN!=null &&
              this.mASSN.equals(other.getMASSN()))) &&
            ((this.mASSG==null && other.getMASSG()==null) || 
             (this.mASSG!=null &&
              this.mASSG.equals(other.getMASSG()))) &&
            ((this.eINDA==null && other.getEINDA()==null) || 
             (this.eINDA!=null &&
              this.eINDA.equals(other.getEINDA()))) &&
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
            ((this.iCTYP==null && other.getICTYP()==null) || 
             (this.iCTYP!=null &&
              this.iCTYP.equals(other.getICTYP()))) &&
            ((this.pCN_RACKY==null && other.getPCN_RACKY()==null) || 
             (this.pCN_RACKY!=null &&
              this.pCN_RACKY.equals(other.getPCN_RACKY()))) &&
            ((this.education==null && other.getEducation()==null) || 
             (this.education!=null &&
              java.util.Arrays.equals(this.education, other.getEducation()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.aNSSA==null && other.getANSSA()==null) || 
             (this.aNSSA!=null &&
              this.aNSSA.equals(other.getANSSA()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.workExperience==null && other.getWorkExperience()==null) || 
             (this.workExperience!=null &&
              java.util.Arrays.equals(this.workExperience, other.getWorkExperience()))) &&
            ((this.aNSVH==null && other.getANSVH()==null) || 
             (this.aNSVH!=null &&
              this.aNSVH.equals(other.getANSVH()))) &&
            ((this.familyMembers==null && other.getFamilyMembers()==null) || 
             (this.familyMembers!=null &&
              java.util.Arrays.equals(this.familyMembers, other.getFamilyMembers()))) &&
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
        if (getPERNR() != null) {
            _hashCode += getPERNR().hashCode();
        }
        if (getNACHN() != null) {
            _hashCode += getNACHN().hashCode();
        }
        if (getPLANS() != null) {
            _hashCode += getPLANS().hashCode();
        }
        if (getPLANS_NAME() != null) {
            _hashCode += getPLANS_NAME().hashCode();
        }
        if (getICNUM() != null) {
            _hashCode += getICNUM().hashCode();
        }
        if (getZTYE_JG() != null) {
            _hashCode += getZTYE_JG().hashCode();
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
        if (getAPMEM() != null) {
            _hashCode += getAPMEM().hashCode();
        }
        if (getApplicant() != null) {
            _hashCode += getApplicant().hashCode();
        }
        if (getApplyReason() != null) {
            _hashCode += getApplyReason().hashCode();
        }
        if (getUpdateBy() != null) {
            _hashCode += getUpdateBy().hashCode();
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
        if (getICTYP() != null) {
            _hashCode += getICTYP().hashCode();
        }
        if (getPCN_RACKY() != null) {
            _hashCode += getPCN_RACKY().hashCode();
        }
        if (getEducation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEducation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEducation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getANSSA() != null) {
            _hashCode += getANSSA().hashCode();
        }
        if (getContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContact(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkExperience() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkExperience());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkExperience(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getANSVH() != null) {
            _hashCode += getANSVH().hashCode();
        }
        if (getFamilyMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFamilyMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFamilyMembers(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERNR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pERNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NACHN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "nACHN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLANS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pLANS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLANS_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pLANS_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "iCNUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_JG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_JG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "lOCAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PSTLZ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pSTLZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZUSRID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zUSRID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_LXR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_LXR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_LXRGX");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_LXRGX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APMEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aPMEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applyReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "updateBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MASSN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "mASSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MASSG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "mASSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EINDA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "eINDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GESCH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "gESCH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GBDAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "gBDAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NATIO");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "nATIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAMST");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "fAMST"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pERSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERSK");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pERSK"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WERKS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "wERKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BTRTL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "bTRTL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ABKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aBKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "iCTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCN_RACKY");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pCN_RACKY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("education");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "education"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageCompetenceTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANSSA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aNSSA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactInfoTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workExperience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "workExperience"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PreviousEmployerTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANSVH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aNSVH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "familyMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "FamilyMemberTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aPCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "applyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTuple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "serviceRelationshipsTuple"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsTupleTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "keyMapping"));
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
