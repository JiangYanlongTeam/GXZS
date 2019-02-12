package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "COMP_CODE", "DOC_TYPE", "DOC_DATE", "PSTNG_DATE", "HEADER_TXT", "REF_DOC_NO", "WAERS", "KURSF",
		"XREF1_HD", "XREF2_HD", "NUMPG" })
public class JTCLFBXCreate_HeadModel {

	public JTCLFBXCreate_HeadModel() {
	}

	public JTCLFBXCreate_HeadModel(String cOMP_CODE, String dOC_TYPE, String dOC_DATE, String pSTNG_DATE,
                                   String hEADER_TXT, String rEF_DOC_NO, String wAERS, String kURSF, String xREF1_HD, String xREF2_HD,
                                   String nUMPG ) {
		super();
		COMP_CODE = cOMP_CODE;
		DOC_TYPE = dOC_TYPE;
		DOC_DATE = dOC_DATE;
		PSTNG_DATE = pSTNG_DATE;
		HEADER_TXT = hEADER_TXT;
		REF_DOC_NO = rEF_DOC_NO;
		WAERS = wAERS;
		KURSF = kURSF;
		XREF1_HD = xREF1_HD;
		XREF2_HD = xREF2_HD;
		NUMPG = nUMPG;
	}

	private String COMP_CODE;
	private String DOC_TYPE;
	private String DOC_DATE;
	private String PSTNG_DATE;
	private String HEADER_TXT;
	private String REF_DOC_NO;
	private String WAERS;
	private String KURSF;
	private String XREF1_HD;
	private String XREF2_HD;
	private String NUMPG;

	@XmlElement(name = "NUMPG")
	public String getNUMPG() {
		return NUMPG;
	}

	public void setNUMPG(String nUMPG) {
		NUMPG = nUMPG;
	}

	@XmlElement(name = "COMP_CODE")
	public String getCOMP_CODE() {
		return COMP_CODE;
	}

	public void setCOMP_CODE(String cOMP_CODE) {
		COMP_CODE = cOMP_CODE;
	}

	@XmlElement(name = "DOC_TYPE")
	public String getDOC_TYPE() {
		return DOC_TYPE;
	}

	public void setDOC_TYPE(String dOC_TYPE) {
		DOC_TYPE = dOC_TYPE;
	}

	@XmlElement(name = "DOC_DATE")
	public String getDOC_DATE() {
		return DOC_DATE;
	}

	public void setDOC_DATE(String dOC_DATE) {
		DOC_DATE = dOC_DATE;
	}

	@XmlElement(name = "PSTNG_DATE")
	public String getPSTNG_DATE() {
		return PSTNG_DATE;
	}

	public void setPSTNG_DATE(String pSTNG_DATE) {
		PSTNG_DATE = pSTNG_DATE;
	}

	@XmlElement(name = "HEADER_TXT")
	public String getHEADER_TXT() {
		return HEADER_TXT;
	}

	public void setHEADER_TXT(String hEADER_TXT) {
		HEADER_TXT = hEADER_TXT;
	}

	@XmlElement(name = "REF_DOC_NO")
	public String getREF_DOC_NO() {
		return REF_DOC_NO;
	}

	public void setREF_DOC_NO(String rEF_DOC_NO) {
		REF_DOC_NO = rEF_DOC_NO;
	}

	@XmlElement(name = "WAERS")
	public String getWAERS() {
		return WAERS;
	}

	public void setWAERS(String wAERS) {
		WAERS = wAERS;
	}

	@XmlElement(name = "KURSF")
	public String getKURSF() {
		return KURSF;
	}

	public void setKURSF(String kURSF) {
		KURSF = kURSF;
	}

	@XmlElement(name = "XREF1_HD")
	public String getXREF1_HD() {
		return XREF1_HD;
	}

	public void setXREF1_HD(String xREF1_HD) {
		XREF1_HD = xREF1_HD;
	}

	@XmlElement(name = "XREF2_HD")
	public String getXREF2_HD() {
		return XREF2_HD;
	}

	public void setXREF2_HD(String xREF2_HD) {
		XREF2_HD = xREF2_HD;
	}

}
