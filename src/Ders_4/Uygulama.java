package Ders_4;

public class Uygulama {
    public static void main(String[] args) {

        TekYönlüListeYapisi tekYonList = new TekYönlüListeYapisi();

        tekYonList.basaEkle(11);
        tekYonList.sonaEkle(22);
        tekYonList.basaEkle(5);
        tekYonList.sonaEkle(33);
        tekYonList.sonaEkle(44);
        tekYonList.sonaEkle(55);

        tekYonList.arayaEkle(3,25);
        tekYonList.arayaEkle(6,50);
        tekYonList.arayaEkle(0,3);

        tekYonList.yazdir();
    }
}
