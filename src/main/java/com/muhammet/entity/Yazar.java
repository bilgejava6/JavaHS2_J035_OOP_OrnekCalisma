package com.muhammet.entity;

public class Yazar extends BaseEntity{
    private String ad;
    private String soyad;
    private String ozcecmis;
    private String alan;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Yazar{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append(", ozcecmis='").append(ozcecmis).append('\'');
        sb.append(", alan='").append(alan).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Yazar(String ad, String soyad, String ozcecmis, String alan) {
        this.ad = ad;
        this.soyad = soyad;
        this.ozcecmis = ozcecmis;
        this.alan = alan;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getOzcecmis() {
        return ozcecmis;
    }

    public void setOzcecmis(String ozcecmis) {
        this.ozcecmis = ozcecmis;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }
}
