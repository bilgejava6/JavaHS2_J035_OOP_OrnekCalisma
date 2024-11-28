package com.muhammet.utility;

import com.muhammet.entity.Kiralama;
import com.muhammet.entity.Kitap;
import com.muhammet.entity.Uye;
import com.muhammet.entity.Yazar;

public class DB {
    public static Kiralama[] kiralama = new Kiralama[3];
    public static Uye[] uyeListesi = new Uye[3];

    public static OzelListe<Kitap> kitapListesi = new OzelListe<>();
    public static OzelListe<Yazar> yazarListesi = new OzelListe<>();
}
