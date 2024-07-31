package badCode.o;

public class Hexagon implements AreaCalculatable {
    private double radius;

    public Hexagon(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return 3*Math.sqrt(3)*Math.pow(radius,2)/2;
    }
}
