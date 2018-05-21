/**
 * LanguageLevelResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class LanguageLevelResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevel[] languageLevel;

    public LanguageLevelResultSet() {
    }

    public LanguageLevelResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevel[] languageLevel) {
        super(
            executionStatus);
        this.languageLevel = languageLevel;
    }


    /**
     * Gets the languageLevel value for this LanguageLevelResultSet.
     * 
     * @return languageLevel
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevel[] getLanguageLevel() {
        return languageLevel;
    }


    /**
     * Sets the languageLevel value for this LanguageLevelResultSet.
     * 
     * @param languageLevel
     */
    public void setLanguageLevel(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevel[] languageLevel) {
        this.languageLevel = languageLevel;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevel getLanguageLevel(int i) {
        return this.languageLevel[i];
    }

    public void setLanguageLevel(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevel _value) {
        this.languageLevel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LanguageLevelResultSet)) return false;
        LanguageLevelResultSet other = (LanguageLevelResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.languageLevel==null && other.getLanguageLevel()==null) || 
             (this.languageLevel!=null &&
              java.util.Arrays.equals(this.languageLevel, other.getLanguageLevel())));
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
        if (getLanguageLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguageLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguageLevel(), i);
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
        new org.apache.axis.description.TypeDesc(LanguageLevelResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "languageLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevel"));
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
