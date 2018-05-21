/**
 * HTTPNoneBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_FICOTRWsd;

public class HTTPNoneBindingStub extends org.apache.axis.client.Stub implements JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRVi {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[21];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchAccountGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchAccountType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "accounts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfAccountsCreate"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Accounts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfAccountsUpdate"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchApprovalStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchClient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCommitmentItemCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCommitmentltem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "commitmentltem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfCommitmentltemCreate"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
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
        oper.setName("updateCommitmentltem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Commitmentltem"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfCommitmentltemUpdate"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCommitmentltem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCompanyCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDistributionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchFinanciaTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createFundcenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "fundcenter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfFundcenterCreate"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateFundcenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Fundcenter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfFundcenterUpdate"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchFundcenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchProducts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ProductsQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ProductsResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchServiceRelationships");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsQuery"), jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsResultSet"));
        oper.setReturnClass(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

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

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountGroupUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "Accounts");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Accounts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountType");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountTypeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ApprovalStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfAccountsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfAccountsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "AccountsUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfCommitmentltemCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfCommitmentltemUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfFundcenterCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ArrayOfFundcenterUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "Categories");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Categories.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CategoriesUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "Client");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Client.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ClientUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategory");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentItemCategoryUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "Commitmentltem");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Commitmentltem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCode");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CompanyCodeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint1.class;
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
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "DistributionStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransaction");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FinanciaTransactionUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "Fundcenter");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Fundcenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "FundcenterUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "Operation");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "OperationUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "Products");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.Products.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ProductsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ProductsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ProductsDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ProductsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ProductsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ProductsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ProductsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationships");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationships.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsTupleTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "ServiceRelationshipsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsUpdate.class;
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

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BasicRecordIdentificationWithKeyMapping");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.BasicRecordIdentificationWithKeyMapping.class;
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

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupResultSet searchAccountGroup(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchAccountGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeResultSet searchAccountType(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchAccountType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCreate[] accounts, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "createAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accounts, reposInfo, configurationParameters});

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

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUpdate[] accounts, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "updateAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {accounts, reposInfo, configurationParameters});

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

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet searchAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchApprovalStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesResultSet searchCategories(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet searchClient(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchClient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryResultSet searchCommitmentItemCategory(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchCommitmentItemCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createCommitmentltem(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCreate[] commitmentltem, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "createCommitmentltem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commitmentltem, reposInfo, configurationParameters});

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

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateCommitmentltem(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate[] commitmentltem, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "updateCommitmentltem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {commitmentltem, reposInfo, configurationParameters});

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

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet searchCommitmentltem(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchCommitmentltem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet searchCompanyCode(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchCompanyCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchDistributionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionResultSet searchFinanciaTransaction(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchFinanciaTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createFundcenter(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCreate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "createFundcenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fundcenter, reposInfo, configurationParameters});

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

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateFundcenter(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUpdate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "updateFundcenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fundcenter, reposInfo, configurationParameters});

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

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet searchFundcenter(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchFundcenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsResultSet searchProducts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchProducts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "searchServiceRelationships"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
