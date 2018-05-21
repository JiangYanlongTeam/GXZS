/**
 * EducationTypeResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EducationTypeResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationType[] educationType;

    public EducationTypeResultSet() {
    }

    public EducationTypeResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationType[] educationType) {
        super(
            executionStatus);
        this.educationType = educationType;
    }


    /**
     * Gets the educationType value for this EducationTypeResultSet.
     * 
     * @return educationType
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationType[] getEducationType() {
        return educationType;
    }


    /**
     * Sets the educationType value for this EducationTypeResultSet.
     * 
     * @param educationType
     */
    public void setEducationType(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationType[] educationType) {
        this.educationType = educationType;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationType getEducationType(int i) {
        return this.educationType[i];
    }

    public void setEducationType(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationType _value) {
        this.educationType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EducationTypeResultSet)) return false;
        EducationTypeResultSet other = (EducationTypeResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.educationType==null && other.getEducationType()==null) || 
             (this.educationType!=null &&
              java.util.Arrays.equals(this.educationType, other.getEducationType())));
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
        if (getEducationType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEducationType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEducationType(), i);
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
        new org.apache.axis.description.TypeDesc(EducationTypeResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "educationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationType"));
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
