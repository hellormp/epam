import java.util.Vector;
import java.util.Random;
public class OOPTask {
    private final double cordenateX;
    private final double cordenateY;
    private final double cordenateZ;
    public OOPTask(double x, double y, double z){
        cordenateX = x;
        cordenateY = y;
        cordenateZ = z;
    }
    public double getLengthOf3DVectors(double x, double y, double z){
        return Math.sqrt(Math.pow(cordenateX,2)+Math.pow(cordenateY,2)+Math.pow(cordenateZ,2));
    }
    public double getScalarMultiplication(double x, double y, double z){
        return;
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

    }


}





