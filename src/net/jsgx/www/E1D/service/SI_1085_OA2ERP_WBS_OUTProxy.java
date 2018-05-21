package net.jsgx.www.E1D.service;

public class SI_1085_OA2ERP_WBS_OUTProxy implements net.jsgx.www.E1D.service.SI_1085_OA2ERP_WBS_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E1D.service.SI_1085_OA2ERP_WBS_OUT sI_1085_OA2ERP_WBS_OUT = null;
  
  public SI_1085_OA2ERP_WBS_OUTProxy() {
    _initSI_1085_OA2ERP_WBS_OUTProxy();
  }
  
  public SI_1085_OA2ERP_WBS_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1085_OA2ERP_WBS_OUTProxy();
  }
  
  private void _initSI_1085_OA2ERP_WBS_OUTProxy() {
    try {
      sI_1085_OA2ERP_WBS_OUT = (new net.jsgx.www.E1D.service.SI_1085_OA2ERP_WBS_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1085_OA2ERP_WBS_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1085_OA2ERP_WBS_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1085_OA2ERP_WBS_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1085_OA2ERP_WBS_OUT != null)
      ((javax.xml.rpc.Stub)sI_1085_OA2ERP_WBS_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E1D.service.SI_1085_OA2ERP_WBS_OUT getSI_1085_OA2ERP_WBS_OUT() {
    if (sI_1085_OA2ERP_WBS_OUT == null)
      _initSI_1085_OA2ERP_WBS_OUTProxy();
    return sI_1085_OA2ERP_WBS_OUT;
  }
  
  public net.jsgx.www.E1D.service.DT_1085_OA2ERP_WBS_RETURN SI_1085_OA2ERP_WBS_OUT(net.jsgx.www.E1D.service.DT_1085_OA2ERP_WBS MT_1085_OA2ERP_WBS) throws java.rmi.RemoteException{
    if (sI_1085_OA2ERP_WBS_OUT == null)
      _initSI_1085_OA2ERP_WBS_OUTProxy();
    return sI_1085_OA2ERP_WBS_OUT.SI_1085_OA2ERP_WBS_OUT(MT_1085_OA2ERP_WBS);
  }
  
  
}