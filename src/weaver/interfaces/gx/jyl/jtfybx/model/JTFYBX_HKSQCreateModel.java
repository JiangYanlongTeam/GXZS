package weaver.interfaces.gx.jyl.jtfybx.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="INPUT")
@XmlType(propOrder = {"HEADER","LINE"})
public class JTFYBX_HKSQCreateModel {

	public JTFYBX_HKSQCreateModel(){}

	public JTFYBX_HKSQCreateModel(List<JTFYBX_HKSQCreate_HeadModel> hEADER,
			List<JTFYBX_HKSQCreate_ItemModel> lINE) {
		super();
		HEADER = hEADER;
		LINE = lINE;
	}

	private List<JTFYBX_HKSQCreate_HeadModel> HEADER;
	private List<JTFYBX_HKSQCreate_ItemModel> LINE;

	@XmlElement(name="HEADER")
	public List<JTFYBX_HKSQCreate_HeadModel> getHEADER() {
		return HEADER;
	}
	public void setHEADER(List<JTFYBX_HKSQCreate_HeadModel> hEADER) {
		HEADER = hEADER;
	}
	@XmlElementWrapper(name="LINES")
	@XmlElement(name="LINE")
	public List<JTFYBX_HKSQCreate_ItemModel> getLINE() {
		return LINE;
	}
	public void setLINE(List<JTFYBX_HKSQCreate_ItemModel> lINE) {
		LINE = lINE;
	}

}
