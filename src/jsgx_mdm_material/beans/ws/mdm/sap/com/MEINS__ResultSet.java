/**
 * MEINS__ResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_material.beans.ws.mdm.sap.com;

public class MEINS__ResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS[] mEINS;

    public MEINS__ResultSet() {
    }

    public MEINS__ResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS[] mEINS) {
        super(
            executionStatus);
        this.mEINS = mEINS;
    }


    /**
     * Gets the mEINS value for this MEINS__ResultSet.
     * 
     * @return mEINS
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS[] getMEINS() {
        return mEINS;
    }


    /**
     * Sets the mEINS value for this MEINS__ResultSet.
     * 
     * @param mEINS
     */
    public void setMEINS(jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS[] mEINS) {
        this.mEINS = mEINS;
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS getMEINS(int i) {
        return this.mEINS[i];
    }

    public void setMEINS(int i, jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS _value) {
        this.mEINS[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MEINS__ResultSet)) return false;
        MEINS__ResultSet other = (MEINS__ResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mEINS==null && other.getMEINS()==null) || 
             (this.mEINS!=null &&
              java.util.Arrays.equals(this.mEINS, other.getMEINS())));
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
        if (getMEINS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMEINS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMEINS(), i);
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
        new org.apache.axis.description.TypeDesc(MEINS__ResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__ResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEINS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "mEINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS"));
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
