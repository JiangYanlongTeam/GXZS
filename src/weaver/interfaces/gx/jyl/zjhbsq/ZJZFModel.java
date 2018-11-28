package weaver.interfaces.gx.jyl.zjhbsq;

import weaver.interfaces.gx.jyl.util.XMLUtil;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="ROOT")
@XmlType(propOrder = {"BUTXT","APPLYNO","STATUS","REQID"})
public class ZJZFModel {

	private String BUTXT;
	private String APPLYNO;
	private String STATUS;
	private String REQID;

	public ZJZFModel(String BUTXT, String APPLYNO, String STATUS, String REQID) {
		this.BUTXT = BUTXT;
		this.APPLYNO = APPLYNO;
		this.STATUS = STATUS;
		this.REQID = REQID;
	}

	public ZJZFModel(){}

	@XmlElement(name="BUTXT")
	public String getBUTXT() {
		return BUTXT;
	}

	public void setBUTXT(String BUTXT) {
		this.BUTXT = BUTXT;
	}
	@XmlElement(name="APPLYNO")
	public String getAPPLYNO() {
		return APPLYNO;
	}

	public void setAPPLYNO(String APPLYNO) {
		this.APPLYNO = APPLYNO;
	}
	@XmlElement(name="STATUS")
	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}
	@XmlElement(name="REQID")
	public String getREQID() {
		return REQID;
	}

	public void setREQID(String REQID) {
		this.REQID = REQID;
	}

	public static void main(String[] args) {
		ZJZFModel model = new ZJZFModel("1", "2", "3", "4");
		try {
			String xmlstring = XMLUtil.beanToXml(model, ZJZFModel.class);
			System.out.println(xmlstring);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
