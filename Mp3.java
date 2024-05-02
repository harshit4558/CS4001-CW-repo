import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mp3 extends Gadget {
    private int availableMemory;

    public Mp3(String model, String size, float price, int weight , int availableMemory) {
        super(price, weight, model, size);
        this.availableMemory = availableMemory;
    }

    public int getAvailableMemory() {
        return availableMemory;
    }

    public void downloadMusic(int musicSize) {
        if (availableMemory > musicSize) {
            availableMemory -= musicSize;
            System.out.println();
            System.out.println("Music downloaded");
            System.out.println();
        } else {
            System.out.println("You have insufficient memory");
        }
    }

    public void deleteMusic(int num) {
        availableMemory += num ;
        System.out.println("Music Deleted");
    }
    
    public void display() {
        super.display();
        System.out.println("Available Memory: " + availableMemory);
    }

}