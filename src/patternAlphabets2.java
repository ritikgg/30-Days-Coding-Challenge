import java.util.Scanner;

public class patternAlphabets2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;


        while (i<=n) {
            int j = 1;
            char val = (char)65;
            while (j <= n) {

                System.out.print(val);
                val++;
                j++;
            }


            System.out.println();
            i++;
        }
    }
}
