/**
 * SortDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class SortDefinition  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private beans.ws.mdm.sap.com.SortField sortField;

    public SortDefinition() {
    }

    public SortDefinition(
           beans.ws.mdm.sap.com.SortField sortField) {
        this.sortField = sortField;
    }


    /**
     * Gets the sortField value for this SortDefinition.
     * 
     * @return sortField
     */
    public beans.ws.mdm.sap.com.SortField getSortField() {
        return sortField;
    }


    /**
     * Sets the sortField value for this SortDefinition.
     * 
     * @param sortField
     */
    public void setSortField(beans.ws.mdm.sap.com.SortField sortField) {
        this.sortField = sortField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SortDefinition)) return false;
        SortDefinition other = (SortDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sortField==null && other.getSortField()==null) || 
             (this.sortField!=null &&
              this.sortField.equals(other.getSortField())));
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
        if (getSortField() != null) {
            _hashCode += getSortField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SortDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "SortDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortField");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "sortField"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "SortField"));
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
