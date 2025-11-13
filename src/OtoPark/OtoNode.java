package OtoPark;

public class OtoNode {
    String plate;
    String enter;
    String exit;
    long minutes;
    long price;

    OtoNode next;
    OtoNode prev;
    public OtoNode (String plate, String enter){
        this.plate = plate;
        this.enter = enter;
        this.next = null;
        this.prev = null;
    }
}
