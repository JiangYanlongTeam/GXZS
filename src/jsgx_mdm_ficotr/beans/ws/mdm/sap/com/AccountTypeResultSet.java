/**
 * AccountTypeResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class AccountTypeResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountType[] accountType;

    public AccountTypeResultSet() {
    }

    public AccountTypeResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountType[] accountType) {
        super(
            executionStatus);
        this.accountType = accountType;
    }


    /**
     * Gets the accountType value for this AccountTypeResultSet.
     * 
     * @return accountType
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountType[] getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this AccountTypeResultSet.
     * 
     * @param accountType
     */
    public void setAccountType(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountType[] accountType) {
        this.accountType = accountType;
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountType getAccountType(int i) {
        return this.accountType[i];
    }

    public void setAccountType(int i, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountType _value) {
        this.accountType[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountTypeResultSet)) return false;
        AccountTypeResultSet other = (AccountTypeResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              java.util.Arrays.equals(this.accountType, other.getAccountType())));
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
        if (getAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountType(), i);
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
        new org.apache.axis.description.TypeDesc(AccountTypeResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountType"));
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
