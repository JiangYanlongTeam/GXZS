/**
 * JSGX_MDM_HRVi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_HRWsd;

public interface JSGX_MDM_HRVi extends java.rmi.Remote {
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeResultSet searchAddressType(jsgx_mdm_hr.beans.ws.mdm.sap.com.AddressTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesResultSet searchCategories(jsgx_mdm_hr.beans.ws.mdm.sap.com.CategoriesQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientResultSet searchClient(jsgx_mdm_hr.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeResultSet searchContactType(jsgx_mdm_hr.beans.ws.mdm.sap.com.ContactTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolResultSet searchCostpool(jsgx_mdm_hr.beans.ws.mdm.sap.com.CostpoolQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeResultSet searchDegree(jsgx_mdm_hr.beans.ws.mdm.sap.com.DegreeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeResultSet searchEducationType(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] createEmployee(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeCreate[] employee, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] updateEmployee(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeUpdate[] employee, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeResultSet searchEmployee(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupResultSet searchEmployeeGroup(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeGroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupResultSet searchEmployeeSubgroup(jsgx_mdm_hr.beans.ws.mdm.sap.com.EmployeeSubgroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsResultSet searchEthnicGroups(jsgx_mdm_hr.beans.ws.mdm.sap.com.EthnicGroupsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderResultSet searchGender(jsgx_mdm_hr.beans.ws.mdm.sap.com.GenderQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeResultSet searchID_Type(jsgx_mdm_hr.beans.ws.mdm.sap.com.ID_TypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentResultSet searchIncident(jsgx_mdm_hr.beans.ws.mdm.sap.com.IncidentQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryResultSet searchIndustry(jsgx_mdm_hr.beans.ws.mdm.sap.com.IndustryQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionResultSet searchJobPosition(jsgx_mdm_hr.beans.ws.mdm.sap.com.JobPositionQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageResultSet searchLanguage(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelResultSet searchLanguageLevel(jsgx_mdm_hr.beans.ws.mdm.sap.com.LanguageLevelQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormResultSet searchLearningForm(jsgx_mdm_hr.beans.ws.mdm.sap.com.LearningFormQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorResultSet searchMajor(jsgx_mdm_hr.beans.ws.mdm.sap.com.MajorQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusResultSet searchMaritalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityResultSet searchNationality(jsgx_mdm_hr.beans.ws.mdm.sap.com.NationalityQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonResultSet searchOperationReason(jsgx_mdm_hr.beans.ws.mdm.sap.com.OperationReasonQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaResultSet searchPayrollArea(jsgx_mdm_hr.beans.ws.mdm.sap.com.PayrollAreaQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaResultSet searchPersonnelArea(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelAreaQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasResultSet searchPersonnelSubareas(jsgx_mdm_hr.beans.ws.mdm.sap.com.PersonnelSubareasQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusResultSet searchPoliticalStatus(jsgx_mdm_hr.beans.ws.mdm.sap.com.PoliticalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsResultSet searchProducts(jsgx_mdm_hr.beans.ws.mdm.sap.com.ProductsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipResultSet searchRelationship(jsgx_mdm_hr.beans.ws.mdm.sap.com.RelationshipQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolResultSet searchSchool(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeResultSet searchSchoolType(jsgx_mdm_hr.beans.ws.mdm.sap.com.SchoolTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(jsgx_mdm_hr.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeResultSet searchWorkType(jsgx_mdm_hr.beans.ws.mdm.sap.com.WorkTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitResultSet searchEducationSystemUnit(jsgx_mdm_hr.beans.ws.mdm.sap.com.EducationSystemUnitQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
}
