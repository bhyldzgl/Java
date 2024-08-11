
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How much fuel does your vehicle consume per kilometer : ");
        double fuel = scanner.nextDouble();
        
        System.out.print("How far did you travel with your vehicle : ");
        double km = scanner.nextDouble();
        
        System.out.println("Total amount you need to pay : " + (km*fuel));
        
    }
    
}
