/**
 * ProductGroupResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_material.beans.ws.mdm.sap.com;

public class ProductGroupResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroup[] productGroup;

    public ProductGroupResultSet() {
    }

    public ProductGroupResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroup[] productGroup) {
        super(
            executionStatus);
        this.productGroup = productGroup;
    }


    /**
     * Gets the productGroup value for this ProductGroupResultSet.
     * 
     * @return productGroup
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroup[] getProductGroup() {
        return productGroup;
    }


    /**
     * Sets the productGroup value for this ProductGroupResultSet.
     * 
     * @param productGroup
     */
    public void setProductGroup(jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroup[] productGroup) {
        this.productGroup = productGroup;
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroup getProductGroup(int i) {
        return this.productGroup[i];
    }

    public void setProductGroup(int i, jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroup _value) {
        this.productGroup[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductGroupResultSet)) return false;
        ProductGroupResultSet other = (ProductGroupResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productGroup==null && other.getProductGroup()==null) || 
             (this.productGroup!=null &&
              java.util.Arrays.equals(this.productGroup, other.getProductGroup())));
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
        if (getProductGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductGroup(), i);
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
        new org.apache.axis.description.TypeDesc(ProductGroupResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "productGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroup"));
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
