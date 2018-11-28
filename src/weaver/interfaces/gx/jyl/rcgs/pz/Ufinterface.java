package weaver.interfaces.gx.jyl.rcgs.pz;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ufinterface")
public class Ufinterface {

    private String roottag = "voucher";
    private String billtype = "gl";
    private String replace = "Y";
    private String receiver = "1176";
    private String sender = "003";
    private String isexchange = "Y";
    private String filename = "voucher.xml";
    private String proc = "add";
    private String operation = "req";

    private Voucher voucher;

    @XmlAttribute(name="roottag")
    public String getRoottag() {
        return roottag;
    }

    public void setRoottag(String roottag) {
        this.roottag = roottag;
    }
    @XmlAttribute(name="billtype")
    public String getBilltype() {
        return billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }
    @XmlAttribute(name="replace")
    public String getReplace() {
        return replace;
    }

    public void setReplace(String replace) {
        this.replace = replace;
    }
    @XmlAttribute(name="receiver")
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    @XmlAttribute(name="sender")
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
    @XmlAttribute(name="isexchange")
    public String getIsexchange() {
        return isexchange;
    }

    public void setIsexchange(String isexchange) {
        this.isexchange = isexchange;
    }
    @XmlAttribute(name="filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    @XmlAttribute(name="proc")
    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }
    @XmlAttribute(name="operation")
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    @XmlElement(name="voucher")
    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }
}
