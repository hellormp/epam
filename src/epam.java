public class epam {

    public static void main(String[] args) {

    //secondPart
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);


    }
    //firstPart
    public int first(int a, int b){
        return a+b;
    }

    //thirdPartgit
    public int sum(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
    public int remainder(int a, int b){
        return a%b;
    }
//fourthPart

}
class valuesArray{
    public static void main(String args[]){
        int[] array = {5,6,7,12,-5,32,43};
        int sum = 0;

        for( int num : array) {
            sum = sum+num;
        }
        System.out.println(sum);
    }
}

class duplicateValues  {
    public static void main(String[] args)
    {
        int[] array = {5,6,7,12,-5,32,43,6,12};
            for (int i = 0; i < array.length-1; i++)
                {
                    for (int j = i+1; j < array.length; j++)
                        {
                            if ((array[i] == array[j]) && (i != j))
                                {
                                    System.out.println(array[j]);
                }
            }
        }
    }
}

