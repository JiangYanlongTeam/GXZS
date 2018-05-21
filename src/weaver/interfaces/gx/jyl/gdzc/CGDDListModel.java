package weaver.interfaces.gx.jyl.gdzc;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ROOT")
public class CGDDListModel {

	private List<CGDDModel> list;

	@XmlElement(name="ITEM")
	public List<CGDDModel> getList() {
		return list;
	}

	public void setList(List<CGDDModel> list) {
		this.list = list;
	}
}
