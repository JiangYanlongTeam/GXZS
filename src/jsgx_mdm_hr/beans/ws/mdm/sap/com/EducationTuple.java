/**
 * EducationTuple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EducationTuple  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String aNZKL;

    private java.lang.String yXMCQC;

    private java.lang.String zTYE_XYX;

    private java.lang.String zYMC;

    private java.lang.Boolean sFZGXL;

    private java.lang.Boolean aCAQM;

    private java.lang.String displayValue;

    private java.lang.Boolean removeTupleValueIndicator;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeLookup sLART;

    private java.util.Calendar bEGDA;

    private java.util.Calendar eNDDA;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormLookup iNSMO;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitLookup eINHT;

    private java.util.Calendar bYSJ;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolLookup yXMC;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeLookup iNSAT;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorLookup sXZY;

    private beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId;

    public EducationTuple() {
    }

    public EducationTuple(
           java.lang.String aNZKL,
           java.lang.String yXMCQC,
           java.lang.String zTYE_XYX,
           java.lang.String zYMC,
           java.lang.Boolean sFZGXL,
           java.lang.Boolean aCAQM,
           java.lang.String displayValue,
           java.lang.Boolean removeTupleValueIndicator,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeLookup sLART,
           java.util.Calendar bEGDA,
           java.util.Calendar eNDDA,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormLookup iNSMO,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitLookup eINHT,
           java.util.Calendar bYSJ,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolLookup yXMC,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeLookup iNSAT,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorLookup sXZY,
           beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.aNZKL = aNZKL;
        this.yXMCQC = yXMCQC;
        this.zTYE_XYX = zTYE_XYX;
        this.zYMC = zYMC;
        this.sFZGXL = sFZGXL;
        this.aCAQM = aCAQM;
        this.displayValue = displayValue;
        this.removeTupleValueIndicator = removeTupleValueIndicator;
        this.sLART = sLART;
        this.bEGDA = bEGDA;
        this.eNDDA = eNDDA;
        this.iNSMO = iNSMO;
        this.eINHT = eINHT;
        this.bYSJ = bYSJ;
        this.yXMC = yXMC;
        this.iNSAT = iNSAT;
        this.sXZY = sXZY;
        this.tupleValueId = tupleValueId;
    }


    /**
     * Gets the aNZKL value for this EducationTuple.
     * 
     * @return aNZKL
     */
    public java.lang.String getANZKL() {
        return aNZKL;
    }


    /**
     * Sets the aNZKL value for this EducationTuple.
     * 
     * @param aNZKL
     */
    public void setANZKL(java.lang.String aNZKL) {
        this.aNZKL = aNZKL;
    }


    /**
     * Gets the yXMCQC value for this EducationTuple.
     * 
     * @return yXMCQC
     */
    public java.lang.String getYXMCQC() {
        return yXMCQC;
    }


    /**
     * Sets the yXMCQC value for this EducationTuple.
     * 
     * @param yXMCQC
     */
    public void setYXMCQC(java.lang.String yXMCQC) {
        this.yXMCQC = yXMCQC;
    }


    /**
     * Gets the zTYE_XYX value for this EducationTuple.
     * 
     * @return zTYE_XYX
     */
    public java.lang.String getZTYE_XYX() {
        return zTYE_XYX;
    }


    /**
     * Sets the zTYE_XYX value for this EducationTuple.
     * 
     * @param zTYE_XYX
     */
    public void setZTYE_XYX(java.lang.String zTYE_XYX) {
        this.zTYE_XYX = zTYE_XYX;
    }


    /**
     * Gets the zYMC value for this EducationTuple.
     * 
     * @return zYMC
     */
    public java.lang.String getZYMC() {
        return zYMC;
    }


    /**
     * Sets the zYMC value for this EducationTuple.
     * 
     * @param zYMC
     */
    public void setZYMC(java.lang.String zYMC) {
        this.zYMC = zYMC;
    }


    /**
     * Gets the sFZGXL value for this EducationTuple.
     * 
     * @return sFZGXL
     */
    public java.lang.Boolean getSFZGXL() {
        return sFZGXL;
    }


    /**
     * Sets the sFZGXL value for this EducationTuple.
     * 
     * @param sFZGXL
     */
    public void setSFZGXL(java.lang.Boolean sFZGXL) {
        this.sFZGXL = sFZGXL;
    }


    /**
     * Gets the aCAQM value for this EducationTuple.
     * 
     * @return aCAQM
     */
    public java.lang.Boolean getACAQM() {
        return aCAQM;
    }


    /**
     * Sets the aCAQM value for this EducationTuple.
     * 
     * @param aCAQM
     */
    public void setACAQM(java.lang.Boolean aCAQM) {
        this.aCAQM = aCAQM;
    }


    /**
     * Gets the displayValue value for this EducationTuple.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this EducationTuple.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the removeTupleValueIndicator value for this EducationTuple.
     * 
     * @return removeTupleValueIndicator
     */
    public java.lang.Boolean getRemoveTupleValueIndicator() {
        return removeTupleValueIndicator;
    }


    /**
     * Sets the removeTupleValueIndicator value for this EducationTuple.
     * 
     * @param removeTupleValueIndicator
     */
    public void setRemoveTupleValueIndicator(java.lang.Boolean removeTupleValueIndicator) {
        this.removeTupleValueIndicator = removeTupleValueIndicator;
    }


    /**
     * Gets the sLART value for this EducationTuple.
     * 
     * @return sLART
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeLookup getSLART() {
        return sLART;
    }


    /**
     * Sets the sLART value for this EducationTuple.
     * 
     * @param sLART
     */
    public void setSLART(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeLookup sLART) {
        this.sLART = sLART;
    }


    /**
     * Gets the bEGDA value for this EducationTuple.
     * 
     * @return bEGDA
     */
    public java.util.Calendar getBEGDA() {
        return bEGDA;
    }


    /**
     * Sets the bEGDA value for this EducationTuple.
     * 
     * @param bEGDA
     */
    public void setBEGDA(java.util.Calendar bEGDA) {
        this.bEGDA = bEGDA;
    }


    /**
     * Gets the eNDDA value for this EducationTuple.
     * 
     * @return eNDDA
     */
    public java.util.Calendar getENDDA() {
        return eNDDA;
    }


    /**
     * Sets the eNDDA value for this EducationTuple.
     * 
     * @param eNDDA
     */
    public void setENDDA(java.util.Calendar eNDDA) {
        this.eNDDA = eNDDA;
    }


    /**
     * Gets the iNSMO value for this EducationTuple.
     * 
     * @return iNSMO
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormLookup getINSMO() {
        return iNSMO;
    }


    /**
     * Sets the iNSMO value for this EducationTuple.
     * 
     * @param iNSMO
     */
    public void setINSMO(jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormLookup iNSMO) {
        this.iNSMO = iNSMO;
    }


    /**
     * Gets the eINHT value for this EducationTuple.
     * 
     * @return eINHT
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitLookup getEINHT() {
        return eINHT;
    }


    /**
     * Sets the eINHT value for this EducationTuple.
     * 
     * @param eINHT
     */
    public void setEINHT(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitLookup eINHT) {
        this.eINHT = eINHT;
    }


    /**
     * Gets the bYSJ value for this EducationTuple.
     * 
     * @return bYSJ
     */
    public java.util.Calendar getBYSJ() {
        return bYSJ;
    }


    /**
     * Sets the bYSJ value for this EducationTuple.
     * 
     * @param bYSJ
     */
    public void setBYSJ(java.util.Calendar bYSJ) {
        this.bYSJ = bYSJ;
    }


    /**
     * Gets the yXMC value for this EducationTuple.
     * 
     * @return yXMC
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolLookup getYXMC() {
        return yXMC;
    }


    /**
     * Sets the yXMC value for this EducationTuple.
     * 
     * @param yXMC
     */
    public void setYXMC(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolLookup yXMC) {
        this.yXMC = yXMC;
    }


    /**
     * Gets the iNSAT value for this EducationTuple.
     * 
     * @return iNSAT
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeLookup getINSAT() {
        return iNSAT;
    }


    /**
     * Sets the iNSAT value for this EducationTuple.
     * 
     * @param iNSAT
     */
    public void setINSAT(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeLookup iNSAT) {
        this.iNSAT = iNSAT;
    }


    /**
     * Gets the sXZY value for this EducationTuple.
     * 
     * @return sXZY
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorLookup getSXZY() {
        return sXZY;
    }


    /**
     * Sets the sXZY value for this EducationTuple.
     * 
     * @param sXZY
     */
    public void setSXZY(jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorLookup sXZY) {
        this.sXZY = sXZY;
    }


    /**
     * Gets the tupleValueId value for this EducationTuple.
     * 
     * @return tupleValueId
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getTupleValueId() {
        return tupleValueId;
    }


    /**
     * Sets the tupleValueId value for this EducationTuple.
     * 
     * @param tupleValueId
     */
    public void setTupleValueId(beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.tupleValueId = tupleValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EducationTuple)) return false;
        EducationTuple other = (EducationTuple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.aNZKL==null && other.getANZKL()==null) || 
             (this.aNZKL!=null &&
              this.aNZKL.equals(other.getANZKL()))) &&
            ((this.yXMCQC==null && other.getYXMCQC()==null) || 
             (this.yXMCQC!=null &&
              this.yXMCQC.equals(other.getYXMCQC()))) &&
            ((this.zTYE_XYX==null && other.getZTYE_XYX()==null) || 
             (this.zTYE_XYX!=null &&
              this.zTYE_XYX.equals(other.getZTYE_XYX()))) &&
            ((this.zYMC==null && other.getZYMC()==null) || 
             (this.zYMC!=null &&
              this.zYMC.equals(other.getZYMC()))) &&
            ((this.sFZGXL==null && other.getSFZGXL()==null) || 
             (this.sFZGXL!=null &&
              this.sFZGXL.equals(other.getSFZGXL()))) &&
            ((this.aCAQM==null && other.getACAQM()==null) || 
             (this.aCAQM!=null &&
              this.aCAQM.equals(other.getACAQM()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.removeTupleValueIndicator==null && other.getRemoveTupleValueIndicator()==null) || 
             (this.removeTupleValueIndicator!=null &&
              this.removeTupleValueIndicator.equals(other.getRemoveTupleValueIndicator()))) &&
            ((this.sLART==null && other.getSLART()==null) || 
             (this.sLART!=null &&
              this.sLART.equals(other.getSLART()))) &&
            ((this.bEGDA==null && other.getBEGDA()==null) || 
             (this.bEGDA!=null &&
              this.bEGDA.equals(other.getBEGDA()))) &&
            ((this.eNDDA==null && other.getENDDA()==null) || 
             (this.eNDDA!=null &&
              this.eNDDA.equals(other.getENDDA()))) &&
            ((this.iNSMO==null && other.getINSMO()==null) || 
             (this.iNSMO!=null &&
              this.iNSMO.equals(other.getINSMO()))) &&
            ((this.eINHT==null && other.getEINHT()==null) || 
             (this.eINHT!=null &&
              this.eINHT.equals(other.getEINHT()))) &&
            ((this.bYSJ==null && other.getBYSJ()==null) || 
             (this.bYSJ!=null &&
              this.bYSJ.equals(other.getBYSJ()))) &&
            ((this.yXMC==null && other.getYXMC()==null) || 
             (this.yXMC!=null &&
              this.yXMC.equals(other.getYXMC()))) &&
            ((this.iNSAT==null && other.getINSAT()==null) || 
             (this.iNSAT!=null &&
              this.iNSAT.equals(other.getINSAT()))) &&
            ((this.sXZY==null && other.getSXZY()==null) || 
             (this.sXZY!=null &&
              this.sXZY.equals(other.getSXZY()))) &&
            ((this.tupleValueId==null && other.getTupleValueId()==null) || 
             (this.tupleValueId!=null &&
              this.tupleValueId.equals(other.getTupleValueId())));
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
        if (getANZKL() != null) {
            _hashCode += getANZKL().hashCode();
        }
        if (getYXMCQC() != null) {
            _hashCode += getYXMCQC().hashCode();
        }
        if (getZTYE_XYX() != null) {
            _hashCode += getZTYE_XYX().hashCode();
        }
        if (getZYMC() != null) {
            _hashCode += getZYMC().hashCode();
        }
        if (getSFZGXL() != null) {
            _hashCode += getSFZGXL().hashCode();
        }
        if (getACAQM() != null) {
            _hashCode += getACAQM().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getRemoveTupleValueIndicator() != null) {
            _hashCode += getRemoveTupleValueIndicator().hashCode();
        }
        if (getSLART() != null) {
            _hashCode += getSLART().hashCode();
        }
        if (getBEGDA() != null) {
            _hashCode += getBEGDA().hashCode();
        }
        if (getENDDA() != null) {
            _hashCode += getENDDA().hashCode();
        }
        if (getINSMO() != null) {
            _hashCode += getINSMO().hashCode();
        }
        if (getEINHT() != null) {
            _hashCode += getEINHT().hashCode();
        }
        if (getBYSJ() != null) {
            _hashCode += getBYSJ().hashCode();
        }
        if (getYXMC() != null) {
            _hashCode += getYXMC().hashCode();
        }
        if (getINSAT() != null) {
            _hashCode += getINSAT().hashCode();
        }
        if (getSXZY() != null) {
            _hashCode += getSXZY().hashCode();
        }
        if (getTupleValueId() != null) {
            _hashCode += getTupleValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EducationTuple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTuple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANZKL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aNZKL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YXMCQC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "yXMCQC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_XYX");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_XYX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZYMC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zYMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFZGXL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "sFZGXL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACAQM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "aCAQM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeTupleValueIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "removeTupleValueIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLART");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "sLART"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEGDA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "bEGDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENDDA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "eNDDA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSMO");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "iNSMO"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EINHT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "eINHT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BYSJ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "bYSJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YXMC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "yXMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INSAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "iNSAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SXZY");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "sXZY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tupleValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "tupleValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BasicRecordIdentification"));
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
