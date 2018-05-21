/**
 * ResultSetBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class ResultSetBase  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private beans.ws.mdm.sap.com.ExecutionStatus executionStatus;

    public ResultSetBase() {
    }

    public ResultSetBase(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus;
    }


    /**
     * Gets the executionStatus value for this ResultSetBase.
     * 
     * @return executionStatus
     */
    public beans.ws.mdm.sap.com.ExecutionStatus getExecutionStatus() {
        return executionStatus;
    }


    /**
     * Sets the executionStatus value for this ResultSetBase.
     * 
     * @param executionStatus
     */
    public void setExecutionStatus(beans.ws.mdm.sap.com.ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultSetBase)) return false;
        ResultSetBase other = (ResultSetBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.executionStatus==null && other.getExecutionStatus()==null) || 
             (this.executionStatus!=null &&
              this.executionStatus.equals(other.getExecutionStatus())));
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
        if (getExecutionStatus() != null) {
            _hashCode += getExecutionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultSetBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ResultSetBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "executionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
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
