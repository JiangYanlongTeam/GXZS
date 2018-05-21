package weaver.interfaces.gx.jyl.gdzc;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.core.mdm.sap.com.RepositoryInformation;
import beans.ws.mdm.sap.com.PicklistConstraint;
import beans.ws.mdm.sap.com.PicklistCriteria;
import beans.ws.mdm.sap.com.RecordIdentifierConstraint;
import beans.ws.mdm.sap.com.TextConstraint;
import beans.ws.mdm.sap.com.TextCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystems;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ClientSystemsResultSet;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorAccountGroupsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Vendors;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.gys.GYSPublicMethod;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;

public class GDZCSearchGysInfo {

	private GYSPublicMethod publicmethod = new GYSPublicMethod();
	private PublicMethod PublicMethods = new PublicMethod();

	public String service(String gysbh) {
		if ("".equals(Util.null2String(gysbh))) {
			return "{\"zhz\":\"\",\"gysmc\":\"\"}";
		}
		try {
			JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
			VendorsQuery vendorsQuery = new VendorsQuery();
			VendorsCriteria vendorsCriteria = new VendorsCriteria();
			// 供应商代码 查询条件
			if (!"".equals(gysbh)) {
				TextCriteria textCriteria = new TextCriteria();
				TextConstraint[] textConstraints = new TextConstraint[1];
				TextConstraint textConstraint = new TextConstraint();
				textConstraint.setExpressionOperator("CONTAINS");
				textConstraint.setValue(gysbh);
				textConstraints[0] = textConstraint;
				textCriteria.setConstraint(textConstraints);
				vendorsCriteria.setLIFNR(textCriteria);
			}
//			List<FFXTMode> list = PublicMethods.getFFXT("1000", "供应商");
//			PicklistCriteria p = new PicklistCriteria();
//			PicklistConstraint[] picklistConstraints = new PicklistConstraint[list.size()];
//
//			for (int i = 0; i < list.size(); i++) {
//				String ffxtdm = list.get(i).getFfxtdm();
//				ClientSystemsQuery query = new ClientSystemsQuery();
//				ClientSystemsCriteria criteria = new ClientSystemsCriteria();
//				criteria.setCode(publicmethod.setTextCriteria(ffxtdm));
//				query.setCriteria(criteria);
//				try {
//					ClientSystemsResultSet res = f.searchClientSystems(query, publicmethod.setReposInfo());
//					ClientSystems[] ClientSystems = res.getClientSystems();
//					PicklistConstraint PicklistConstraint = new PicklistConstraint();
//					PicklistConstraint.setExpressionOperator("EQUALS");
//					RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
//					RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
//					RecordIdentifierConstraint
//							.setInternalID(ClientSystems[0].getRecordIdentification().getInternalID());
//					RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
//					PicklistConstraint.setValue(RecordIdentifierConstraints);
//					picklistConstraints[i] = PicklistConstraint;
//				} catch (RemoteException e) {
//					e.printStackTrace();
//				}
//			}
//			p.setConstraint(picklistConstraints);
//			vendorsCriteria.setServiceRelationshipsTupleCLIENT_SYSTEM(p);
			vendorsQuery.setCriteria(vendorsCriteria);
			VendorsResultSet vendorsResultSet = null;
			try {
				vendorsResultSet = f.searchVendors(vendorsQuery, publicmethod.setReposInfo());
				Vendors[] vendors = vendorsResultSet.getVendors();
				if (null == vendors) {
					return "{\"zhz\":\"\",\"gysmc\":\"\"}";
				}
				VendorAccountGroupsLookup vendorAccountGroupsLookup = vendors[0].getKTOKK();
				String zhz_value = "";
				if (null != vendorAccountGroupsLookup) {
					zhz_value = vendorAccountGroupsLookup.getDisplayValue();
				}
				// 供应商全称
				String gysqc_value = vendors[0].getFULL_NAME();
				return "{\"zhz\":\"" + zhz_value + "\",\"gysmc\":\"" + gysqc_value + "\"}";

			} catch (RemoteException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
		}
		return null;
	}

	/**
	 * 设置CustomerAccountGroupsCriteria 对象
	 * 
	 * @param disvalue
	 *            默认值
	 * @return
	 */
	public static TextCriteria setTextCriteria(String disvalue) {
		TextCriteria textCriteria = new TextCriteria();
		TextConstraint[] textConstraints = new TextConstraint[1];
		TextConstraint textConstraint = new TextConstraint();
		textConstraint.setExpressionOperator("EQUALS");
		textConstraint.setValue(disvalue);
		textConstraints[0] = textConstraint;
		textCriteria.setConstraint(textConstraints);
		return textCriteria;
	}

	/**
	 * 设置RepositoryInformation对象
	 * 
	 * @return
	 */
	public static RepositoryInformation setReposInfo() {
		RepositoryInformation reposInfo = new RepositoryInformation();
		reposInfo.setDataLang("Chinese [CN]");
		reposInfo.setRepositoryName("JSGX_MDM_BUSINESS_PARTNER_Dev");
		reposInfo.setServerName("MDD");
		return reposInfo;
	}

	public static void main(String[] args) {
		try {
			JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
			VendorsQuery vendorsQuery = new VendorsQuery();
			VendorsCriteria vendorsCriteria = new VendorsCriteria();
			// 供应商代码 查询条件
			if ("".equals("")) {
				TextCriteria textCriteria = new TextCriteria();
				TextConstraint[] textConstraints = new TextConstraint[1];
				TextConstraint textConstraint = new TextConstraint();
				textConstraint.setExpressionOperator("CONTAINS");
				textConstraint.setValue("100000002");
				textConstraints[0] = textConstraint;
				textCriteria.setConstraint(textConstraints);
				vendorsCriteria.setLIFNR(textCriteria);
			}
			List<FFXTMode> list = new ArrayList<FFXTMode>();
			FFXTMode mode = new FFXTMode();
			String ffxtmc1 = "SAP_集团本部";
			String ffxtdm1 = "ECC_JT";
			mode.setFfxtdm(ffxtdm1);
			mode.setFfxtmc(ffxtmc1);
			list.add(mode);

			PicklistCriteria p = new PicklistCriteria();
			PicklistConstraint[] picklistConstraints = new PicklistConstraint[list.size()];

			for (int i = 0; i < list.size(); i++) {
				String ffxtdm = list.get(i).getFfxtdm();
				ClientSystemsQuery query = new ClientSystemsQuery();
				ClientSystemsCriteria criteria = new ClientSystemsCriteria();
				criteria.setCode(setTextCriteria(ffxtdm));
				query.setCriteria(criteria);
				try {
					ClientSystemsResultSet res = f.searchClientSystems(query, setReposInfo());
					ClientSystems[] ClientSystems = res.getClientSystems();
					PicklistConstraint PicklistConstraint = new PicklistConstraint();
					PicklistConstraint.setExpressionOperator("EQUALS");
					RecordIdentifierConstraint[] RecordIdentifierConstraints = new RecordIdentifierConstraint[1];
					RecordIdentifierConstraint RecordIdentifierConstraint = new RecordIdentifierConstraint();
					RecordIdentifierConstraint
							.setInternalID(ClientSystems[0].getRecordIdentification().getInternalID());
					RecordIdentifierConstraints[0] = RecordIdentifierConstraint;
					PicklistConstraint.setValue(RecordIdentifierConstraints);
					picklistConstraints[i] = PicklistConstraint;
				} catch (RemoteException e) {
					e.printStackTrace();
				}
			}
			p.setConstraint(picklistConstraints);
			vendorsCriteria.setServiceRelationshipsTupleCLIENT_SYSTEM(p);
			vendorsQuery.setCriteria(vendorsCriteria);
			VendorsResultSet vendorsResultSet = null;
			try {
				vendorsResultSet = f.searchVendors(vendorsQuery, setReposInfo());
				Vendors[] vendors = vendorsResultSet.getVendors();
				if (null == vendors) {
					System.out.println("{\"zhz\":\"\",\"gysmc\":\"\"}");
				}
				VendorAccountGroupsLookup vendorAccountGroupsLookup = vendors[0].getKTOKK();
				String zhz_value = "";
				if (null != vendorAccountGroupsLookup) {
					zhz_value = vendorAccountGroupsLookup.getDisplayValue();
				}
				// 供应商全称
				String gysqc_value = vendors[0].getFULL_NAME();
				System.out.println("{\"zhz\":\"" + zhz_value + "\",\"gysmc\":\"" + gysqc_value + "\"}");

			} catch (RemoteException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
