package Task6;

import Session06.Circle;

public class Cylinder2 extends Circle {
    private double height;

    public Cylinder2(){
        super();
        height = 1.0;
    }
    public Cylinder2(double height){
        super();
        this.height = height;
    }
    public Cylinder2(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double  getVolume(){
        return getArea()*height;
    }
}
