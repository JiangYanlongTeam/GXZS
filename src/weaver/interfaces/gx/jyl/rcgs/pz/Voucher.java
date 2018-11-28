package weaver.interfaces.gx.jyl.rcgs.pz;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Voucher {
    private String id;
    private Voucher_head voucher_head;
    private Voucher_body voucher_body;

    @XmlElement(name="voucher_body")
    public Voucher_body getVoucher_body() {
        return voucher_body;
    }

    public void setVoucher_body(Voucher_body voucher_body) {
        this.voucher_body = voucher_body;
    }

    @XmlAttribute(name="id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name="voucher_head")
    public Voucher_head getVoucher_head() {
        return voucher_head;
    }

    public void setVoucher_head(Voucher_head voucher_head) {
        this.voucher_head = voucher_head;
    }
}
