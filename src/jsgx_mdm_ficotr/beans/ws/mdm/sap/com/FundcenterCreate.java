/**
 * FundcenterCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class FundcenterCreate  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String applyNumber;

    private java.lang.String fIKRS;

    private java.lang.String fICTR;

    private java.lang.String bEZEICH;

    private java.lang.String bESCHR;

    private java.lang.Boolean lVOMA;

    private java.lang.String aPMEM;

    private java.lang.String applicant;

    private java.lang.String updateBy;

    private java.lang.Boolean dATAC;

    private java.util.Calendar dATAB;

    private java.util.Calendar dATBIS;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeLookup bUKRS;

    private java.util.Calendar applyData;

    private java.util.Calendar applyTime;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup operation;

    private beans.ws.mdm.sap.com.KeyMapping[] keyMapping;

    public FundcenterCreate() {
    }

    public FundcenterCreate(
           java.lang.String applyNumber,
           java.lang.String fIKRS,
           java.lang.String fICTR,
           java.lang.String bEZEICH,
           java.lang.String bESCHR,
           java.lang.Boolean lVOMA,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String updateBy,
           java.lang.Boolean dATAC,
           java.util.Calendar dATAB,
           java.util.Calendar dATBIS,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeLookup bUKRS,
           java.util.Calendar applyData,
           java.util.Calendar applyTime,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping) {
        this.applyNumber = applyNumber;
        this.fIKRS = fIKRS;
        this.fICTR = fICTR;
        this.bEZEICH = bEZEICH;
        this.bESCHR = bESCHR;
        this.lVOMA = lVOMA;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.updateBy = updateBy;
        this.dATAC = dATAC;
        this.dATAB = dATAB;
        this.dATBIS = dATBIS;
        this.aPCOD = aPCOD;
        this.bUKRS = bUKRS;
        this.applyData = applyData;
        this.applyTime = applyTime;
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
        this.operation = operation;
        this.keyMapping = keyMapping;
    }


    /**
     * Gets the applyNumber value for this FundcenterCreate.
     * 
     * @return applyNumber
     */
    public java.lang.String getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this FundcenterCreate.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(java.lang.String applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the fIKRS value for this FundcenterCreate.
     * 
     * @return fIKRS
     */
    public java.lang.String getFIKRS() {
        return fIKRS;
    }


    /**
     * Sets the fIKRS value for this FundcenterCreate.
     * 
     * @param fIKRS
     */
    public void setFIKRS(java.lang.String fIKRS) {
        this.fIKRS = fIKRS;
    }


    /**
     * Gets the fICTR value for this FundcenterCreate.
     * 
     * @return fICTR
     */
    public java.lang.String getFICTR() {
        return fICTR;
    }


    /**
     * Sets the fICTR value for this FundcenterCreate.
     * 
     * @param fICTR
     */
    public void setFICTR(java.lang.String fICTR) {
        this.fICTR = fICTR;
    }


    /**
     * Gets the bEZEICH value for this FundcenterCreate.
     * 
     * @return bEZEICH
     */
    public java.lang.String getBEZEICH() {
        return bEZEICH;
    }


    /**
     * Sets the bEZEICH value for this FundcenterCreate.
     * 
     * @param bEZEICH
     */
    public void setBEZEICH(java.lang.String bEZEICH) {
        this.bEZEICH = bEZEICH;
    }


    /**
     * Gets the bESCHR value for this FundcenterCreate.
     * 
     * @return bESCHR
     */
    public java.lang.String getBESCHR() {
        return bESCHR;
    }


    /**
     * Sets the bESCHR value for this FundcenterCreate.
     * 
     * @param bESCHR
     */
    public void setBESCHR(java.lang.String bESCHR) {
        this.bESCHR = bESCHR;
    }


    /**
     * Gets the lVOMA value for this FundcenterCreate.
     * 
     * @return lVOMA
     */
    public java.lang.Boolean getLVOMA() {
        return lVOMA;
    }


    /**
     * Sets the lVOMA value for this FundcenterCreate.
     * 
     * @param lVOMA
     */
    public void setLVOMA(java.lang.Boolean lVOMA) {
        this.lVOMA = lVOMA;
    }


    /**
     * Gets the aPMEM value for this FundcenterCreate.
     * 
     * @return aPMEM
     */
    public java.lang.String getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this FundcenterCreate.
     * 
     * @param aPMEM
     */
    public void setAPMEM(java.lang.String aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this FundcenterCreate.
     * 
     * @return applicant
     */
    public java.lang.String getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this FundcenterCreate.
     * 
     * @param applicant
     */
    public void setApplicant(java.lang.String applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the updateBy value for this FundcenterCreate.
     * 
     * @return updateBy
     */
    public java.lang.String getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this FundcenterCreate.
     * 
     * @param updateBy
     */
    public void setUpdateBy(java.lang.String updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the dATAC value for this FundcenterCreate.
     * 
     * @return dATAC
     */
    public java.lang.Boolean getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this FundcenterCreate.
     * 
     * @param dATAC
     */
    public void setDATAC(java.lang.Boolean dATAC) {
        this.dATAC = dATAC;
    }


    /**
     * Gets the dATAB value for this FundcenterCreate.
     * 
     * @return dATAB
     */
    public java.util.Calendar getDATAB() {
        return dATAB;
    }


    /**
     * Sets the dATAB value for this FundcenterCreate.
     * 
     * @param dATAB
     */
    public void setDATAB(java.util.Calendar dATAB) {
        this.dATAB = dATAB;
    }


    /**
     * Gets the dATBIS value for this FundcenterCreate.
     * 
     * @return dATBIS
     */
    public java.util.Calendar getDATBIS() {
        return dATBIS;
    }


    /**
     * Sets the dATBIS value for this FundcenterCreate.
     * 
     * @param dATBIS
     */
    public void setDATBIS(java.util.Calendar dATBIS) {
        this.dATBIS = dATBIS;
    }


    /**
     * Gets the aPCOD value for this FundcenterCreate.
     * 
     * @return aPCOD
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this FundcenterCreate.
     * 
     * @param aPCOD
     */
    public void setAPCOD(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the bUKRS value for this FundcenterCreate.
     * 
     * @return bUKRS
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeLookup getBUKRS() {
        return bUKRS;
    }


    /**
     * Sets the bUKRS value for this FundcenterCreate.
     * 
     * @param bUKRS
     */
    public void setBUKRS(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeLookup bUKRS) {
        this.bUKRS = bUKRS;
    }


    /**
     * Gets the applyData value for this FundcenterCreate.
     * 
     * @return applyData
     */
    public java.util.Calendar getApplyData() {
        return applyData;
    }


    /**
     * Sets the applyData value for this FundcenterCreate.
     * 
     * @param applyData
     */
    public void setApplyData(java.util.Calendar applyData) {
        this.applyData = applyData;
    }


    /**
     * Gets the applyTime value for this FundcenterCreate.
     * 
     * @return applyTime
     */
    public java.util.Calendar getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this FundcenterCreate.
     * 
     * @param applyTime
     */
    public void setApplyTime(java.util.Calendar applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the serviceRelationshipsTuple value for this FundcenterCreate.
     * 
     * @return serviceRelationshipsTuple
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] getServiceRelationshipsTuple() {
        return serviceRelationshipsTuple;
    }


    /**
     * Sets the serviceRelationshipsTuple value for this FundcenterCreate.
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
     * Gets the operation value for this FundcenterCreate.
     * 
     * @return operation
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this FundcenterCreate.
     * 
     * @param operation
     */
    public void setOperation(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup operation) {
        this.operation = operation;
    }


    /**
     * Gets the keyMapping value for this FundcenterCreate.
     * 
     * @return keyMapping
     */
    public beans.ws.mdm.sap.com.KeyMapping[] getKeyMapping() {
        return keyMapping;
    }


    /**
     * Sets the keyMapping value for this FundcenterCreate.
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
        if (!(obj instanceof FundcenterCreate)) return false;
        FundcenterCreate other = (FundcenterCreate) obj;
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
            ((this.fICTR==null && other.getFICTR()==null) || 
             (this.fICTR!=null &&
              this.fICTR.equals(other.getFICTR()))) &&
            ((this.bEZEICH==null && other.getBEZEICH()==null) || 
             (this.bEZEICH!=null &&
              this.bEZEICH.equals(other.getBEZEICH()))) &&
            ((this.bESCHR==null && other.getBESCHR()==null) || 
             (this.bESCHR!=null &&
              this.bESCHR.equals(other.getBESCHR()))) &&
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
            ((this.dATAC==null && other.getDATAC()==null) || 
             (this.dATAC!=null &&
              this.dATAC.equals(other.getDATAC()))) &&
            ((this.dATAB==null && other.getDATAB()==null) || 
             (this.dATAB!=null &&
              this.dATAB.equals(other.getDATAB()))) &&
            ((this.dATBIS==null && other.getDATBIS()==null) || 
             (this.dATBIS!=null &&
              this.dATBIS.equals(other.getDATBIS()))) &&
            ((this.aPCOD==null && other.getAPCOD()==null) || 
             (this.aPCOD!=null &&
              this.aPCOD.equals(other.getAPCOD()))) &&
            ((this.bUKRS==null && other.getBUKRS()==null) || 
             (this.bUKRS!=null &&
              this.bUKRS.equals(other.getBUKRS()))) &&
            ((this.applyData==null && other.getApplyData()==null) || 
             (this.applyData!=null &&
              this.applyData.equals(other.getApplyData()))) &&
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
        if (getFICTR() != null) {
            _hashCode += getFICTR().hashCode();
        }
        if (getBEZEICH() != null) {
            _hashCode += getBEZEICH().hashCode();
        }
        if (getBESCHR() != null) {
            _hashCode += getBESCHR().hashCode();
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
        if (getDATAC() != null) {
            _hashCode += getDATAC().hashCode();
        }
        if (getDATAB() != null) {
            _hashCode += getDATAB().hashCode();
        }
        if (getDATBIS() != null) {
            _hashCode += getDATBIS().hashCode();
        }
        if (getAPCOD() != null) {
            _hashCode += getAPCOD().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getApplyData() != null) {
            _hashCode += getApplyData().hashCode();
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
        new org.apache.axis.description.TypeDesc(FundcenterCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterCreate"));
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
        elemField.setFieldName("FICTR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "fICTR"));
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
        elemField.setFieldName("DATAB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "dATAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATBIS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "dATBIS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "bUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "applyData"));
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
