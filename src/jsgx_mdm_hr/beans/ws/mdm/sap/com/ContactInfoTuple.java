/**
 * ContactInfoTuple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class ContactInfoTuple  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String uSRID;

    private java.lang.String displayValue;

    private java.lang.Boolean removeTupleValueIndicator;

    private jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeLookup uSRTY;

    private beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId;

    public ContactInfoTuple() {
    }

    public ContactInfoTuple(
           java.lang.String uSRID,
           java.lang.String displayValue,
           java.lang.Boolean removeTupleValueIndicator,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeLookup uSRTY,
           beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.uSRID = uSRID;
        this.displayValue = displayValue;
        this.removeTupleValueIndicator = removeTupleValueIndicator;
        this.uSRTY = uSRTY;
        this.tupleValueId = tupleValueId;
    }


    /**
     * Gets the uSRID value for this ContactInfoTuple.
     * 
     * @return uSRID
     */
    public java.lang.String getUSRID() {
        return uSRID;
    }


    /**
     * Sets the uSRID value for this ContactInfoTuple.
     * 
     * @param uSRID
     */
    public void setUSRID(java.lang.String uSRID) {
        this.uSRID = uSRID;
    }


    /**
     * Gets the displayValue value for this ContactInfoTuple.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this ContactInfoTuple.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the removeTupleValueIndicator value for this ContactInfoTuple.
     * 
     * @return removeTupleValueIndicator
     */
    public java.lang.Boolean getRemoveTupleValueIndicator() {
        return removeTupleValueIndicator;
    }


    /**
     * Sets the removeTupleValueIndicator value for this ContactInfoTuple.
     * 
     * @param removeTupleValueIndicator
     */
    public void setRemoveTupleValueIndicator(java.lang.Boolean removeTupleValueIndicator) {
        this.removeTupleValueIndicator = removeTupleValueIndicator;
    }


    /**
     * Gets the uSRTY value for this ContactInfoTuple.
     * 
     * @return uSRTY
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeLookup getUSRTY() {
        return uSRTY;
    }


    /**
     * Sets the uSRTY value for this ContactInfoTuple.
     * 
     * @param uSRTY
     */
    public void setUSRTY(jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeLookup uSRTY) {
        this.uSRTY = uSRTY;
    }


    /**
     * Gets the tupleValueId value for this ContactInfoTuple.
     * 
     * @return tupleValueId
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getTupleValueId() {
        return tupleValueId;
    }


    /**
     * Sets the tupleValueId value for this ContactInfoTuple.
     * 
     * @param tupleValueId
     */
    public void setTupleValueId(beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.tupleValueId = tupleValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContactInfoTuple)) return false;
        ContactInfoTuple other = (ContactInfoTuple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uSRID==null && other.getUSRID()==null) || 
             (this.uSRID!=null &&
              this.uSRID.equals(other.getUSRID()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.removeTupleValueIndicator==null && other.getRemoveTupleValueIndicator()==null) || 
             (this.removeTupleValueIndicator!=null &&
              this.removeTupleValueIndicator.equals(other.getRemoveTupleValueIndicator()))) &&
            ((this.uSRTY==null && other.getUSRTY()==null) || 
             (this.uSRTY!=null &&
              this.uSRTY.equals(other.getUSRTY()))) &&
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
        if (getUSRID() != null) {
            _hashCode += getUSRID().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getRemoveTupleValueIndicator() != null) {
            _hashCode += getRemoveTupleValueIndicator().hashCode();
        }
        if (getUSRTY() != null) {
            _hashCode += getUSRTY().hashCode();
        }
        if (getTupleValueId() != null) {
            _hashCode += getTupleValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContactInfoTuple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactInfoTuple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USRID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "uSRID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeTupleValueIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "removeTupleValueIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USRTY");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "uSRTY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tupleValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "tupleValueId"));
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
