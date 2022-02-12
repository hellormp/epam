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




