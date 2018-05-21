package net.jsgx.www.E1D.service;

public class SI_1083_OA2ERP_ASSET_OUTProxy implements net.jsgx.www.E1D.service.SI_1083_OA2ERP_ASSET_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E1D.service.SI_1083_OA2ERP_ASSET_OUT sI_1083_OA2ERP_ASSET_OUT = null;
  
  public SI_1083_OA2ERP_ASSET_OUTProxy() {
    _initSI_1083_OA2ERP_ASSET_OUTProxy();
  }
  
  public SI_1083_OA2ERP_ASSET_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1083_OA2ERP_ASSET_OUTProxy();
  }
  
  private void _initSI_1083_OA2ERP_ASSET_OUTProxy() {
    try {
      sI_1083_OA2ERP_ASSET_OUT = (new net.jsgx.www.E1D.service.SI_1083_OA2ERP_ASSET_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1083_OA2ERP_ASSET_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1083_OA2ERP_ASSET_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1083_OA2ERP_ASSET_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1083_OA2ERP_ASSET_OUT != null)
      ((javax.xml.rpc.Stub)sI_1083_OA2ERP_ASSET_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E1D.service.SI_1083_OA2ERP_ASSET_OUT getSI_1083_OA2ERP_ASSET_OUT() {
    if (sI_1083_OA2ERP_ASSET_OUT == null)
      _initSI_1083_OA2ERP_ASSET_OUTProxy();
    return sI_1083_OA2ERP_ASSET_OUT;
  }
  
  public net.jsgx.www.E1D.service.DT_1083_OA2ERP_ASSET_RETURN SI_1083_OA2ERP_ASSET_OUT(net.jsgx.www.E1D.service.DT_1083_OA2ERP_ASSET MT_1083_OA2ERP_ASSET) throws java.rmi.RemoteException{
    if (sI_1083_OA2ERP_ASSET_OUT == null)
      _initSI_1083_OA2ERP_ASSET_OUTProxy();
    return sI_1083_OA2ERP_ASSET_OUT.SI_1083_OA2ERP_ASSET_OUT(MT_1083_OA2ERP_ASSET);
  }
  
  
}