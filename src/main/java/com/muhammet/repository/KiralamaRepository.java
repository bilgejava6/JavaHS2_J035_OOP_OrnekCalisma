package com.muhammet.repository;

import com.muhammet.entity.Kiralama;
import com.muhammet.utility.DB;

public class KiralamaRepository implements Repository<Kiralama>{
    private int index=0;
    @Override
    public void save(Kiralama kiralama) {
        if(DB.kiralama.length>index)// güvenlik
            DB.kiralama[index++] = kiralama;// 0, 1, 2
    }

    @Override
    public void update(Kiralama kiralama) {

    }

    @Override
    public void delete(String uuid) {

    }

    public void KiralamaListesiGoster(){
        for(int i=0; i<DB.kiralama.length;i++){
            Kiralama kiralama = DB.kiralama[i];
            System.out.println("kiralayan üye.......: "+ kiralama.getUye().getAd());
            System.out.println("kiralanan kitap.....: "+ kiralama.getKitap().getAd());
            System.out.println("iade tarihi.........: "+ kiralama.getIadeTarihi());
            System.out.println("------------------------------");
        }
    }

    @Override
    public Kiralama findById(String uuid) {
        return null;
    }

    @Override
    public Kiralama[] findAll() {
        return new Kiralama[0];
    }
}
