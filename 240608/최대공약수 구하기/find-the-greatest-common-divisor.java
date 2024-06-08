import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int m =  sc.nextInt();

        gcd(n,m);
    }

    public static void gcd(int a, int b){

        int temp = (a<b)? a:b;
        int r = (a>b)? a%b:b%a;
        if(r!=0){
            gcd(temp,r);
        }
        else {
            System.out.print(temp);

        }
    }
}