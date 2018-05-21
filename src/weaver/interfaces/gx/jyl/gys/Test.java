package weaver.interfaces.gx.jyl.gys;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Vendors;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;

public class Test {

	public static void main(String[] args) {
		//检查是否有在途的编号
		String gysmc = "南京国信大酒店有限公司";
		String sh = "";
		String djh = "91320300711555109G";
		String zzjgdm = "";
		GYSPublicMethod GYSPublicMethod = new GYSPublicMethod();
		JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
		VendorsQuery vendorsQuery = new VendorsQuery();
		VendorsResultSet vendorsResultSet = null;
		if(!"".equals(gysmc)) {
			VendorsCriteria vendorsCriteria = new VendorsCriteria();
			vendorsCriteria.setFULL_NAME(GYSPublicMethod.setTextCriteria(gysmc));
			vendorsQuery.setCriteria(vendorsCriteria);
			try {
			    vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
			    if(null != vendorsResultSet) {
			    	Vendors[] vendors = vendorsResultSet.getVendors();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		System.out.println("{\"flag\":\"2\"}");
						} else {
							System.out.println("{\"flag\":\"0\"}");
						}
			    	} else {
			    		System.out.println("{\"flag\":\"0\"}");
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
		if("".equals(sh)){
			VendorsCriteria vendorsCriteria1 = new VendorsCriteria();
			vendorsCriteria1.setSTCEG(GYSPublicMethod.setTextCriteria(sh));
			vendorsQuery.setCriteria(vendorsCriteria1);
			try {
			    vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
			    if(null != vendorsResultSet) {
			    	Vendors[] vendors = vendorsResultSet.getVendors();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		System.out.println("{\"flag\":\"2\"}");
						} else {
							System.out.println("{\"flag\":\"0\"}");
						}
			    	} else {
			    		System.out.println("{\"flag\":\"0\"}");
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
		if(!"".equals(djh)) {
			VendorsCriteria vendorsCriteria2 = new VendorsCriteria();
			vendorsCriteria2.setSTCD1(GYSPublicMethod.setTextCriteria(djh));
			vendorsQuery.setCriteria(vendorsCriteria2);
			try {
			    vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
			    if(null != vendorsResultSet) {
			    	Vendors[] vendors = vendorsResultSet.getVendors();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		System.out.println("{\"flag\":\"2\"}");
						} else {
							System.out.println("{\"flag\":\"0\"}");
						}
			    	} else {
			    		System.out.println("{\"flag\":\"0\"}");
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
		if(!"".equals(zzjgdm)) {
			VendorsCriteria vendorsCriteria2 = new VendorsCriteria();
			vendorsCriteria2.setSTCD2(GYSPublicMethod.setTextCriteria(zzjgdm));
			vendorsQuery.setCriteria(vendorsCriteria2);
			try {
			    vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
			    if(null != vendorsResultSet) {
			    	Vendors[] vendors = vendorsResultSet.getVendors();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		System.out.println("{\"flag\":\"2\"}");
						} else {
							System.out.println("{\"flag\":\"0\"}");
						}
			    	} else {
			    		System.out.println("{\"flag\":\"0\"}");
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
	}
}
