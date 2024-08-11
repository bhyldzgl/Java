
import java.beans.JavaBean;

public class Main {
   
    public static void main(String[] args) {
     
        String a = "Hello";
        System.out.println(a + " Welcome");
        
        String b = "Java";
        String c = " Programming";
        String d = " Language";
        
        /*
        String e = "Java"+
                   "Programming"
                   "Language";
        */
        
        String e = b+c+d;
        
        System.out.println(e);
        
        String x = "Hello";
        int y = 35;
        
        String z = x+y; // automatic replacement implemented.
        
        System.out.println(z);
        
        
        char w1 = '?';
        
        String w2 = "Hello, how are you" + w1;
        
        System.out.println(w2);
        
        
        // \t --> leaves 4 spaces on the line
        // \n --> One line goes down
        
    }
}
