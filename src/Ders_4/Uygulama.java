package Ders_4;

public class Uygulama {
    public static void main(String[] args) {

        TekYönlüListeYapisi tekYonList = new TekYönlüListeYapisi();

        tekYonList.basaEkle(10);
        tekYonList.basaEkle(30);
        tekYonList.basaEkle(40);
        tekYonList.basaEkle(50);
        tekYonList.basaEkle(60);

        tekYonList.aradanSil(2);
        tekYonList.aradanSil(3);
        tekYonList.aradanSil(0);
        tekYonList.aradanSil(1);
        tekYonList.aradanSil(0);

        tekYonList.yazdir();
    }
}
