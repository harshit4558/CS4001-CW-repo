public class Gadget {
    private float price;
    private int weight;
    private String model;
    private String size;


    public Gadget(float price, int weight, String model, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
        this.weight = weight;
    }

    
    // Accessor methods
    public int getWeight() {
        return weight;
    }
    public float getPrice() {
        return price;
    }
    public String getModel() {
        return model;
    }
    public String getSize() {
        return size;
    }

    
    // Display method
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: £" + price);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Size: " + size);
    }

    

}