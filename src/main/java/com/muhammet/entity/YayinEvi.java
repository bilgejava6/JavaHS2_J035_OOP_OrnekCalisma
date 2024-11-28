package com.muhammet.entity;

public class YayinEvi extends BaseEntity{
    private String ad;
    private String adres;
    private String iletisim;



    public YayinEvi(String ad, String adres, String iletisim) {
        this.ad = ad;
        this.adres = adres;
        this.iletisim = iletisim;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getIletisim() {
        return iletisim;
    }

    public void setIletisim(String iletisim) {
        this.iletisim = iletisim;
    }
}
