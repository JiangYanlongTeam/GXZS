/**
 * RepositoryInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.core.mdm.sap.com;

public class RepositoryInformation  implements java.io.Serializable {
    private java.lang.String dataLang;

    private java.lang.String destinationName;

    private java.lang.String repositoryName;

    private java.lang.Boolean secureConnection;

    private java.lang.String serverName;

    public RepositoryInformation() {
    }

    public RepositoryInformation(
           java.lang.String dataLang,
           java.lang.String destinationName,
           java.lang.String repositoryName,
           java.lang.Boolean secureConnection,
           java.lang.String serverName) {
           this.dataLang = dataLang;
           this.destinationName = destinationName;
           this.repositoryName = repositoryName;
           this.secureConnection = secureConnection;
           this.serverName = serverName;
    }


    /**
     * Gets the dataLang value for this RepositoryInformation.
     * 
     * @return dataLang
     */
    public java.lang.String getDataLang() {
        return dataLang;
    }


    /**
     * Sets the dataLang value for this RepositoryInformation.
     * 
     * @param dataLang
     */
    public void setDataLang(java.lang.String dataLang) {
        this.dataLang = dataLang;
    }


    /**
     * Gets the destinationName value for this RepositoryInformation.
     * 
     * @return destinationName
     */
    public java.lang.String getDestinationName() {
        return destinationName;
    }


    /**
     * Sets the destinationName value for this RepositoryInformation.
     * 
     * @param destinationName
     */
    public void setDestinationName(java.lang.String destinationName) {
        this.destinationName = destinationName;
    }


    /**
     * Gets the repositoryName value for this RepositoryInformation.
     * 
     * @return repositoryName
     */
    public java.lang.String getRepositoryName() {
        return repositoryName;
    }


    /**
     * Sets the repositoryName value for this RepositoryInformation.
     * 
     * @param repositoryName
     */
    public void setRepositoryName(java.lang.String repositoryName) {
        this.repositoryName = repositoryName;
    }


    /**
     * Gets the secureConnection value for this RepositoryInformation.
     * 
     * @return secureConnection
     */
    public java.lang.Boolean getSecureConnection() {
        return secureConnection;
    }


    /**
     * Sets the secureConnection value for this RepositoryInformation.
     * 
     * @param secureConnection
     */
    public void setSecureConnection(java.lang.Boolean secureConnection) {
        this.secureConnection = secureConnection;
    }


    /**
     * Gets the serverName value for this RepositoryInformation.
     * 
     * @return serverName
     */
    public java.lang.String getServerName() {
        return serverName;
    }


    /**
     * Sets the serverName value for this RepositoryInformation.
     * 
     * @param serverName
     */
    public void setServerName(java.lang.String serverName) {
        this.serverName = serverName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RepositoryInformation)) return false;
        RepositoryInformation other = (RepositoryInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataLang==null && other.getDataLang()==null) || 
             (this.dataLang!=null &&
              this.dataLang.equals(other.getDataLang()))) &&
            ((this.destinationName==null && other.getDestinationName()==null) || 
             (this.destinationName!=null &&
              this.destinationName.equals(other.getDestinationName()))) &&
            ((this.repositoryName==null && other.getRepositoryName()==null) || 
             (this.repositoryName!=null &&
              this.repositoryName.equals(other.getRepositoryName()))) &&
            ((this.secureConnection==null && other.getSecureConnection()==null) || 
             (this.secureConnection!=null &&
              this.secureConnection.equals(other.getSecureConnection()))) &&
            ((this.serverName==null && other.getServerName()==null) || 
             (this.serverName!=null &&
              this.serverName.equals(other.getServerName())));
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
        if (getDataLang() != null) {
            _hashCode += getDataLang().hashCode();
        }
        if (getDestinationName() != null) {
            _hashCode += getDestinationName().hashCode();
        }
        if (getRepositoryName() != null) {
            _hashCode += getRepositoryName().hashCode();
        }
        if (getSecureConnection() != null) {
            _hashCode += getSecureConnection().hashCode();
        }
        if (getServerName() != null) {
            _hashCode += getServerName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RepositoryInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataLang");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "dataLang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "destinationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repositoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "repositoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secureConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "secureConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "serverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
