/**
 * LanguageCompetenceTuple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class LanguageCompetenceTuple  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String displayValue;

    private java.lang.Boolean removeTupleValueIndicator;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLookup yZMC;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelLookup sPDJ;

    private beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId;

    public LanguageCompetenceTuple() {
    }

    public LanguageCompetenceTuple(
           java.lang.String displayValue,
           java.lang.Boolean removeTupleValueIndicator,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLookup yZMC,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelLookup sPDJ,
           beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.displayValue = displayValue;
        this.removeTupleValueIndicator = removeTupleValueIndicator;
        this.yZMC = yZMC;
        this.sPDJ = sPDJ;
        this.tupleValueId = tupleValueId;
    }


    /**
     * Gets the displayValue value for this LanguageCompetenceTuple.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this LanguageCompetenceTuple.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the removeTupleValueIndicator value for this LanguageCompetenceTuple.
     * 
     * @return removeTupleValueIndicator
     */
    public java.lang.Boolean getRemoveTupleValueIndicator() {
        return removeTupleValueIndicator;
    }


    /**
     * Sets the removeTupleValueIndicator value for this LanguageCompetenceTuple.
     * 
     * @param removeTupleValueIndicator
     */
    public void setRemoveTupleValueIndicator(java.lang.Boolean removeTupleValueIndicator) {
        this.removeTupleValueIndicator = removeTupleValueIndicator;
    }


    /**
     * Gets the yZMC value for this LanguageCompetenceTuple.
     * 
     * @return yZMC
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLookup getYZMC() {
        return yZMC;
    }


    /**
     * Sets the yZMC value for this LanguageCompetenceTuple.
     * 
     * @param yZMC
     */
    public void setYZMC(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLookup yZMC) {
        this.yZMC = yZMC;
    }


    /**
     * Gets the sPDJ value for this LanguageCompetenceTuple.
     * 
     * @return sPDJ
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelLookup getSPDJ() {
        return sPDJ;
    }


    /**
     * Sets the sPDJ value for this LanguageCompetenceTuple.
     * 
     * @param sPDJ
     */
    public void setSPDJ(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelLookup sPDJ) {
        this.sPDJ = sPDJ;
    }


    /**
     * Gets the tupleValueId value for this LanguageCompetenceTuple.
     * 
     * @return tupleValueId
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getTupleValueId() {
        return tupleValueId;
    }


    /**
     * Sets the tupleValueId value for this LanguageCompetenceTuple.
     * 
     * @param tupleValueId
     */
    public void setTupleValueId(beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.tupleValueId = tupleValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LanguageCompetenceTuple)) return false;
        LanguageCompetenceTuple other = (LanguageCompetenceTuple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.removeTupleValueIndicator==null && other.getRemoveTupleValueIndicator()==null) || 
             (this.removeTupleValueIndicator!=null &&
              this.removeTupleValueIndicator.equals(other.getRemoveTupleValueIndicator()))) &&
            ((this.yZMC==null && other.getYZMC()==null) || 
             (this.yZMC!=null &&
              this.yZMC.equals(other.getYZMC()))) &&
            ((this.sPDJ==null && other.getSPDJ()==null) || 
             (this.sPDJ!=null &&
              this.sPDJ.equals(other.getSPDJ()))) &&
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
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getRemoveTupleValueIndicator() != null) {
            _hashCode += getRemoveTupleValueIndicator().hashCode();
        }
        if (getYZMC() != null) {
            _hashCode += getYZMC().hashCode();
        }
        if (getSPDJ() != null) {
            _hashCode += getSPDJ().hashCode();
        }
        if (getTupleValueId() != null) {
            _hashCode += getTupleValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LanguageCompetenceTuple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageCompetenceTuple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("YZMC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "yZMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPDJ");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "sPDJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelLookup"));
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
