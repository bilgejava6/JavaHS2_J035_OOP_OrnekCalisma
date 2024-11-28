package com.muhammet.entity;

import com.muhammet.enums.KiralamaDurumu;

public class Kiralama extends BaseEntity{
    private Uye uye;
    private Kitap kitap;
    private Long kiralamTarihi;
    private Long iadeTarihi;
    private int kiralamaSuresi;
    private KiralamaDurumu kiralamaDurumu;
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kiralama{");
        sb.append("uye=").append(uye);
        sb.append(", kitap=").append(kitap);
        sb.append(", kiralamTarihi=").append(kiralamTarihi);
        sb.append(", iadeTarihi=").append(iadeTarihi);
        sb.append(", kiralamaSuresi=").append(kiralamaSuresi);
        sb.append('}');
        return sb.toString();
    }

    public Kiralama(Uye uye, Kitap kitap, Long kiralamTarihi, Long iadeTarihi, int kiralamaSuresi) {
        this.uye = uye;
        this.kitap = kitap;
        this.kiralamTarihi = kiralamTarihi;
        this.iadeTarihi = iadeTarihi;
        this.kiralamaSuresi = kiralamaSuresi;
        this.kiralamaDurumu = KiralamaDurumu.KIRADA;
    }

    public KiralamaDurumu getKiralamaDurumu() {
        return kiralamaDurumu;
    }

    public void setKiralamaDurumu(KiralamaDurumu kiralamaDurumu) {
        this.kiralamaDurumu = kiralamaDurumu;
    }

    public int getKiralamaSuresi() {
        return kiralamaSuresi;
    }

    public void setKiralamaSuresi(int kiralamaSuresi) {
        this.kiralamaSuresi = kiralamaSuresi;
    }

    public Long getIadeTarihi() {
        return iadeTarihi;
    }

    public void setIadeTarihi(Long iadeTarihi) {
        this.iadeTarihi = iadeTarihi;
    }

    public Long getKiralamTarihi() {
        return kiralamTarihi;
    }

    public void setKiralamTarihi(Long kiralamTarihi) {
        this.kiralamTarihi = kiralamTarihi;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }

    public Uye getUye() {
        return uye;
    }

    public void setUye(Uye uye) {
        this.uye = uye;
    }
}
