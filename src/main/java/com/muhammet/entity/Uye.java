package com.muhammet.entity;

import com.muhammet.enums.Cinsiyet;
import com.muhammet.enums.UyelikTuru;

public class Uye extends BaseEntity{
    private String ad;
    private String soyad;
    private String adres;
    private String telefon;
    private UyelikTuru uyelikTuru;
    private Cinsiyet cinsiyet;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Uye{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", soyad='").append(soyad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", uyelikTuru=").append(uyelikTuru);
        sb.append(", cinsiyet=").append(cinsiyet);
        sb.append('}');
        return sb.toString();
    }

    public Uye(String ad, String soyad, String adres, String telefon, UyelikTuru uyelikTuru, Cinsiyet cinsiyet) {
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.telefon = telefon;
        this.uyelikTuru = uyelikTuru;
        this.cinsiyet = cinsiyet;
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public UyelikTuru getUyelikTuru() {
        return uyelikTuru;
    }

    public void setUyelikTuru(UyelikTuru uyelikTuru) {
        this.uyelikTuru = uyelikTuru;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
