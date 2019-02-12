package weaver.interfaces.gx.jyl.file;

public class M_DFILE {
    private String status;
    private String creator;
    private String createtime;
    private String unit;
    private String efilecount;
    private String extid;
    private String title;
    private String cwrq;
    private String zrz;
    private String wh;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getEfilecount() {
        return efilecount;
    }

    public void setEfilecount(String efilecount) {
        this.efilecount = efilecount;
    }

    public String getExtid() {
        return extid;
    }

    public void setExtid(String extid) {
        this.extid = extid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCwrq() {
        return cwrq;
    }

    public void setCwrq(String cwrq) {
        this.cwrq = cwrq;
    }

    public String getZrz() {
        return zrz;
    }

    public void setZrz(String zrz) {
        this.zrz = zrz;
    }

    public String getWh() {
        return wh;
    }

    public void setWh(String wh) {
        this.wh = wh;
    }

    @Override
    public String toString() {
        return "M_DFILE{" +
                "status='" + status + '\'' +
                ", creator='" + creator + '\'' +
                ", createtime='" + createtime + '\'' +
                ", unit='" + unit + '\'' +
                ", efilecount='" + efilecount + '\'' +
                ", extid='" + extid + '\'' +
                ", title='" + title + '\'' +
                ", cwrq='" + cwrq + '\'' +
                ", zrz='" + zrz + '\'' +
                ", wh='" + wh + '\'' +
                '}';
    }
}
