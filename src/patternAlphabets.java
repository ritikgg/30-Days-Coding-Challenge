import java.util.Scanner;

public class patternAlphabets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
//        char val = (char)65;

        while (i<=n) {
            int j = 1;
            char ch = (char)('A' + i - 1);
            while (j <= n) {

                System.out.print(ch);
                ch++;
                j++;

//                val++;
            }


            System.out.println();
            i++;
        }
    }
}
