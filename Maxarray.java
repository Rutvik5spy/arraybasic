public class Maxarray {
    public static void main(String[] args) {
        int[] arr = {23,45,673,89,102};
        System.out.println(big(arr));
    }
    static int big(int[] arrr) {
        int temp = arrr[0];
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i]> temp) {
                temp = arrr[i];
            }
        }
        
        return temp;
    }
}
