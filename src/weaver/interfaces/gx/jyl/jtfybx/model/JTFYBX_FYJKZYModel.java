package weaver.interfaces.gx.jyl.jtfybx.model;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import weaver.interfaces.gx.jyl.util.XMLUtil;

@XmlRootElement(name="ROOT")
@XmlType(propOrder = {"BUKRS","GJAHR","MONAT","KOSTL","APPLYNO_EX","DMBTR","BUDG_CODE","ABSTRACT"})
public class JTFYBX_FYJKZYModel {
	
	private String BUKRS;
	private String GJAHR;
	private String MONAT;
	private String KOSTL;
	private String APPLYNO_EX;
	private String DMBTR;
	private String BUDG_CODE;
	private String ABSTRACT;
	
	public JTFYBX_FYJKZYModel(){}

	public JTFYBX_FYJKZYModel(String bUKRS, String gJAHR, String mONAT,
			String kOSTL, String aPPLYNO_EX, String dMBTR, String bUDG_CODE,
			String aBSTRACT) {
		super();
		BUKRS = bUKRS;
		GJAHR = gJAHR;
		MONAT = mONAT;
		KOSTL = kOSTL;
		APPLYNO_EX = aPPLYNO_EX;
		DMBTR = dMBTR;
		BUDG_CODE = bUDG_CODE;
		ABSTRACT = aBSTRACT;
	}

	@XmlElement(name="BUKRS")
	public String getBUKRS() {
		return BUKRS;
	}
	public void setBUKRS(String bUKRS) {
		BUKRS = bUKRS;
	}
	@XmlElement(name="GJAHR")
	public String getGJAHR() {
		return GJAHR;
	}
	public void setGJAHR(String gJAHR) {
		GJAHR = gJAHR;
	}
	@XmlElement(name="MONAT")
	public String getMONAT() {
		return MONAT;
	}
	public void setMONAT(String mONAT) {
		MONAT = mONAT;
	}
	@XmlElement(name="KOSTL")
	public String getKOSTL() {
		return KOSTL;
	}
	public void setKOSTL(String kOSTL) {
		KOSTL = kOSTL;
	}
	@XmlElement(name="APPLYNO_EX")
	public String getAPPLYNO_EX() {
		return APPLYNO_EX;
	}
	public void setAPPLYNO_EX(String aPPLYNO_EX) {
		APPLYNO_EX = aPPLYNO_EX;
	}
	@XmlElement(name="DMBTR")
	public String getDMBTR() {
		return DMBTR;
	}
	public void setDMBTR(String dMBTR) {
		DMBTR = dMBTR;
	}
	@XmlElement(name="BUDG_CODE")
	public String getBUDG_CODE() {
		return BUDG_CODE;
	}
	public void setBUDG_CODE(String bUDG_CODE) {
		BUDG_CODE = bUDG_CODE;
	}
	@XmlElement(name="ABSTRACT")
	public String getABSTRACT() {
		return ABSTRACT;
	}
	public void setABSTRACT(String aBSTRACT) {
		ABSTRACT = aBSTRACT;
	}
	
	public static void main(String[] args) {
		JTFYBX_FYJKZYModel model = new JTFYBX_FYJKZYModel("1", "2", "3", "4", "5", "6", "7", "8");
		try {
			String xml = XMLUtil.beanToXml(model, JTFYBX_FYJKZYModel.class);
			System.out.println(xml);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
