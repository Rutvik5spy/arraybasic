public class Tcs1 {
    public static void main(String[] args) {
       Evenodd(123456);
    }
    static void Evenodd(int n){
       int temp = 0;
       int sum= 0;
       int sum1 = 0;
       while (n>0) {
        int rem = n %10;
       n/= 10;
       temp =rem;
       if (temp%2 == 0){
        System.out.print(temp + " ");
         sum = sum + temp;
       }
       if(temp%2 != 0){
        System.out.println(temp + " ");
        sum1 = sum1 + temp;
      }
    }
       int finals = sum;
       System.out.println();
       System.out.print("Sum of even number " + finals);
       int finals1 = sum1;
       System.out.println();
       System.out.println("Sum of odd number " + sum1);
}
}
