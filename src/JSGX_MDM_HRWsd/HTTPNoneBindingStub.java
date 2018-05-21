/**
 * HTTPNoneBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_HRWsd;

public class HTTPNoneBindingStub extends org.apache.axis.client.Stub implements JSGX_MDM_HRWsd.JSGX_MDM_HRVi {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[39];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchAddressType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchApprovalStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchClient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchContactType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCostpool");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDegree");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDistributionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchEducationType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createEmployee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "employee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ArrayOfEmployeeCreate"), jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
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
        oper.setName("updateEmployee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Employee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ArrayOfEmployeeUpdate"), jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchEmployee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchEmployeeGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchEmployeeSubgroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchEthnicGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchGender");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchID_Type");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchIncident");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchIndustry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchJobPosition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchLanguageLevel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchLearningForm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMajor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchMaritalStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchNationality");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchOperationReason");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPayrollArea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPersonnelArea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPersonnelSubareas");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchPoliticalStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchProducts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ProductsQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ProductsResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchRelationship");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchSchool");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchSchoolType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchServiceRelationships");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchWorkType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchEducationSystemUnit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitQuery"), jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitResultSet"));
        oper.setReturnClass(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

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
        addBindings2();
        addBindings3();
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

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressType");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "AddressTypeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ApprovalStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ArrayOfEmployeeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ArrayOfEmployeeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Categories");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Categories.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CategoriesUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Client");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Client.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ClientUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactInfoTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactInfoTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactType");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ContactTypeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Costpool");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Costpool.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "CostpoolUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Degree");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Degree.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DegreeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "DistributionStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnit");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationSystemUnitUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationType");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeResultSet.class;
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
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EducationTypeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Employee");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Employee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeGroupUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeSubgroupUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EmployeeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroups");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "EthnicGroupsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "FamilyMemberTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.FamilyMemberTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Gender");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Gender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "GenderUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_Type");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_Type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ID_TypeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Incident");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Incident.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IncidentUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Industry");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Industry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "IndustryUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPosition");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "JobPositionUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Language");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Language.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageCompetenceTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCompetenceTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevel");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
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
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLevelUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LanguageUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningForm");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningForm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "LearningFormUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Major");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Major.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MajorUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Nationality");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Nationality.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "NationalityUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Operation");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReason");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationReasonUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "OperationUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollArea");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PayrollAreaUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelArea");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelAreaUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareas");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PersonnelSubareasUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
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
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PoliticalStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "PreviousEmployerTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.PreviousEmployerTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Products");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Products.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ProductsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ProductsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ProductsDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ProductsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ProductsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ProductsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ProductsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "Relationship");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.Relationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "RelationshipUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "School");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.School.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolType");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolTypeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "SchoolUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationships");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationships.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsTupleTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "ServiceRelationshipsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkType");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "WorkTypeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeUpdate.class;
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

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.AttributeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeID");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.AttributeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValue");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.AttributeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValueConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.AttributeValueConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValueCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.AttributeValueCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "AttributeValueValue");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.AttributeValueValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "MultilingualText");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.MultilingualText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "NameValuePair");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.NameValuePair.class;
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

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeResultSet searchAddressType(jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchAddressType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchApprovalStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesResultSet searchCategories(jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientResultSet searchClient(jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchClient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeResultSet searchContactType(jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchContactType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolResultSet searchCostpool(jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchCostpool"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeResultSet searchDegree(jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchDegree"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchDistributionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeResultSet searchEducationType(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchEducationType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createEmployee(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCreate[] employee, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "createEmployee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {employee, reposInfo, configurationParameters});

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

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateEmployee(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeUpdate[] employee, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "updateEmployee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {employee, reposInfo, configurationParameters});

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

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeResultSet searchEmployee(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchEmployee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupResultSet searchEmployeeGroup(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchEmployeeGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupResultSet searchEmployeeSubgroup(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchEmployeeSubgroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsResultSet searchEthnicGroups(jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchEthnicGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderResultSet searchGender(jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchGender"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeResultSet searchID_Type(jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchID_Type"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentResultSet searchIncident(jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchIncident"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryResultSet searchIndustry(jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchIndustry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionResultSet searchJobPosition(jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchJobPosition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageResultSet searchLanguage(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelResultSet searchLanguageLevel(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchLanguageLevel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormResultSet searchLearningForm(jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchLearningForm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorResultSet searchMajor(jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchMajor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusResultSet searchMaritalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchMaritalStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityResultSet searchNationality(jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchNationality"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonResultSet searchOperationReason(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchOperationReason"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaResultSet searchPayrollArea(jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchPayrollArea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaResultSet searchPersonnelArea(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchPersonnelArea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasResultSet searchPersonnelSubareas(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchPersonnelSubareas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusResultSet searchPoliticalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchPoliticalStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsResultSet searchProducts(jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchProducts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipResultSet searchRelationship(jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchRelationship"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolResultSet searchSchool(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchSchool"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeResultSet searchSchoolType(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchSchoolType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchServiceRelationships"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeResultSet searchWorkType(jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchWorkType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitResultSet searchEducationSystemUnit(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_HRVi", "searchEducationSystemUnit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
