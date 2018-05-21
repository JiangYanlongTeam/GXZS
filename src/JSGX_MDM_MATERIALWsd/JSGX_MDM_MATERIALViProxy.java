package JSGX_MDM_MATERIALWsd;

public class JSGX_MDM_MATERIALViProxy implements JSGX_MDM_MATERIALWsd.JSGX_MDM_MATERIALVi {
  private String _endpoint = null;
  private JSGX_MDM_MATERIALWsd.JSGX_MDM_MATERIALVi jSGX_MDM_MATERIALVi = null;
  
  public JSGX_MDM_MATERIALViProxy() {
    _initJSGX_MDM_MATERIALViProxy();
  }
  
  public JSGX_MDM_MATERIALViProxy(String endpoint) {
    _endpoint = endpoint;
    _initJSGX_MDM_MATERIALViProxy();
  }
  
  private void _initJSGX_MDM_MATERIALViProxy() {
    try {
      jSGX_MDM_MATERIALVi = (new JSGX_MDM_MATERIALWsd.JSGX_MDM_MATERIALLocator()).getHTTPNonePort();
      if (jSGX_MDM_MATERIALVi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jSGX_MDM_MATERIALVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jSGX_MDM_MATERIALVi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jSGX_MDM_MATERIALVi != null)
      ((javax.xml.rpc.Stub)jSGX_MDM_MATERIALVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public JSGX_MDM_MATERIALWsd.JSGX_MDM_MATERIALVi getJSGX_MDM_MATERIALVi() {
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi;
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(jsgx_mdm_material.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchApprovalStatus(query, reposInfo);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.ClientResultSet searchClient(jsgx_mdm_material.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchClient(query, reposInfo);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(jsgx_mdm_material.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchDistributionStatus(query, reposInfo);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorResultSet searchIndustrySector(jsgx_mdm_material.beans.ws.mdm.sap.com.IndustrySectorQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchIndustrySector(query, reposInfo);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__ResultSet searchMATKL(jsgx_mdm_material.beans.ws.mdm.sap.com.MATKL__Query query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchMATKL(query, reposInfo);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__ResultSet searchMEINS(jsgx_mdm_material.beans.ws.mdm.sap.com.MEINS__Query query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchMEINS(query, reposInfo);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__ResultSet searchMTPOS(jsgx_mdm_material.beans.ws.mdm.sap.com.MTPOS__Query query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchMTPOS(query, reposInfo);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeResultSet searchMaterialType(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialTypeQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchMaterialType(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsCreate[] materials, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.createMaterials(materials, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsUpdate[] materials, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.updateMaterials(materials, reposInfo, configurationParameters);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsResultSet searchMaterials(jsgx_mdm_material.beans.ws.mdm.sap.com.MaterialsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchMaterials(query, reposInfo);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.OperationResultSet searchOperation(jsgx_mdm_material.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchOperation(query, reposInfo);
  }
  
  public jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupResultSet searchProductGroup(jsgx_mdm_material.beans.ws.mdm.sap.com.ProductGroupQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (jSGX_MDM_MATERIALVi == null)
      _initJSGX_MDM_MATERIALViProxy();
    return jSGX_MDM_MATERIALVi.searchProductGroup(query, reposInfo);
  }
  
  
}