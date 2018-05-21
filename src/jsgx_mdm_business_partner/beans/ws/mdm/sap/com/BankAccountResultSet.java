/**
 * BankAccountResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class BankAccountResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount[] bankAccount;

    public BankAccountResultSet() {
    }

    public BankAccountResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount[] bankAccount) {
        super(
            executionStatus);
        this.bankAccount = bankAccount;
    }


    /**
     * Gets the bankAccount value for this BankAccountResultSet.
     * 
     * @return bankAccount
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount[] getBankAccount() {
        return bankAccount;
    }


    /**
     * Sets the bankAccount value for this BankAccountResultSet.
     * 
     * @param bankAccount
     */
    public void setBankAccount(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount[] bankAccount) {
        this.bankAccount = bankAccount;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount getBankAccount(int i) {
        return this.bankAccount[i];
    }

    public void setBankAccount(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount _value) {
        this.bankAccount[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccountResultSet)) return false;
        BankAccountResultSet other = (BankAccountResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bankAccount==null && other.getBankAccount()==null) || 
             (this.bankAccount!=null &&
              java.util.Arrays.equals(this.bankAccount, other.getBankAccount())));
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
        if (getBankAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankAccount(), i);
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
        new org.apache.axis.description.TypeDesc(BankAccountResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "bankAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccount"));
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
