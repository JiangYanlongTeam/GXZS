package weaver.interfaces.gx.jyl.rcgs.pz;

import javax.xml.bind.annotation.XmlElement;

public class Auxiliary_accounting {

    private Item item;

    @XmlElement(name="item")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
