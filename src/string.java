import java.util.Scanner;

public class string {
    public static void print(String s){
        for(int i = 0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
    public static void printPrefix (String str){
        for(int i = 0;i<str.length();i++){
            System.out.println(str.substring(0,i+1));
        }
    }

    public static String reverseString(String s){

        for(int i = s.length()-1; i>=0;i--){
            System.out.print(s.charAt(i));
        }
        return s;
    }
    public static boolean isPalindrome( String s){
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void printSubstring(String s){
        int n = s.length();
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<n;j++){
                for(int k =i;k<=j;k++) {
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static String reverseEachWord ( String s ){
        String ans = "";
        int  currentWordStart = 0;
        int i = 0;
        for(;i<s.length();i++){
            if(s.charAt(i) == ' '){
                //Reverse Current Word
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for(int j = currentWordStart;j<=currentWordEnd;j++){
                    reversedWord = s.charAt(j) + reversedWord;
                }
                //Add it final string(ans)
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }
        int currentWordEnd = i - 1;
        String reversedWord = "";
        for(int j = currentWordStart;j<=currentWordEnd;j++){
            reversedWord = s.charAt(j) + reversedWord;
        }
        //Add it final string(ans)
        ans += reversedWord;
        return ans;
    }

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        String str = "abc def ghi jkl";
        System.out.println(reverseEachWord(str));


//        System.out.println(str + " " + str.length());
//        String str2 = s.next();
//        System.out.print(str2 + " " + str2.length());
//        printPrefix(str);
//        print(str);
//        String substr = str.substring(3);
//        System.out.println(substr);


    }
}
