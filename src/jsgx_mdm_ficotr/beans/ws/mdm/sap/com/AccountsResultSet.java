/**
 * AccountsResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class AccountsResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Accounts[] accounts;

    public AccountsResultSet() {
    }

    public AccountsResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Accounts[] accounts) {
        super(
            executionStatus);
        this.accounts = accounts;
    }


    /**
     * Gets the accounts value for this AccountsResultSet.
     * 
     * @return accounts
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Accounts[] getAccounts() {
        return accounts;
    }


    /**
     * Sets the accounts value for this AccountsResultSet.
     * 
     * @param accounts
     */
    public void setAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Accounts[] accounts) {
        this.accounts = accounts;
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Accounts getAccounts(int i) {
        return this.accounts[i];
    }

    public void setAccounts(int i, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Accounts _value) {
        this.accounts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountsResultSet)) return false;
        AccountsResultSet other = (AccountsResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accounts==null && other.getAccounts()==null) || 
             (this.accounts!=null &&
              java.util.Arrays.equals(this.accounts, other.getAccounts())));
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
        if (getAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccounts(), i);
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
        new org.apache.axis.description.TypeDesc(AccountsResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "accounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "Accounts"));
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
