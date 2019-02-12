package weaver.interfaces.gx.jyl.extension.tzgl.Mode;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

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
