package Session06;

public class TestCircle_Java {
    public static void main(String[] args) {
        //Declare and Construct an instance of the Circle class call..
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.printf("The area is:  %.2f%n", c1.getArea());

        //Declare and Construct another instance of the Circle class..
        Circle c2 = new Circle(2.0);
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The color is: " + c2.getColor());
        System.out.printf("The area is:  %.2f%n", c2.getArea());

        //Declare and Construct yet another instance of the Circle class..
        Circle c3 = new Circle();
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The color is: " + c3.getColor());
        System.out.printf("The area is:  %.2f%n", c3.getArea());
    }
}
