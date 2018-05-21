/**
 * CostpoolResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class CostpoolResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.Costpool[] costpool;

    public CostpoolResultSet() {
    }

    public CostpoolResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.Costpool[] costpool) {
        super(
            executionStatus);
        this.costpool = costpool;
    }


    /**
     * Gets the costpool value for this CostpoolResultSet.
     * 
     * @return costpool
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.Costpool[] getCostpool() {
        return costpool;
    }


    /**
     * Sets the costpool value for this CostpoolResultSet.
     * 
     * @param costpool
     */
    public void setCostpool(jsgx_mdm_hr.beans.ws.mdm.sap.com.Costpool[] costpool) {
        this.costpool = costpool;
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.Costpool getCostpool(int i) {
        return this.costpool[i];
    }

    public void setCostpool(int i, jsgx_mdm_hr.beans.ws.mdm.sap.com.Costpool _value) {
        this.costpool[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CostpoolResultSet)) return false;
        CostpoolResultSet other = (CostpoolResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.costpool==null && other.getCostpool()==null) || 
             (this.costpool!=null &&
              java.util.Arrays.equals(this.costpool, other.getCostpool())));
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
        if (getCostpool() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostpool());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostpool(), i);
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
        new org.apache.axis.description.TypeDesc(CostpoolResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costpool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "costpool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Costpool"));
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
