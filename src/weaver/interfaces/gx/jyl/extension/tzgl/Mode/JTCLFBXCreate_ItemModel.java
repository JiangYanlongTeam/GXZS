package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "SHKZG", "HKONT", "ZWLDW", "NAME1", "MWSKZ", "WRBTR", "DMBTR", "SGTXT", "XNEGP", "ZUONR",
		"KOSTL", "AUFNR", "POSID", "BUDG_CODE" })
public class JTCLFBXCreate_ItemModel {

	private String SHKZG;
	private String HKONT;
	private String ZWLDW;
	private String MWSKZ;
	private String WRBTR;
	private String DMBTR;
	private String SGTXT;
	private String XNEGP;
	private String ZUONR;
	private String KOSTL;
	private String AUFNR;
	private String POSID;
	private String BUDG_CODE;
	private String NAME1;

	public JTCLFBXCreate_ItemModel() {
	}

	public JTCLFBXCreate_ItemModel(String sHKZG, String hKONT, String zWLDW, String nAME1, String mWSKZ, String wRBTR,
                                   String dMBTR, String sGTXT, String xNEGP, String zUONR, String kOSTL, String aUFNR, String pOSID,
                                   String bUDG_CODE) {
		super();
		SHKZG = sHKZG;
		HKONT = hKONT;
		ZWLDW = zWLDW;
		NAME1 = nAME1;
		MWSKZ = mWSKZ;
		WRBTR = wRBTR;
		DMBTR = dMBTR;
		SGTXT = sGTXT;
		XNEGP = xNEGP;
		ZUONR = zUONR;
		KOSTL = kOSTL;
		AUFNR = aUFNR;
		POSID = pOSID;
		BUDG_CODE = bUDG_CODE;
	}

	@XmlElement(name = "NAME1")
	public String getNAME1() {
		return NAME1;
	}

	public void setNAME1(String nAME1) {
		NAME1 = nAME1;
	}

	@XmlElement(name = "SHKZG")
	public String getSHKZG() {
		return SHKZG;
	}

	public void setSHKZG(String sHKZG) {
		SHKZG = sHKZG;
	}

	@XmlElement(name = "HKONT")
	public String getHKONT() {
		return HKONT;
	}

	public void setHKONT(String hKONT) {
		HKONT = hKONT;
	}

	@XmlElement(name = "ZWLDW")
	public String getZWLDW() {
		return ZWLDW;
	}

	public void setZWLDW(String zWLDW) {
		ZWLDW = zWLDW;
	}

	@XmlElement(name = "MWSKZ")
	public String getMWSKZ() {
		return MWSKZ;
	}

	public void setMWSKZ(String mWSKZ) {
		MWSKZ = mWSKZ;
	}

	@XmlElement(name = "WRBTR")
	public String getWRBTR() {
		return WRBTR;
	}

	public void setWRBTR(String wRBTR) {
		WRBTR = wRBTR;
	}

	@XmlElement(name = "DMBTR")
	public String getDMBTR() {
		return DMBTR;
	}

	public void setDMBTR(String dMBTR) {
		DMBTR = dMBTR;
	}

	@XmlElement(name = "SGTXT")
	public String getSGTXT() {
		return SGTXT;
	}

	public void setSGTXT(String sGTXT) {
		SGTXT = sGTXT;
	}

	@XmlElement(name = "XNEGP")
	public String getXNEGP() {
		return XNEGP;
	}

	public void setXNEGP(String xNEGP) {
		XNEGP = xNEGP;
	}

	@XmlElement(name = "ZUONR")
	public String getZUONR() {
		return ZUONR;
	}

	public void setZUONR(String zUONR) {
		ZUONR = zUONR;
	}

	@XmlElement(name = "KOSTL")
	public String getKOSTL() {
		return KOSTL;
	}

	public void setKOSTL(String kOSTL) {
		KOSTL = kOSTL;
	}

	@XmlElement(name = "AUFNR")
	public String getAUFNR() {
		return AUFNR;
	}

	public void setAUFNR(String aUFNR) {
		AUFNR = aUFNR;
	}

	@XmlElement(name = "POSID")
	public String getPOSID() {
		return POSID;
	}

	public void setPOSID(String pOSID) {
		POSID = pOSID;
	}

	@XmlElement(name = "BUDG_CODE")
	public String getBUDG_CODE() {
		return BUDG_CODE;
	}

	public void setBUDG_CODE(String bUDG_CODE) {
		BUDG_CODE = bUDG_CODE;
	}
}
