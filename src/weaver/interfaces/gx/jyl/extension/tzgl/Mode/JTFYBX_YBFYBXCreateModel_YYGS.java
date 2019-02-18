package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name="INPUT")
@XmlType(propOrder = {"HEADER","LINE"})
public class JTFYBX_YBFYBXCreateModel_YYGS {

	public JTFYBX_YBFYBXCreateModel_YYGS(){}

	public JTFYBX_YBFYBXCreateModel_YYGS(List<JTFYBX_YBFYBXCreate_HeadModel> hEADER,
                                         List<JTFYBX_YBFYBXCreate_ItemModel_YYGS> lINE) {
		super();
		HEADER = hEADER;
		LINE = lINE;
	}

	private List<JTFYBX_YBFYBXCreate_HeadModel> HEADER;
	private List<JTFYBX_YBFYBXCreate_ItemModel_YYGS> LINE;

	@XmlElement(name="HEADER")
	public List<JTFYBX_YBFYBXCreate_HeadModel> getHEADER() {
		return HEADER;
	}
	public void setHEADER(List<JTFYBX_YBFYBXCreate_HeadModel> hEADER) {
		HEADER = hEADER;
	}
	@XmlElementWrapper(name="LINES")
	@XmlElement(name="LINE")
	public List<JTFYBX_YBFYBXCreate_ItemModel_YYGS> getLINE() {
		return LINE;
	}
	public void setLINE(List<JTFYBX_YBFYBXCreate_ItemModel_YYGS> lINE) {
		LINE = lINE;
	}
}
