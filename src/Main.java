public class Main {
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println("Pi = "+circle.pi);
        System.out.println("radius = "+circle.radius);
        System.out.print("Area = ");
        circle.area();
        System.out.println();
        System.out.println("Circumference = ");
        circle.circumference();


    }
}
