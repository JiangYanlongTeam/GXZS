/**
 * ExecutionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class ExecutionStatus  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String description;

    private java.lang.String dataObject;

    private beans.ws.mdm.sap.com.Fault[] fault;

    public ExecutionStatus() {
    }

    public ExecutionStatus(
           java.lang.String status,
           java.lang.String description,
           java.lang.String dataObject,
           beans.ws.mdm.sap.com.Fault[] fault) {
        this.status = status;
        this.description = description;
        this.dataObject = dataObject;
        this.fault = fault;
    }


    /**
     * Gets the status value for this ExecutionStatus.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExecutionStatus.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the description value for this ExecutionStatus.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ExecutionStatus.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dataObject value for this ExecutionStatus.
     * 
     * @return dataObject
     */
    public java.lang.String getDataObject() {
        return dataObject;
    }


    /**
     * Sets the dataObject value for this ExecutionStatus.
     * 
     * @param dataObject
     */
    public void setDataObject(java.lang.String dataObject) {
        this.dataObject = dataObject;
    }


    /**
     * Gets the fault value for this ExecutionStatus.
     * 
     * @return fault
     */
    public beans.ws.mdm.sap.com.Fault[] getFault() {
        return fault;
    }


    /**
     * Sets the fault value for this ExecutionStatus.
     * 
     * @param fault
     */
    public void setFault(beans.ws.mdm.sap.com.Fault[] fault) {
        this.fault = fault;
    }

    public beans.ws.mdm.sap.com.Fault getFault(int i) {
        return this.fault[i];
    }

    public void setFault(int i, beans.ws.mdm.sap.com.Fault _value) {
        this.fault[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecutionStatus)) return false;
        ExecutionStatus other = (ExecutionStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dataObject==null && other.getDataObject()==null) || 
             (this.dataObject!=null &&
              this.dataObject.equals(other.getDataObject()))) &&
            ((this.fault==null && other.getFault()==null) || 
             (this.fault!=null &&
              java.util.Arrays.equals(this.fault, other.getFault())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDataObject() != null) {
            _hashCode += getDataObject().hashCode();
        }
        if (getFault() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFault());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFault(), i);
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
        new org.apache.axis.description.TypeDesc(ExecutionStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataObject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "dataObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "fault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "Fault"));
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
