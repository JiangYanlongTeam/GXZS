package JSGX_MDM_FICOTRWsd;

public class JSGX_MDM_FICOTRViProxy implements JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRVi {
  private String _endpoint = null;
  private JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRVi jSGX_MDM_FICOTRVi = null;
  
  public JSGX_MDM_FICOTRViProxy() {
    _initJSGX_MDM_FICOTRViProxy();
  }
  
  public JSGX_MDM_FICOTRViProxy(String endpoint) {
    _endpoint = endpoint;
    _initJSGX_MDM_FICOTRViProxy();
  }
  
  private void _initJSGX_MDM_FICOTRViProxy() {
    try {
      jSGX_MDM_FICOTRVi = (new JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRLocator()).getHTTPNonePort();
      if (jSGX_MDM_FICOTRVi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jSGX_MDM_FICOTRVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jSGX_MDM_FICOTRVi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jSGX_MDM_FICOTRVi != null)
      ((javax.xml.rpc.Stub)jSGX_MDM_FICOTRVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRVi getJSGX_MDM_FICOTRVi() {
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi;
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupResultSet searchAccountGroup(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountGroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchAccountGroup(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeResultSet searchAccountType(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchAccountType(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsCreate[] accounts, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.createAccounts(accounts, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsUpdate[] accounts, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.updateAccounts(accounts, reposInfo, configurationParameters);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsResultSet searchAccounts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.AccountsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchAccounts(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchApprovalStatus(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesResultSet searchCategories(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CategoriesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchCategories(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientResultSet searchClient(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchClient(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryResultSet searchCommitmentItemCategory(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchCommitmentItemCategory(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createCommitmentltem(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCreate[] commitmentltem, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.createCommitmentltem(commitmentltem, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateCommitmentltem(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate[] commitmentltem, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.updateCommitmentltem(commitmentltem, reposInfo, configurationParameters);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet searchCommitmentltem(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchCommitmentltem(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeResultSet searchCompanyCode(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CompanyCodeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchCompanyCode(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchDistributionStatus(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionResultSet searchFinanciaTransaction(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchFinanciaTransaction(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createFundcenter(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterCreate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.createFundcenter(fundcenter, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateFundcenter(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterUpdate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.updateFundcenter(fundcenter, reposInfo, configurationParameters);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterResultSet searchFundcenter(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FundcenterQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchFundcenter(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchOperation(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsResultSet searchProducts(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ProductsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchProducts(query, reposInfo);
  }
  
  public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_FICOTRVi == null)
      _initJSGX_MDM_FICOTRViProxy();
    return jSGX_MDM_FICOTRVi.searchServiceRelationships(query, reposInfo);
  }
  
  
}