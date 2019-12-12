package pl.qualitycourses.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Leon");

        double l = 5;
        System.out.println("Pole kwadratu o boku " + l + " = " + area(l));

        double a = 4;
        double b = 5;
        System.out.println("Pole prostokąta o bokach " + a + " i " + b + " = " + area(a, b));
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double len){
        return len * len;
    }

    public static double area(double a, double b){
        return a * b;
    }
}