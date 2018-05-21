package JSGX_MDM_HRWsd;

public class JSGX_MDM_HRViProxy implements JSGX_MDM_HRWsd.JSGX_MDM_HRVi {
  private String _endpoint = null;
  private JSGX_MDM_HRWsd.JSGX_MDM_HRVi jSGX_MDM_HRVi = null;
  
  public JSGX_MDM_HRViProxy() {
    _initJSGX_MDM_HRViProxy();
  }
  
  public JSGX_MDM_HRViProxy(String endpoint) {
    _endpoint = endpoint;
    _initJSGX_MDM_HRViProxy();
  }
  
  private void _initJSGX_MDM_HRViProxy() {
    try {
      jSGX_MDM_HRVi = (new JSGX_MDM_HRWsd.JSGX_MDM_HRLocator()).getHTTPNonePort();
      if (jSGX_MDM_HRVi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jSGX_MDM_HRVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jSGX_MDM_HRVi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jSGX_MDM_HRVi != null)
      ((javax.xml.rpc.Stub)jSGX_MDM_HRVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public JSGX_MDM_HRWsd.JSGX_MDM_HRVi getJSGX_MDM_HRVi() {
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi;
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeResultSet searchAddressType(jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchAddressType(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchApprovalStatus(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesResultSet searchCategories(jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchCategories(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientResultSet searchClient(jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchClient(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeResultSet searchContactType(jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchContactType(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolResultSet searchCostpool(jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchCostpool(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeResultSet searchDegree(jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchDegree(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchDistributionStatus(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeResultSet searchEducationType(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchEducationType(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createEmployee(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCreate[] employee, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.createEmployee(employee, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateEmployee(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeUpdate[] employee, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.updateEmployee(employee, reposInfo, configurationParameters);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeResultSet searchEmployee(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchEmployee(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupResultSet searchEmployeeGroup(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchEmployeeGroup(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupResultSet searchEmployeeSubgroup(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchEmployeeSubgroup(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsResultSet searchEthnicGroups(jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchEthnicGroups(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderResultSet searchGender(jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchGender(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeResultSet searchID_Type(jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchID_Type(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentResultSet searchIncident(jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchIncident(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryResultSet searchIndustry(jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchIndustry(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionResultSet searchJobPosition(jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchJobPosition(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageResultSet searchLanguage(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchLanguage(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelResultSet searchLanguageLevel(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchLanguageLevel(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormResultSet searchLearningForm(jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchLearningForm(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorResultSet searchMajor(jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchMajor(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusResultSet searchMaritalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchMaritalStatus(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityResultSet searchNationality(jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchNationality(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchOperation(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonResultSet searchOperationReason(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchOperationReason(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaResultSet searchPayrollArea(jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchPayrollArea(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaResultSet searchPersonnelArea(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchPersonnelArea(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasResultSet searchPersonnelSubareas(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchPersonnelSubareas(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusResultSet searchPoliticalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchPoliticalStatus(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsResultSet searchProducts(jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchProducts(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipResultSet searchRelationship(jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchRelationship(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolResultSet searchSchool(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchSchool(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeResultSet searchSchoolType(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchSchoolType(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchServiceRelationships(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeResultSet searchWorkType(jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchWorkType(query, reposInfo);
  }
  
  public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitResultSet searchEducationSystemUnit(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_HRVi == null)
      _initJSGX_MDM_HRViProxy();
    return jSGX_MDM_HRVi.searchEducationSystemUnit(query, reposInfo);
  }
  
  
}