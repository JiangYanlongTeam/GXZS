/**
 * ResultDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans.ws.mdm.sap.com;

public class ResultDefinition  extends base.core.mdm.sap.com.AbstractDataObject  implements java.io.Serializable {
    private java.lang.String fieldListType;

    private java.lang.String regionalLayer;

    private java.lang.Boolean retrieveKeyMapping;

    private java.lang.Boolean loadAttributes;

    private java.lang.Boolean filterQualifiedLinks;

    private java.lang.Boolean loadTupleValues;

    private beans.ws.mdm.sap.com.FieldDefinition[] fieldDefinition;

    private java.math.BigInteger pageNumber;

    private java.math.BigInteger pageSize;

    private beans.ws.mdm.sap.com.SortDefinition sortDefinition;

    public ResultDefinition() {
    }

    public ResultDefinition(
           java.lang.String fieldListType,
           java.lang.String regionalLayer,
           java.lang.Boolean retrieveKeyMapping,
           java.lang.Boolean loadAttributes,
           java.lang.Boolean filterQualifiedLinks,
           java.lang.Boolean loadTupleValues,
           beans.ws.mdm.sap.com.FieldDefinition[] fieldDefinition,
           java.math.BigInteger pageNumber,
           java.math.BigInteger pageSize,
           beans.ws.mdm.sap.com.SortDefinition sortDefinition) {
        this.fieldListType = fieldListType;
        this.regionalLayer = regionalLayer;
        this.retrieveKeyMapping = retrieveKeyMapping;
        this.loadAttributes = loadAttributes;
        this.filterQualifiedLinks = filterQualifiedLinks;
        this.loadTupleValues = loadTupleValues;
        this.fieldDefinition = fieldDefinition;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sortDefinition = sortDefinition;
    }


    /**
     * Gets the fieldListType value for this ResultDefinition.
     * 
     * @return fieldListType
     */
    public java.lang.String getFieldListType() {
        return fieldListType;
    }


    /**
     * Sets the fieldListType value for this ResultDefinition.
     * 
     * @param fieldListType
     */
    public void setFieldListType(java.lang.String fieldListType) {
        this.fieldListType = fieldListType;
    }


    /**
     * Gets the regionalLayer value for this ResultDefinition.
     * 
     * @return regionalLayer
     */
    public java.lang.String getRegionalLayer() {
        return regionalLayer;
    }


    /**
     * Sets the regionalLayer value for this ResultDefinition.
     * 
     * @param regionalLayer
     */
    public void setRegionalLayer(java.lang.String regionalLayer) {
        this.regionalLayer = regionalLayer;
    }


    /**
     * Gets the retrieveKeyMapping value for this ResultDefinition.
     * 
     * @return retrieveKeyMapping
     */
    public java.lang.Boolean getRetrieveKeyMapping() {
        return retrieveKeyMapping;
    }


    /**
     * Sets the retrieveKeyMapping value for this ResultDefinition.
     * 
     * @param retrieveKeyMapping
     */
    public void setRetrieveKeyMapping(java.lang.Boolean retrieveKeyMapping) {
        this.retrieveKeyMapping = retrieveKeyMapping;
    }


    /**
     * Gets the loadAttributes value for this ResultDefinition.
     * 
     * @return loadAttributes
     */
    public java.lang.Boolean getLoadAttributes() {
        return loadAttributes;
    }


    /**
     * Sets the loadAttributes value for this ResultDefinition.
     * 
     * @param loadAttributes
     */
    public void setLoadAttributes(java.lang.Boolean loadAttributes) {
        this.loadAttributes = loadAttributes;
    }


    /**
     * Gets the filterQualifiedLinks value for this ResultDefinition.
     * 
     * @return filterQualifiedLinks
     */
    public java.lang.Boolean getFilterQualifiedLinks() {
        return filterQualifiedLinks;
    }


    /**
     * Sets the filterQualifiedLinks value for this ResultDefinition.
     * 
     * @param filterQualifiedLinks
     */
    public void setFilterQualifiedLinks(java.lang.Boolean filterQualifiedLinks) {
        this.filterQualifiedLinks = filterQualifiedLinks;
    }


    /**
     * Gets the loadTupleValues value for this ResultDefinition.
     * 
     * @return loadTupleValues
     */
    public java.lang.Boolean getLoadTupleValues() {
        return loadTupleValues;
    }


    /**
     * Sets the loadTupleValues value for this ResultDefinition.
     * 
     * @param loadTupleValues
     */
    public void setLoadTupleValues(java.lang.Boolean loadTupleValues) {
        this.loadTupleValues = loadTupleValues;
    }


    /**
     * Gets the fieldDefinition value for this ResultDefinition.
     * 
     * @return fieldDefinition
     */
    public beans.ws.mdm.sap.com.FieldDefinition[] getFieldDefinition() {
        return fieldDefinition;
    }


    /**
     * Sets the fieldDefinition value for this ResultDefinition.
     * 
     * @param fieldDefinition
     */
    public void setFieldDefinition(beans.ws.mdm.sap.com.FieldDefinition[] fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
    }

    public beans.ws.mdm.sap.com.FieldDefinition getFieldDefinition(int i) {
        return this.fieldDefinition[i];
    }

    public void setFieldDefinition(int i, beans.ws.mdm.sap.com.FieldDefinition _value) {
        this.fieldDefinition[i] = _value;
    }


    /**
     * Gets the pageNumber value for this ResultDefinition.
     * 
     * @return pageNumber
     */
    public java.math.BigInteger getPageNumber() {
        return pageNumber;
    }


    /**
     * Sets the pageNumber value for this ResultDefinition.
     * 
     * @param pageNumber
     */
    public void setPageNumber(java.math.BigInteger pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * Gets the pageSize value for this ResultDefinition.
     * 
     * @return pageSize
     */
    public java.math.BigInteger getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this ResultDefinition.
     * 
     * @param pageSize
     */
    public void setPageSize(java.math.BigInteger pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the sortDefinition value for this ResultDefinition.
     * 
     * @return sortDefinition
     */
    public beans.ws.mdm.sap.com.SortDefinition getSortDefinition() {
        return sortDefinition;
    }


    /**
     * Sets the sortDefinition value for this ResultDefinition.
     * 
     * @param sortDefinition
     */
    public void setSortDefinition(beans.ws.mdm.sap.com.SortDefinition sortDefinition) {
        this.sortDefinition = sortDefinition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultDefinition)) return false;
        ResultDefinition other = (ResultDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fieldListType==null && other.getFieldListType()==null) || 
             (this.fieldListType!=null &&
              this.fieldListType.equals(other.getFieldListType()))) &&
            ((this.regionalLayer==null && other.getRegionalLayer()==null) || 
             (this.regionalLayer!=null &&
              this.regionalLayer.equals(other.getRegionalLayer()))) &&
            ((this.retrieveKeyMapping==null && other.getRetrieveKeyMapping()==null) || 
             (this.retrieveKeyMapping!=null &&
              this.retrieveKeyMapping.equals(other.getRetrieveKeyMapping()))) &&
            ((this.loadAttributes==null && other.getLoadAttributes()==null) || 
             (this.loadAttributes!=null &&
              this.loadAttributes.equals(other.getLoadAttributes()))) &&
            ((this.filterQualifiedLinks==null && other.getFilterQualifiedLinks()==null) || 
             (this.filterQualifiedLinks!=null &&
              this.filterQualifiedLinks.equals(other.getFilterQualifiedLinks()))) &&
            ((this.loadTupleValues==null && other.getLoadTupleValues()==null) || 
             (this.loadTupleValues!=null &&
              this.loadTupleValues.equals(other.getLoadTupleValues()))) &&
            ((this.fieldDefinition==null && other.getFieldDefinition()==null) || 
             (this.fieldDefinition!=null &&
              java.util.Arrays.equals(this.fieldDefinition, other.getFieldDefinition()))) &&
            ((this.pageNumber==null && other.getPageNumber()==null) || 
             (this.pageNumber!=null &&
              this.pageNumber.equals(other.getPageNumber()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.sortDefinition==null && other.getSortDefinition()==null) || 
             (this.sortDefinition!=null &&
              this.sortDefinition.equals(other.getSortDefinition())));
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
        if (getFieldListType() != null) {
            _hashCode += getFieldListType().hashCode();
        }
        if (getRegionalLayer() != null) {
            _hashCode += getRegionalLayer().hashCode();
        }
        if (getRetrieveKeyMapping() != null) {
            _hashCode += getRetrieveKeyMapping().hashCode();
        }
        if (getLoadAttributes() != null) {
            _hashCode += getLoadAttributes().hashCode();
        }
        if (getFilterQualifiedLinks() != null) {
            _hashCode += getFilterQualifiedLinks().hashCode();
        }
        if (getLoadTupleValues() != null) {
            _hashCode += getLoadTupleValues().hashCode();
        }
        if (getFieldDefinition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldDefinition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldDefinition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageNumber() != null) {
            _hashCode += getPageNumber().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getSortDefinition() != null) {
            _hashCode += getSortDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ResultDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldListType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "fieldListType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionalLayer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "regionalLayer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveKeyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "retrieveKeyMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "loadAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterQualifiedLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "filterQualifiedLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadTupleValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "loadTupleValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "fieldDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "FieldDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "pageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "sortDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "SortDefinition"));
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
