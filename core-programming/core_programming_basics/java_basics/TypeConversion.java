package Java_Basic;

public class TypeConversion {
    public static void main(String[] args) {

        int a = 10;
        double b = a; // implicit

        double x = 9.7;
        int y = (int) x; // explicit

        System.out.println("Implicit: " + b);
        System.out.println("Explicit: " + y);
    }
}