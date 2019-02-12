package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name="INPUT")
@XmlType(propOrder = {"HEADER","LINE"})
public class JTFYBX_CLFCreateModel {

	public JTFYBX_CLFCreateModel(){}

	public JTFYBX_CLFCreateModel(List<JTFYBX_CLFCreate_HeadModel> hEADER,
			List<JTFYBX_CLFCreate_ItemModel> lINE) {
		super();
		HEADER = hEADER;
		LINE = lINE;
	}

	private List<JTFYBX_CLFCreate_HeadModel> HEADER;
	private List<JTFYBX_CLFCreate_ItemModel> LINE;

	@XmlElement(name="HEADER")
	public List<JTFYBX_CLFCreate_HeadModel> getHEADER() {
		return HEADER;
	}
	public void setHEADER(List<JTFYBX_CLFCreate_HeadModel> hEADER) {
		HEADER = hEADER;
	}
	@XmlElementWrapper(name="LINES")
	@XmlElement(name="LINE")
	public List<JTFYBX_CLFCreate_ItemModel> getLINE() {
		return LINE;
	}
	public void setLINE(List<JTFYBX_CLFCreate_ItemModel> lINE) {
		LINE = lINE;
	}
}
