public class Main {

    public static void main(String[] args) {
         
        // Double : 64 bit - 8 byte
        // Float : 32 bit - 4 byte
        
        // Automatic conversion int --> float --> double
        
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;
        
        System.out.println(a);        
        System.out.println(b);        
        System.out.println(c);        
        System.out.println(d);   
        
        float e = (float)5.0;
        float f = 5f;
        float g = 5.2f;
        
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        
        
        int x = 22/7;
        float y = 22f / 7f;
        double z = 22d / 7d;
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
}
