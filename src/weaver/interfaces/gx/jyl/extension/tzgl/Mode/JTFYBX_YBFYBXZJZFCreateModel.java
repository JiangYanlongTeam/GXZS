package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="ROOT")
public class JTFYBX_YBFYBXZJZFCreateModel {

	public JTFYBX_YBFYBXZJZFCreateModel(){}
	
	public JTFYBX_YBFYBXZJZFCreateModel(List<JTFYBX_YBFYBXZJZFCreate_HeadModel> hEAD) {
		super();
		HEAD = hEAD;
	}

	private List<JTFYBX_YBFYBXZJZFCreate_HeadModel> HEAD;

	@XmlElement(name="HEAD")
	public List<JTFYBX_YBFYBXZJZFCreate_HeadModel> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<JTFYBX_YBFYBXZJZFCreate_HeadModel> hEAD) {
		HEAD = hEAD;
	}
}
