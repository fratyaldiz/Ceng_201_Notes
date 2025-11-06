package CarGalleryApp;

public class OtoNode {
    String plate;
    String Brand;
    String model;
    String colour;
    double purchasePrice;
    double salePrice;
    String information;

    OtoNode next;

    public OtoNode(String plate, String Brand, String model,
                   String colour, double purchasePrice,
                   String information) {
        this.plate = plate;
        this.Brand = Brand;
        this.model = model;
        this.colour = colour;
        this.purchasePrice = purchasePrice;
        this.salePrice = purchasePrice * (12/10);
        this.information = information;
        next = null;

    }

}
