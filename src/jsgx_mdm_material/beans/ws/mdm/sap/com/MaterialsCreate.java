/**
 * MaterialsCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_material.beans.ws.mdm.sap.com;

public class MaterialsCreate  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String applyNumber;

    private java.lang.String mATNR;

    private java.lang.String mAKTX;

    private java.lang.String _char;

    private java.lang.String char1;

    private java.lang.String char2;

    private java.lang.String char3;

    private java.lang.String char4;

    private java.lang.String char5;

    private java.lang.String char6;

    private java.lang.String char7;

    private java.lang.String char8;

    private java.lang.String char9;

    private java.lang.String char10;

    private java.lang.String char11;

    private java.lang.Boolean lVOMA;

    private java.lang.String aPMEM;

    private java.lang.String applicant;

    private java.lang.String updateBy;

    private jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Lookup mATKL;

    private jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Lookup mEINS;

    private jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorLookup mBRSH;

    private jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeLookup mTART;

    private jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupLookup sPART;

    private jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD;

    private java.util.Calendar applyDate;

    private java.util.Calendar applyTime;

    private jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Lookup mTPOS;

    private jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple;

    private jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup operation;

    private beans.ws.mdm.sap.com.KeyMapping[] keyMapping;

    public MaterialsCreate() {
    }

    public MaterialsCreate(
           java.lang.String applyNumber,
           java.lang.String mATNR,
           java.lang.String mAKTX,
           java.lang.String _char,
           java.lang.String char1,
           java.lang.String char2,
           java.lang.String char3,
           java.lang.String char4,
           java.lang.String char5,
           java.lang.String char6,
           java.lang.String char7,
           java.lang.String char8,
           java.lang.String char9,
           java.lang.String char10,
           java.lang.String char11,
           java.lang.Boolean lVOMA,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String updateBy,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Lookup mATKL,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Lookup mEINS,
           jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorLookup mBRSH,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeLookup mTART,
           jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupLookup sPART,
           jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Lookup mTPOS,
           jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping) {
        this.applyNumber = applyNumber;
        this.mATNR = mATNR;
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
        this.lVOMA = lVOMA;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.updateBy = updateBy;
        this.mATKL = mATKL;
        this.mEINS = mEINS;
        this.mBRSH = mBRSH;
        this.mTART = mTART;
        this.sPART = sPART;
        this.aPCOD = aPCOD;
        this.applyDate = applyDate;
        this.applyTime = applyTime;
        this.mTPOS = mTPOS;
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
        this.operation = operation;
        this.keyMapping = keyMapping;
    }


    /**
     * Gets the applyNumber value for this MaterialsCreate.
     * 
     * @return applyNumber
     */
    public java.lang.String getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this MaterialsCreate.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(java.lang.String applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the mATNR value for this MaterialsCreate.
     * 
     * @return mATNR
     */
    public java.lang.String getMATNR() {
        return mATNR;
    }


    /**
     * Sets the mATNR value for this MaterialsCreate.
     * 
     * @param mATNR
     */
    public void setMATNR(java.lang.String mATNR) {
        this.mATNR = mATNR;
    }


    /**
     * Gets the mAKTX value for this MaterialsCreate.
     * 
     * @return mAKTX
     */
    public java.lang.String getMAKTX() {
        return mAKTX;
    }


    /**
     * Sets the mAKTX value for this MaterialsCreate.
     * 
     * @param mAKTX
     */
    public void setMAKTX(java.lang.String mAKTX) {
        this.mAKTX = mAKTX;
    }


    /**
     * Gets the _char value for this MaterialsCreate.
     * 
     * @return _char
     */
    public java.lang.String get_char() {
        return _char;
    }


    /**
     * Sets the _char value for this MaterialsCreate.
     * 
     * @param _char
     */
    public void set_char(java.lang.String _char) {
        this._char = _char;
    }


    /**
     * Gets the char1 value for this MaterialsCreate.
     * 
     * @return char1
     */
    public java.lang.String getChar1() {
        return char1;
    }


    /**
     * Sets the char1 value for this MaterialsCreate.
     * 
     * @param char1
     */
    public void setChar1(java.lang.String char1) {
        this.char1 = char1;
    }


    /**
     * Gets the char2 value for this MaterialsCreate.
     * 
     * @return char2
     */
    public java.lang.String getChar2() {
        return char2;
    }


    /**
     * Sets the char2 value for this MaterialsCreate.
     * 
     * @param char2
     */
    public void setChar2(java.lang.String char2) {
        this.char2 = char2;
    }


    /**
     * Gets the char3 value for this MaterialsCreate.
     * 
     * @return char3
     */
    public java.lang.String getChar3() {
        return char3;
    }


    /**
     * Sets the char3 value for this MaterialsCreate.
     * 
     * @param char3
     */
    public void setChar3(java.lang.String char3) {
        this.char3 = char3;
    }


    /**
     * Gets the char4 value for this MaterialsCreate.
     * 
     * @return char4
     */
    public java.lang.String getChar4() {
        return char4;
    }


    /**
     * Sets the char4 value for this MaterialsCreate.
     * 
     * @param char4
     */
    public void setChar4(java.lang.String char4) {
        this.char4 = char4;
    }


    /**
     * Gets the char5 value for this MaterialsCreate.
     * 
     * @return char5
     */
    public java.lang.String getChar5() {
        return char5;
    }


    /**
     * Sets the char5 value for this MaterialsCreate.
     * 
     * @param char5
     */
    public void setChar5(java.lang.String char5) {
        this.char5 = char5;
    }


    /**
     * Gets the char6 value for this MaterialsCreate.
     * 
     * @return char6
     */
    public java.lang.String getChar6() {
        return char6;
    }


    /**
     * Sets the char6 value for this MaterialsCreate.
     * 
     * @param char6
     */
    public void setChar6(java.lang.String char6) {
        this.char6 = char6;
    }


    /**
     * Gets the char7 value for this MaterialsCreate.
     * 
     * @return char7
     */
    public java.lang.String getChar7() {
        return char7;
    }


    /**
     * Sets the char7 value for this MaterialsCreate.
     * 
     * @param char7
     */
    public void setChar7(java.lang.String char7) {
        this.char7 = char7;
    }


    /**
     * Gets the char8 value for this MaterialsCreate.
     * 
     * @return char8
     */
    public java.lang.String getChar8() {
        return char8;
    }


    /**
     * Sets the char8 value for this MaterialsCreate.
     * 
     * @param char8
     */
    public void setChar8(java.lang.String char8) {
        this.char8 = char8;
    }


    /**
     * Gets the char9 value for this MaterialsCreate.
     * 
     * @return char9
     */
    public java.lang.String getChar9() {
        return char9;
    }


    /**
     * Sets the char9 value for this MaterialsCreate.
     * 
     * @param char9
     */
    public void setChar9(java.lang.String char9) {
        this.char9 = char9;
    }


    /**
     * Gets the char10 value for this MaterialsCreate.
     * 
     * @return char10
     */
    public java.lang.String getChar10() {
        return char10;
    }


    /**
     * Sets the char10 value for this MaterialsCreate.
     * 
     * @param char10
     */
    public void setChar10(java.lang.String char10) {
        this.char10 = char10;
    }


    /**
     * Gets the char11 value for this MaterialsCreate.
     * 
     * @return char11
     */
    public java.lang.String getChar11() {
        return char11;
    }


    /**
     * Sets the char11 value for this MaterialsCreate.
     * 
     * @param char11
     */
    public void setChar11(java.lang.String char11) {
        this.char11 = char11;
    }


    /**
     * Gets the lVOMA value for this MaterialsCreate.
     * 
     * @return lVOMA
     */
    public java.lang.Boolean getLVOMA() {
        return lVOMA;
    }


    /**
     * Sets the lVOMA value for this MaterialsCreate.
     * 
     * @param lVOMA
     */
    public void setLVOMA(java.lang.Boolean lVOMA) {
        this.lVOMA = lVOMA;
    }


    /**
     * Gets the aPMEM value for this MaterialsCreate.
     * 
     * @return aPMEM
     */
    public java.lang.String getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this MaterialsCreate.
     * 
     * @param aPMEM
     */
    public void setAPMEM(java.lang.String aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this MaterialsCreate.
     * 
     * @return applicant
     */
    public java.lang.String getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this MaterialsCreate.
     * 
     * @param applicant
     */
    public void setApplicant(java.lang.String applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the updateBy value for this MaterialsCreate.
     * 
     * @return updateBy
     */
    public java.lang.String getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this MaterialsCreate.
     * 
     * @param updateBy
     */
    public void setUpdateBy(java.lang.String updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the mATKL value for this MaterialsCreate.
     * 
     * @return mATKL
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Lookup getMATKL() {
        return mATKL;
    }


    /**
     * Sets the mATKL value for this MaterialsCreate.
     * 
     * @param mATKL
     */
    public void setMATKL(jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Lookup mATKL) {
        this.mATKL = mATKL;
    }


    /**
     * Gets the mEINS value for this MaterialsCreate.
     * 
     * @return mEINS
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Lookup getMEINS() {
        return mEINS;
    }


    /**
     * Sets the mEINS value for this MaterialsCreate.
     * 
     * @param mEINS
     */
    public void setMEINS(jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Lookup mEINS) {
        this.mEINS = mEINS;
    }


    /**
     * Gets the mBRSH value for this MaterialsCreate.
     * 
     * @return mBRSH
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorLookup getMBRSH() {
        return mBRSH;
    }


    /**
     * Sets the mBRSH value for this MaterialsCreate.
     * 
     * @param mBRSH
     */
    public void setMBRSH(jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorLookup mBRSH) {
        this.mBRSH = mBRSH;
    }


    /**
     * Gets the mTART value for this MaterialsCreate.
     * 
     * @return mTART
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeLookup getMTART() {
        return mTART;
    }


    /**
     * Sets the mTART value for this MaterialsCreate.
     * 
     * @param mTART
     */
    public void setMTART(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeLookup mTART) {
        this.mTART = mTART;
    }


    /**
     * Gets the sPART value for this MaterialsCreate.
     * 
     * @return sPART
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupLookup getSPART() {
        return sPART;
    }


    /**
     * Sets the sPART value for this MaterialsCreate.
     * 
     * @param sPART
     */
    public void setSPART(jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupLookup sPART) {
        this.sPART = sPART;
    }


    /**
     * Gets the aPCOD value for this MaterialsCreate.
     * 
     * @return aPCOD
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this MaterialsCreate.
     * 
     * @param aPCOD
     */
    public void setAPCOD(jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the applyDate value for this MaterialsCreate.
     * 
     * @return applyDate
     */
    public java.util.Calendar getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this MaterialsCreate.
     * 
     * @param applyDate
     */
    public void setApplyDate(java.util.Calendar applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this MaterialsCreate.
     * 
     * @return applyTime
     */
    public java.util.Calendar getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this MaterialsCreate.
     * 
     * @param applyTime
     */
    public void setApplyTime(java.util.Calendar applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the mTPOS value for this MaterialsCreate.
     * 
     * @return mTPOS
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Lookup getMTPOS() {
        return mTPOS;
    }


    /**
     * Sets the mTPOS value for this MaterialsCreate.
     * 
     * @param mTPOS
     */
    public void setMTPOS(jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Lookup mTPOS) {
        this.mTPOS = mTPOS;
    }


    /**
     * Gets the serviceRelationshipsTuple value for this MaterialsCreate.
     * 
     * @return serviceRelationshipsTuple
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] getServiceRelationshipsTuple() {
        return serviceRelationshipsTuple;
    }


    /**
     * Sets the serviceRelationshipsTuple value for this MaterialsCreate.
     * 
     * @param serviceRelationshipsTuple
     */
    public void setServiceRelationshipsTuple(jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple) {
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple getServiceRelationshipsTuple(int i) {
        return this.serviceRelationshipsTuple[i];
    }

    public void setServiceRelationshipsTuple(int i, jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple _value) {
        this.serviceRelationshipsTuple[i] = _value;
    }


    /**
     * Gets the operation value for this MaterialsCreate.
     * 
     * @return operation
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this MaterialsCreate.
     * 
     * @param operation
     */
    public void setOperation(jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup operation) {
        this.operation = operation;
    }


    /**
     * Gets the keyMapping value for this MaterialsCreate.
     * 
     * @return keyMapping
     */
    public beans.ws.mdm.sap.com.KeyMapping[] getKeyMapping() {
        return keyMapping;
    }


    /**
     * Sets the keyMapping value for this MaterialsCreate.
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
        if (!(obj instanceof MaterialsCreate)) return false;
        MaterialsCreate other = (MaterialsCreate) obj;
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
            ((this.mATNR==null && other.getMATNR()==null) || 
             (this.mATNR!=null &&
              this.mATNR.equals(other.getMATNR()))) &&
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
            ((this.lVOMA==null && other.getLVOMA()==null) || 
             (this.lVOMA!=null &&
              this.lVOMA.equals(other.getLVOMA()))) &&
            ((this.aPMEM==null && other.getAPMEM()==null) || 
             (this.aPMEM!=null &&
              this.aPMEM.equals(other.getAPMEM()))) &&
            ((this.applicant==null && other.getApplicant()==null) || 
             (this.applicant!=null &&
              this.applicant.equals(other.getApplicant()))) &&
            ((this.updateBy==null && other.getUpdateBy()==null) || 
             (this.updateBy!=null &&
              this.updateBy.equals(other.getUpdateBy()))) &&
            ((this.mATKL==null && other.getMATKL()==null) || 
             (this.mATKL!=null &&
              this.mATKL.equals(other.getMATKL()))) &&
            ((this.mEINS==null && other.getMEINS()==null) || 
             (this.mEINS!=null &&
              this.mEINS.equals(other.getMEINS()))) &&
            ((this.mBRSH==null && other.getMBRSH()==null) || 
             (this.mBRSH!=null &&
              this.mBRSH.equals(other.getMBRSH()))) &&
            ((this.mTART==null && other.getMTART()==null) || 
             (this.mTART!=null &&
              this.mTART.equals(other.getMTART()))) &&
            ((this.sPART==null && other.getSPART()==null) || 
             (this.sPART!=null &&
              this.sPART.equals(other.getSPART()))) &&
            ((this.aPCOD==null && other.getAPCOD()==null) || 
             (this.aPCOD!=null &&
              this.aPCOD.equals(other.getAPCOD()))) &&
            ((this.applyDate==null && other.getApplyDate()==null) || 
             (this.applyDate!=null &&
              this.applyDate.equals(other.getApplyDate()))) &&
            ((this.applyTime==null && other.getApplyTime()==null) || 
             (this.applyTime!=null &&
              this.applyTime.equals(other.getApplyTime()))) &&
            ((this.mTPOS==null && other.getMTPOS()==null) || 
             (this.mTPOS!=null &&
              this.mTPOS.equals(other.getMTPOS()))) &&
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
        if (getMATNR() != null) {
            _hashCode += getMATNR().hashCode();
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
        if (getLVOMA() != null) {
            _hashCode += getLVOMA().hashCode();
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
        if (getMATKL() != null) {
            _hashCode += getMATKL().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
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
        if (getAPCOD() != null) {
            _hashCode += getAPCOD().hashCode();
        }
        if (getApplyDate() != null) {
            _hashCode += getApplyDate().hashCode();
        }
        if (getApplyTime() != null) {
            _hashCode += getApplyTime().hashCode();
        }
        if (getMTPOS() != null) {
            _hashCode += getMTPOS().hashCode();
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
        new org.apache.axis.description.TypeDesc(MaterialsCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATNR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mATNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAKTX");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mAKTX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_char");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char6");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char7");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char8");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char9");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char10");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("char11");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "char11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LVOMA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "lVOMA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APMEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "aPMEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "updateBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MATKL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mATKL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__Lookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEINS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mEINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__Lookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MBRSH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mBRSH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTART");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mTART"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPART");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "sPART"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "aPCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "applyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "applyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mTPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__Lookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTuple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "serviceRelationshipsTuple"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ServiceRelationshipsTupleTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "keyMapping"));
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
