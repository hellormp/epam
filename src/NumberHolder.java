import java.awt.*;
import java.util.Locale;

//1.	Write a Java program to concatenate a given string to the end of another string. And remove all `P` or `p` characters.
class concatenate{
    public static void main(String[] args) {
        String s1 = "PHP Exercises and";
        String s = s1.concat("Python Exercises");
        System.out.println(s.replace('P',' '));
    }
}
//2.	Design such Java class with name Computer and such properties as:
class Computer{
    private String Brand;
    private String ScreenSize;
    private int NumberOfCores;
    private String Type;
    public Computer(String x,String y){
        Brand = x;
        ScreenSize = y;
    }
    public static void main(String[] args) {
    Computer computer = new Computer("Asus","FullHD");
    computer.Brand = "Apple";
    computer.ScreenSize = "HD";
    computer.NumberOfCores = 4;
    computer.Type = "laptop";
    }
}
//3.     What's wrong with the following program? Fix the program called SomethingIsWrong.
class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.width * myRect.height);
    }
}
//4.	Given the following class, called NumberHolder, write some code that creates an instance of the class,
//      initializes its two member variables, and then displays the value of each member variable
public class NumberHolder {
    public static void main(String[] args) {
        int anInt = 10;
        float aFloat = 10F;
        System.out.println(anInt);
        System.out.println(aFloat);


    }
}
//5.    The following code creates one array and one string object. How many references to those objects exist after the code executes?
//      Is either object eligible for garbage collection?
//Answer: There is only one reference to the students array and one reference to the string "Peter Smith"
//Object and array  is NOT eligible for garbage collection, coz they have links for each other
class arrayAndOneStringObject{
    public static void main(String[] args) {
        String[] students = new String[10];
        String studentName = "Peter Parker";
        students[0] = studentName;
        studentName = null;
    }
}
//6.	How does a program destroy an object that it creates?
//Program doesn't destroy an object manually.
//If it's the old Object and the program doesn't use it, it can give the null parameter for garbage collector and the then garbage collector will destroy it

class mar{
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            System.out.println(4*i);
        }
        int n=1;
        while (n<=25){
            System.out.println(n*=5);
        }
        int a = 10;
        double b = 2;
        a = (int)b;
        b = (double)a;
        System.out.println(b);
        System.out.println(a);
        int [] masiv = new int[2];
        masiv[1]= 2;
        masiv[0]= 292;



    }
}
class joy {
     {

    }

    public static void main(String[] args) {
        joy joy = new joy("Joydada", 21);
        String name;
        int age;

        System.out.println(joy);


    }
    public joy(String name, int age){
        name=name;
        age=age;
        int s;
        s = name.length();
        System.out.println(s);
        String d = "sdm.txt";
        String da = "dagfg.exe";
        String dad = "SGDFGNGND";
        System.out.println(da.concat(d));
        int ada = name.charAt(5);
        System.out.println(ada);
        String sentence ="          Обожаю язык программирования Java           ";
        System.out.println(sentence.substring(6));
        System.out.println(sentence.substring(6,18));
        System.out.println(sentence.trim());
        System.out.println(da.endsWith(".exe"));
        System.out.println(d.getBytes());
        System.out.println(d.replace("s","d"));
        System.out.println(d.toUpperCase(Locale.CANADA));
        System.out.println(d.toUpperCase(Locale.ROOT));
        System.out.println(dad.toLowerCase(Locale.ROOT));
        System.out.println(d.equals(da));
        String Str = new String("Добро пожаловать на ProgLang.su");
        System.out.println("Хэш-код для Str: " + Str.hashCode());
        System.out.println(d.toUpperCase(Locale.ROOT));
        System.out.println(dad.toLowerCase(Locale.ROOT));
        System.out.println("Хэш-код для Str: " + Str.hashCode());




        
    }
}
class Longer{
    public static void main(String[] args) {

    }
}



