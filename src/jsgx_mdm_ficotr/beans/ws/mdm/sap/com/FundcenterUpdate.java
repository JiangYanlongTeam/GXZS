/**
 * FundcenterUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_ficotr.beans.ws.mdm.sap.com;

public class FundcenterUpdate  extends jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCreate  implements java.io.Serializable {
    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterID recordIdentification;

    public FundcenterUpdate() {
    }

    public FundcenterUpdate(
           java.lang.String applyNumber,
           java.lang.String fIKRS,
           java.lang.String fICTR,
           java.lang.String bEZEICH,
           java.lang.String bESCHR,
           java.lang.Boolean lVOMA,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String updateBy,
           java.lang.Boolean dATAC,
           java.util.Calendar dATAB,
           java.util.Calendar dATBIS,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeLookup bUKRS,
           java.util.Calendar applyData,
           java.util.Calendar applyTime,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping,
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterID recordIdentification) {
        super(
            applyNumber,
            fIKRS,
            fICTR,
            bEZEICH,
            bESCHR,
            lVOMA,
            aPMEM,
            applicant,
            updateBy,
            dATAC,
            dATAB,
            dATBIS,
            aPCOD,
            bUKRS,
            applyData,
            applyTime,
            serviceRelationshipsTuple,
            operation,
            keyMapping);
        this.recordIdentification = recordIdentification;
    }


    /**
     * Gets the recordIdentification value for this FundcenterUpdate.
     * 
     * @return recordIdentification
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterID getRecordIdentification() {
        return recordIdentification;
    }


    /**
     * Sets the recordIdentification value for this FundcenterUpdate.
     * 
     * @param recordIdentification
     */
    public void setRecordIdentification(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterID recordIdentification) {
        this.recordIdentification = recordIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundcenterUpdate)) return false;
        FundcenterUpdate other = (FundcenterUpdate) obj;
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
        new org.apache.axis.description.TypeDesc(FundcenterUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "recordIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterID"));
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
