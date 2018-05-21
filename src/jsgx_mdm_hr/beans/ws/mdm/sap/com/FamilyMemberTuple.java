/**
 * FamilyMemberTuple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class FamilyMemberTuple  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String pAD_NACHN;

    private java.lang.String displayValue;

    private java.lang.Boolean removeTupleValueIndicator;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipLookup fAMSA;

    private java.util.Calendar gBDAT;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup fANAT;

    private beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId;

    public FamilyMemberTuple() {
    }

    public FamilyMemberTuple(
           java.lang.String pAD_NACHN,
           java.lang.String displayValue,
           java.lang.Boolean removeTupleValueIndicator,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipLookup fAMSA,
           java.util.Calendar gBDAT,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup fANAT,
           beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.pAD_NACHN = pAD_NACHN;
        this.displayValue = displayValue;
        this.removeTupleValueIndicator = removeTupleValueIndicator;
        this.fAMSA = fAMSA;
        this.gBDAT = gBDAT;
        this.fANAT = fANAT;
        this.tupleValueId = tupleValueId;
    }


    /**
     * Gets the pAD_NACHN value for this FamilyMemberTuple.
     * 
     * @return pAD_NACHN
     */
    public java.lang.String getPAD_NACHN() {
        return pAD_NACHN;
    }


    /**
     * Sets the pAD_NACHN value for this FamilyMemberTuple.
     * 
     * @param pAD_NACHN
     */
    public void setPAD_NACHN(java.lang.String pAD_NACHN) {
        this.pAD_NACHN = pAD_NACHN;
    }


    /**
     * Gets the displayValue value for this FamilyMemberTuple.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this FamilyMemberTuple.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the removeTupleValueIndicator value for this FamilyMemberTuple.
     * 
     * @return removeTupleValueIndicator
     */
    public java.lang.Boolean getRemoveTupleValueIndicator() {
        return removeTupleValueIndicator;
    }


    /**
     * Sets the removeTupleValueIndicator value for this FamilyMemberTuple.
     * 
     * @param removeTupleValueIndicator
     */
    public void setRemoveTupleValueIndicator(java.lang.Boolean removeTupleValueIndicator) {
        this.removeTupleValueIndicator = removeTupleValueIndicator;
    }


    /**
     * Gets the fAMSA value for this FamilyMemberTuple.
     * 
     * @return fAMSA
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipLookup getFAMSA() {
        return fAMSA;
    }


    /**
     * Sets the fAMSA value for this FamilyMemberTuple.
     * 
     * @param fAMSA
     */
    public void setFAMSA(jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipLookup fAMSA) {
        this.fAMSA = fAMSA;
    }


    /**
     * Gets the gBDAT value for this FamilyMemberTuple.
     * 
     * @return gBDAT
     */
    public java.util.Calendar getGBDAT() {
        return gBDAT;
    }


    /**
     * Sets the gBDAT value for this FamilyMemberTuple.
     * 
     * @param gBDAT
     */
    public void setGBDAT(java.util.Calendar gBDAT) {
        this.gBDAT = gBDAT;
    }


    /**
     * Gets the fANAT value for this FamilyMemberTuple.
     * 
     * @return fANAT
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup getFANAT() {
        return fANAT;
    }


    /**
     * Sets the fANAT value for this FamilyMemberTuple.
     * 
     * @param fANAT
     */
    public void setFANAT(jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup fANAT) {
        this.fANAT = fANAT;
    }


    /**
     * Gets the tupleValueId value for this FamilyMemberTuple.
     * 
     * @return tupleValueId
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getTupleValueId() {
        return tupleValueId;
    }


    /**
     * Sets the tupleValueId value for this FamilyMemberTuple.
     * 
     * @param tupleValueId
     */
    public void setTupleValueId(beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.tupleValueId = tupleValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FamilyMemberTuple)) return false;
        FamilyMemberTuple other = (FamilyMemberTuple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pAD_NACHN==null && other.getPAD_NACHN()==null) || 
             (this.pAD_NACHN!=null &&
              this.pAD_NACHN.equals(other.getPAD_NACHN()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.removeTupleValueIndicator==null && other.getRemoveTupleValueIndicator()==null) || 
             (this.removeTupleValueIndicator!=null &&
              this.removeTupleValueIndicator.equals(other.getRemoveTupleValueIndicator()))) &&
            ((this.fAMSA==null && other.getFAMSA()==null) || 
             (this.fAMSA!=null &&
              this.fAMSA.equals(other.getFAMSA()))) &&
            ((this.gBDAT==null && other.getGBDAT()==null) || 
             (this.gBDAT!=null &&
              this.gBDAT.equals(other.getGBDAT()))) &&
            ((this.fANAT==null && other.getFANAT()==null) || 
             (this.fANAT!=null &&
              this.fANAT.equals(other.getFANAT()))) &&
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
        if (getPAD_NACHN() != null) {
            _hashCode += getPAD_NACHN().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getRemoveTupleValueIndicator() != null) {
            _hashCode += getRemoveTupleValueIndicator().hashCode();
        }
        if (getFAMSA() != null) {
            _hashCode += getFAMSA().hashCode();
        }
        if (getGBDAT() != null) {
            _hashCode += getGBDAT().hashCode();
        }
        if (getFANAT() != null) {
            _hashCode += getFANAT().hashCode();
        }
        if (getTupleValueId() != null) {
            _hashCode += getTupleValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FamilyMemberTuple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "FamilyMemberTuple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PAD_NACHN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "pAD_NACHN"));
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
        elemField.setFieldName("FAMSA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "fAMSA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipLookup"));
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
        elemField.setFieldName("FANAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "fANAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityLookup"));
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
