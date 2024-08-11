public class Main {

    public static void main(String[] args) {
        
        int a = 4;
        
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        byte b = 5;
        
        System.out.println(b);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        
        short c = 6;
        
        System.out.println(c);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        
        long d = 7;
        
        System.out.println(d);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        
        // byte --> short --> int --> long
        
        byte k = 100;
        
        byte m = (byte)(k / 2);
        
        System.out.println(m);
    }
    
}
