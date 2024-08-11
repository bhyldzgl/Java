import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Please enter your age : ");
         int age = scanner.nextInt();
         
         System.out.println("Your age : " + age);
         
         scanner.nextLine();
         
         System.out.print("Please enter a text : ");
         String text = scanner.nextLine();
         
         System.out.println(text);
    }
    
}
