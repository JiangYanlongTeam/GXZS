package weaver.interfaces.gx.jyl.rcgs.pz;

import javax.xml.bind.annotation.XmlElement;

public class Entry {
    private String entry_id;
    private String account_code;
    private String abstracts;
    private String settlement;
    private String document_id;
    private String document_date;
    private String currency;
    private String unit_price;
    private String exchange_rate1;
    private String exchange_rate2;
    private String debit_quantity;
    private String primary_debit_amount;
    private String secondary_debit_amount;
    private String natural_debit_currency;
    private String credit_quantity;
    private String primary_credit_amount;

    private String secondary_credit_amount;
    private String natural_credit_currency;
    private String bill_type;
    private String bill_id;
    private String bill_date;
    private Auxiliary_accounting auxiliary_accounting;

    @XmlElement(name="auxiliary_accounting")
    public Auxiliary_accounting getAuxiliary_accounting() {
        return auxiliary_accounting;
    }

    public void setAuxiliary_accounting(Auxiliary_accounting auxiliary_accounting) {
        this.auxiliary_accounting = auxiliary_accounting;
    }

    @XmlElement(name="entry_id")
    public String getEntry_id() {
        return entry_id;
    }

    public void setEntry_id(String entry_id) {
        this.entry_id = entry_id;
    }
    @XmlElement(name="account_code")
    public String getAccount_code() {
        return account_code;
    }

    public void setAccount_code(String account_code) {
        this.account_code = account_code;
    }
    @XmlElement(name="abstract")
    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }
    @XmlElement(name="settlement")
    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }
    @XmlElement(name="document_id")
    public String getDocument_id() {
        return document_id;
    }

    public void setDocument_id(String document_id) {
        this.document_id = document_id;
    }
    @XmlElement(name="document_date")
    public String getDocument_date() {
        return document_date;
    }

    public void setDocument_date(String document_date) {
        this.document_date = document_date;
    }
    @XmlElement(name="currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    @XmlElement(name="unit_price")
    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }
    @XmlElement(name="exchange_rate1")
    public String getExchange_rate1() {
        return exchange_rate1;
    }

    public void setExchange_rate1(String exchange_rate1) {
        this.exchange_rate1 = exchange_rate1;
    }
    @XmlElement(name="exchange_rate2")
    public String getExchange_rate2() {
        return exchange_rate2;
    }

    public void setExchange_rate2(String exchange_rate2) {
        this.exchange_rate2 = exchange_rate2;
    }
    @XmlElement(name="debit_quantity")
    public String getDebit_quantity() {
        return debit_quantity;
    }

    public void setDebit_quantity(String debit_quantity) {
        this.debit_quantity = debit_quantity;
    }
    @XmlElement(name="primary_debit_amount")
    public String getPrimary_debit_amount() {
        return primary_debit_amount;
    }

    public void setPrimary_debit_amount(String primary_debit_amount) {
        this.primary_debit_amount = primary_debit_amount;
    }
    @XmlElement(name="secondary_debit_amount")
    public String getSecondary_debit_amount() {
        return secondary_debit_amount;
    }

    public void setSecondary_debit_amount(String secondary_debit_amount) {
        this.secondary_debit_amount = secondary_debit_amount;
    }
    @XmlElement(name="natural_debit_currency")
    public String getNatural_debit_currency() {
        return natural_debit_currency;
    }

    public void setNatural_debit_currency(String natural_debit_currency) {
        this.natural_debit_currency = natural_debit_currency;
    }
    @XmlElement(name="credit_quantity")
    public String getCredit_quantity() {
        return credit_quantity;
    }

    public void setCredit_quantity(String credit_quantity) {
        this.credit_quantity = credit_quantity;
    }
    @XmlElement(name="primary_credit_amount")
    public String getPrimary_credit_amount() {
        return primary_credit_amount;
    }

    public void setPrimary_credit_amount(String primary_credit_amount) {
        this.primary_credit_amount = primary_credit_amount;
    }
    @XmlElement(name="secondary_credit_amount")
    public String getSecondary_credit_amount() {
        return secondary_credit_amount;
    }

    public void setSecondary_credit_amount(String secondary_credit_amount) {
        this.secondary_credit_amount = secondary_credit_amount;
    }
    @XmlElement(name="natural_credit_currency")
    public String getNatural_credit_currency() {
        return natural_credit_currency;
    }

    public void setNatural_credit_currency(String natural_credit_currency) {
        this.natural_credit_currency = natural_credit_currency;
    }
    @XmlElement(name="bill_type")
    public String getBill_type() {
        return bill_type;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }
    @XmlElement(name="bill_id")
    public String getBill_id() {
        return bill_id;
    }

    public void setBill_id(String bill_id) {
        this.bill_id = bill_id;
    }
    @XmlElement(name="bill_date")
    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }
}
