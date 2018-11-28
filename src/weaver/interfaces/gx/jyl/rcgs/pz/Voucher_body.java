package weaver.interfaces.gx.jyl.rcgs.pz;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Voucher_body {
    private List<Entry> entry = new ArrayList<Entry>();

    @XmlElement(name="entry")
    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }
}
