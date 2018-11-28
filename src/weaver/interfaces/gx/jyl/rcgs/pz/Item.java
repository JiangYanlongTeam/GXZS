package weaver.interfaces.gx.jyl.rcgs.pz;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Item {

    private String name;

    private String spcecialitemvalue;

    @XmlAttribute(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="spcecialitemvalue")
    public String getSpcecialitemvalue() {
        return spcecialitemvalue;
    }

    public void setSpcecialitemvalue(String spcecialitemvalue) {
        this.spcecialitemvalue = spcecialitemvalue;
    }
}
