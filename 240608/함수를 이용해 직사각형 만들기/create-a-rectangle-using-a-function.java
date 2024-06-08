import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        rect(n,m);

    }
    public static void rect(int n, int m){
        while(n-- >0){
            for(int i = 0; i<m;i++){
                System.out.print(1);
            }
            System.out.println("");

        }
    }
}