/**
 * ServiceRelationshipsTupleTuple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class ServiceRelationshipsTupleTuple  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String rETURN;

    private java.lang.String displayValue;

    private java.lang.Boolean removeTupleValueIndicator;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup cLIENT_SYSTEM;

    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup dISTUS;

    private beans.ws.mdm.sap.com.MultilingualText[] gUID;

    private beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId;

    public ServiceRelationshipsTupleTuple() {
    }

    public ServiceRelationshipsTupleTuple(
           java.lang.String rETURN,
           java.lang.String displayValue,
           java.lang.Boolean removeTupleValueIndicator,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup cLIENT_SYSTEM,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup dISTUS,
           beans.ws.mdm.sap.com.MultilingualText[] gUID,
           beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.rETURN = rETURN;
        this.displayValue = displayValue;
        this.removeTupleValueIndicator = removeTupleValueIndicator;
        this.cLIENT_SYSTEM = cLIENT_SYSTEM;
        this.dISTUS = dISTUS;
        this.gUID = gUID;
        this.tupleValueId = tupleValueId;
    }


    /**
     * Gets the rETURN value for this ServiceRelationshipsTupleTuple.
     * 
     * @return rETURN
     */
    public java.lang.String getRETURN() {
        return rETURN;
    }


    /**
     * Sets the rETURN value for this ServiceRelationshipsTupleTuple.
     * 
     * @param rETURN
     */
    public void setRETURN(java.lang.String rETURN) {
        this.rETURN = rETURN;
    }


    /**
     * Gets the displayValue value for this ServiceRelationshipsTupleTuple.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this ServiceRelationshipsTupleTuple.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the removeTupleValueIndicator value for this ServiceRelationshipsTupleTuple.
     * 
     * @return removeTupleValueIndicator
     */
    public java.lang.Boolean getRemoveTupleValueIndicator() {
        return removeTupleValueIndicator;
    }


    /**
     * Sets the removeTupleValueIndicator value for this ServiceRelationshipsTupleTuple.
     * 
     * @param removeTupleValueIndicator
     */
    public void setRemoveTupleValueIndicator(java.lang.Boolean removeTupleValueIndicator) {
        this.removeTupleValueIndicator = removeTupleValueIndicator;
    }


    /**
     * Gets the cLIENT_SYSTEM value for this ServiceRelationshipsTupleTuple.
     * 
     * @return cLIENT_SYSTEM
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup getCLIENT_SYSTEM() {
        return cLIENT_SYSTEM;
    }


    /**
     * Sets the cLIENT_SYSTEM value for this ServiceRelationshipsTupleTuple.
     * 
     * @param cLIENT_SYSTEM
     */
    public void setCLIENT_SYSTEM(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup cLIENT_SYSTEM) {
        this.cLIENT_SYSTEM = cLIENT_SYSTEM;
    }


    /**
     * Gets the dISTUS value for this ServiceRelationshipsTupleTuple.
     * 
     * @return dISTUS
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup getDISTUS() {
        return dISTUS;
    }


    /**
     * Sets the dISTUS value for this ServiceRelationshipsTupleTuple.
     * 
     * @param dISTUS
     */
    public void setDISTUS(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup dISTUS) {
        this.dISTUS = dISTUS;
    }


    /**
     * Gets the gUID value for this ServiceRelationshipsTupleTuple.
     * 
     * @return gUID
     */
    public beans.ws.mdm.sap.com.MultilingualText[] getGUID() {
        return gUID;
    }


    /**
     * Sets the gUID value for this ServiceRelationshipsTupleTuple.
     * 
     * @param gUID
     */
    public void setGUID(beans.ws.mdm.sap.com.MultilingualText[] gUID) {
        this.gUID = gUID;
    }

    public beans.ws.mdm.sap.com.MultilingualText getGUID(int i) {
        return this.gUID[i];
    }

    public void setGUID(int i, beans.ws.mdm.sap.com.MultilingualText _value) {
        this.gUID[i] = _value;
    }


    /**
     * Gets the tupleValueId value for this ServiceRelationshipsTupleTuple.
     * 
     * @return tupleValueId
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getTupleValueId() {
        return tupleValueId;
    }


    /**
     * Sets the tupleValueId value for this ServiceRelationshipsTupleTuple.
     * 
     * @param tupleValueId
     */
    public void setTupleValueId(beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.tupleValueId = tupleValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRelationshipsTupleTuple)) return false;
        ServiceRelationshipsTupleTuple other = (ServiceRelationshipsTupleTuple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rETURN==null && other.getRETURN()==null) || 
             (this.rETURN!=null &&
              this.rETURN.equals(other.getRETURN()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.removeTupleValueIndicator==null && other.getRemoveTupleValueIndicator()==null) || 
             (this.removeTupleValueIndicator!=null &&
              this.removeTupleValueIndicator.equals(other.getRemoveTupleValueIndicator()))) &&
            ((this.cLIENT_SYSTEM==null && other.getCLIENT_SYSTEM()==null) || 
             (this.cLIENT_SYSTEM!=null &&
              this.cLIENT_SYSTEM.equals(other.getCLIENT_SYSTEM()))) &&
            ((this.dISTUS==null && other.getDISTUS()==null) || 
             (this.dISTUS!=null &&
              this.dISTUS.equals(other.getDISTUS()))) &&
            ((this.gUID==null && other.getGUID()==null) || 
             (this.gUID!=null &&
              java.util.Arrays.equals(this.gUID, other.getGUID()))) &&
            ((this.tupleValueId==null && other.getTupleValueId()==null) || 
             (this.tupleValueId!=null &&
              this.tupleValueId.equals(other.getTupleValueId())));
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
        if (getRETURN() != null) {
            _hashCode += getRETURN().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getRemoveTupleValueIndicator() != null) {
            _hashCode += getRemoveTupleValueIndicator().hashCode();
        }
        if (getCLIENT_SYSTEM() != null) {
            _hashCode += getCLIENT_SYSTEM().hashCode();
        }
        if (getDISTUS() != null) {
            _hashCode += getDISTUS().hashCode();
        }
        if (getGUID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGUID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGUID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTupleValueId() != null) {
            _hashCode += getTupleValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRelationshipsTupleTuple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsTupleTuple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETURN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "rETURN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeTupleValueIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "removeTupleValueIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENT_SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "cLIENT_SYSTEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISTUS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "dISTUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "gUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "MultilingualText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tupleValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "tupleValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BasicRecordIdentification"));
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
