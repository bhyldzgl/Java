public class Main {
   
    public static void main(String[] args) {
         
         // && --> and operator
         // ıf all the results are true, the result is true.
         // ıf even one of the results is wrong, the result is wrong.
         
         // || --> or operator 
         // if at least one of the results is true,the result is true
         // if all of the results are false the result is false
         
         // ! --> not operator
         
         System.out.println(3 == 3 && 2 < 3); // true
         System.out.println(3 == 3 && 2 > 3); // false
         
         
         System.out.println(3 == 3 || 2 < 3); //true
         System.out.println(3 == 3 || 2 > 3); //true 
         System.out.println(3 != 3 || 2 > 3); //false
    }
    
}
