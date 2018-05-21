package weaver.interfaces.gx.jyl.gfgs.model;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import weaver.interfaces.gx.jyl.util.XMLUtil;

@XmlRootElement(name="ROOT")
@XmlType(propOrder = {"BUTXT","APPLYNO","STATUS","REQID"})
public class JTCWZJZFReturnModel {

	private String BUTXT;
	private String APPLYNO;
	private String STATUS;
	private String REQID;
	
	public JTCWZJZFReturnModel(){}

	public JTCWZJZFReturnModel(String bUTXT, String aPPLYNO, String sTATUS,
			String rEQID) {
		super();
		BUTXT = bUTXT;
		APPLYNO = aPPLYNO;
		STATUS = sTATUS;
		REQID = rEQID;
	}
	@XmlElement(name="BUTXT")
	public String getBUTXT() {
		return BUTXT;
	}

	public void setBUTXT(String bUTXT) {
		BUTXT = bUTXT;
	}
	@XmlElement(name="APPLYNO")
	public String getAPPLYNO() {
		return APPLYNO;
	}

	public void setAPPLYNO(String aPPLYNO) {
		APPLYNO = aPPLYNO;
	}
	@XmlElement(name="STATUS")
	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	@XmlElement(name="REQID")
	public String getREQID() {
		return REQID;
	}

	public void setREQID(String rEQID) {
		REQID = rEQID;
	}
	
	public static void main(String[] args) {
		JTCWZJZFReturnModel model = new JTCWZJZFReturnModel("1", "2", "3", "4");
		try {
			String xmlstring = XMLUtil.beanToXml(model, JTCWZJZFReturnModel.class);
			System.out.println(xmlstring);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
}
