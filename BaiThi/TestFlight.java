package BaiThi;

public class TestFlight {
    public static void main(String[] args) {
    Flight g1 = new Flight(875, "Toronto");
    g1.display();
        System.out.println("Number Flight is: " + g1.getNumber());
        System.out.println("Destination Flight is: " + g1.getDestination());
    }
}
