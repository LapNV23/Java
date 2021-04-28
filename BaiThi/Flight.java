package BaiThi;

public class Flight {
    private int number;
    private String destination;

    public Flight(){

    }
    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number=" + number +
                ", destination='" + destination + '\'' +
                '}';
    }
    public void display(){
        System.out.println(number + "," + destination);
    }
}
