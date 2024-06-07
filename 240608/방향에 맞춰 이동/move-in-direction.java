import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int x=0,y=0;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};

        int n = sc.nextInt();
        int t = 0;
        String s;
        for(int i=0;i<n;i++){
            s = sc.next();
            switch(s){
                case "E" : s = "0"; break;
                case "W" : s = "1"; break;
                case "S" : s = "2"; break;
                case "N" : s = "3"; break;
            }
            t = sc.nextInt();
            x = x+t*dx[Integer.parseInt(s)];
            y = y+t*dy[Integer.parseInt(s)];


        }

        System.out.print(x+" "+y);
        


    }
}