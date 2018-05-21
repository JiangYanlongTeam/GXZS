/**
 * ServiceRelationshipsUniqueConstraint1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class ServiceRelationshipsUniqueConstraint1  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String cLIENT_SYSTEM;

    public ServiceRelationshipsUniqueConstraint1() {
    }

    public ServiceRelationshipsUniqueConstraint1(
           java.lang.String cLIENT_SYSTEM) {
        this.cLIENT_SYSTEM = cLIENT_SYSTEM;
    }


    /**
     * Gets the cLIENT_SYSTEM value for this ServiceRelationshipsUniqueConstraint1.
     * 
     * @return cLIENT_SYSTEM
     */
    public java.lang.String getCLIENT_SYSTEM() {
        return cLIENT_SYSTEM;
    }


    /**
     * Sets the cLIENT_SYSTEM value for this ServiceRelationshipsUniqueConstraint1.
     * 
     * @param cLIENT_SYSTEM
     */
    public void setCLIENT_SYSTEM(java.lang.String cLIENT_SYSTEM) {
        this.cLIENT_SYSTEM = cLIENT_SYSTEM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRelationshipsUniqueConstraint1)) return false;
        ServiceRelationshipsUniqueConstraint1 other = (ServiceRelationshipsUniqueConstraint1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cLIENT_SYSTEM==null && other.getCLIENT_SYSTEM()==null) || 
             (this.cLIENT_SYSTEM!=null &&
              this.cLIENT_SYSTEM.equals(other.getCLIENT_SYSTEM())));
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
        if (getCLIENT_SYSTEM() != null) {
            _hashCode += getCLIENT_SYSTEM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRelationshipsUniqueConstraint1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsUniqueConstraint1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENT_SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "cLIENT_SYSTEM"));
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
