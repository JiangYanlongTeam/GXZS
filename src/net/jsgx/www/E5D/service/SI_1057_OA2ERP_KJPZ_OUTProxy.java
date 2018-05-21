package net.jsgx.www.E5D.service;

public class SI_1057_OA2ERP_KJPZ_OUTProxy implements net.jsgx.www.E5D.service.SI_1057_OA2ERP_KJPZ_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E5D.service.SI_1057_OA2ERP_KJPZ_OUT sI_1057_OA2ERP_KJPZ_OUT = null;
  
  public SI_1057_OA2ERP_KJPZ_OUTProxy() {
    _initSI_1057_OA2ERP_KJPZ_OUTProxy();
  }
  
  public SI_1057_OA2ERP_KJPZ_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1057_OA2ERP_KJPZ_OUTProxy();
  }
  
  private void _initSI_1057_OA2ERP_KJPZ_OUTProxy() {
    try {
      sI_1057_OA2ERP_KJPZ_OUT = (new net.jsgx.www.E5D.service.SI_1057_OA2ERP_KJPZ_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1057_OA2ERP_KJPZ_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1057_OA2ERP_KJPZ_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1057_OA2ERP_KJPZ_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1057_OA2ERP_KJPZ_OUT != null)
      ((javax.xml.rpc.Stub)sI_1057_OA2ERP_KJPZ_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E5D.service.SI_1057_OA2ERP_KJPZ_OUT getSI_1057_OA2ERP_KJPZ_OUT() {
    if (sI_1057_OA2ERP_KJPZ_OUT == null)
      _initSI_1057_OA2ERP_KJPZ_OUTProxy();
    return sI_1057_OA2ERP_KJPZ_OUT;
  }
  
  public net.jsgx.www.E5D.service.DT_1057_OA2ERP_KJPZ_RETURN SI_1057_OA2ERP_KJPZ_OUT(net.jsgx.www.E5D.service.DT_1057_OA2ERP_KJPZ MT_1057_OA2ERP_KJPZ) throws java.rmi.RemoteException{
    if (sI_1057_OA2ERP_KJPZ_OUT == null)
      _initSI_1057_OA2ERP_KJPZ_OUTProxy();
    return sI_1057_OA2ERP_KJPZ_OUT.SI_1057_OA2ERP_KJPZ_OUT(MT_1057_OA2ERP_KJPZ);
  }
  
  
}