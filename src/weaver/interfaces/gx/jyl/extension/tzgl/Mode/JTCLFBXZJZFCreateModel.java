package weaver.interfaces.gx.jyl.extension.tzgl.Mode;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="ROOT")
public class JTCLFBXZJZFCreateModel {

	public JTCLFBXZJZFCreateModel(){}
	
	public JTCLFBXZJZFCreateModel(List<JTCLFBXZJZFCreate_HeadModel> hEAD) {
		super();
		HEAD = hEAD;
	}

	private List<JTCLFBXZJZFCreate_HeadModel> HEAD;

	@XmlElement(name="HEAD")
	public List<JTCLFBXZJZFCreate_HeadModel> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<JTCLFBXZJZFCreate_HeadModel> hEAD) {
		HEAD = hEAD;
	}
}
