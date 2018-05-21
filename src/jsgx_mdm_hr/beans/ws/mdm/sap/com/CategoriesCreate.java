/**
 * CategoriesCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class CategoriesCreate  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private beans.ws.mdm.sap.com.MultilingualText[] name;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesID parent;

    public CategoriesCreate() {
    }

    public CategoriesCreate(
           beans.ws.mdm.sap.com.MultilingualText[] name,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesID parent) {
        this.name = name;
        this.parent = parent;
    }


    /**
     * Gets the name value for this CategoriesCreate.
     * 
     * @return name
     */
    public beans.ws.mdm.sap.com.MultilingualText[] getName() {
        return name;
    }


    /**
     * Sets the name value for this CategoriesCreate.
     * 
     * @param name
     */
    public void setName(beans.ws.mdm.sap.com.MultilingualText[] name) {
        this.name = name;
    }

    public beans.ws.mdm.sap.com.MultilingualText getName(int i) {
        return this.name[i];
    }

    public void setName(int i, beans.ws.mdm.sap.com.MultilingualText _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the parent value for this CategoriesCreate.
     * 
     * @return parent
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesID getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this CategoriesCreate.
     * 
     * @param parent
     */
    public void setParent(jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesID parent) {
        this.parent = parent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategoriesCreate)) return false;
        CategoriesCreate other = (CategoriesCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent())));
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategoriesCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "MultilingualText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesID"));
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
