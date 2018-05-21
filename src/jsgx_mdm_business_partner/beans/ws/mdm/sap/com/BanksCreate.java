/**
 * BanksCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class BanksCreate  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String applyNumber;

    private java.lang.String bANKL;

    private java.lang.String bANKA;

    private java.lang.String sTRAS;

    private java.lang.String oRT01;

    private java.lang.String bRNCH;

    private java.lang.String aPMEM;

    private java.lang.String applicant;

    private java.lang.String updateBy;

    private java.lang.Boolean dATAC;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup bANKS;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup pROVZ;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD;

    private java.util.Calendar applyDate;

    private java.util.Calendar applyTime;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple;

    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup operation;

    private beans.ws.mdm.sap.com.KeyMapping[] keyMapping;

    public BanksCreate() {
    }

    public BanksCreate(
           java.lang.String applyNumber,
           java.lang.String bANKL,
           java.lang.String bANKA,
           java.lang.String sTRAS,
           java.lang.String oRT01,
           java.lang.String bRNCH,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String updateBy,
           java.lang.Boolean dATAC,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup bANKS,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup pROVZ,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping) {
        this.applyNumber = applyNumber;
        this.bANKL = bANKL;
        this.bANKA = bANKA;
        this.sTRAS = sTRAS;
        this.oRT01 = oRT01;
        this.bRNCH = bRNCH;
        this.aPMEM = aPMEM;
        this.applicant = applicant;
        this.updateBy = updateBy;
        this.dATAC = dATAC;
        this.bANKS = bANKS;
        this.pROVZ = pROVZ;
        this.aPCOD = aPCOD;
        this.applyDate = applyDate;
        this.applyTime = applyTime;
        this.serviceRelationshipsTuple = serviceRelationshipsTuple;
        this.operation = operation;
        this.keyMapping = keyMapping;
    }


    /**
     * Gets the applyNumber value for this BanksCreate.
     * 
     * @return applyNumber
     */
    public java.lang.String getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this BanksCreate.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(java.lang.String applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the bANKL value for this BanksCreate.
     * 
     * @return bANKL
     */
    public java.lang.String getBANKL() {
        return bANKL;
    }


    /**
     * Sets the bANKL value for this BanksCreate.
     * 
     * @param bANKL
     */
    public void setBANKL(java.lang.String bANKL) {
        this.bANKL = bANKL;
    }


    /**
     * Gets the bANKA value for this BanksCreate.
     * 
     * @return bANKA
     */
    public java.lang.String getBANKA() {
        return bANKA;
    }


    /**
     * Sets the bANKA value for this BanksCreate.
     * 
     * @param bANKA
     */
    public void setBANKA(java.lang.String bANKA) {
        this.bANKA = bANKA;
    }


    /**
     * Gets the sTRAS value for this BanksCreate.
     * 
     * @return sTRAS
     */
    public java.lang.String getSTRAS() {
        return sTRAS;
    }


    /**
     * Sets the sTRAS value for this BanksCreate.
     * 
     * @param sTRAS
     */
    public void setSTRAS(java.lang.String sTRAS) {
        this.sTRAS = sTRAS;
    }


    /**
     * Gets the oRT01 value for this BanksCreate.
     * 
     * @return oRT01
     */
    public java.lang.String getORT01() {
        return oRT01;
    }


    /**
     * Sets the oRT01 value for this BanksCreate.
     * 
     * @param oRT01
     */
    public void setORT01(java.lang.String oRT01) {
        this.oRT01 = oRT01;
    }


    /**
     * Gets the bRNCH value for this BanksCreate.
     * 
     * @return bRNCH
     */
    public java.lang.String getBRNCH() {
        return bRNCH;
    }


    /**
     * Sets the bRNCH value for this BanksCreate.
     * 
     * @param bRNCH
     */
    public void setBRNCH(java.lang.String bRNCH) {
        this.bRNCH = bRNCH;
    }


    /**
     * Gets the aPMEM value for this BanksCreate.
     * 
     * @return aPMEM
     */
    public java.lang.String getAPMEM() {
        return aPMEM;
    }


    /**
     * Sets the aPMEM value for this BanksCreate.
     * 
     * @param aPMEM
     */
    public void setAPMEM(java.lang.String aPMEM) {
        this.aPMEM = aPMEM;
    }


    /**
     * Gets the applicant value for this BanksCreate.
     * 
     * @return applicant
     */
    public java.lang.String getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this BanksCreate.
     * 
     * @param applicant
     */
    public void setApplicant(java.lang.String applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the updateBy value for this BanksCreate.
     * 
     * @return updateBy
     */
    public java.lang.String getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this BanksCreate.
     * 
     * @param updateBy
     */
    public void setUpdateBy(java.lang.String updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the dATAC value for this BanksCreate.
     * 
     * @return dATAC
     */
    public java.lang.Boolean getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this BanksCreate.
     * 
     * @param dATAC
     */
    public void setDATAC(java.lang.Boolean dATAC) {
        this.dATAC = dATAC;
    }


    /**
     * Gets the bANKS value for this BanksCreate.
     * 
     * @return bANKS
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup getBANKS() {
        return bANKS;
    }


    /**
     * Sets the bANKS value for this BanksCreate.
     * 
     * @param bANKS
     */
    public void setBANKS(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup bANKS) {
        this.bANKS = bANKS;
    }


    /**
     * Gets the pROVZ value for this BanksCreate.
     * 
     * @return pROVZ
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup getPROVZ() {
        return pROVZ;
    }


    /**
     * Sets the pROVZ value for this BanksCreate.
     * 
     * @param pROVZ
     */
    public void setPROVZ(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup pROVZ) {
        this.pROVZ = pROVZ;
    }


    /**
     * Gets the aPCOD value for this BanksCreate.
     * 
     * @return aPCOD
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this BanksCreate.
     * 
     * @param aPCOD
     */
    public void setAPCOD(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the applyDate value for this BanksCreate.
     * 
     * @return applyDate
     */
    public java.util.Calendar getApplyDate() {
        return applyDate;
    }


    /**
     * Sets the applyDate value for this BanksCreate.
     * 
     * @param applyDate
     */
    public void setApplyDate(java.util.Calendar applyDate) {
        this.applyDate = applyDate;
    }


    /**
     * Gets the applyTime value for this BanksCreate.
     * 
     * @return applyTime
     */
    public java.util.Calendar getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this BanksCreate.
     * 
     * @param applyTime
     */
    public void setApplyTime(java.util.Calendar applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the serviceRelationshipsTuple value for this BanksCreate.
     * 
     * @return serviceRelationshipsTuple
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] getServiceRelationshipsTuple() {
        return serviceRelationshipsTuple;
    }


    /**
     * Sets the serviceRelationshipsTuple value for this BanksCreate.
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
     * Gets the operation value for this BanksCreate.
     * 
     * @return operation
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this BanksCreate.
     * 
     * @param operation
     */
    public void setOperation(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup operation) {
        this.operation = operation;
    }


    /**
     * Gets the keyMapping value for this BanksCreate.
     * 
     * @return keyMapping
     */
    public beans.ws.mdm.sap.com.KeyMapping[] getKeyMapping() {
        return keyMapping;
    }


    /**
     * Sets the keyMapping value for this BanksCreate.
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
        if (!(obj instanceof BanksCreate)) return false;
        BanksCreate other = (BanksCreate) obj;
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
            ((this.bANKL==null && other.getBANKL()==null) || 
             (this.bANKL!=null &&
              this.bANKL.equals(other.getBANKL()))) &&
            ((this.bANKA==null && other.getBANKA()==null) || 
             (this.bANKA!=null &&
              this.bANKA.equals(other.getBANKA()))) &&
            ((this.sTRAS==null && other.getSTRAS()==null) || 
             (this.sTRAS!=null &&
              this.sTRAS.equals(other.getSTRAS()))) &&
            ((this.oRT01==null && other.getORT01()==null) || 
             (this.oRT01!=null &&
              this.oRT01.equals(other.getORT01()))) &&
            ((this.bRNCH==null && other.getBRNCH()==null) || 
             (this.bRNCH!=null &&
              this.bRNCH.equals(other.getBRNCH()))) &&
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
            ((this.bANKS==null && other.getBANKS()==null) || 
             (this.bANKS!=null &&
              this.bANKS.equals(other.getBANKS()))) &&
            ((this.pROVZ==null && other.getPROVZ()==null) || 
             (this.pROVZ!=null &&
              this.pROVZ.equals(other.getPROVZ()))) &&
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
        if (getBANKL() != null) {
            _hashCode += getBANKL().hashCode();
        }
        if (getBANKA() != null) {
            _hashCode += getBANKA().hashCode();
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
        if (getBANKS() != null) {
            _hashCode += getBANKS().hashCode();
        }
        if (getPROVZ() != null) {
            _hashCode += getPROVZ().hashCode();
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
        new org.apache.axis.description.TypeDesc(BanksCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bANKL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bANKA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STRAS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "sTRAS"));
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
        elemField.setFieldName("BRNCH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bRNCH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("BANKS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bANKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROVZ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "pROVZ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
