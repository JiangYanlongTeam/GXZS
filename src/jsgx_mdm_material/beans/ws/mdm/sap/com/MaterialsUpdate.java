/**
 * MaterialsUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_material.beans.ws.mdm.sap.com;

public class MaterialsUpdate  extends jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCreate  implements java.io.Serializable {
    private jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsID recordIdentification;

    public MaterialsUpdate() {
    }

    public MaterialsUpdate(
           java.lang.String applyNumber,
           java.lang.String mATNR,
           java.lang.String mAKTX,
           java.lang.String _char,
           java.lang.String char1,
           java.lang.String char2,
           java.lang.String char3,
           java.lang.String char4,
           java.lang.String char5,
           java.lang.String char6,
           java.lang.String char7,
           java.lang.String char8,
           java.lang.String char9,
           java.lang.String char10,
           java.lang.String char11,
           java.lang.Boolean lVOMA,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String updateBy,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Lookup mATKL,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Lookup mEINS,
           jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorLookup mBRSH,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeLookup mTART,
           jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupLookup sPART,
           jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Lookup mTPOS,
           jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping,
           jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsID recordIdentification) {
        super(
            applyNumber,
            mATNR,
            mAKTX,
            _char,
            char1,
            char2,
            char3,
            char4,
            char5,
            char6,
            char7,
            char8,
            char9,
            char10,
            char11,
            lVOMA,
            aPMEM,
            applicant,
            updateBy,
            mATKL,
            mEINS,
            mBRSH,
            mTART,
            sPART,
            aPCOD,
            applyDate,
            applyTime,
            mTPOS,
            serviceRelationshipsTuple,
            operation,
            keyMapping);
        this.recordIdentification = recordIdentification;
    }


    /**
     * Gets the recordIdentification value for this MaterialsUpdate.
     * 
     * @return recordIdentification
     */
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsID getRecordIdentification() {
        return recordIdentification;
    }


    /**
     * Sets the recordIdentification value for this MaterialsUpdate.
     * 
     * @param recordIdentification
     */
    public void setRecordIdentification(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsID recordIdentification) {
        this.recordIdentification = recordIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaterialsUpdate)) return false;
        MaterialsUpdate other = (MaterialsUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recordIdentification==null && other.getRecordIdentification()==null) || 
             (this.recordIdentification!=null &&
              this.recordIdentification.equals(other.getRecordIdentification())));
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
        if (getRecordIdentification() != null) {
            _hashCode += getRecordIdentification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaterialsUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "recordIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsID"));
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
