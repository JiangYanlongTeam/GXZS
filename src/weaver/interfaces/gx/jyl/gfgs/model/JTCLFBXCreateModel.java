package weaver.interfaces.gx.jyl.gfgs.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import weaver.interfaces.gx.jyl.util.XMLUtil;

@XmlRootElement(name="INPUT")
@XmlType(propOrder = {"HEADER","LINE"})
public class JTCLFBXCreateModel {

	public JTCLFBXCreateModel(){}

	public JTCLFBXCreateModel(List<JTCLFBXCreate_HeadModel> hEADER,
			List<JTCLFBXCreate_ItemModel> lINE) {
		super();
		HEADER = hEADER;
		LINE = lINE;
	}

	private List<JTCLFBXCreate_HeadModel> HEADER;
	private List<JTCLFBXCreate_ItemModel> LINE;

	@XmlElement(name="HEADER")
	public List<JTCLFBXCreate_HeadModel> getHEADER() {
		return HEADER;
	}
	public void setHEADER(List<JTCLFBXCreate_HeadModel> hEADER) {
		HEADER = hEADER;
	}
	@XmlElementWrapper(name="LINES")
	@XmlElement(name="LINE")
	public List<JTCLFBXCreate_ItemModel> getLINE() {
		return LINE;
	}
	public void setLINE(List<JTCLFBXCreate_ItemModel> lINE) {
		LINE = lINE;
	}
}
