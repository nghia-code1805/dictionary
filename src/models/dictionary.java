package models;

public class dictionary {
    private String en;
    private String vn;

    public dictionary(){

    }

    public  dictionary(String en, String vn) {
        this.en = en;
        this.vn = vn;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
}
