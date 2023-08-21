public class Ex08 {
    public static void main(String[] args){
        Circle circle = new Circle(10);
        circle.calculateArea();
        circle.calculateCircunference();

    }
}

class Circle {
    private double PI = 3.141592;
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    void calculateArea(){
        System.out.print("Area: ");
        System.out.println( PI * Math.pow(radius, 2));
    }
    
    void calculateCircunference(){
        System.out.print("Circunference: ");
        System.out.println(2 * PI * radius);
    }

}