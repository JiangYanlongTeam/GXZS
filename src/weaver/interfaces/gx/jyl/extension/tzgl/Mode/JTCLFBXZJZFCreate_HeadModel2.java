package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "ZDJLX", "BUKRS", "GJAHR", "MONAT", "KOSTL", "ZJPZH_ZY", "APPLYNO_EX", "ZFKLX", "LIFNR","ABWHK", "BRPDT",
		"ZJBR", "SQJE_HSB", "WAERS", "KURSF","SQJE_BWB","PAY_DATE", "TR_TYPE", "RECE_ACC_NAME", "RECE_CNAPS", "RECE_ACC_NO", "BUDG_CODE",
		"ABSTRACT","NUMPG","PAYER_CNAPS","PAYBANK_NO" })


public class JTCLFBXZJZFCreate_HeadModel2 {

	public JTCLFBXZJZFCreate_HeadModel2() {
	}

	public JTCLFBXZJZFCreate_HeadModel2(String zDJLX, String bUKRS, String gJAHR, String mONAT, String kOSTL,
                                        String zJPZH_ZY, String aPPLYNO_EX, String zFKLX, String lIFNR, String aBWHK , String bRPDT, String zJBR, String sQJE_HSB,
                                        String wAERS, String kURSF, String sQJE_BWB, String pAY_DATE, String tR_TYPE, String rECE_ACC_NAME, String rECE_CNAPS, String rECE_ACC_NO,
                                        String bUDG_CODE, String aBSTRACT, String nUMPG, String pAYER_CNAPS, String pAYBANK_NO) {
		super();
		PAYER_CNAPS = pAYER_CNAPS;
		PAYBANK_NO = pAYBANK_NO;
		ZDJLX = zDJLX;
		BUKRS = bUKRS;
		GJAHR = gJAHR;
		MONAT = mONAT;
		KOSTL = kOSTL;
		ZJPZH_ZY = zJPZH_ZY;
		APPLYNO_EX = aPPLYNO_EX;
		ZFKLX = zFKLX;
		LIFNR = lIFNR;
		BRPDT = bRPDT;
		ZJBR = zJBR;
		SQJE_HSB = sQJE_HSB;
		WAERS = wAERS;
		PAY_DATE = pAY_DATE;
		TR_TYPE = tR_TYPE;
		RECE_ACC_NAME = rECE_ACC_NAME;
		RECE_CNAPS = rECE_CNAPS;
		RECE_ACC_NO = rECE_ACC_NO;
		BUDG_CODE = bUDG_CODE;
		ABSTRACT = aBSTRACT;
		NUMPG = nUMPG;
		ABWHK = aBWHK;
		KURSF = kURSF;
		SQJE_BWB = sQJE_BWB;
	}

	private String ZDJLX;
	private String BUKRS;
	private String GJAHR;
	private String MONAT;
	private String KOSTL;
	private String ZJPZH_ZY;
	private String APPLYNO_EX;
	private String ZFKLX;
	private String LIFNR;
	private String BRPDT;
	private String ZJBR;
	private String SQJE_HSB;
	private String WAERS;
	private String PAY_DATE;
	private String TR_TYPE;
	private String RECE_ACC_NAME;
	private String RECE_CNAPS;
	private String RECE_ACC_NO;
	private String BUDG_CODE;
	private String ABSTRACT;
	private String NUMPG;
	private String ABWHK;
	private String PAYER_CNAPS;
	private String PAYBANK_NO;
	private String KURSF;
	private String SQJE_BWB;

	@XmlElement(name = "KURSF")
	public String getKURSF() {
		return KURSF;
	}

	public void setKURSF(String KURSF) {
		this.KURSF = KURSF;
	}

	@XmlElement(name = "SQJE_BWB")
	public String getSQJE_BWB() {
		return SQJE_BWB;
	}

	public void setSQJE_BWB(String SQJE_BWB) {
		this.SQJE_BWB = SQJE_BWB;
	}

	@XmlElement(name = "PAYER_CNAPS")
	public String getPAYER_CNAPS() {
		return PAYER_CNAPS;
	}

	public void setPAYER_CNAPS(String pAYER_CNAPS) {
		PAYER_CNAPS = pAYER_CNAPS;
	}
	@XmlElement(name = "PAYBANK_NO")
	public String getPAYBANK_NO() {
		return PAYBANK_NO;
	}

	public void setPAYBANK_NO(String pAYBANK_NO) {
		PAYBANK_NO = pAYBANK_NO;
	}

	@XmlElement(name = "NUMPG")
	public String getNUMPG() {
		return NUMPG;
	}

	public void setNUMPG(String nUMPG) {
		NUMPG = nUMPG;
	}
	@XmlElement(name = "ABWHK")
	public String getABWHK() {
		return ABWHK;
	}

