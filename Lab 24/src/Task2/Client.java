package Task2;

public class Client {
    public Chair chair;

    public void sit() {
        if (chair != null) {
            System.out.println("Sitting");
        }
        else {
            System.out.println("No chair");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
