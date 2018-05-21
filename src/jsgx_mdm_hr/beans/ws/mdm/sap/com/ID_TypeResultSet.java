/**
 * ID_TypeResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class ID_TypeResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_Type[] iD_Type;

    public ID_TypeResultSet() {
    }

    public ID_TypeResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_Type[] iD_Type) {
        super(
            executionStatus);
        this.iD_Type = iD_Type;
    }


    /**
     * Gets the iD_Type value for this ID_TypeResultSet.
     * 
     * @return iD_Type
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_Type[] getID_Type() {
        return iD_Type;
    }


    /**
     * Sets the iD_Type value for this ID_TypeResultSet.
     * 
     * @param iD_Type
     */
    public void setID_Type(jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_Type[] iD_Type) {
        this.iD_Type = iD_Type;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_Type getID_Type(int i) {
        return this.iD_Type[i];
    }

    public void setID_Type(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_Type _value) {
        this.iD_Type[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ID_TypeResultSet)) return false;
        ID_TypeResultSet other = (ID_TypeResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.iD_Type==null && other.getID_Type()==null) || 
             (this.iD_Type!=null &&
              java.util.Arrays.equals(this.iD_Type, other.getID_Type())));
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
        if (getID_Type() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getID_Type());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getID_Type(), i);
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
        new org.apache.axis.description.TypeDesc(ID_TypeResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID_Type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "iD_Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_Type"));
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
