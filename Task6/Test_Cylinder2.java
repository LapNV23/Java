package Task6;

public class Test_Cylinder2 {
    public static void main(String[] args) {
        Cylinder2 c1 = new Cylinder2();
        System.out.println("Cylinder:"
            + " radius=" + c1.getRadius()
            + " height=" + c1.getHeight()
            + " base area=" + c1.getArea()
            + " volume=" + c1.getVolume());

        Cylinder2 c2 = new Cylinder2(10.0);
        System.out.println("Cylinder:"
            + " radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " base area=" + c2.getArea()
            + " volume=" + c2.getVolume());
    }
}
