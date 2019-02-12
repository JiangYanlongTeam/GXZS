package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="INPUT")
public class FPJY_Head {

	public FPJY_Head(){}
	
	public FPJY_Head(List<FPJY_Body> hEAD) {
		super();
		HEAD = hEAD;
	}

	private List<FPJY_Body> HEAD;

	@XmlElement(name="LINE")
	public List<FPJY_Body> getHEAD() {
		return HEAD;
	}

	public void setHEAD(List<FPJY_Body> hEAD) {
		HEAD = hEAD;
	}
}
