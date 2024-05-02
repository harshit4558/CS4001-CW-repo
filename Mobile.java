
public class Mobile extends Gadget {
    private int credit;

    public Mobile(String model, String size, int weight, float price, int credit) {
        super(price, weight, model, size);
        this.credit = credit;
    }
    // Accesor methods
    public int getCredit() {
        return credit;
    }
    public void addCredit(int amount) {
        if (amount > 0) {
            credit += amount;
        } else {
            throw new ArithmeticException("Please enter a positive value");
        }
    }

    public void phoneCall(long phoneNumber, int callDuration) {
        if (credit > callDuration) {
            System.out.println("Calling " + phoneNumber);
            System.out.println("Call duration: " + callDuration);
            credit -= callDuration;
            System.out.println("Calling credit left: " + credit);
        } else {
            System.out.println("You have insuffcient calling credit");
        }
    }

    public void display() {
        super.display();
        System.out.println("Calling credit remaining: " + credit + " minutes");

    }

}