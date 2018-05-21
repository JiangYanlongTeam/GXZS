package net.jsgx.www.E1D.service;

public class SI_1029_ALL2ERP_ZJYSSF_OUTProxy implements net.jsgx.www.E1D.service.SI_1029_ALL2ERP_ZJYSSF_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E1D.service.SI_1029_ALL2ERP_ZJYSSF_OUT sI_1029_ALL2ERP_ZJYSSF_OUT = null;
  
  public SI_1029_ALL2ERP_ZJYSSF_OUTProxy() {
    _initSI_1029_ALL2ERP_ZJYSSF_OUTProxy();
  }
  
  public SI_1029_ALL2ERP_ZJYSSF_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1029_ALL2ERP_ZJYSSF_OUTProxy();
  }
  
  private void _initSI_1029_ALL2ERP_ZJYSSF_OUTProxy() {
    try {
      sI_1029_ALL2ERP_ZJYSSF_OUT = (new net.jsgx.www.E1D.service.SI_1029_ALL2ERP_ZJYSSF_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1029_ALL2ERP_ZJYSSF_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1029_ALL2ERP_ZJYSSF_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1029_ALL2ERP_ZJYSSF_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1029_ALL2ERP_ZJYSSF_OUT != null)
      ((javax.xml.rpc.Stub)sI_1029_ALL2ERP_ZJYSSF_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E1D.service.SI_1029_ALL2ERP_ZJYSSF_OUT getSI_1029_ALL2ERP_ZJYSSF_OUT() {
    if (sI_1029_ALL2ERP_ZJYSSF_OUT == null)
      _initSI_1029_ALL2ERP_ZJYSSF_OUTProxy();
    return sI_1029_ALL2ERP_ZJYSSF_OUT;
  }
  
  public net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF_RETURN SI_1029_ALL2ERP_ZJYSSF_OUT(net.jsgx.www.E1D.service.DT_1029_ALL2ERP_ZJYSSF MT_1029_ALL2ERP_ZJYSSF) throws java.rmi.RemoteException{
    if (sI_1029_ALL2ERP_ZJYSSF_OUT == null)
      _initSI_1029_ALL2ERP_ZJYSSF_OUTProxy();
    return sI_1029_ALL2ERP_ZJYSSF_OUT.SI_1029_ALL2ERP_ZJYSSF_OUT(MT_1029_ALL2ERP_ZJYSSF);
  }
  
  
}