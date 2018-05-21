package weaver.interfaces.gx.jyl.gdzc;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ROOT")
@XmlType(propOrder = {"ID","BUKRS","ANLKL","TXT50","ANLHTXT","INVZU","KOSTL","KOSTLV","PS_PSP_PNR2","RAUMN","KFZKZ","ORD41","ORD43","LIFNR","LIEFE"})
public class GDZCModel {
	
	public GDZCModel(){}
	
	
	
	public GDZCModel(String iD, String bUKRS, String aNLKL, String tXT50,
			String aNLHTXT, String iNVZU, String kOSTL, String kOSTLV,
			String pS_PSP_PNR2, String rAUMN, String kFZKZ, String oRD41,
			String oRD43, String lIFNR, String lIEFE) {
		super();
		ID = iD;
		BUKRS = bUKRS;
		ANLKL = aNLKL;
		TXT50 = tXT50;
		ANLHTXT = aNLHTXT;
		INVZU = iNVZU;
		KOSTL = kOSTL;
		KOSTLV = kOSTLV;
		PS_PSP_PNR2 = pS_PSP_PNR2;
		RAUMN = rAUMN;
		KFZKZ = kFZKZ;
		ORD41 = oRD41;
		ORD43 = oRD43;
		LIFNR = lIFNR;
		LIEFE = lIEFE;
	}



	private String ID;
	private String BUKRS;
	private String ANLKL;
	private String TXT50;
	private String ANLHTXT;
	private String INVZU;
	private String KOSTL;
	private String KOSTLV;
	private String PS_PSP_PNR2;
	private String RAUMN;
	private String KFZKZ;
	private String ORD41;
	private String ORD43;
	private String LIFNR;
	private String LIEFE;
	
	@XmlElement(name="ID")
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	@XmlElement(name="BUKRS") 
	public String getBUKRS() {
		return BUKRS;
	}
	public void setBUKRS(String bUKRS) {
		BUKRS = bUKRS;
	}
	@XmlElement(name="ANLKL")
	public String getANLKL() {
		return ANLKL;
	}
	public void setANLKL(String aNLKL) {
		ANLKL = aNLKL;
	}
	@XmlElement(name="TXT50")
	public String getTXT50() {
		return TXT50;
	}
	public void setTXT50(String tXT50) {
		TXT50 = tXT50;
	}
	@XmlElement(name="ANLHTXT")
	public String getANLHTXT() {
		return ANLHTXT;
	}
	public void setANLHTXT(String aNLHTXT) {
		ANLHTXT = aNLHTXT;
	}
	@XmlElement(name="INVZU")
	public String getINVZU() {
		return INVZU;
	}
	public void setINVZU(String iNVZU) {
		INVZU = iNVZU;
	}
	@XmlElement(name="KOSTL")
	public String getKOSTL() {
		return KOSTL;
	}
	public void setKOSTL(String kOSTL) {
		KOSTL = kOSTL;
	}
	@XmlElement(name="KOSTLV")
	public String getKOSTLV() {
		return KOSTLV;
	}
	public void setKOSTLV(String kOSTLV) {
		KOSTLV = kOSTLV;
	}
	@XmlElement(name="PS_PSP_PNR2")
	public String getPS_PSP_PNR2() {
		return PS_PSP_PNR2;
	}
	public void setPS_PSP_PNR2(String pS_PSP_PNR2) {
		PS_PSP_PNR2 = pS_PSP_PNR2;
	}
	@XmlElement(name="RAUMN")
	public String getRAUMN() {
		return RAUMN;
	}
	public void setRAUMN(String rAUMN) {
		RAUMN = rAUMN;
	}
	@XmlElement(name="KFZKZ")
	public String getKFZKZ() {
		return KFZKZ;
	}
	public void setKFZKZ(String kFZKZ) {
		KFZKZ = kFZKZ;
	}
	@XmlElement(name="ORD41")
	public String getORD41() {
		return ORD41;
	}
	public void setORD41(String oRD41) {
		ORD41 = oRD41;
	}
	@XmlElement(name="ORD43")
	public String getORD43() {
		return ORD43;
	}
	public void setORD43(String oRD43) {
		ORD43 = oRD43;
	}
	@XmlElement(name="LIFNR")
	public String getLIFNR() {
		return LIFNR;
	}
	public void setLIFNR(String lIFNR) {
		LIFNR = lIFNR;
	}
	@XmlElement(name="LIEFE")
	public String getLIEFE() {
		return LIEFE;
	}
	public void setLIEFE(String lIEFE) {
		LIEFE = lIEFE;
	}
}
