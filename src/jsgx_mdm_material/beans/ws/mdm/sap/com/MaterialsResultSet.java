/**
 * MaterialsResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_material.beans.ws.mdm.sap.com;

public class MaterialsResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_material.beans.ws.mdm.sap.com.Materials[] materials;

    public MaterialsResultSet() {
    }

    public MaterialsResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_material.beans.ws.mdm.sap.com.Materials[] materials) {
        super(
            executionStatus);
        this.materials = materials;
    }


    /**
     * Gets the materials value for this MaterialsResultSet.
     * 
     * @return materials
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.Materials[] getMaterials() {
        return materials;
    }


    /**
     * Sets the materials value for this MaterialsResultSet.
     * 
     * @param materials
     */
    public void setMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.Materials[] materials) {
        this.materials = materials;
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.Materials getMaterials(int i) {
        return this.materials[i];
    }

    public void setMaterials(int i, jsgx_mdm_material.beans.ws.mdm.sap.com.Materials _value) {
        this.materials[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaterialsResultSet)) return false;
        MaterialsResultSet other = (MaterialsResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.materials==null && other.getMaterials()==null) || 
             (this.materials!=null &&
              java.util.Arrays.equals(this.materials, other.getMaterials())));
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
        if (getMaterials() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaterials());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaterials(), i);
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
        new org.apache.axis.description.TypeDesc(MaterialsResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "materials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "Materials"));
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
