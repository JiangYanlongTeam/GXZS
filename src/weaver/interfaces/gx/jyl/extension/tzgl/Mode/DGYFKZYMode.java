package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ROOT")
@XmlType(propOrder = {"BUKRS","GJAHR","MONAT","KOSTL","APPLYNO_EX","DMBTR","BUDG_CODE","ABSTRACT","YS_TYPE"})
public class DGYFKZYMode {

	private String BUKRS;
	private String GJAHR;
	private String MONAT;
	private String KOSTL;
	private String APPLYNO_EX;
	private String DMBTR;
	private String BUDG_CODE;
	private String ABSTRACT;
	private String YS_TYPE;
	
	public DGYFKZYMode(){}
	
	public DGYFKZYMode(String bUKRS, String gJAHR, String mONAT,
			String kOSTL, String aPPLYNO_EX, String dMBTR, String bUDG_CODE,
			String aBSTRACT, String yS_TYPE) {
		super();
		BUKRS = bUKRS;
		GJAHR = gJAHR;
		MONAT = mONAT;
		KOSTL = kOSTL;
		APPLYNO_EX = aPPLYNO_EX;
		DMBTR = dMBTR;
		BUDG_CODE = bUDG_CODE;
		ABSTRACT = aBSTRACT;
		YS_TYPE = yS_TYPE;
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
	@XmlElement(name="YS_TYPE")
	public String getYS_TYPE() {
		return YS_TYPE;
	}
	public void setYS_TYPE(String yS_TYPE) {
		YS_TYPE = yS_TYPE;
	}
}
