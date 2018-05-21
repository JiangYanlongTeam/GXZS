/**
 * KeyMappingConstraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class KeyMappingConstraint  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private java.lang.String remoteSystem;

    private java.lang.String remoteKey;

    public KeyMappingConstraint() {
    }

    public KeyMappingConstraint(
           java.lang.String remoteSystem,
           java.lang.String remoteKey) {
        this.remoteSystem = remoteSystem;
        this.remoteKey = remoteKey;
    }


    /**
     * Gets the remoteSystem value for this KeyMappingConstraint.
     * 
     * @return remoteSystem
     */
    public java.lang.String getRemoteSystem() {
        return remoteSystem;
    }


    /**
     * Sets the remoteSystem value for this KeyMappingConstraint.
     * 
     * @param remoteSystem
     */
    public void setRemoteSystem(java.lang.String remoteSystem) {
        this.remoteSystem = remoteSystem;
    }


    /**
     * Gets the remoteKey value for this KeyMappingConstraint.
     * 
     * @return remoteKey
     */
    public java.lang.String getRemoteKey() {
        return remoteKey;
    }


    /**
     * Sets the remoteKey value for this KeyMappingConstraint.
     * 
     * @param remoteKey
     */
    public void setRemoteKey(java.lang.String remoteKey) {
        this.remoteKey = remoteKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeyMappingConstraint)) return false;
        KeyMappingConstraint other = (KeyMappingConstraint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.remoteSystem==null && other.getRemoteSystem()==null) || 
             (this.remoteSystem!=null &&
              this.remoteSystem.equals(other.getRemoteSystem()))) &&
            ((this.remoteKey==null && other.getRemoteKey()==null) || 
             (this.remoteKey!=null &&
              this.remoteKey.equals(other.getRemoteKey())));
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
        if (getRemoteSystem() != null) {
            _hashCode += getRemoteSystem().hashCode();
        }
        if (getRemoteKey() != null) {
            _hashCode += getRemoteKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeyMappingConstraint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMappingConstraint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "remoteSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "remoteKey"));
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
