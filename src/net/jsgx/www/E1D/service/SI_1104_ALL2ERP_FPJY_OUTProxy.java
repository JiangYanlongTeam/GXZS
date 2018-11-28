package net.jsgx.www.E1D.service;

public class SI_1104_ALL2ERP_FPJY_OUTProxy implements net.jsgx.www.E1D.service.SI_1104_ALL2ERP_FPJY_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E1D.service.SI_1104_ALL2ERP_FPJY_OUT sI_1104_ALL2ERP_FPJY_OUT = null;
  
  public SI_1104_ALL2ERP_FPJY_OUTProxy() {
    _initSI_1104_ALL2ERP_FPJY_OUTProxy();
  }
  
  public SI_1104_ALL2ERP_FPJY_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1104_ALL2ERP_FPJY_OUTProxy();
  }
  
  private void _initSI_1104_ALL2ERP_FPJY_OUTProxy() {
    try {
      sI_1104_ALL2ERP_FPJY_OUT = (new net.jsgx.www.E1D.service.SI_1104_ALL2ERP_FPJY_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1104_ALL2ERP_FPJY_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1104_ALL2ERP_FPJY_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1104_ALL2ERP_FPJY_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1104_ALL2ERP_FPJY_OUT != null)
      ((javax.xml.rpc.Stub)sI_1104_ALL2ERP_FPJY_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E1D.service.SI_1104_ALL2ERP_FPJY_OUT getSI_1104_ALL2ERP_FPJY_OUT() {
    if (sI_1104_ALL2ERP_FPJY_OUT == null)
      _initSI_1104_ALL2ERP_FPJY_OUTProxy();
    return sI_1104_ALL2ERP_FPJY_OUT;
  }
  
  public DT_1104_ALL2ERP_FPJY_RETURN SI_1104_ALL2ERP_FPJY_OUT(net.jsgx.www.E1D.service.DT_1104_ALL2ERP_FPJY MT_1104_ALL2ERP_FPJY) throws java.rmi.RemoteException{
    if (sI_1104_ALL2ERP_FPJY_OUT == null)
      _initSI_1104_ALL2ERP_FPJY_OUTProxy();
    return sI_1104_ALL2ERP_FPJY_OUT.SI_1104_ALL2ERP_FPJY_OUT(MT_1104_ALL2ERP_FPJY);
  }
  
  
}