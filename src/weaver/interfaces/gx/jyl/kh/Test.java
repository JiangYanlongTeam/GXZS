package weaver.interfaces.gx.jyl.kh;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Customers;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersResultSet;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;

public class Test {

	public static void main(String[] args) {
		//检查是否有在途的编号
		String khmc = "江苏国信仪征热电有限责任公司";
		String sh = "";
		String djh = "91320300711555109G";
		String zzjgdm = "";
		KHPublicMethod publicmethod = new KHPublicMethod();
		JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        CustomersQuery customersQuery = new CustomersQuery();
        CustomersResultSet fundcenterResultSet = null;
        if(!"".equals(khmc)) {
        	CustomersCriteria customersCriteria = new CustomersCriteria();
        	customersCriteria.setFULL_NAME(publicmethod.setTextCriteria(khmc));
            customersQuery.setCriteria(customersCriteria);
            try {
    			fundcenterResultSet = f.searchCustomers(customersQuery, publicmethod.setReposInfo());
    			Customers[] customers = fundcenterResultSet.getCustomers();
    	        if(customers != null) {
    		    	if(customers.length > 0) {
    		    		System.out.println("{\"flag\":\"2\"}");
    				} else {
    					System.out.println("{\"flag\":\"0\"}");
    				}
    	    	} else {
    	    		System.out.println("{\"flag\":\"0\"}");
    	    	}
    		} catch (java.rmi.RemoteException e) {
    			e.printStackTrace();
    		}
        }
        if(!"".equals(sh)) {
        	CustomersCriteria customersCriteria = new CustomersCriteria();
        	customersCriteria.setSTCEG(publicmethod.setTextCriteria(sh));
            customersQuery.setCriteria(customersCriteria);
            try {
    			fundcenterResultSet = f.searchCustomers(customersQuery, publicmethod.setReposInfo());
    			Customers[] customers = fundcenterResultSet.getCustomers();
    	        if(customers != null) {
    		    	if(customers.length > 0) {
    		    		System.out.println("{\"flag\":\"2\"}");
    				} else {
    					System.out.println("{\"flag\":\"0\"}");
    				}
    	    	} else {
    	    		System.out.println("{\"flag\":\"0\"}");
    	    	}
    		} catch (java.rmi.RemoteException e) {
    			e.printStackTrace();
    		}
        }
        if(!"".equals(djh)) {
        	CustomersCriteria customersCriteria = new CustomersCriteria();
        	customersCriteria.setSTCD1(publicmethod.setTextCriteria(djh));
            customersQuery.setCriteria(customersCriteria);
            try {
    			fundcenterResultSet = f.searchCustomers(customersQuery, publicmethod.setReposInfo());
    			Customers[] customers = fundcenterResultSet.getCustomers();
    	        if(customers != null) {
    		    	if(customers.length > 0) {
    		    		System.out.println("{\"flag\":\"2\"}");
    				} else {
    					System.out.println("{\"flag\":\"0\"}");
    				}
    	    	} else {
    	    		System.out.println("{\"flag\":\"0\"}");
    	    	}
    		} catch (java.rmi.RemoteException e) {
    			e.printStackTrace();
    		}
        }
        if(!"".equals(zzjgdm)) {
        	CustomersCriteria customersCriteria = new CustomersCriteria();
        	customersCriteria.setSTCD5(publicmethod.setTextCriteria(zzjgdm));
            customersQuery.setCriteria(customersCriteria);
            try {
    			fundcenterResultSet = f.searchCustomers(customersQuery, publicmethod.setReposInfo());
    			Customers[] customers = fundcenterResultSet.getCustomers();
    	        if(customers != null) {
    		    	if(customers.length > 0) {
    		    		System.out.println("{\"flag\":\"2\"}");
    				} else {
    					System.out.println("{\"flag\":\"0\"}");
    				}
    	    	} else {
    	    		System.out.println("{\"flag\":\"0\"}");
    	    	}
    		} catch (java.rmi.RemoteException e) {
    			e.printStackTrace();
    		}
        }
	}
}
