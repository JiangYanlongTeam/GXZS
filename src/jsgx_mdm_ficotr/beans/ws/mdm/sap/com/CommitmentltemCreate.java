/**
 * CommitmentltemCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class CommitmentltemCreate  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String applyNumber;

    private java.lang.String fIKRS;

    private java.lang.String fIPOS;

    private java.lang.String bEZEICH;

    private java.lang.String bESCHR;

    private java.lang.Boolean cOMCAT;

    private java.lang.Boolean sTATS;

    private java.lang.Boolean lVOMA;

    private java.lang.String aPMEM;

    private java.lang.String applicant;

    private java.lang.String applyReason;

    private java.lang.String updateBy;

    private java.lang.Boolean dATAC;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionLookup fIVOR;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryLookup kNZAEPO;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemLookup fICPOS;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD;

    private java.util.Calendar applyDate;

    private java.util.Calendar applyTime;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup operation;

    private beans.ws.mdm.sap.com.KeyMapping[] keyMapping;

    public CommitmentltemCreate() {
    }

    public CommitmentltemCreate(
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
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping) {
        this.applyNumber = applyNumber;
        this.fIKRS = fIKRS;
        this.fIPOS = fIPOS;
        this.bEZEICH = bEZEICH;
        this.bESCHR = bESCHR;
        this.cOMCAT = cOMCAT;
        this.sTATS = sTATS;
        this.lVOMA = lVOMA;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.applyReason = applyReason;
        this.updateBy = updateBy;
        this.dATAC = dATAC;
        this.fIVOR = fIVOR;
        this.kNZAEPO = kNZAEPO;
        this.fICPOS = fICPOS;
        this.aPCOD = aPCOD;
        this.applyDate = applyDate;
        this.applyTime = applyTime;
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
        this.operation = operation;
        this.keyMapping = keyMapping;
    }


    /**
     * Gets the applyNumber value for this CommitmentltemCreate.
     * 
     * @return applyNumber
     */
    public java.lang.String getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this CommitmentltemCreate.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(java.lang.String applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the fIKRS value for this CommitmentltemCreate.
     * 
     * @return fIKRS
     */
    public java.lang.String getFIKRS() {
        return fIKRS;
    }


    /**
     * Sets the fIKRS value for this CommitmentltemCreate.
     * 
     * @param fIKRS
     */
    public void setFIKRS(java.lang.String fIKRS) {
        this.fIKRS = fIKRS;
    }


    /**
     * Gets the fIPOS value for this CommitmentltemCreate.
     * 
     * @return fIPOS
     */
    public java.lang.String getFIPOS() {
        return fIPOS;
    }


    /**
     * Sets the fIPOS value for this CommitmentltemCreate.
     * 
     * @param fIPOS
     */
    public void setFIPOS(java.lang.String fIPOS) {
        this.fIPOS = fIPOS;
    }


    /**
     * Gets the bEZEICH value for this CommitmentltemCreate.
     * 
     * @return bEZEICH
     */
    public java.lang.String getBEZEICH() {
        return bEZEICH;
    }


    /**
     * Sets the bEZEICH value for this CommitmentltemCreate.
     * 
     * @param bEZEICH
     */
    public void setBEZEICH(java.lang.String bEZEICH) {
        this.bEZEICH = bEZEICH;
    }


    /**
     * Gets the bESCHR value for this CommitmentltemCreate.
     * 
     * @return bESCHR
     */
    public java.lang.String getBESCHR() {
        return bESCHR;
    }


    /**
     * Sets the bESCHR value for this CommitmentltemCreate.
     * 
     * @param bESCHR
     */
    public void setBESCHR(java.lang.String bESCHR) {
        this.bESCHR = bESCHR;
    }


    /**
     * Gets the cOMCAT value for this CommitmentltemCreate.
     * 
     * @return cOMCAT
     */
    public java.lang.Boolean getCOMCAT() {
        return cOMCAT;
    }


    /**
     * Sets the cOMCAT value for this CommitmentltemCreate.
     * 
     * @param cOMCAT
     */
    public void setCOMCAT(java.lang.Boolean cOMCAT) {
        this.cOMCAT = cOMCAT;
    }


    /**
     * Gets the sTATS value for this CommitmentltemCreate.
     * 
     * @return sTATS
     */
    public java.lang.Boolean getSTATS() {
        return sTATS;
    }


    /**
     * Sets the sTATS value for this CommitmentltemCreate.
     * 
     * @param sTATS
     */
    public void setSTATS(java.lang.Boolean sTATS) {
        this.sTATS = sTATS;
    }


    /**
     * Gets the lVOMA value for this CommitmentltemCreate.
     * 
     * @return lVOMA
     */
    public java.lang.Boolean getLVOMA() {
        return lVOMA;
    }


    /**
     * Sets the lVOMA value for this CommitmentltemCreate.
     * 
     * @param lVOMA
     */
    public void setLVOMA(java.lang.Boolean lVOMA) {
        this.lVOMA = lVOMA;
    }


    /**
     * Gets the aPMEM value for this CommitmentltemCreate.
     * 
     * @return aPMEM
     */
    public java.lang.String getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this CommitmentltemCreate.
     * 
     * @param aPMEM
     */
    public void setAPMEM(java.lang.String aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this CommitmentltemCreate.
     * 
     * @return applicant
     */
    public java.lang.String getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this CommitmentltemCreate.
     * 
     * @param applicant
     */
    public void setApplicant(java.lang.String applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the applyReason value for this CommitmentltemCreate.
     * 
     * @return applyReason
     */
    public java.lang.String getApplyReason() {
        return applyReason;
    }


    /**
     * Sets the applyReason value for this CommitmentltemCreate.
     * 
     * @param applyReason
     */
    public void setApplyReason(java.lang.String applyReason) {
        this.applyReason = applyReason;
    }


    /**
     * Gets the updateBy value for this CommitmentltemCreate.
     * 
     * @return updateBy
     */
    public java.lang.String getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this CommitmentltemCreate.
     * 
     * @param updateBy
     */
    public void setUpdateBy(java.lang.String updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the dATAC value for this CommitmentltemCreate.
     * 
     * @return dATAC
     */
    public java.lang.Boolean getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this CommitmentltemCreate.
     * 
     * @param dATAC
     */
    public void setDATAC(java.lang.Boolean dATAC) {
        this.dATAC = dATAC;
    }


    /**
     * Gets the fIVOR value for this CommitmentltemCreate.
     * 
     * @return fIVOR
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionLookup getFIVOR() {
        return fIVOR;
    }


    /**
     * Sets the fIVOR value for this CommitmentltemCreate.
     * 
     * @param fIVOR
     */
    public void setFIVOR(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionLookup fIVOR) {
        this.fIVOR = fIVOR;
    }


    /**
     * Gets the kNZAEPO value for this CommitmentltemCreate.
     * 
     * @return kNZAEPO
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryLookup getKNZAEPO() {
        return kNZAEPO;
    }


    /**
     * Sets the kNZAEPO value for this CommitmentltemCreate.
     * 
     * @param kNZAEPO
     */
    public void setKNZAEPO(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryLookup kNZAEPO) {
        this.kNZAEPO = kNZAEPO;
    }


    /**
     * Gets the fICPOS value for this CommitmentltemCreate.
     * 
     * @return fICPOS
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemLookup getFICPOS() {
        return fICPOS;
    }


    /**
     * Sets the fICPOS value for this CommitmentltemCreate.
     * 
     * @param fICPOS
     */
    public void setFICPOS(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemLookup fICPOS) {
        this.fICPOS = fICPOS;
    }


    /**
     * Gets the aPCOD value for this CommitmentltemCreate.
     * 
     * @return aPCOD
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this CommitmentltemCreate.
     * 
     * @param aPCOD
     */
    public void setAPCOD(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the applyDate value for this CommitmentltemCreate.
     * 
     * @return applyDate
     */
    public java.util.Calendar getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this CommitmentltemCreate.
     * 
     * @param applyDate
     */
    public void setApplyDate(java.util.Calendar applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this CommitmentltemCreate.
     * 
     * @return applyTime
     */
    public java.util.Calendar getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this CommitmentltemCreate.
     * 
     * @param applyTime
     */
    public void setApplyTime(java.util.Calendar applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the serviceRelationshipsTuple value for this CommitmentltemCreate.
     * 
     * @return serviceRelationshipsTuple
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] getServiceRelationshipsTuple() {
        return serviceRelationshipsTuple;
    }


    /**
     * Sets the serviceRelationshipsTuple value for this CommitmentltemCreate.
     * 
     * @param serviceRelationshipsTuple
     */
    public void setServiceRelationshipsTuple(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple) {
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple getServiceRelationshipsTuple(int i) {
        return this.serviceRelationshipsTuple[i];
    }

    public void setServiceRelationshipsTuple(int i, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple _value) {
        this.serviceRelationshipsTuple[i] = _value;
    }


    /**
     * Gets the operation value for this CommitmentltemCreate.
     * 
     * @return operation
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this CommitmentltemCreate.
     * 
     * @param operation
     */
    public void setOperation(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup operation) {
        this.operation = operation;
    }


    /**
     * Gets the keyMapping value for this CommitmentltemCreate.
     * 
     * @return keyMapping
     */
    public beans.ws.mdm.sap.com.KeyMapping[] getKeyMapping() {
        return keyMapping;
    }


    /**
     * Sets the keyMapping value for this CommitmentltemCreate.
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
        if (!(obj instanceof CommitmentltemCreate)) return false;
        CommitmentltemCreate other = (CommitmentltemCreate) obj;
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
            ((this.cOMCAT==null && other.getCOMCAT()==null) || 
             (this.cOMCAT!=null &&
              this.cOMCAT.equals(other.getCOMCAT()))) &&
            ((this.sTATS==null && other.getSTATS()==null) || 
             (this.sTATS!=null &&
              this.sTATS.equals(other.getSTATS()))) &&
            ((this.lVOMA==null && other.getLVOMA()==null) || 
             (this.lVOMA!=null &&
              this.lVOMA.equals(other.getLVOMA()))) &&
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
            ((this.dATAC==null && other.getDATAC()==null) || 
             (this.dATAC!=null &&
              this.dATAC.equals(other.getDATAC()))) &&
            ((this.fIVOR==null && other.getFIVOR()==null) || 
             (this.fIVOR!=null &&
              this.fIVOR.equals(other.getFIVOR()))) &&
            ((this.kNZAEPO==null && other.getKNZAEPO()==null) || 
             (this.kNZAEPO!=null &&
              this.kNZAEPO.equals(other.getKNZAEPO()))) &&
            ((this.fICPOS==null && other.getFICPOS()==null) || 
             (this.fICPOS!=null &&
              this.fICPOS.equals(other.getFICPOS()))) &&
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
        if (getCOMCAT() != null) {
            _hashCode += getCOMCAT().hashCode();
        }
        if (getSTATS() != null) {
            _hashCode += getSTATS().hashCode();
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
        if (getApplyReason() != null) {
            _hashCode += getApplyReason().hashCode();
        }
        if (getUpdateBy() != null) {
            _hashCode += getUpdateBy().hashCode();
        }
        if (getDATAC() != null) {
            _hashCode += getDATAC().hashCode();
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
        new org.apache.axis.description.TypeDesc(CommitmentltemCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "fIKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "fIPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEZEICH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "bEZEICH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BESCHR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "bESCHR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMCAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "cOMCAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "sTATS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LVOMA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "lVOMA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APMEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "aPMEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applyReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "updateBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "dATAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIVOR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "fIVOR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KNZAEPO");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "kNZAEPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FICPOS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "fICPOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "aPCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTuple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "serviceRelationshipsTuple"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsTupleTuple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "keyMapping"));
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
