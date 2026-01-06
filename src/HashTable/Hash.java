package HashTable;

public class Hash {
    Node dizi [];
    int size;

    public Hash(int size) {
        this.size = size;
        dizi = new Node[size];
        for (int i = 0; i < size; i++) {
            dizi[i] = new Node();
        }
    }

    int indexUret( int key ){
        return key % size;
    }

    void add(int key, String name){
        int index = indexUret(key);

        Node eleman = new Node(key, name);

        Node temp = dizi[index];

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = eleman;

        System.out.println(eleman.name + " eklendi. ");
    }
}


