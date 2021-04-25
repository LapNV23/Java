package Task9;

public class Vehicle {
    public String vehicleNo;
    public String vehicleName;
    public int wheels;
    /**
     * Accelerates the vehicle
     *
     * @return void
     */
    public void accelerate(int speed) {
        System.out.println("Accelerating at:"+speed+ "kmph");
    }
}
