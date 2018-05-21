package net.jsgx.www.E1D.service;

public class SI_1030_ALL2ERP_ZJYSZY_OUTProxy implements net.jsgx.www.E1D.service.SI_1030_ALL2ERP_ZJYSZY_OUT {
  private String _endpoint = null;
  private net.jsgx.www.E1D.service.SI_1030_ALL2ERP_ZJYSZY_OUT sI_1030_ALL2ERP_ZJYSZY_OUT = null;
  
  public SI_1030_ALL2ERP_ZJYSZY_OUTProxy() {
    _initSI_1030_ALL2ERP_ZJYSZY_OUTProxy();
  }
  
  public SI_1030_ALL2ERP_ZJYSZY_OUTProxy(String endpoint) {
    _endpoint = endpoint;
    _initSI_1030_ALL2ERP_ZJYSZY_OUTProxy();
  }
  
  private void _initSI_1030_ALL2ERP_ZJYSZY_OUTProxy() {
    try {
      sI_1030_ALL2ERP_ZJYSZY_OUT = (new net.jsgx.www.E1D.service.SI_1030_ALL2ERP_ZJYSZY_OUTServiceLocator()).getHTTPS_Port();
      if (sI_1030_ALL2ERP_ZJYSZY_OUT != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sI_1030_ALL2ERP_ZJYSZY_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sI_1030_ALL2ERP_ZJYSZY_OUT)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sI_1030_ALL2ERP_ZJYSZY_OUT != null)
      ((javax.xml.rpc.Stub)sI_1030_ALL2ERP_ZJYSZY_OUT)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.jsgx.www.E1D.service.SI_1030_ALL2ERP_ZJYSZY_OUT getSI_1030_ALL2ERP_ZJYSZY_OUT() {
    if (sI_1030_ALL2ERP_ZJYSZY_OUT == null)
      _initSI_1030_ALL2ERP_ZJYSZY_OUTProxy();
    return sI_1030_ALL2ERP_ZJYSZY_OUT;
  }
  
  public net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY_RETURN SI_1030_ALL2ERP_ZJYSZY_OUT(net.jsgx.www.E1D.service.DT_1030_ALL2ERP_ZJYSZY MT_1030_ALL2ERP_ZJYSZY) throws java.rmi.RemoteException{
    if (sI_1030_ALL2ERP_ZJYSZY_OUT == null)
      _initSI_1030_ALL2ERP_ZJYSZY_OUTProxy();
    return sI_1030_ALL2ERP_ZJYSZY_OUT.SI_1030_ALL2ERP_ZJYSZY_OUT(MT_1030_ALL2ERP_ZJYSZY);
  }
  
  
}