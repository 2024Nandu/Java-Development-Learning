import java.util.Scanner;

public class ggg {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int i = N;   // start from N

        while(i >= 1) {
            System.out.println(i);
            i--;   // decrease
        }
    }
}