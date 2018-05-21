/**
 * AccountGroupResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class AccountGroupResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroup[] accountGroup;

    public AccountGroupResultSet() {
    }

    public AccountGroupResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroup[] accountGroup) {
        super(
            executionStatus);
        this.accountGroup = accountGroup;
    }


    /**
     * Gets the accountGroup value for this AccountGroupResultSet.
     * 
     * @return accountGroup
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroup[] getAccountGroup() {
        return accountGroup;
    }


    /**
     * Sets the accountGroup value for this AccountGroupResultSet.
     * 
     * @param accountGroup
     */
    public void setAccountGroup(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroup[] accountGroup) {
        this.accountGroup = accountGroup;
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroup getAccountGroup(int i) {
        return this.accountGroup[i];
    }

    public void setAccountGroup(int i, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroup _value) {
        this.accountGroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountGroupResultSet)) return false;
        AccountGroupResultSet other = (AccountGroupResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountGroup==null && other.getAccountGroup()==null) || 
             (this.accountGroup!=null &&
              java.util.Arrays.equals(this.accountGroup, other.getAccountGroup())));
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
        if (getAccountGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountGroup(), i);
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
        new org.apache.axis.description.TypeDesc(AccountGroupResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "accountGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroup"));
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
