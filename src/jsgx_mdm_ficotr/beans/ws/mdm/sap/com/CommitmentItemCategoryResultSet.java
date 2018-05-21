/**
 * CommitmentItemCategoryResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class CommitmentItemCategoryResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategory[] commitmentItemCategory;

    public CommitmentItemCategoryResultSet() {
    }

    public CommitmentItemCategoryResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategory[] commitmentItemCategory) {
        super(
            executionStatus);
        this.commitmentItemCategory = commitmentItemCategory;
    }


    /**
     * Gets the commitmentItemCategory value for this CommitmentItemCategoryResultSet.
     * 
     * @return commitmentItemCategory
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategory[] getCommitmentItemCategory() {
        return commitmentItemCategory;
    }


    /**
     * Sets the commitmentItemCategory value for this CommitmentItemCategoryResultSet.
     * 
     * @param commitmentItemCategory
     */
    public void setCommitmentItemCategory(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategory[] commitmentItemCategory) {
        this.commitmentItemCategory = commitmentItemCategory;
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategory getCommitmentItemCategory(int i) {
        return this.commitmentItemCategory[i];
    }

    public void setCommitmentItemCategory(int i, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategory _value) {
        this.commitmentItemCategory[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommitmentItemCategoryResultSet)) return false;
        CommitmentItemCategoryResultSet other = (CommitmentItemCategoryResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.commitmentItemCategory==null && other.getCommitmentItemCategory()==null) || 
             (this.commitmentItemCategory!=null &&
              java.util.Arrays.equals(this.commitmentItemCategory, other.getCommitmentItemCategory())));
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
        if (getCommitmentItemCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommitmentItemCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommitmentItemCategory(), i);
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
        new org.apache.axis.description.TypeDesc(CommitmentItemCategoryResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commitmentItemCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "commitmentItemCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategory"));
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
