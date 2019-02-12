package weaver.interfaces.gx.jyl.extension.tzgl.Mode;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="ROOT")
public class JTCLFBXZJZFGDZCCreateModel {

	public JTCLFBXZJZFGDZCCreateModel(){}

	public JTCLFBXZJZFGDZCCreateModel(List<JTCLFBXZJZFGFZCCreate_HeadModel> hEAD) {
		super();
		HEAD = hEAD;
	}

	private List<JTCLFBXZJZFGFZCCreate_HeadModel> HEAD;

	@XmlElement(name="HEAD")
	public List<JTCLFBXZJZFGFZCCreate_HeadModel> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<JTCLFBXZJZFGFZCCreate_HeadModel> hEAD) {
		HEAD = hEAD;
	}
}
