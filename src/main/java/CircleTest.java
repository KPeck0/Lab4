
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter radius of the circle: ");
       
       double radius = in.nextDouble();  
       Circle circle = new Circle(radius);   
   
       System.out.println("Radius of the circle is: " + circle.getRadius());

       System.out.println("Area of the circle is: " + circle.getArea());
  
       System.out.println("Diameter of the circle is: " + circle.getDiameter());

       System.out.println("Circumference of the circle is: " + circle.getCircumference());
   
 
        
        
        
    }
}
