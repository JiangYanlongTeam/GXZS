/**
 * JSGX_MDM_FICOTRVi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_FICOTRWsd;

public interface JSGX_MDM_FICOTRVi extends java.rmi.Remote {
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupResultSet searchAccountGroup(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeResultSet searchAccountType(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] createAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCreate[] accounts, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] updateAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUpdate[] accounts, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet searchAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesResultSet searchCategories(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet searchClient(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryResultSet searchCommitmentItemCategory(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] createCommitmentltem(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCreate[] commitmentltem, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] updateCommitmentltem(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate[] commitmentltem, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet searchCommitmentltem(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet searchCompanyCode(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionResultSet searchFinanciaTransaction(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] createFundcenter(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCreate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] updateFundcenter(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUpdate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet searchFundcenter(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsResultSet searchProducts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
}
