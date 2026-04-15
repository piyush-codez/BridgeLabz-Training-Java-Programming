package Review;

abstract class Car {
    Car(){
        System.out.println("Abtsract constructor is called");
    }
    abstract void sound();
}
public class Toyota extends Car{
    private String color;

    Toyota(){
        super();
        System.out.println("Your Toyota Car is ready to start.");
    }

    //Encapsulation
    public void setter(String name){
        this.color = name;
    }
    public String getter(){
        return color;
    }
    //method overloading
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, double n2,int n3){
        return n1+n2+n3;
    }
//    @Override
    public void sound(){
        System.out.println("Toyota Fortuner produces loud sound");
    }

    public static void main(String[] args) {
        Toyota t = new Toyota();
        t.setter("Black");
        System.out.println("\nYour Toyota Car is " + t.getter() + " in color");
        t.sound();

        System.out.println("first method o/p : " + t.add(2,4));
        System.out.println("second method o/p : " + t.add(2.4,4.4,5));
        System.out.println(t instanceof Toyota);
        System.out.println(t.getClass());
    }
}
