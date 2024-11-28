package com.muhammet;

import com.muhammet.entity.Kiralama;
import com.muhammet.entity.Kitap;
import com.muhammet.entity.Uye;
import com.muhammet.entity.Yazar;
import com.muhammet.enums.Cinsiyet;
import com.muhammet.enums.KitapDurum;
import com.muhammet.enums.UyelikTuru;
import com.muhammet.repository.KiralamaRepository;
import com.muhammet.utility.DB;
import com.muhammet.utility.StaticValues;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        /**
         * Araç Kiralama Yönetim Sistemi
         * --------------------------------
         * --- Müşteri
         * --- Araç (uuid, modelYili, plaka vs., marka ve model)
         * -----  Marka ve Model ayrı birer entity olacaklar.
         * --- Kiralama
         * --- Firma(Kiralamayı yapan firma)
         * --- Bakim
         *
         *
         * Kütüphane ve Kitap Kiralama Uygulaması
         *
         * ---- Kitap
         * bir kitabın birden fazla yazarı olabilir. yayın evi olacak, uuid, basım yılı, kitabın durumu
         * (KIRADA, UYGUN, BAKIMDA, ELIMIZDE YOK (enum)) ve başka 4 adet daha işe yarayabilecek özellik ekleyiniz.
         * ---- Yazar
         * ---- Yayın Evi
         * ---- Üye
         * uuid, ad, soyad, adres, telefon, ERKEK/KADIN(enum), STANDART,BRONZ,GUMUS,ALTIN,PLATIN üyelik (Enum),
         * ---- Kiralama
         * kiralayan üye, kiralanan kitap(her kiralama 1 kitap içerebilir), kiralama tarihi, kiralama iade günü
         * kitapların kiralanma süreleri standart olup (3-5-9-14-21 gün) ile sınırlıdır.
         *---------------
         * 1- ahmet isimli üye hangi kitap yada kitapları kiralamıştır?
         * 2- bir yayın evine ait kitaplar hangileri?
         * 3- belli bir kitabı kadınlar mı erkekler mi daha çok alıyor?
         * 4- kiralama iade tarihleri düşünüldüğünde bugün iade gelecek kitaplar hangileridir?
         * 5- bir A kitabı şuan kiralanabilir durumda mı?
         * 6- A kitabının yazar veya yazarları kimlerdir?
         * 7- A yazarının kitapları nelerdir?
         *
         */
        Uye uyeAhmet = new Uye("Ahmet","TAŞ","Ankara","", UyelikTuru.ALTIN, Cinsiyet.ERKEK);
        Uye uyeDemet = new Uye("Demet","HAYAT","İzmir","", UyelikTuru.PLATIN, Cinsiyet.KADIN);
        LocalDate localDate = LocalDate.of(1988,1,1);
        Kitap kita1 = new Kitap(localDate, KitapDurum.UYGUN,"","A Kitabı");
        Kitap kita2 = new Kitap(localDate, KitapDurum.UYGUN,"","B Kitabı");
        Kitap kita3 = new Kitap(localDate, KitapDurum.UYGUN,"","C Kitabı");
        Kitap kita4 = new Kitap(localDate, KitapDurum.UYGUN,"","D Kitabı");


        Kiralama kiralama1 = new Kiralama(uyeAhmet,kita3,System.currentTimeMillis(),System.currentTimeMillis()+ StaticValues.DAY_5,5);
        Kiralama kiralama2 = new Kiralama(uyeDemet,kita1,System.currentTimeMillis(),System.currentTimeMillis()+ StaticValues.DAY_3,3);
        Kiralama kiralama3 = new Kiralama(uyeAhmet,kita2,System.currentTimeMillis(),System.currentTimeMillis()+ StaticValues.DAY_9,9);
        Kiralama kiralama4 = new Kiralama(uyeDemet,kita4,System.currentTimeMillis(),System.currentTimeMillis()+ StaticValues.DAY_9,9);

        KiralamaRepository repository = new KiralamaRepository();
        repository.save(kiralama1);
        repository.save(kiralama2);
        repository.save(kiralama3);
        repository.save(kiralama4);

        repository.KiralamaListesiGoster();

        DB.kitapListesi.add(kita1);

        DB.yazarListesi.add(new Yazar("","","",""));

    }
}