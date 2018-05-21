/**
 * SearchMajor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_HRVi;

public class SearchMajor  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorQuery query;

    private beans.core.mdm.sap.com.RepositoryInformation reposInfo;

    public SearchMajor() {
    }

    public SearchMajor(
           jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorQuery query,
           beans.core.mdm.sap.com.RepositoryInformation reposInfo) {
           this.query = query;
           this.reposInfo = reposInfo;
    }


    /**
     * Gets the query value for this SearchMajor.
     * 
     * @return query
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorQuery getQuery() {
        return query;
    }


    /**
     * Sets the query value for this SearchMajor.
     * 
     * @param query
     */
    public void setQuery(jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorQuery query) {
        this.query = query;
    }


    /**
     * Gets the reposInfo value for this SearchMajor.
     * 
     * @return reposInfo
     */
    public beans.core.mdm.sap.com.RepositoryInformation getReposInfo() {
        return reposInfo;
    }


    /**
     * Sets the reposInfo value for this SearchMajor.
     * 
     * @param reposInfo
     */
    public void setReposInfo(beans.core.mdm.sap.com.RepositoryInformation reposInfo) {
        this.reposInfo = reposInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchMajor)) return false;
        SearchMajor other = (SearchMajor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.reposInfo==null && other.getReposInfo()==null) || 
             (this.reposInfo!=null &&
              this.reposInfo.equals(other.getReposInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getReposInfo() != null) {
            _hashCode += getReposInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchMajor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", ">searchMajor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorQuery"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reposInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"));
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
