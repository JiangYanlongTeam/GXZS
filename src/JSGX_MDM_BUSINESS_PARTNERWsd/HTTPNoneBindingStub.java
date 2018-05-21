/**
 * HTTPNoneBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_BUSINESS_PARTNERWsd;

public class HTTPNoneBindingStub extends org.apache.axis.client.Stub implements JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERVi {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[29];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchApprovalStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBankAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "bankAccount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfBankAccountCreate"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBankAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Bank_Account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfBankAccountUpdate"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchBankAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBanks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "banks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfBanksCreate"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBanks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Banks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfBanksUpdate"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchBanks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchBusinessSections");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchClientSystems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCustomerAccountGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCustomerType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCustomers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "customers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfCustomersCreate"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCustomers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Customers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfCustomersUpdate"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchCustomers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDistributionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchLanguages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchOperationTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchRegions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchServiceRelationships");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTaxPayerKinds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTitles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchTradePartners");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchVendorAccountGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createVendors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "vendors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfVendorsCreate"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateVendors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Vendors"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfVendorsUpdate"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchVendors");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsQuery"), jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsResultSet"));
        oper.setReturnClass(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

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

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ApprovalStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfBankAccountCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfBankAccountUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfBanksCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfBanksUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfCustomersCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfCustomersUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfVendorsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ArrayOfVendorsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccount");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountsTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BankAccountUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Banks");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Banks.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BanksUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSections");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSections.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystems");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ClientSystemsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Countries");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Countries.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CountriesUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Currency");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CurrencyUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroups");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerAccountGroupsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Customers");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Customers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersUniqueConstraint3");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUniqueConstraint3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersUniqueConstraint4");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUniqueConstraint4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomersUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerType");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeCriteria.class;
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
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "CustomerTypeUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatus");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "DistributionStatusUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Languages");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Languages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "LanguagesUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Operation");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypes");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationTypesUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "OperationUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Regions");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Regions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsDisplayFields");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "RegionsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationships");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationships.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsTupleTuple");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "ServiceRelationshipsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKinds");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKinds.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TaxPayerKindsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Titles");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Titles.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TitlesUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartners");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartners.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "TradePartnersUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroups");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroups.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsLookup");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsUniqueConstraint2.class;
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
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorAccountGroupsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "Vendors");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Vendors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsCreate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsCriteria");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsID");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsQuery");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsResultSet");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsUniqueConstraint3");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsUniqueConstraint4");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "VendorsUpdate");
            cachedSerQNames.add(qName);
            cls = jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUpdate.class;
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

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchApprovalStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createBankAccount(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCreate[] bankAccount, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "createBankAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bankAccount, reposInfo, configurationParameters});

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

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateBankAccount(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountUpdate[] bank_Account, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "updateBankAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bank_Account, reposInfo, configurationParameters});

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

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet searchBankAccount(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchBankAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createBanks(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCreate[] banks, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "createBanks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {banks, reposInfo, configurationParameters});

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

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateBanks(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksUpdate[] banks, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "updateBanks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {banks, reposInfo, configurationParameters});

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

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet searchBanks(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchBanks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsResultSet searchBusinessSections(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchBusinessSections"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet searchClientSystems(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchClientSystems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesResultSet searchCountries(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyResultSet searchCurrency(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchCurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsResultSet searchCustomerAccountGroups(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchCustomerAccountGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeResultSet searchCustomerType(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchCustomerType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createCustomers(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate[] customers, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "createCustomers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customers, reposInfo, configurationParameters});

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

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateCustomers(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUpdate[] customers, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "updateCustomers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customers, reposInfo, configurationParameters});

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

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet searchCustomers(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchCustomers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchDistributionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesResultSet searchLanguages(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchLanguages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesResultSet searchOperationTypes(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchOperationTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsResultSet searchRegions(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchRegions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchServiceRelationships"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsResultSet searchTaxPayerKinds(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchTaxPayerKinds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesResultSet searchTitles(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchTitles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersResultSet searchTradePartners(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchTradePartners"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsResultSet searchVendorAccountGroups(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchVendorAccountGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createVendors(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCreate[] vendors, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "createVendors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {vendors, reposInfo, configurationParameters});

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

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateVendors(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUpdate[] vendors, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "updateVendors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {vendors, reposInfo, configurationParameters});

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

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet searchVendors(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:JSGX_MDM_BUSINESS_PARTNERVi", "searchVendors"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
