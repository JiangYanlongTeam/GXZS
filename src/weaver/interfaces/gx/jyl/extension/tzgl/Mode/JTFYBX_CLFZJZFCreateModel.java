package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="ROOT")
public class JTFYBX_CLFZJZFCreateModel {

	public JTFYBX_CLFZJZFCreateModel(){}
	
	public JTFYBX_CLFZJZFCreateModel(List<JTFYBX_CLFZJZFCreate_HeadModel> hEAD) {
		super();
		HEAD = hEAD;
	}

	private List<JTFYBX_CLFZJZFCreate_HeadModel> HEAD;

	@XmlElement(name="HEAD")
	public List<JTFYBX_CLFZJZFCreate_HeadModel> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<JTFYBX_CLFZJZFCreate_HeadModel> hEAD) {
		HEAD = hEAD;
	}
}
