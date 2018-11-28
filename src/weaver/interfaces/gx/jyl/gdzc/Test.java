package weaver.interfaces.gx.jyl.gdzc;

import java.rmi.RemoteException;

import net.jsgx.www.E1D.service.DT_1083_OA2ERP_ASSET;
import net.jsgx.www.E1D.service.DT_1083_OA2ERP_ASSET_RETURN;
import net.jsgx.www.E1D.service.SI_1083_OA2ERP_ASSET_OUTProxy;

public class Test {

	public static void main(String[] args) {
//		SI_1083_OA2ERP_ASSET_OUTProxy proxy = new SI_1083_OA2ERP_ASSET_OUTProxy();
//		DT_1083_OA2ERP_ASSET DT_1083_OA2ERP_ASSET = new DT_1083_OA2ERP_ASSET();
//		DT_1083_OA2ERP_ASSET.setSYSTEM("2");
//		DT_1083_OA2ERP_ASSET.setOUTPUT("<?xml version=\"1.0\" encoding=\"GBK\" ?><ROOT><ID>1</ID><BUKRS>2000</BUKRS><ANLKL>10201</ANLKL><TXT50>test</TXT50><ANLHTXT>惠普T10</ANLHTXT><INVZU>C200000400</INVZU><KOSTL>C200000400</KOSTL><KOSTLV>C200000400</KOSTLV><PS_PSP_PNR2>40209016001</PS_PSP_PNR2><RAUMN>201</RAUMN><KFZKZ>执照牌号</KFZKZ><ORD41>Z01</ORD41><ORD43>Y01</ORD43><LIFNR></LIFNR><LIEFE></LIEFE></ROOT>");
//		try {
//			DT_1083_OA2ERP_ASSET_RETURN res = proxy.SI_1083_OA2ERP_ASSET_OUT(DT_1083_OA2ERP_ASSET);
//			String input = res.getINPUT();
//			System.out.println(input);
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}
		String s = "2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2;2";
		String[] strs = s.split(";");
		System.out.println(strs.length);
	}
}
