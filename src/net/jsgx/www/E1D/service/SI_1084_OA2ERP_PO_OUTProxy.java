package net.jsgx.www.E1D.service;

public class SI_1084_OA2ERP_PO_OUTProxy implements net.jsgx.www.E1D.service.SI_1084_OA2ERP_PO_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E1D.service.SI_1084_OA2ERP_PO_OUT sI_1084_OA2ERP_PO_OUT = null;
  
  public SI_1084_OA2ERP_PO_OUTProxy() {
    _initSI_1084_OA2ERP_PO_OUTProxy();
  }
  
  public SI_1084_OA2ERP_PO_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1084_OA2ERP_PO_OUTProxy();
  }
  
  private void _initSI_1084_OA2ERP_PO_OUTProxy() {
    try {
      sI_1084_OA2ERP_PO_OUT = (new net.jsgx.www.E1D.service.SI_1084_OA2ERP_PO_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1084_OA2ERP_PO_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1084_OA2ERP_PO_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1084_OA2ERP_PO_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1084_OA2ERP_PO_OUT != null)
      ((javax.xml.rpc.Stub)sI_1084_OA2ERP_PO_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E1D.service.SI_1084_OA2ERP_PO_OUT getSI_1084_OA2ERP_PO_OUT() {
    if (sI_1084_OA2ERP_PO_OUT == null)
      _initSI_1084_OA2ERP_PO_OUTProxy();
    return sI_1084_OA2ERP_PO_OUT;
  }
  
  public net.jsgx.www.E1D.service.DT_1084_OA2ERP_PO_RETURN SI_1084_OA2ERP_PO_OUT(net.jsgx.www.E1D.service.DT_1084_OA2ERP_PO MT_1084_OA2ERP_PO) throws java.rmi.RemoteException{
    if (sI_1084_OA2ERP_PO_OUT == null)
      _initSI_1084_OA2ERP_PO_OUTProxy();
    return sI_1084_OA2ERP_PO_OUT.SI_1084_OA2ERP_PO_OUT(MT_1084_OA2ERP_PO);
  }
  
  
}