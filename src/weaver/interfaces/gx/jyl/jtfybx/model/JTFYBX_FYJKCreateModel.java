package weaver.interfaces.gx.jyl.jtfybx.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ROOT")
public class JTFYBX_FYJKCreateModel {
	
	public JTFYBX_FYJKCreateModel(){}
	
	
	public JTFYBX_FYJKCreateModel(List<JTFYBX_FYJKCreate_HeadModel> hEAD) {
		super();
		HEAD = hEAD;
	}

	private List<JTFYBX_FYJKCreate_HeadModel> HEAD;
	@XmlElement(name="HEAD")
	public List<JTFYBX_FYJKCreate_HeadModel> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<JTFYBX_FYJKCreate_HeadModel> hEAD) {
		HEAD = hEAD;
	}
}
