package weaver.interfaces.gx.jyl.rcgs.pz;

import javax.xml.bind.annotation.XmlElement;

public class Voucher_head {
    private String company;
    private String voucher_type;
    private String fiscal_year;
    private String accounting_period;
    private String voucher_id;
    private String attachment_number;
    private String prepareddate;
    private String enter;
    private String cashier;
    private String signature;
    private String checker;
    private String posting_date;
    private String posting_person;
    private String voucher_making_system;
    private String memo1;
    private String memo2;
    private String reserve1;
    private String reserve2;
    private String date;

    @XmlElement(name="date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement(name="company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @XmlElement(name="voucher_type")
    public String getVoucher_type() {
        return voucher_type;
    }

    public void setVoucher_type(String voucher_type) {
        this.voucher_type = voucher_type;
    }
    @XmlElement(name="fiscal_year")
    public String getFiscal_year() {
        return fiscal_year;
    }

    public void setFiscal_year(String fiscal_year) {
        this.fiscal_year = fiscal_year;
    }
    @XmlElement(name="accounting_period")
    public String getAccounting_period() {
        return accounting_period;
    }

    public void setAccounting_period(String accounting_period) {
        this.accounting_period = accounting_period;
    }
    @XmlElement(name="voucher_id")
    public String getVoucher_id() {
        return voucher_id;
    }

    public void setVoucher_id(String voucher_id) {
        this.voucher_id = voucher_id;
    }
    @XmlElement(name="attachment_number")
    public String getAttachment_number() {
        return attachment_number;
    }

    public void setAttachment_number(String attachment_number) {
        this.attachment_number = attachment_number;
    }
    @XmlElement(name="prepareddate")
    public String getPrepareddate() {
        return prepareddate;
    }

    public void setPrepareddate(String prepareddate) {
        this.prepareddate = prepareddate;
    }
    @XmlElement(name="enter")
    public String getEnter() {
        return enter;
    }

    public void setEnter(String enter) {
        this.enter = enter;
    }
    @XmlElement(name="cashier")
    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }
    @XmlElement(name="signature")
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
    @XmlElement(name="checker")
    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }
    @XmlElement(name="posting_date")
    public String getPosting_date() {
        return posting_date;
    }

    public void setPosting_date(String posting_date) {
        this.posting_date = posting_date;
    }
    @XmlElement(name="posting_person")
    public String getPosting_person() {
        return posting_person;
    }

    public void setPosting_person(String posting_person) {
        this.posting_person = posting_person;
    }
    @XmlElement(name="voucher_making_system")
    public String getVoucher_making_system() {
        return voucher_making_system;
    }

    public void setVoucher_making_system(String voucher_making_system) {
        this.voucher_making_system = voucher_making_system;
    }
    @XmlElement(name="memo1")
    public String getMemo1() {
        return memo1;
    }

    public void setMemo1(String memo1) {
        this.memo1 = memo1;
    }
    @XmlElement(name="memo2")
    public String getMemo2() {
        return memo2;
    }

    public void setMemo2(String memo2) {
        this.memo2 = memo2;
    }
    @XmlElement(name="reserve1")
    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }
    @XmlElement(name="reserve2")
    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }
}
