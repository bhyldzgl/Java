public class Main {
   
    public static void main(String[] args) {
         
        /*
         + --> Agregation operator
         - --> Subtraction operator
         / --> Division operator
         * --> Multiplication operator
         % --> Remainder operator
        */
        
        
        
        System.out.println(3 + 4);
        System.out.println(3 - 5f);
        System.out.println(10 / 4);
        System.out.println(10d / 4);
        System.out.println(10 * 4.5);
        System.out.println(10 % 4);
        
        //******************************************
        
        int a = 4;
        
        a = a + 2;
        System.out.println(a);
                        
        int b = 4;
        
        b += 2; // b = b +2 ;
        System.out.println(b);
        
        int d = 6;
        int c = 7;
        
        c++;
        d--;
        System.out.println(d);
        System.out.println(c);
        
        //************************************
        
        System.out.println("\n\n\n");
        
        int x = 7;
        int y = 7;
        System.out.println(x++);
        System.out.println(++y);
   }
    
}
