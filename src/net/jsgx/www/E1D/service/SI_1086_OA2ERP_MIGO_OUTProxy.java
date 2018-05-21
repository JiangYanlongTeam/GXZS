package net.jsgx.www.E1D.service;

public class SI_1086_OA2ERP_MIGO_OUTProxy implements net.jsgx.www.E1D.service.SI_1086_OA2ERP_MIGO_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E1D.service.SI_1086_OA2ERP_MIGO_OUT sI_1086_OA2ERP_MIGO_OUT = null;
  
  public SI_1086_OA2ERP_MIGO_OUTProxy() {
    _initSI_1086_OA2ERP_MIGO_OUTProxy();
  }
  
  public SI_1086_OA2ERP_MIGO_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1086_OA2ERP_MIGO_OUTProxy();
  }
  
  private void _initSI_1086_OA2ERP_MIGO_OUTProxy() {
    try {
      sI_1086_OA2ERP_MIGO_OUT = (new net.jsgx.www.E1D.service.SI_1086_OA2ERP_MIGO_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1086_OA2ERP_MIGO_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1086_OA2ERP_MIGO_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1086_OA2ERP_MIGO_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1086_OA2ERP_MIGO_OUT != null)
      ((javax.xml.rpc.Stub)sI_1086_OA2ERP_MIGO_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E1D.service.SI_1086_OA2ERP_MIGO_OUT getSI_1086_OA2ERP_MIGO_OUT() {
    if (sI_1086_OA2ERP_MIGO_OUT == null)
      _initSI_1086_OA2ERP_MIGO_OUTProxy();
    return sI_1086_OA2ERP_MIGO_OUT;
  }
  
  public net.jsgx.www.E1D.service.DT_1086_OA2ERP_MIGO_RETURN SI_1086_OA2ERP_MIGO_OUT(net.jsgx.www.E1D.service.DT_1086_OA2ERP_MIGO MT_1086_OA2ERP_MIGO) throws java.rmi.RemoteException{
    if (sI_1086_OA2ERP_MIGO_OUT == null)
      _initSI_1086_OA2ERP_MIGO_OUTProxy();
    return sI_1086_OA2ERP_MIGO_OUT.SI_1086_OA2ERP_MIGO_OUT(MT_1086_OA2ERP_MIGO);
  }
  
  
}