public class Recursion1 {
//    Recursion with Array

    public static int fact(int n){
        if(n==0){            //base case
            return 1;
        }
        int smallAns = fact(n-1);
        return n * smallAns;
    }
    public static int findPower(int x, int n){

        if(n==0){            //base case
            return 1;
        }

        return x * findPower(x,n-1);
    }
    public static void print(int n) {

        if (n == 0) {            //base case
            return;

        }
        print(n - 1);
        System.out.print(n + " ");


    }
    public static int digitCount (int n){
        if(n==0){
            return 0;
        }
        int smallOutput = digitCount(n/10);
        return smallOutput + 1;
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static boolean checkSorted(int [] input) {
        if(input.length <= 1){ //if array is size of 1 then it is always sorted
            return true;
        }
        if(input[0]>input[1]){
            return false;
        }
        int[] smallInput = new int[input.length-1];
        for(int i = 1; i<input.length;i++){
            smallInput[i-1] = input[i];
        }
        return checkSorted(smallInput);

    }
    public static int arraySum(int[] arr,int startIndex){
        if(startIndex>=arr.length){
            return 0;

        }
        return arr[startIndex] + arraySum(arr,startIndex+1);
    }
    private static boolean findN(int[] arr, int startIndex, int target){
        if(startIndex>=arr.length) {
            return false;
        }
        if(arr[startIndex] == target){
            return true;
        }

        return findN(arr, startIndex + 1,target);
    }
    public static boolean findN(int[] arr,int target){

        return findN(arr,0,target);
    }
    private  static boolean checkSortedBetter(int[] arr,int startIndex){
        if(startIndex>=arr.length-1){
            return true;
        }
        if(arr[startIndex] > arr[startIndex+1]){
            return false;
        }
        boolean smallOutput = checkSortedBetter(arr,startIndex+1);
        return smallOutput;
    }
    public static boolean checkSortedBetter(int[] arr){

        return checkSortedBetter(arr,0);
    }

    private static int findNIndex(int[] arr, int startIndex, int target){
        if(startIndex==arr.length) {
            return -1;
        }
        if(arr[startIndex] == target){
            return startIndex;
        }

        return findNIndex(arr,startIndex + 1,target);
    }

    public static int findNIndex(int[] arr, int target){

        return findNIndex(arr,0,target);
    }

    private static int lastIndex(int[] arr,int start){
        if(start ==arr.length -1) {
            return arr[start];
        }

        return lastIndex(arr,start+1);
    }

    public static int lastIndex(int[] arr){
        return lastIndex(arr,0);
    }

    public static int allIndicesNumber(int[] arr, int target, int start){
        if(start>=arr.length){
            return 0;
        }
        if(arr[start]==target){
            System.out.print(start + " ");
        }
        return allIndicesNumber(arr,target,start+1);
    }
//    public static int allIndicesNumber(int[] arr, int target){
//
//        return allIndicesNumber(arr,target,0);
//    }


    public static void main(String[] args) {
        int[] arr = {1,3,4,5,9};
        System.out.println(lastIndex(arr));
        int n = allIndicesNumber(arr,8,0);
        System.out.println(n);
    }
}
