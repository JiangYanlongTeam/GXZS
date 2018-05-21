/**
 * EmployeeUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class EmployeeUpdate  extends jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCreate  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeID recordIdentification;

    public EmployeeUpdate() {
    }

    public EmployeeUpdate(
           java.lang.String applyNumber,
           java.lang.String pERNR,
           java.lang.String nACHN,
           java.lang.String pLANS,
           java.lang.String pLANS_NAME,
           java.lang.String iCNUM,
           java.lang.String zTYE_JG,
           java.lang.String lOCAT,
           java.lang.String pSTLZ,
           java.lang.String zUSRID,
           java.lang.String zTYE_LXR,
           java.lang.String zTYE_LXRGX,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String applyReason,
           java.lang.String updateBy,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentLookup mASSN,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonLookup mASSG,
           java.util.Calendar eINDA,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderLookup gESCH,
           java.util.Calendar gBDAT,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup nATIO,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusLookup fAMST,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeLookup workType,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupLookup pERSG,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupLookup pERSK,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaLookup wERKS,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasLookup bTRTL,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaLookup aBKRS,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeLookup iCTYP,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsLookup pCN_RACKY,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple[] education,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCompetenceTuple[] language,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeLookup aNSSA,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple[] contact,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.PreviousEmployerTuple[] workExperience,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolLookup aNSVH,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.FamilyMemberTuple[] familyMembers,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping,
           jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeID recordIdentification) {
        super(
            applyNumber,
            pERNR,
            nACHN,
            pLANS,
            pLANS_NAME,
            iCNUM,
            zTYE_JG,
            lOCAT,
            pSTLZ,
            zUSRID,
            zTYE_LXR,
            zTYE_LXRGX,
            aPMEM,
            applicant,
            applyReason,
            updateBy,
            mASSN,
            mASSG,
            eINDA,
            gESCH,
            gBDAT,
            nATIO,
            fAMST,
            workType,
            pERSG,
            pERSK,
            wERKS,
            bTRTL,
            aBKRS,
            iCTYP,
            pCN_RACKY,
            education,
            language,
            aNSSA,
            contact,
            workExperience,
            aNSVH,
            familyMembers,
            aPCOD,
            applyDate,
            applyTime,
            serviceRelationshipsTuple,
            operation,
            keyMapping);
        this.recordIdentification = recordIdentification;
    }


    /**
     * Gets the recordIdentification value for this EmployeeUpdate.
     * 
     * @return recordIdentification
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeID getRecordIdentification() {
        return recordIdentification;
    }


    /**
     * Sets the recordIdentification value for this EmployeeUpdate.
     * 
     * @param recordIdentification
     */
    public void setRecordIdentification(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeID recordIdentification) {
        this.recordIdentification = recordIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeUpdate)) return false;
        EmployeeUpdate other = (EmployeeUpdate) obj;
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
        new org.apache.axis.description.TypeDesc(EmployeeUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "recordIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeID"));
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
