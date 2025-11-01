package Ders_4;

public class TekYönlüListeYapisi {
    Node head =  null;
    Node tail = null;

    void basaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head  = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu ve ilk eleman eklendi");
        }
        else{
            eleman.next = head;
            head  = eleman;
            System.out.println("Başa eleman eklendi");
        }
    }
    void sonaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;
        eleman.next = null;

        if (tail == null) {
            tail = eleman;
            head = eleman;
            System.out.println("Liste yapısı oluşturuldu ve ilk eleman eklendi");
        }
        else{
            tail.next = eleman; //Ekleme yaptık
            tail = eleman;      //İsim güncelliyoruz.
            System.out.println("Sona eleman eklendi");
        }
    }
    void arayaEkle( int indis, int x){
        Node eleman = new Node();
        eleman.data = x;

        if (head == null && indis == 0) {
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu ve ilk eleman eklendi");
        }
        else if(head != null && indis == 0){
            eleman.next = head;
            head  = eleman;
            System.out.println(indis + " indisinci sıraya yeni eleman eklendi");
        }
        else{
            int n = 0;
            Node temp = head;
            Node temp2 = head;

            while (temp.next != null){
                n++;
                temp2 = temp;
                temp = temp.next;
            }

            if(n == indis){
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println("Eleman eklendi");
            }
            else{
                temp = head;
                temp2 = head;
                int i=0;
                while(i!=indis){
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println(indis + ". sıraya eleman eklendi");
            }


        }

    }

    void bastanSil(){
        if (head == null) {
            System.out.println("Liste boş, silinecek nesne yok.");
        }
        else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman silindi");
        }
        else{
            head = head.next;
            System.out.println("Baştaki eleman silindi");
        }
    }

    void sondanSil(){
        if (head == null) {
            System.out.println("Liste boş, silinecek nesne yok.");
        }
        else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman silindi");
        }
        else{
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null){
                temp2 = temp;
                temp = temp.next;
            }

            temp2.next = null;
            tail = temp2;
            System.out.println("Sondan eleman silindi");
        }
    }

    void yazdir(){
        if (head == null){
            System.out.print("Liste boş. ");
        }
        else{
            Node temp = head;
            System.out.print("baş ->");
            while (temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("son.");
        }
    }
}
