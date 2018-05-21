package JSGX_MDM_BUSINESS_PARTNERWsd;

public class JSGX_MDM_BUSINESS_PARTNERViProxy implements JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERVi {
  private String _endpoint = null;
  private JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERVi jSGX_MDM_BUSINESS_PARTNERVi = null;
  
  public JSGX_MDM_BUSINESS_PARTNERViProxy() {
    _initJSGX_MDM_BUSINESS_PARTNERViProxy();
  }
  
  public JSGX_MDM_BUSINESS_PARTNERViProxy(String endpoint) {
    _endpoint = endpoint;
    _initJSGX_MDM_BUSINESS_PARTNERViProxy();
  }
  
  private void _initJSGX_MDM_BUSINESS_PARTNERViProxy() {
    try {
      jSGX_MDM_BUSINESS_PARTNERVi = (new JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERLocator()).getHTTPNonePort();
      if (jSGX_MDM_BUSINESS_PARTNERVi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jSGX_MDM_BUSINESS_PARTNERVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jSGX_MDM_BUSINESS_PARTNERVi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jSGX_MDM_BUSINESS_PARTNERVi != null)
      ((javax.xml.rpc.Stub)jSGX_MDM_BUSINESS_PARTNERVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERVi getJSGX_MDM_BUSINESS_PARTNERVi() {
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi;
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchApprovalStatus(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createBankAccount(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountCreate[] bankAccount, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.createBankAccount(bankAccount, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateBankAccount(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountUpdate[] bank_Account, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.updateBankAccount(bank_Account, reposInfo, configurationParameters);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountResultSet searchBankAccount(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchBankAccount(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createBanks(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksCreate[] banks, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.createBanks(banks, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateBanks(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksUpdate[] banks, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.updateBanks(banks, reposInfo, configurationParameters);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksResultSet searchBanks(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchBanks(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsResultSet searchBusinessSections(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSectionsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchBusinessSections(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet searchClientSystems(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchClientSystems(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesResultSet searchCountries(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchCountries(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyResultSet searchCurrency(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CurrencyQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchCurrency(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsResultSet searchCustomerAccountGroups(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchCustomerAccountGroups(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeResultSet searchCustomerType(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchCustomerType(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createCustomers(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate[] customers, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.createCustomers(customers, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateCustomers(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersUpdate[] customers, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.updateCustomers(customers, reposInfo, configurationParameters);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet searchCustomers(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchCustomers(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchDistributionStatus(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesResultSet searchLanguages(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchLanguages(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchOperation(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesResultSet searchOperationTypes(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationTypesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchOperationTypes(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsResultSet searchRegions(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchRegions(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchServiceRelationships(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsResultSet searchTaxPayerKinds(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TaxPayerKindsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchTaxPayerKinds(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesResultSet searchTitles(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchTitles(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersResultSet searchTradePartners(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchTradePartners(query, reposInfo);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsResultSet searchVendorAccountGroups(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchVendorAccountGroups(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createVendors(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCreate[] vendors, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.createVendors(vendors, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateVendors(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsUpdate[] vendors, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.updateVendors(vendors, reposInfo, configurationParameters);
  }
  
  public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet searchVendors(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_BUSINESS_PARTNERVi == null)
      _initJSGX_MDM_BUSINESS_PARTNERViProxy();
    return jSGX_MDM_BUSINESS_PARTNERVi.searchVendors(query, reposInfo);
  }
  
  
}