package net.jsgx.www.E1D.service;

public class SI_1049_ALL2ERP_ZJZFSQ_OUTProxy implements net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUT sI_1049_ALL2ERP_ZJZFSQ_OUT = null;
  
  public SI_1049_ALL2ERP_ZJZFSQ_OUTProxy() {
    _initSI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
  }
  
  public SI_1049_ALL2ERP_ZJZFSQ_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
  }
  
  private void _initSI_1049_ALL2ERP_ZJZFSQ_OUTProxy() {
    try {
      sI_1049_ALL2ERP_ZJZFSQ_OUT = (new net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1049_ALL2ERP_ZJZFSQ_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1049_ALL2ERP_ZJZFSQ_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1049_ALL2ERP_ZJZFSQ_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1049_ALL2ERP_ZJZFSQ_OUT != null)
      ((javax.xml.rpc.Stub)sI_1049_ALL2ERP_ZJZFSQ_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUT getSI_1049_ALL2ERP_ZJZFSQ_OUT() {
    if (sI_1049_ALL2ERP_ZJZFSQ_OUT == null)
      _initSI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
    return sI_1049_ALL2ERP_ZJZFSQ_OUT;
  }
  
  public net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ_RETURN SI_1049_ALL2ERP_ZJZFSQ_OUT(net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ MT_1049_ALL2ERP_ZJZFSQ) throws java.rmi.RemoteException{
    if (sI_1049_ALL2ERP_ZJZFSQ_OUT == null)
      _initSI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
    return sI_1049_ALL2ERP_ZJZFSQ_OUT.SI_1049_ALL2ERP_ZJZFSQ_OUT(MT_1049_ALL2ERP_ZJZFSQ);
  }
  
  
}