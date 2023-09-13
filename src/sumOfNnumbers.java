import java.util.Scanner;

public class sumOfNnumbers {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // print numbers 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        // print sum of 1 to n numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = sum + i;

        }
        System.out.println(sum);
    }
}
