package epamInterface;

public  abstract class Rectangular implements Shape{
    private double SideA;
    private double SideB;

    public double getSideA(double sideA) {
        return SideA;
    }

    public double getSideB(double sideB) {
        return SideB;
    }

    @Override
    public void getSquare() {
        System.out.println(getSideA(5)*getSideB(2.6));
    }
}
