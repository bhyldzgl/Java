
import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
         
        // Bod mass index = weight/size*size
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your weight : ");
        double weight = scanner.nextDouble();
        
        System.out.print("Please enter your size : ");
        double size = scanner.nextDouble();
        
        double index = weight/(size*size);
        
        System.out.println("Your body mass result : " + index);
    }
    
}
