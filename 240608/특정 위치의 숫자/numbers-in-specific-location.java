import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        for(int i =0; i<10;i++){
            n[i] = sc.nextInt();
        }
        System.out.printf(n[2]+n[4]+n[9]);

    }
}