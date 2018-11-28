package weaver.interfaces.gx.jyl.fpjy;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "BLDAT", "BUDAT", "INV_TRAN", "BUKRS", "ZFBDT", "BKTXT", "EBELN", "EBELP", "ANLN1","WRBTR", "MENGE",
		"WRBTR1", "MWSKZ1", "WMWST", "FPJY_ID", "FPJY_NO"})


public class FPJY_Body {

	public FPJY_Body() {
	}

	public FPJY_Body(String BLDAT, String BUDAT, String INV_TRAN, String BUKRS, String ZFBDT, String BKTXT, String EBELN, String EBELP, String ANLN1, String WRBTR, String MENGE, String WRBTR1, String MWSKZ1, String WMWST, String FPJY_ID, String FPJY_NO) {
		this.BLDAT = BLDAT;
		this.BUDAT = BUDAT;
		this.INV_TRAN = INV_TRAN;
		this.BUKRS = BUKRS;
		this.ZFBDT = ZFBDT;
		this.BKTXT = BKTXT;
		this.EBELN = EBELN;
		this.EBELP = EBELP;
		this.ANLN1 = ANLN1;
		this.WRBTR = WRBTR;
		this.MENGE = MENGE;
		this.WRBTR1 = WRBTR1;
		this.MWSKZ1 = MWSKZ1;
		this.WMWST = WMWST;
		this.FPJY_ID = FPJY_ID;
		this.FPJY_NO = FPJY_NO;
	}

	// @XmlElement(name = "PAYER_CNAPS")

	private String BLDAT;
	private String BUDAT;
	private String INV_TRAN;
	private String BUKRS;
	private String ZFBDT;
	private String BKTXT;
	private String EBELN;
	private String EBELP;
	private String ANLN1;
	private String WRBTR;
	private String MENGE;
	private String WRBTR1;
	private String MWSKZ1;
	private String WMWST;
	private String FPJY_ID;
	private String FPJY_NO;

	@XmlElement(name = "BLDAT")
	public String getBLDAT() {
		return BLDAT;
	}

	public void setBLDAT(String BLDAT) {
		this.BLDAT = BLDAT;
	}

	@XmlElement(name = "BUDAT")
	public String getBUDAT() {
		return BUDAT;
	}

	public void setBUDAT(String BUDAT) {
		this.BUDAT = BUDAT;
	}

	@XmlElement(name = "INV_TRAN")
	public String getINV_TRAN() {
		return INV_TRAN;
	}

	public void setINV_TRAN(String INV_TRAN) {
		this.INV_TRAN = INV_TRAN;
	}

	@XmlElement(name = "BUKRS")
	public String getBUKRS() {
		return BUKRS;
	}

	public void setBUKRS(String BUKRS) {
		this.BUKRS = BUKRS;
	}

	@XmlElement(name = "ZFBDT")
	public String getZFBDT() {
		return ZFBDT;
	}

	public void setZFBDT(String ZFBDT) {
		this.ZFBDT = ZFBDT;
	}

	@XmlElement(name = "BKTXT")
	public String getBKTXT() {
		return BKTXT;
	}

	public void setBKTXT(String BKTXT) {
		this.BKTXT = BKTXT;
	}

	@XmlElement(name = "EBELN")
	public String getEBELN() {
		return EBELN;
	}

	public void setEBELN(String EBELN) {
		this.EBELN = EBELN;
	}

	@XmlElement(name = "EBELP")
	public String getEBELP() {
		return EBELP;
	}

	public void setEBELP(String EBELP) {
		this.EBELP = EBELP;
	}

	@XmlElement(name = "ANLN1")
	public String getANLN1() {
		return ANLN1;
	}

	public void setANLN1(String ANLN1) {
		this.ANLN1 = ANLN1;
	}

	@XmlElement(name = "WRBTR")
	public String getWRBTR() {
		return WRBTR;
	}

	public void setWRBTR(String WRBTR) {
		this.WRBTR = WRBTR;
	}

	@XmlElement(name = "MENGE")
	public String getMENGE() {
		return MENGE;
	}

	public void setMENGE(String MENGE) {
		this.MENGE = MENGE;
	}

	@XmlElement(name = "WRBTR1")
	public String getWRBTR1() {
		return WRBTR1;
	}

	public void setWRBTR1(String WRBTR1) {
		this.WRBTR1 = WRBTR1;
	}

	@XmlElement(name = "MWSKZ1")
	public String getMWSKZ1() {
		return MWSKZ1;
	}

	public void setMWSKZ1(String MWSKZ1) {
		this.MWSKZ1 = MWSKZ1;
	}

	@XmlElement(name = "WMWST")
	public String getWMWST() {
		return WMWST;
	}

	public void setWMWST(String WMWST) {
		this.WMWST = WMWST;
	}

	@XmlElement(name = "FPJY_ID")
	public String getFPJY_ID() {
		return FPJY_ID;
	}

	public void setFPJY_ID(String FPJY_ID) {
		this.FPJY_ID = FPJY_ID;
	}

	@XmlElement(name = "FPJY_NO")
	public String getFPJY_NO() {
		return FPJY_NO;
	}

	public void setFPJY_NO(String FPJY_NO) {
		this.FPJY_NO = FPJY_NO;
	}
}
