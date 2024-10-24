public class Hello{
         public static void main(String args[]){
            System.out.println("Hello World!");
            int sum =0;
            for(int i=2; i<=100; i++){
               if (primeNumbers(i)) {
                   sum +=i;
               }
               // Boolean ans =primeNumbers(i);
               // System.out.println(i + " " + ans );           
            }
            System.out.println(sum);
            
         }
         static boolean  primeNumbers(int n){
          int a = 2;
          while (a*a<=n) {
            if (n%a==0) {
                return false;
            }
         a++;
          }  
          return true;       
         }
}