package weaver.interfaces.gx.jyl.gfgs.cxdgyfk;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import weaver.interfaces.gx.jyl.util.XMLUtil;

@XmlRootElement(name="ROOT")
@XmlType(propOrder = {"BUKRS","ZJPZH","ZRELEASE","DMBTR"})
public class CXDGYFKSFMode {

	private String BUKRS;
	private String ZJPZH;
	private String ZRELEASE;
	private String DMBTR;
	
	public CXDGYFKSFMode(){}
	
	
	public CXDGYFKSFMode(String bUKRS, String zJPZH, String zRELEASE,
			String dMBTR) {
		super();
		BUKRS = bUKRS;
		ZJPZH = zJPZH;
		ZRELEASE = zRELEASE;
		DMBTR = dMBTR;
	}


	@XmlElement(name="BUKRS")
	public String getBUKRS() {
		return BUKRS;
	}
	public void setBUKRS(String bUKRS) {
		BUKRS = bUKRS;
	}
	@XmlElement(name="ZJPZH")
	public String getZJPZH() {
		return ZJPZH;
	}
	public void setZJPZH(String zJPZH) {
		ZJPZH = zJPZH;
	}
	@XmlElement(name="ZRELEASE")
	public String getZRELEASE() {
		return ZRELEASE;
	}
	public void setZRELEASE(String zRELEASE) {
		ZRELEASE = zRELEASE;
	}
	@XmlElement(name="DMBTR")
	public String getDMBTR() {
		return DMBTR;
	}
	public void setDMBTR(String dMBTR) {
		DMBTR = dMBTR;
	}
	
	public static void main(String[] args) {
		CXDGYFKSFMode model = new CXDGYFKSFMode("1", "2", "3", "4");
		try {
			String xml = XMLUtil.beanToXml(model, CXDGYFKSFMode.class);
			System.out.println(xml);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
