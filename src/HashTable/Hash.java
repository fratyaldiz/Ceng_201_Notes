package HashTable;

public class Hash {
    Node dizi[];
    int size;

    public Hash(int size) {
        this.size = size;
        dizi = new Node[size];
        for (int i = 0; i < size; i++) {
            dizi[i] = new Node(); // dummy head
        }
    }

    int indexUret(int key) {
        return key % size;
    }

    void add(int key, String name) {
        int index = indexUret(key);

        Node eleman = new Node(key, name);

        // Başa ekleme (dummy head'in hemen arkasına)
        eleman.next = dizi[index].next;
        dizi[index].next = eleman;

        System.out.println(eleman.name + " eklendi. ");
    }

    void delete(int key) {
        int index = indexUret(key);

        Node prev = dizi[index];      // dummy head
        Node curr = prev.next;        // ilk gerçek eleman

        while (curr != null && curr.key != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println(key + " bulunamadı.");
            return;
        }

        // curr silinecek node
        prev.next = curr.next;
        System.out.println(curr.name + " silindi.");
    }

    void print() {
        for (int i = 0; i < size; i++) {

            System.out.print("Dizi[" + i + "] -> ");

            Node temp = dizi[i].next;          // dummy head'i atla, ilk gerçek elemana geç

            if (temp == null) {                // bucket boşsa
                System.out.println("bos");
                continue;
            }

            while (temp != null) {             // sona kadar tüm elemanları yazdır
                System.out.print(temp.key + "-" + temp.name + " -> ");
                temp = temp.next;
            }

            System.out.println("null");        // listenin bittiğini göstermek için
        }
    }


}
