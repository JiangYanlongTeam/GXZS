/**
 * IndustryCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class IndustryCriteria  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String[] namedSearchCriteria;

    private java.lang.String[] maskCriteria;

    private java.lang.String logicalOperator;

    private beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria;

    private beans.ws.mdm.sap.com.TextCriteria code;

    private beans.ws.mdm.sap.com.TextCriteria name;

    public IndustryCriteria() {
    }

    public IndustryCriteria(
           java.lang.String[] namedSearchCriteria,
           java.lang.String[] maskCriteria,
           java.lang.String logicalOperator,
           beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria,
           beans.ws.mdm.sap.com.TextCriteria code,
           beans.ws.mdm.sap.com.TextCriteria name) {
        this.namedSearchCriteria = namedSearchCriteria;
        this.maskCriteria = maskCriteria;
        this.logicalOperator = logicalOperator;
        this.keywordCriteria = keywordCriteria;
        this.code = code;
        this.name = name;
    }


    /**
     * Gets the namedSearchCriteria value for this IndustryCriteria.
     * 
     * @return namedSearchCriteria
     */
    public java.lang.String[] getNamedSearchCriteria() {
        return namedSearchCriteria;
    }


    /**
     * Sets the namedSearchCriteria value for this IndustryCriteria.
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
     * Gets the maskCriteria value for this IndustryCriteria.
     * 
     * @return maskCriteria
     */
    public java.lang.String[] getMaskCriteria() {
        return maskCriteria;
    }


    /**
     * Sets the maskCriteria value for this IndustryCriteria.
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
     * Gets the logicalOperator value for this IndustryCriteria.
     * 
     * @return logicalOperator
     */
    public java.lang.String getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this IndustryCriteria.
     * 
     * @param logicalOperator
     */
    public void setLogicalOperator(java.lang.String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the keywordCriteria value for this IndustryCriteria.
     * 
     * @return keywordCriteria
     */
    public beans.ws.mdm.sap.com.KeywordConstraint getKeywordCriteria() {
        return keywordCriteria;
    }


    /**
     * Sets the keywordCriteria value for this IndustryCriteria.
     * 
     * @param keywordCriteria
     */
    public void setKeywordCriteria(beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria) {
        this.keywordCriteria = keywordCriteria;
    }


    /**
     * Gets the code value for this IndustryCriteria.
     * 
     * @return code
     */
    public beans.ws.mdm.sap.com.TextCriteria getCode() {
        return code;
    }


    /**
     * Sets the code value for this IndustryCriteria.
     * 
     * @param code
     */
    public void setCode(beans.ws.mdm.sap.com.TextCriteria code) {
        this.code = code;
    }


    /**
     * Gets the name value for this IndustryCriteria.
     * 
     * @return name
     */
    public beans.ws.mdm.sap.com.TextCriteria getName() {
        return name;
    }


    /**
     * Sets the name value for this IndustryCriteria.
     * 
     * @param name
     */
    public void setName(beans.ws.mdm.sap.com.TextCriteria name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndustryCriteria)) return false;
        IndustryCriteria other = (IndustryCriteria) obj;
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
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndustryCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryCriteria"));
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
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
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
