/**
 * HTTPNoneBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_MATERIALWsd;

public class HTTPNoneBindingStub extends org.apache.axis.client.Stub implements JSGX_MDM_MATERIALWsd.JSGX_MDM_MATERIALVi {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[13];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchApprovalStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusQuery"), jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchClient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientQuery"), jsgx_mdm_material.beans.ws.mdm.sap.com.ClientQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.ClientResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDistributionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusQuery"), jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchIndustrySector");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorQuery"), jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMATKL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__Query"), jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Query.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__ResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMEINS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__Query"), jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Query.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__ResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMTPOS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__Query"), jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Query.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__ResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMaterialType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeQuery"), jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createMaterials");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "materials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ArrayOfMaterialsCreate"), jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateMaterials");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Materials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ArrayOfMaterialsUpdate"), jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMaterials");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsQuery"), jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationQuery"), jsgx_mdm_material.beans.ws.mdm.sap.com.OperationQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.OperationResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchProductGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupQuery"), jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupResultSet"));
        oper.setReturnClass(jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

    }

    public HTTPNoneBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public HTTPNoneBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public HTTPNoneBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.core.base", "AbstractDataObject");
            cachedSerQNames.add(qName);
            cls = base.core.mdm.sap.com.AbstractDataObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.core.base", "AbstractMdmDataObject");
            cachedSerQNames.add(qName);
            cls = base.core.mdm.sap.com.AbstractMdmDataObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation");
            cachedSerQNames.add(qName);
            cls = beans.core.mdm.sap.com.RepositoryInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ApprovalStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ArrayOfMaterialsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ArrayOfMaterialsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "Client");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.Client.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ClientCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ClientCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ClientID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ClientLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ClientQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ClientResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ClientUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ClientUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ClientUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ClientUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "DistributionStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySector");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "IndustrySectorUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "Materials");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.Materials.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialType");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MaterialTypeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__Create");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Create.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__Criteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Criteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__ID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__Lookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Lookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__Query");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__ResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__UniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__UniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MATKL__Update");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Update.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__Create");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Create.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__Criteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Criteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__ID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__Lookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Lookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__Query");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__ResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__UniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__UniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MEINS__Update");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Update.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__Create");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Create.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__Criteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Criteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__ID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__Lookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Lookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__Query");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__ResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__UniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__UniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "MTPOS__Update");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Update.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "Operation");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.OperationCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.OperationCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.OperationID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.OperationLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.OperationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.OperationResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.OperationUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.OperationUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "OperationUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.OperationUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ProductGroupUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_material", "ServiceRelationshipsTupleTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_material.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.ExecutionStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BasicRecordIdentification");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.BasicRecordIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.BooleanConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.BooleanCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.CreateConfigurationParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.DateTimeConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.DateTimeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.ExecutionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "Fault");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.Fault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "FieldDefinition");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.FieldDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMapping");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.KeyMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMappingConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.KeyMappingConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeywordConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.KeywordConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "NumericConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.NumericConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "NumericCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.NumericCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.PicklistConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.PicklistCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "RecordIdentifierConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.RecordIdentifierConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ResultDefinition");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.ResultDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ResultSetBase");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.ResultSetBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "SortDefinition");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.SortDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "SortField");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.SortField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.TextConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.TextCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.UpdateConfigurationParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchApprovalStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.ClientResultSet searchClient(jsgx_mdm_material.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchClient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.ClientResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.ClientResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.ClientResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchDistributionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet searchIndustrySector(jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchIndustrySector"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet searchMATKL(jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Query query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchMATKL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ResultSet searchMEINS(jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Query query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchMEINS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ResultSet searchMTPOS(jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Query query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchMTPOS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeResultSet searchMaterialType(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchMaterialType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCreate[] materials, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "createMaterials"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {materials, reposInfo, configurationParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (beans.ws.mdm.sap.com.ExecutionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (beans.ws.mdm.sap.com.ExecutionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, beans.ws.mdm.sap.com.ExecutionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsUpdate[] materials, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "updateMaterials"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {materials, reposInfo, configurationParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (beans.ws.mdm.sap.com.ExecutionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (beans.ws.mdm.sap.com.ExecutionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, beans.ws.mdm.sap.com.ExecutionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet searchMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchMaterials"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_material.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.OperationResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.OperationResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.OperationResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupResultSet searchProductGroup(jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_MATERIALVi", "searchProductGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
