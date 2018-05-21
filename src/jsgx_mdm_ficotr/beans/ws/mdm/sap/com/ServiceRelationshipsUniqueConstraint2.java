/**
 * ServiceRelationshipsUniqueConstraint2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class ServiceRelationshipsUniqueConstraint2  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String cLIENT_SYSTEM_NAME;

    public ServiceRelationshipsUniqueConstraint2() {
    }

    public ServiceRelationshipsUniqueConstraint2(
           java.lang.String cLIENT_SYSTEM_NAME) {
        this.cLIENT_SYSTEM_NAME = cLIENT_SYSTEM_NAME;
    }


    /**
     * Gets the cLIENT_SYSTEM_NAME value for this ServiceRelationshipsUniqueConstraint2.
     * 
     * @return cLIENT_SYSTEM_NAME
     */
    public java.lang.String getCLIENT_SYSTEM_NAME() {
        return cLIENT_SYSTEM_NAME;
    }


    /**
     * Sets the cLIENT_SYSTEM_NAME value for this ServiceRelationshipsUniqueConstraint2.
     * 
     * @param cLIENT_SYSTEM_NAME
     */
    public void setCLIENT_SYSTEM_NAME(java.lang.String cLIENT_SYSTEM_NAME) {
        this.cLIENT_SYSTEM_NAME = cLIENT_SYSTEM_NAME;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRelationshipsUniqueConstraint2)) return false;
        ServiceRelationshipsUniqueConstraint2 other = (ServiceRelationshipsUniqueConstraint2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cLIENT_SYSTEM_NAME==null && other.getCLIENT_SYSTEM_NAME()==null) || 
             (this.cLIENT_SYSTEM_NAME!=null &&
              this.cLIENT_SYSTEM_NAME.equals(other.getCLIENT_SYSTEM_NAME())));
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
        if (getCLIENT_SYSTEM_NAME() != null) {
            _hashCode += getCLIENT_SYSTEM_NAME().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRelationshipsUniqueConstraint2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsUniqueConstraint2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENT_SYSTEM_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "cLIENT_SYSTEM_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
