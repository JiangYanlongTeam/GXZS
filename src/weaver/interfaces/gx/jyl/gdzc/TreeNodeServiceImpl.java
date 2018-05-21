package weaver.interfaces.gx.jyl.gdzc;

import java.rmi.RemoteException;

import net.jsgx.www.E1D.service.DT_1085_OA2ERP_WBS;
import net.jsgx.www.E1D.service.DT_1085_OA2ERP_WBS_RETURN;
import net.jsgx.www.E1D.service.SI_1085_OA2ERP_WBS_OUTProxy;
import weaver.general.BaseBean;

public class TreeNodeServiceImpl extends BaseBean implements TreeNodeService{

	@Override
	public String getXMLTreeNode() {
		BaseBean bean = new BaseBean();
		String number = bean.getPropValue("sh", "wbs_number");
		String system = bean.getPropValue("sh", "wbs_system");
		SI_1085_OA2ERP_WBS_OUTProxy proxy = new SI_1085_OA2ERP_WBS_OUTProxy();
		DT_1085_OA2ERP_WBS DT_1085_OA2ERP_WBS = new DT_1085_OA2ERP_WBS();
		DT_1085_OA2ERP_WBS.setOUTPUT("<ROOT><ID>"+number+"</ID></ROOT>");
		DT_1085_OA2ERP_WBS.setSYSTEM(system);
		String xml = "";
		try {
			DT_1085_OA2ERP_WBS_RETURN result = proxy.SI_1085_OA2ERP_WBS_OUT(DT_1085_OA2ERP_WBS);
			String xmlresult = result.getINPUT();
			xml = xmlresult.replace("<?xml version=\"1.0\"?>", "");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return xml;
	}
}
