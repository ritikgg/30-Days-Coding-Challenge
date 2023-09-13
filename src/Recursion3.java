import java.sql.SQLOutput;
import java.util.Scanner;

public class Recursion3  {
    public static void printString ( String[] str){
        for(int i = 0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
    public static String[] findSubsequence(String str){
        if(str.length()==0){
            String[] ans = {""};
            return ans;
        }
        String[] smallAns = findSubsequence(str.substring(1));
        String[] ans = new String[2*smallAns.length];
        for(int i = 0;i<smallAns.length;i++){
            ans[i] = smallAns[i];
        }
        for(int i = 0;i<smallAns.length;i++){
            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];
        }
        return ans;
    }
    public static String[] SingleDigit(int n) {
        if(n<=1||n>10){
            System.exit(0);
        }
        if (n == 2) {
            String Output[] = {"a", "b", "c"};
            return Output;
        } else if (n == 3) {
            String Output[] = {"d", "e", "f"};
            return Output;
        } else if (n == 4) {
            String Output[] = {"g", "h", "i"};
            return Output;
        } else if (n == 5) {
            String Output[] = {"j", "k", "l"};
            return Output;
        } else if (n == 6) {
            String Output[] = {"m", "n", "o"};
            return Output;
        } else if (n == 7) {
            String Output[] = {"p", "q", "r", "s"};
            return Output;
        } else if (n == 8) {
            String Output[] = {"t", "u", "v"};
            return Output;
        } else {
            String Output[] = {"w", "x", "y", "z"};
            return Output;
        }
    }
    public static String[] keypad(int n){
        if(n==0){
            String Output[] = {""};
            return Output;
        }
        String [] chotaArray = keypad(n/10);
        String [] singleDigOut = SingleDigit(n%10);
        String [] Output = new String[singleDigOut.length * chotaArray.length];

        int k = 0;
        for(int a = 0;a<singleDigOut.length;a++){
            for(int i = 0;i<chotaArray.length;i++){
                Output [k] = chotaArray[i] + singleDigOut[a];
                k++;

            }
        }
        return Output;
    }
    public static void printSubsequemces(String input, String outputSoFar){
        if (input.length() == 0){
            System.out.println(outputSoFar);
            return;
        }//we choose not to include first character
        printSubsequemces(input.substring(1),outputSoFar);
        //we choose to include first character
        printSubsequemces(input.substring(1),outputSoFar + input.charAt(0));
    }
    public static void printSubsequemces(String input){
        printSubsequemces(input,"");
    }
    public static void printKeypad(int input,String output){
        if(input == 0){
            System.out.println(output);
            return;
        }
        String[] singDigOut = SingleDigit(input%10);
        for(int i = 0;i<singDigOut.length;i++){
            printKeypad(input/10,singDigOut[i] + output);
        }
    }
    public static void printKeypad(int input){
        printKeypad(input,"");
    }

    public static void main(String[] args) {
        String str = "xyz";
        String[] ans = findSubsequence(str);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number Combination");
        int n = s.nextInt();
        printKeypad(n);
//        printSubsequemces("xyz");

    }
}
