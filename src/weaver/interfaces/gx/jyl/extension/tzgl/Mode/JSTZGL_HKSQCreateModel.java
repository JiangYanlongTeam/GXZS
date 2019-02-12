package weaver.interfaces.gx.jyl.extension.tzgl.Mode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name="INPUT")
@XmlType(propOrder = {"HEADER","LINE"})
public class JSTZGL_HKSQCreateModel {

	public JSTZGL_HKSQCreateModel(){}

	public JSTZGL_HKSQCreateModel(List<JSTZGL_HKSQCreate_HeadModel> hEADER,
								  List<JSTZGL_HKSQCreate_ItemModel> lINE) {
		super();
		HEADER = hEADER;
		LINE = lINE;
	}

	private List<JSTZGL_HKSQCreate_HeadModel> HEADER;
	private List<JSTZGL_HKSQCreate_ItemModel> LINE;

	@XmlElement(name="HEADER")
	public List<JSTZGL_HKSQCreate_HeadModel> getHEADER() {
		return HEADER;
	}
	public void setHEADER(List<JSTZGL_HKSQCreate_HeadModel> hEADER) {
		HEADER = hEADER;
	}
	@XmlElementWrapper(name="LINES")
	@XmlElement(name="LINE")
	public List<JSTZGL_HKSQCreate_ItemModel> getLINE() {
		return LINE;
	}
	public void setLINE(List<JSTZGL_HKSQCreate_ItemModel> lINE) {
		LINE = lINE;
	}

}
