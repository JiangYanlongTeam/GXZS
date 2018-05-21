package weaver.interfaces.gx.jyl.gfgs.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ROOT")
public class JTCWFYJKCreateModel {
	
	public JTCWFYJKCreateModel(){}
	
	
	public JTCWFYJKCreateModel(List<JTCWFYJKCreate_HeadModel> hEAD) {
		super();
		HEAD = hEAD;
	}

	private List<JTCWFYJKCreate_HeadModel> HEAD;
	@XmlElement(name="HEAD")
	public List<JTCWFYJKCreate_HeadModel> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<JTCWFYJKCreate_HeadModel> hEAD) {
		HEAD = hEAD;
	}
}
