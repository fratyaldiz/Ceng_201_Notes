package pdf;

public class Main {
    public static void main(String[] args) {

        Node head = null;
        Node new_node = null;

        System.out.println("Sıralı Ekleme İşlemleri Başlatılıyor...");

        int[] valuesToInsert = {8, 5, 3, 7, 10, 5, 1};

        for (int value : valuesToInsert) {

            new_node = DLL.getNode(value);

            head = DLL.sortedInsert(head, new_node);
            System.out.print("Eklendi: " + value + " -> Yeni Liste: ");
            DLL.printList(head);

            System.out.println("---");
            System.out.print("Oluşturulan Çift Yönlü Liste: ");

            DLL.printList(head);
        }
    }
}