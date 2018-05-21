/**
 * JSGX_MDM_MATERIALVi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_MATERIALWsd;

public interface JSGX_MDM_MATERIALVi extends java.rmi.Remote {
    public jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.ClientResultSet searchClient(jsgx_mdm_material.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet searchIndustrySector(jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet searchMATKL(jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Query query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ResultSet searchMEINS(jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Query query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ResultSet searchMTPOS(jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Query query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeResultSet searchMaterialType(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] createMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCreate[] materials, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] updateMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsUpdate[] materials, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet searchMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_material.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupResultSet searchProductGroup(jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
}
