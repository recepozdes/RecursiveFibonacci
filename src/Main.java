import java.util.Scanner;

public class Main {

    static int recFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return recFib(n - 1) + recFib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int n = sc.nextInt();
        System.out.print(" fib("+n+"): " + recFib(n));


    }
}
