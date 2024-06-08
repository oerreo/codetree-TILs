import java.util.Scanner;

public class Main {
    private static int x =0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        lcm(n,m);
    }

    public static void lcm(int a, int b){
        int result = a * b;
        gcd(a,b);
        result /=x;
        System.out.print(result);
    }

    public static void gcd(int a, int b){
        int temp = (a<b)?a:b;
        int r=(a>b)?a%b:b%a;
        if (r!=0) gcd(temp,r);
        else x = temp;
    }
}