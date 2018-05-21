package net.jsgx.www.E4D.service;

public class SI_1082_OA2ERP_ZJZFSP_OUTProxy implements net.jsgx.www.E4D.service.SI_1082_OA2ERP_ZJZFSP_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E4D.service.SI_1082_OA2ERP_ZJZFSP_OUT sI_1082_OA2ERP_ZJZFSP_OUT = null;
  
  public SI_1082_OA2ERP_ZJZFSP_OUTProxy() {
    _initSI_1082_OA2ERP_ZJZFSP_OUTProxy();
  }
  
  public SI_1082_OA2ERP_ZJZFSP_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1082_OA2ERP_ZJZFSP_OUTProxy();
  }
  
  private void _initSI_1082_OA2ERP_ZJZFSP_OUTProxy() {
    try {
      sI_1082_OA2ERP_ZJZFSP_OUT = (new net.jsgx.www.E4D.service.SI_1082_OA2ERP_ZJZFSP_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1082_OA2ERP_ZJZFSP_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1082_OA2ERP_ZJZFSP_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1082_OA2ERP_ZJZFSP_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1082_OA2ERP_ZJZFSP_OUT != null)
      ((javax.xml.rpc.Stub)sI_1082_OA2ERP_ZJZFSP_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E4D.service.SI_1082_OA2ERP_ZJZFSP_OUT getSI_1082_OA2ERP_ZJZFSP_OUT() {
    if (sI_1082_OA2ERP_ZJZFSP_OUT == null)
      _initSI_1082_OA2ERP_ZJZFSP_OUTProxy();
    return sI_1082_OA2ERP_ZJZFSP_OUT;
  }
  
  public net.jsgx.www.E4D.service.DT_1082_OA2ERP_ZJZFSP_RETURN SI_1082_OA2ERP_ZJZFSP_OUT(net.jsgx.www.E4D.service.DT_1082_OA2ERP_ZJZFSP MT_1082_OA2ERP_ZJZFSP) throws java.rmi.RemoteException{
    if (sI_1082_OA2ERP_ZJZFSP_OUT == null)
      _initSI_1082_OA2ERP_ZJZFSP_OUTProxy();
    return sI_1082_OA2ERP_ZJZFSP_OUT.SI_1082_OA2ERP_ZJZFSP_OUT(MT_1082_OA2ERP_ZJZFSP);
  }
  
  
}