	public void setABWHK(String aBWHK) {
		ABWHK = aBWHK;
	}

	@XmlElement(name = "ZDJLX")
	public String getZDJLX() {
		return ZDJLX;
	}

	public void setZDJLX(String zDJLX) {
		ZDJLX = zDJLX;
	}

	@XmlElement(name = "BUKRS")
	public String getBUKRS() {
		return BUKRS;
	}

	public void setBUKRS(String bUKRS) {
		BUKRS = bUKRS;
	}

	@XmlElement(name = "GJAHR")
	public String getGJAHR() {
		return GJAHR;
	}

	public void setGJAHR(String gJAHR) {
		GJAHR = gJAHR;
	}

	@XmlElement(name = "MONAT")
	public String getMONAT() {
		return MONAT;
	}

	public void setMONAT(String mONAT) {
		MONAT = mONAT;
	}

	@XmlElement(name = "KOSTL")
	public String getKOSTL() {
		return KOSTL;
	}

	public void setKOSTL(String kOSTL) {
		KOSTL = kOSTL;
	}

	@XmlElement(name = "ZJPZH_ZY")
	public String getZJPZH_ZY() {
		return ZJPZH_ZY;
	}

	public void setZJPZH_ZY(String zJPZH_ZY) {
		ZJPZH_ZY = zJPZH_ZY;
	}

	@XmlElement(name = "APPLYNO_EX")
	public String getAPPLYNO_EX() {
		return APPLYNO_EX;
	}

	public void setAPPLYNO_EX(String aPPLYNO_EX) {
		APPLYNO_EX = aPPLYNO_EX;
	}

	@XmlElement(name = "ZFKLX")
	public String getZFKLX() {
		return ZFKLX;
	}

	public void setZFKLX(String zFKLX) {
		ZFKLX = zFKLX;
	}

	@XmlElement(name = "LIFNR")
	public String getLIFNR() {
		return LIFNR;
	}

	public void setLIFNR(String lIFNR) {
		LIFNR = lIFNR;
	}

	@XmlElement(name = "BRPDT")
	public String getBRPDT() {
		return BRPDT;
	}

	public void setBRPDT(String bRPDT) {
		BRPDT = bRPDT;
	}

	@XmlElement(name = "ZJBR")
	public String getZJBR() {
		return ZJBR;
	}

	public void setZJBR(String zJBR) {
		ZJBR = zJBR;
	}

	@XmlElement(name = "SQJE_HSB")
	public String getSQJE_HSB() {
		return SQJE_HSB;
	}

	public void setSQJE_HSB(String sQJE_HSB) {
		SQJE_HSB = sQJE_HSB;
	}

	@XmlElement(name = "WAERS")
	public String getWAERS() {
		return WAERS;
	}

	public void setWAERS(String wAERS) {
		WAERS = wAERS;
	}

	@XmlElement(name = "PAY_DATE")
	public String getPAY_DATE() {
		return PAY_DATE;
	}

	public void setPAY_DATE(String pAY_DATE) {
		PAY_DATE = pAY_DATE;
	}

	@XmlElement(name = "TR_TYPE")
	public String getTR_TYPE() {
		return TR_TYPE;
	}

	public void setTR_TYPE(String tR_TYPE) {
		TR_TYPE = tR_TYPE;
	}

	@XmlElement(name = "RECE_ACC_NAME")
	public String getRECE_ACC_NAME() {
		return RECE_ACC_NAME;
	}

	public void setRECE_ACC_NAME(String rECE_ACC_NAME) {
		RECE_ACC_NAME = rECE_ACC_NAME;
	}

	@XmlElement(name = "RECE_CNAPS")
	public String getRECE_CNAPS() {
		return RECE_CNAPS;
	}

	public void setRECE_CNAPS(String rECE_CNAPS) {
		RECE_CNAPS = rECE_CNAPS;
	}

	@XmlElement(name = "RECE_ACC_NO")
	public String getRECE_ACC_NO() {
		return RECE_ACC_NO;
	}

	public void setRECE_ACC_NO(String rECE_ACC_NO) {
		RECE_ACC_NO = rECE_ACC_NO;
	}

	@XmlElement(name = "BUDG_CODE")
	public String getBUDG_CODE() {
		return BUDG_CODE;
	}

	public void setBUDG_CODE(String bUDG_CODE) {
		BUDG_CODE = bUDG_CODE;
	}

	@XmlElement(name = "ABSTRACT")
	public String getABSTRACT() {
		return ABSTRACT;
	}

	public void setABSTRACT(String aBSTRACT) {
		ABSTRACT = aBSTRACT;
	}

}
