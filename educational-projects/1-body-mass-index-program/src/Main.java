
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many cents does your car burn per kilometer? :");
        double penny = scanner.nextDouble();
        
        System.out.print("How many kilometers did you travel with your vehicle? :");
        
        int km = scanner.nextInt();
        
        System.out.println("Total amount you need to pay : " + (penny * km));
        
    }
    
}