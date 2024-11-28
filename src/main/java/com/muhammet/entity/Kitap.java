package com.muhammet.entity;

import com.muhammet.enums.KitapDurum;

import java.time.LocalDate;
import java.util.Arrays;

public class Kitap extends BaseEntity{
    private String ad;
    private String aciklama;
    private Yazar[] yazarlar;
    private YayinEvi yayinEvi;
    private LocalDate basimYili;
    private KitapDurum durum;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kitap{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", aciklama='").append(aciklama).append('\'');
        sb.append(", yazarlar=").append(yazarlar == null ? "null" : Arrays.asList(yazarlar).toString());
        sb.append(", yayinEvi=").append(yayinEvi);
        sb.append(", basimYili=").append(basimYili);
        sb.append(", durum=").append(durum);
        sb.append('}');
        return sb.toString();
    }

    public Kitap(LocalDate basimYili, KitapDurum durum, String aciklama, String ad) {
        this.basimYili = basimYili;
        this.durum = durum;
        this.aciklama = aciklama;
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Yazar[] getYazarlar() {
        return yazarlar;
    }

    public void setYazarlar(Yazar[] yazarlar) {
        this.yazarlar = yazarlar;
    }

    public YayinEvi getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(YayinEvi yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    public LocalDate getBasimYili() {
        return basimYili;
    }

    public void setBasimYili(LocalDate basimYili) {
        this.basimYili = basimYili;
    }

    public KitapDurum getDurum() {
        return durum;
    }

    public void setDurum(KitapDurum durum) {
        this.durum = durum;
    }
}
