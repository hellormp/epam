package epamInterface;

public abstract class Round implements Shape {
    private static final double PI = Math.PI;
    private double radius;
    private double diameter;

    private double getRadius(double radius ){
        return diameter/2;
    }
    private double getDiametr(double diameter ){
        return diameter;
    }

    @Override
    public void getSquare() {
        System.out.println(PI*Math.sqrt(getRadius(5)));

    }
}
