/**
 * PreviousEmployerTuple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class PreviousEmployerTuple  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String vORAG;

    private java.lang.String zTYE_BM;

    private java.lang.String zTYE_BZXX;

    private java.lang.String zTYE_GW;

    private java.lang.String displayValue;

    private java.lang.Boolean removeTupleValueIndicator;

    private java.util.Calendar bEGDA;

    private java.util.Calendar eNDDA;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryLookup bRSCH;

    private beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId;

    public PreviousEmployerTuple() {
    }

    public PreviousEmployerTuple(
           java.lang.String vORAG,
           java.lang.String zTYE_BM,
           java.lang.String zTYE_BZXX,
           java.lang.String zTYE_GW,
           java.lang.String displayValue,
           java.lang.Boolean removeTupleValueIndicator,
           java.util.Calendar bEGDA,
           java.util.Calendar eNDDA,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryLookup bRSCH,
           beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.vORAG = vORAG;
        this.zTYE_BM = zTYE_BM;
        this.zTYE_BZXX = zTYE_BZXX;
        this.zTYE_GW = zTYE_GW;
        this.displayValue = displayValue;
        this.removeTupleValueIndicator = removeTupleValueIndicator;
        this.bEGDA = bEGDA;
        this.eNDDA = eNDDA;
        this.bRSCH = bRSCH;
        this.tupleValueId = tupleValueId;
    }


    /**
     * Gets the vORAG value for this PreviousEmployerTuple.
     * 
     * @return vORAG
     */
    public java.lang.String getVORAG() {
        return vORAG;
    }


    /**
     * Sets the vORAG value for this PreviousEmployerTuple.
     * 
     * @param vORAG
     */
    public void setVORAG(java.lang.String vORAG) {
        this.vORAG = vORAG;
    }


    /**
     * Gets the zTYE_BM value for this PreviousEmployerTuple.
     * 
     * @return zTYE_BM
     */
    public java.lang.String getZTYE_BM() {
        return zTYE_BM;
    }


    /**
     * Sets the zTYE_BM value for this PreviousEmployerTuple.
     * 
     * @param zTYE_BM
     */
    public void setZTYE_BM(java.lang.String zTYE_BM) {
        this.zTYE_BM = zTYE_BM;
    }


    /**
     * Gets the zTYE_BZXX value for this PreviousEmployerTuple.
     * 
     * @return zTYE_BZXX
     */
    public java.lang.String getZTYE_BZXX() {
        return zTYE_BZXX;
    }


    /**
     * Sets the zTYE_BZXX value for this PreviousEmployerTuple.
     * 
     * @param zTYE_BZXX
     */
    public void setZTYE_BZXX(java.lang.String zTYE_BZXX) {
        this.zTYE_BZXX = zTYE_BZXX;
    }


    /**
     * Gets the zTYE_GW value for this PreviousEmployerTuple.
     * 
     * @return zTYE_GW
     */
    public java.lang.String getZTYE_GW() {
        return zTYE_GW;
    }


    /**
     * Sets the zTYE_GW value for this PreviousEmployerTuple.
     * 
     * @param zTYE_GW
     */
    public void setZTYE_GW(java.lang.String zTYE_GW) {
        this.zTYE_GW = zTYE_GW;
    }


    /**
     * Gets the displayValue value for this PreviousEmployerTuple.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this PreviousEmployerTuple.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the removeTupleValueIndicator value for this PreviousEmployerTuple.
     * 
     * @return removeTupleValueIndicator
     */
    public java.lang.Boolean getRemoveTupleValueIndicator() {
        return removeTupleValueIndicator;
    }


    /**
     * Sets the removeTupleValueIndicator value for this PreviousEmployerTuple.
     * 
     * @param removeTupleValueIndicator
     */
    public void setRemoveTupleValueIndicator(java.lang.Boolean removeTupleValueIndicator) {
        this.removeTupleValueIndicator = removeTupleValueIndicator;
    }


    /**
     * Gets the bEGDA value for this PreviousEmployerTuple.
     * 
     * @return bEGDA
     */
    public java.util.Calendar getBEGDA() {
        return bEGDA;
    }


    /**
     * Sets the bEGDA value for this PreviousEmployerTuple.
     * 
     * @param bEGDA
     */
    public void setBEGDA(java.util.Calendar bEGDA) {
        this.bEGDA = bEGDA;
    }


    /**
     * Gets the eNDDA value for this PreviousEmployerTuple.
     * 
     * @return eNDDA
     */
    public java.util.Calendar getENDDA() {
        return eNDDA;
    }


    /**
     * Sets the eNDDA value for this PreviousEmployerTuple.
     * 
     * @param eNDDA
     */
    public void setENDDA(java.util.Calendar eNDDA) {
        this.eNDDA = eNDDA;
    }


    /**
     * Gets the bRSCH value for this PreviousEmployerTuple.
     * 
     * @return bRSCH
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryLookup getBRSCH() {
        return bRSCH;
    }


    /**
     * Sets the bRSCH value for this PreviousEmployerTuple.
     * 
     * @param bRSCH
     */
    public void setBRSCH(jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryLookup bRSCH) {
        this.bRSCH = bRSCH;
    }


    /**
     * Gets the tupleValueId value for this PreviousEmployerTuple.
     * 
     * @return tupleValueId
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getTupleValueId() {
        return tupleValueId;
    }


    /**
     * Sets the tupleValueId value for this PreviousEmployerTuple.
     * 
     * @param tupleValueId
     */
    public void setTupleValueId(beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.tupleValueId = tupleValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreviousEmployerTuple)) return false;
        PreviousEmployerTuple other = (PreviousEmployerTuple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vORAG==null && other.getVORAG()==null) || 
             (this.vORAG!=null &&
              this.vORAG.equals(other.getVORAG()))) &&
            ((this.zTYE_BM==null && other.getZTYE_BM()==null) || 
             (this.zTYE_BM!=null &&
              this.zTYE_BM.equals(other.getZTYE_BM()))) &&
            ((this.zTYE_BZXX==null && other.getZTYE_BZXX()==null) || 
             (this.zTYE_BZXX!=null &&
              this.zTYE_BZXX.equals(other.getZTYE_BZXX()))) &&
            ((this.zTYE_GW==null && other.getZTYE_GW()==null) || 
             (this.zTYE_GW!=null &&
              this.zTYE_GW.equals(other.getZTYE_GW()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.removeTupleValueIndicator==null && other.getRemoveTupleValueIndicator()==null) || 
             (this.removeTupleValueIndicator!=null &&
              this.removeTupleValueIndicator.equals(other.getRemoveTupleValueIndicator()))) &&
            ((this.bEGDA==null && other.getBEGDA()==null) || 
             (this.bEGDA!=null &&
              this.bEGDA.equals(other.getBEGDA()))) &&
            ((this.eNDDA==null && other.getENDDA()==null) || 
             (this.eNDDA!=null &&
              this.eNDDA.equals(other.getENDDA()))) &&
            ((this.bRSCH==null && other.getBRSCH()==null) || 
             (this.bRSCH!=null &&
              this.bRSCH.equals(other.getBRSCH()))) &&
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
        if (getVORAG() != null) {
            _hashCode += getVORAG().hashCode();
        }
        if (getZTYE_BM() != null) {
            _hashCode += getZTYE_BM().hashCode();
        }
        if (getZTYE_BZXX() != null) {
            _hashCode += getZTYE_BZXX().hashCode();
        }
        if (getZTYE_GW() != null) {
            _hashCode += getZTYE_GW().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getRemoveTupleValueIndicator() != null) {
            _hashCode += getRemoveTupleValueIndicator().hashCode();
        }
        if (getBEGDA() != null) {
            _hashCode += getBEGDA().hashCode();
        }
        if (getENDDA() != null) {
            _hashCode += getENDDA().hashCode();
        }
        if (getBRSCH() != null) {
            _hashCode += getBRSCH().hashCode();
        }
        if (getTupleValueId() != null) {
            _hashCode += getTupleValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreviousEmployerTuple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PreviousEmployerTuple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VORAG");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "vORAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_BM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_BM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_BZXX");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_BZXX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZTYE_GW");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "zTYE_GW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("BRSCH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "bRSCH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryLookup"));
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
