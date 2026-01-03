package tree_ogrenci_kayit;

public class Node {
    int no, not;
    String name;
    Node left, right;

    public Node(){
        no = 0;
        not = 0;
        name = "";
        left = right = null;
    }
    public Node(int no, int not, String name){
        this.no = no;
        this.not = not;
        this.name = name;

        left = right = null;
    }
}
