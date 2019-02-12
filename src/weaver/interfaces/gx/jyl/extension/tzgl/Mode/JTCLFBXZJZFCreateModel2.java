package weaver.interfaces.gx.jyl.extension.tzgl.Mode;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="ROOT")
public class JTCLFBXZJZFCreateModel2 {

	public JTCLFBXZJZFCreateModel2(){}

	public JTCLFBXZJZFCreateModel2(List<JTCLFBXZJZFCreate_HeadModel2> hEAD) {
		super();
		HEAD = hEAD;
	}

	private List<JTCLFBXZJZFCreate_HeadModel2> HEAD;

	@XmlElement(name="HEAD")
	public List<JTCLFBXZJZFCreate_HeadModel2> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<JTCLFBXZJZFCreate_HeadModel2> hEAD) {
		HEAD = hEAD;
	}
}
