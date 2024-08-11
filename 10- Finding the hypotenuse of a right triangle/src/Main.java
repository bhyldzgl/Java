
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first side of the triangle : ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the second side of the triange : ");
        double y = scanner.nextDouble();
        
        
        double z = Math.sqrt((x*x)+(y*y));
        
        System.out.println("Hypotenuse of triangle : " + z);
    }
    
}
