package questions;

public class pattern4 {
    public static void main(String[] args) {
       pattern(5);
       pattern1(5);
    }
    public static void pattern(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = n-i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n){
        for (int i = 0; i <n ; i++) {
            int k=1;
            for (int j = n-i; j >0 ; j--) {

                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
