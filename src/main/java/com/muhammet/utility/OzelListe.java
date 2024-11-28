package com.muhammet.utility;

public class OzelListe<T> {
    private int size=0;
    private T[] list=null;
    private int currentIndex = -1;

    public void add(T item){
        size++;
        if(list==null){
            list = (T[])  new Object[size];
            list[++currentIndex] = item;
        }else{
            T[] tmp = list;
            list =  (T[])  new Object[size];
            for(int i=0; i<tmp.length;i++)
                list[i] = tmp[i];
            list[++currentIndex] = item;
        }
    }

}
