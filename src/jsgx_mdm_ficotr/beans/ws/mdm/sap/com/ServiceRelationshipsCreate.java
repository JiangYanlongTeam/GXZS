/**
 * ServiceRelationshipsCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class ServiceRelationshipsCreate  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String cLIENT_SYSTEM_NAME;

    private java.lang.String dGUID;

    private java.lang.String rETURN;

    private beans.ws.mdm.sap.com.MultilingualText[] cLIENT_SYSTEM;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup dISTUS;

    public ServiceRelationshipsCreate() {
    }

    public ServiceRelationshipsCreate(
           java.lang.String cLIENT_SYSTEM_NAME,
           java.lang.String dGUID,
           java.lang.String rETURN,
           beans.ws.mdm.sap.com.MultilingualText[] cLIENT_SYSTEM,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup dISTUS) {
        this.cLIENT_SYSTEM_NAME = cLIENT_SYSTEM_NAME;
        this.dGUID = dGUID;
        this.rETURN = rETURN;
        this.cLIENT_SYSTEM = cLIENT_SYSTEM;
        this.dISTUS = dISTUS;
    }


    /**
     * Gets the cLIENT_SYSTEM_NAME value for this ServiceRelationshipsCreate.
     * 
     * @return cLIENT_SYSTEM_NAME
     */
    public java.lang.String getCLIENT_SYSTEM_NAME() {
        return cLIENT_SYSTEM_NAME;
    }


    /**
     * Sets the cLIENT_SYSTEM_NAME value for this ServiceRelationshipsCreate.
     * 
     * @param cLIENT_SYSTEM_NAME
     */
    public void setCLIENT_SYSTEM_NAME(java.lang.String cLIENT_SYSTEM_NAME) {
        this.cLIENT_SYSTEM_NAME = cLIENT_SYSTEM_NAME;
    }


    /**
     * Gets the dGUID value for this ServiceRelationshipsCreate.
     * 
     * @return dGUID
     */
    public java.lang.String getDGUID() {
        return dGUID;
    }


    /**
     * Sets the dGUID value for this ServiceRelationshipsCreate.
     * 
     * @param dGUID
     */
    public void setDGUID(java.lang.String dGUID) {
        this.dGUID = dGUID;
    }


    /**
     * Gets the rETURN value for this ServiceRelationshipsCreate.
     * 
     * @return rETURN
     */
    public java.lang.String getRETURN() {
        return rETURN;
    }


    /**
     * Sets the rETURN value for this ServiceRelationshipsCreate.
     * 
     * @param rETURN
     */
    public void setRETURN(java.lang.String rETURN) {
        this.rETURN = rETURN;
    }


    /**
     * Gets the cLIENT_SYSTEM value for this ServiceRelationshipsCreate.
     * 
     * @return cLIENT_SYSTEM
     */
    public beans.ws.mdm.sap.com.MultilingualText[] getCLIENT_SYSTEM() {
        return cLIENT_SYSTEM;
    }


    /**
     * Sets the cLIENT_SYSTEM value for this ServiceRelationshipsCreate.
     * 
     * @param cLIENT_SYSTEM
     */
    public void setCLIENT_SYSTEM(beans.ws.mdm.sap.com.MultilingualText[] cLIENT_SYSTEM) {
        this.cLIENT_SYSTEM = cLIENT_SYSTEM;
    }

    public beans.ws.mdm.sap.com.MultilingualText getCLIENT_SYSTEM(int i) {
        return this.cLIENT_SYSTEM[i];
    }

    public void setCLIENT_SYSTEM(int i, beans.ws.mdm.sap.com.MultilingualText _value) {
        this.cLIENT_SYSTEM[i] = _value;
    }


    /**
     * Gets the dISTUS value for this ServiceRelationshipsCreate.
     * 
     * @return dISTUS
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup getDISTUS() {
        return dISTUS;
    }


    /**
     * Sets the dISTUS value for this ServiceRelationshipsCreate.
     * 
     * @param dISTUS
     */
    public void setDISTUS(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup dISTUS) {
        this.dISTUS = dISTUS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRelationshipsCreate)) return false;
        ServiceRelationshipsCreate other = (ServiceRelationshipsCreate) obj;
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
              this.cLIENT_SYSTEM_NAME.equals(other.getCLIENT_SYSTEM_NAME()))) &&
            ((this.dGUID==null && other.getDGUID()==null) || 
             (this.dGUID!=null &&
              this.dGUID.equals(other.getDGUID()))) &&
            ((this.rETURN==null && other.getRETURN()==null) || 
             (this.rETURN!=null &&
              this.rETURN.equals(other.getRETURN()))) &&
            ((this.cLIENT_SYSTEM==null && other.getCLIENT_SYSTEM()==null) || 
             (this.cLIENT_SYSTEM!=null &&
              java.util.Arrays.equals(this.cLIENT_SYSTEM, other.getCLIENT_SYSTEM()))) &&
            ((this.dISTUS==null && other.getDISTUS()==null) || 
             (this.dISTUS!=null &&
              this.dISTUS.equals(other.getDISTUS())));
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
        if (getDGUID() != null) {
            _hashCode += getDGUID().hashCode();
        }
        if (getRETURN() != null) {
            _hashCode += getRETURN().hashCode();
        }
        if (getCLIENT_SYSTEM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCLIENT_SYSTEM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCLIENT_SYSTEM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDISTUS() != null) {
            _hashCode += getDISTUS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRelationshipsCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENT_SYSTEM_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "cLIENT_SYSTEM_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "dGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETURN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "rETURN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENT_SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "cLIENT_SYSTEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "MultilingualText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISTUS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "dISTUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusLookup"));
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
