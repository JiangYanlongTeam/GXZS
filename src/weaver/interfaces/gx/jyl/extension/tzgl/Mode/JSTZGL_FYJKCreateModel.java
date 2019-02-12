package weaver.interfaces.gx.jyl.extension.tzgl.Mode;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="ROOT")
public class JSTZGL_FYJKCreateModel {

	public JSTZGL_FYJKCreateModel(){}


	public JSTZGL_FYJKCreateModel(List<JSTZGL_FYJKCreate_HeadModel> hEAD) {
		super();
		HEAD = hEAD;
	}

	private List<JSTZGL_FYJKCreate_HeadModel> HEAD;
	@XmlElement(name="HEAD")
	public List<JSTZGL_FYJKCreate_HeadModel> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<JSTZGL_FYJKCreate_HeadModel> hEAD) {
		HEAD = hEAD;
	}
}
