package Task8_18;

abstract public class Shape2 {
    private String color;
    public Shape2(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    abstract public double getArea();
}
