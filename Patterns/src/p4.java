import java.util.Scanner;

public class p4 {
    public static void print1(int n ){
        for (int i = 1; i <= n; i++) {
            for (int j =1; j <= i; j++) {
                System.out.print( i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-->0){
            int n = in.nextInt();
            print1(n);
        }
    }
}
