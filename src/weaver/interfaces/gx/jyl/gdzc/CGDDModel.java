package weaver.interfaces.gx.jyl.gdzc;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder = {"ID","BSART","LIFNR","BUKRS","EKORG","EKGRP","HTKEY","HTTXT","HTWRB","MAKTX","MATKL","MENGE","LMEIN","ANLN1","PS_POSID","SAKTO","KOSTL","EEIND","NETWR","MWSKZ","WERKS"})
public class CGDDModel {

	public CGDDModel(){
		
	}
	
	
	public CGDDModel(String iD, String bSART, String lIFNR, String bUKRS,
			String eKORG, String eKGRP, String hTKEY, String hTTXT,
			String hTWRB, String mAKTX, String mATKL, String mENGE,
			String lMEIN, String aNLN1, String pS_POSID, String sAKTO,
			String kOSTL, String eEIND, String nETWR, String mWSKZ, String wERKS) {
		super();
		ID = iD;
		BSART = bSART;
		LIFNR = lIFNR;
		BUKRS = bUKRS;
		EKORG = eKORG;
		EKGRP = eKGRP;
		HTKEY = hTKEY;
		HTTXT = hTTXT;
		HTWRB = hTWRB;
		MAKTX = mAKTX;
		MATKL = mATKL;
		MENGE = mENGE;
		LMEIN = lMEIN;
		ANLN1 = aNLN1;
		PS_POSID = pS_POSID;
		SAKTO = sAKTO;
		KOSTL = kOSTL;
		EEIND = eEIND;
		NETWR = nETWR;
		MWSKZ = mWSKZ;
		WERKS = wERKS;
	}


	private String ID;
	private String BSART;
	private String LIFNR;
	private String BUKRS;
	private String EKORG;
	private String EKGRP;
	private String HTKEY;
	private String HTTXT;
	private String HTWRB;
	private String MAKTX;
	private String MATKL;
	private String MENGE;
	private String LMEIN;
	private String ANLN1;
	private String PS_POSID;
	private String SAKTO;
	private String KOSTL;
	private String EEIND;
	private String NETWR;
	private String MWSKZ;
	private String WERKS;
	
	@XmlElement(name="ID")
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	@XmlElement(name="BSART")
	public String getBSART() {
		return BSART;
	}
	public void setBSART(String bSART) {
		BSART = bSART;
	}
	@XmlElement(name="LIFNR")
	public String getLIFNR() {
		return LIFNR;
	}
	public void setLIFNR(String lIFNR) {
		LIFNR = lIFNR;
	}
	@XmlElement(name="BUKRS")
	public String getBUKRS() {
		return BUKRS;
	}
	public void setBUKRS(String bUKRS) {
		BUKRS = bUKRS;
	}
	@XmlElement(name="EKORG")
	public String getEKORG() {
		return EKORG;
	}
	public void setEKORG(String eKORG) {
		EKORG = eKORG;
	}
	@XmlElement(name="EKGRP")
	public String getEKGRP() {
		return EKGRP;
	}
	public void setEKGRP(String eKGRP) {
		EKGRP = eKGRP;
	}
	@XmlElement(name="HTKEY")
	public String getHTKEY() {
		return HTKEY;
	}
	public void setHTKEY(String hTKEY) {
		HTKEY = hTKEY;
	}
	@XmlElement(name="HTTXT")
	public String getHTTXT() {
		return HTTXT;
	}
	public void setHTTXT(String hTTXT) {
		HTTXT = hTTXT;
	}
	@XmlElement(name="HTWRB")
	public String getHTWRB() {
		return HTWRB;
	}
	public void setHTWRB(String hTWRB) {
		HTWRB = hTWRB;
	}
	@XmlElement(name="MAKTX")
	public String getMAKTX() {
		return MAKTX;
	}
	public void setMAKTX(String mAKTX) {
		MAKTX = mAKTX;
	}
	@XmlElement(name="MATKL")
	public String getMATKL() {
		return MATKL;
	}
	public void setMATKL(String mATKL) {
		MATKL = mATKL;
	}
	@XmlElement(name="MENGE")
	public String getMENGE() {
		return MENGE;
	}
	public void setMENGE(String mENGE) {
		MENGE = mENGE;
	}
	@XmlElement(name="LMEIN")
	public String getLMEIN() {
		return LMEIN;
	}
	public void setLMEIN(String lMEIN) {
		LMEIN = lMEIN;
	}
	@XmlElement(name="ANLN1")
	public String getANLN1() {
		return ANLN1;
	}
	public void setANLN1(String aNLN1) {
		ANLN1 = aNLN1;
	}
	@XmlElement(name="PS_POSID")
	public String getPS_POSID() {
		return PS_POSID;
	}
	public void setPS_POSID(String pS_POSID) {
		PS_POSID = pS_POSID;
	}
	@XmlElement(name="SAKTO")
	public String getSAKTO() {
		return SAKTO;
	}
	public void setSAKTO(String sAKTO) {
		SAKTO = sAKTO;
	}
	@XmlElement(name="KOSTL")
	public String getKOSTL() {
		return KOSTL;
	}
	public void setKOSTL(String kOSTL) {
		KOSTL = kOSTL;
	}
	@XmlElement(name="EEIND")
	public String getEEIND() {
		return EEIND;
	}
	public void setEEIND(String eEIND) {
		EEIND = eEIND;
	}
	@XmlElement(name="NETWR")
	public String getNETWR() {
		return NETWR;
	}
	public void setNETWR(String nETWR) {
		NETWR = nETWR;
	}
	@XmlElement(name="MWSKZ")
	public String getMWSKZ() {
		return MWSKZ;
	}
	public void setMWSKZ(String mWSKZ) {
		MWSKZ = mWSKZ;
	}
	@XmlElement(name="WERKS")
	public String getWERKS() {
		return WERKS;
	}
	public void setWERKS(String wERKS) {
		WERKS = wERKS;
	}
}
