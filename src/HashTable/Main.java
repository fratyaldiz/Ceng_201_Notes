package HashTable;

public class Main {
    public static void main(String[] args) {

        Hash hashTable = new Hash(5);

        hashTable.add(0,"ahmet");
        hashTable.add(1,"mehmet");

        hashTable.add(2,"hasan");
        hashTable.add(4,"hüseyin");

        hashTable.add(10,"ayşe");
        hashTable.add(15,"fatma");

        hashTable.add(12,"beyza");
        hashTable.add(9,"ece");

        System.out.println(hashTable.dizi[3].next.name);

    }
}
