/**
 * PersonnelSubareasResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class PersonnelSubareasResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareas[] personnelSubareas;

    public PersonnelSubareasResultSet() {
    }

    public PersonnelSubareasResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareas[] personnelSubareas) {
        super(
            executionStatus);
        this.personnelSubareas = personnelSubareas;
    }


    /**
     * Gets the personnelSubareas value for this PersonnelSubareasResultSet.
     * 
     * @return personnelSubareas
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareas[] getPersonnelSubareas() {
        return personnelSubareas;
    }


    /**
     * Sets the personnelSubareas value for this PersonnelSubareasResultSet.
     * 
     * @param personnelSubareas
     */
    public void setPersonnelSubareas(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareas[] personnelSubareas) {
        this.personnelSubareas = personnelSubareas;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareas getPersonnelSubareas(int i) {
        return this.personnelSubareas[i];
    }

    public void setPersonnelSubareas(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareas _value) {
        this.personnelSubareas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonnelSubareasResultSet)) return false;
        PersonnelSubareasResultSet other = (PersonnelSubareasResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.personnelSubareas==null && other.getPersonnelSubareas()==null) || 
             (this.personnelSubareas!=null &&
              java.util.Arrays.equals(this.personnelSubareas, other.getPersonnelSubareas())));
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
        if (getPersonnelSubareas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersonnelSubareas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersonnelSubareas(), i);
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
        new org.apache.axis.description.TypeDesc(PersonnelSubareasResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personnelSubareas");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "personnelSubareas"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareas"));
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
