import epamInterface.Shape;

import java.util.Vector;
import java.util.Random;

public class OOPTask implements Shape {
    private double cordenateX;
    private double cordenateY;
    private double cordenateZ;

    @Override
    public void getSquare() {

    }


    class ScalarMultiplication extends OOPTask {
    private double cordenateX1;
    private double cordenateY1;
    private double cordenateZ1;
    private double cordenateX2;
    private double cordenateY2;
    private double cordenateZ2;


    public void Cordinator(double x1, double y1, double z1, double x2, double y2, double z2){
        this.cordenateX1 = x1;
        this.cordenateY1 = y1;
        this.cordenateZ1 = z1;
        this.cordenateX2 = x2;
        this.cordenateY2 = y2;
        this.cordenateZ2 = z2;
    }
}
    public void Cordinator(double x, double y, double z){
        this.cordenateX = x;
        this.cordenateY = y;
        this.cordenateZ = z;
    }
    public double getLengthOf3DVectors(double x, double y, double z){
        return Math.sqrt(Math.pow(cordenateX,2)+Math.pow(cordenateY,2)+Math.pow(cordenateZ,2));
    }

    public double getScalarMultiplication(double x1, double y1, double z1, double x2, double y2, double z2){
        return (x1*x2+y1*y2+z1*z2);
    }

    static Vector<String> vector;
    static void getRandomElements()
    {
        Random random = new Random();
        for (int i = 0; i < vector.size(); i++)
        {
            int index = random.nextInt(vector.size());
            System.out.println(vector.get(index));
        }
    }
    public static void main(String[] args)
    {
        getRandomElements();

    }


}





