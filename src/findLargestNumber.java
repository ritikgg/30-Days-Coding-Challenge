import java.util.Scanner;
public class findLargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0;
        for (int i = 0; i<n; i++){

            if(max > n){
                n = max;
            }
        }
        System.out.println(max);
    }
}
