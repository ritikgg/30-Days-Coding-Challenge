import java.util.Arrays;

public class Recursion2 extends array {
    //Recursion with String
    public static String removeX(String str) {
        if (str.length() == 0) {
            return str;
        }
        String ans = "";
        if (str.charAt(0) != 'x') {
            ans = ans + str.charAt(0);
        }
        String smallAns = removeX(str.substring(1));
        return ans + smallAns;
    }

    public static String replaceChar(String str) {
        if (str.length() == 0) {
            return str;
        }
        String ans = "";
        if (str.charAt(0) == 'a') {
//            ans = ans + 'x';
            ans = str.replace('a', 'x');
        }
        String smallAns = replaceChar(str.substring(1));
        return ans;
    }

    public static String replaceChar2(String str, char c1, char c2) {
        if (str.length() == 0) {
            return str;
        }
        char c;
        if (str.charAt(0) == c1) {
            c = c2;
        } else {
            c = str.charAt(0);
        }
        String ans = replaceChar2(str.substring(1), c1, c2);
        return c + ans;
    }

    public static String removeDuplicate(String str) {
        if (str.length() <= 1) {
            return str;
        }

        String ans = "";
        if (str.charAt(0) != str.charAt(1)) {
            ans = ans + str.charAt(0);
        }
        String smallAns = removeDuplicate(str.substring(1));
        return ans + smallAns;

    }

    public static String removeDuplicate2(String s) {
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return removeDuplicate2(s.substring(1));
        } else {
            String small = removeDuplicate2(s.substring(1));
            return s.charAt(0) + small;

        }
    }
    public static void mergeSort(int[] arr, int sI, int eI){
        if(sI >= eI){
            return; //if the array is size of 1 or empty
        }
        int mid = (sI + eI) / 2;
        mergeSort(arr, sI,mid);
        mergeSort(arr,mid+1, eI);
        merge(arr, sI,eI);
    }
    public static void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length-1);
    }
    public static void merge(int[]arr,int sI,int eI){
        int mid =(sI+eI)/2;
        int[] ans = new int[eI - sI +1];
        int i = sI;
        int j = mid + 1;
        int k = 0;
        while (i<=mid && j<=eI){
            if (arr[i]<=arr[j]){
                ans[k] = arr[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr[j];
                k++;
                j++;
            }

        }
        while (i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while (j<=eI){
            ans[k]=arr[j];
            j++;
            k++;
        }
        int m=0;
        for (int a =sI;a<=eI;a++){
            arr[a]=ans[m];
            m++;
        }
    }

    public static int partition(int[]arr,int low,int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high]=temp;
        return i; //pivot index

    }
        public static void quickSort2(int[]arr,int low, int high){
            if(low<high){
                int pivotIndex = partition(arr,low,high);

                quickSort2(arr,low,pivotIndex-1);
                quickSort2(arr,pivotIndex+1,high);
            }
        }
        public static void quickSort2(int[]arr){
        int n = arr.length;
        quickSort2(arr,0,n-1);
        }

        public static void main (String[]args){
            int[] arr = {6,3,9,5,2,8};
            quickSort2(arr);
            printArray(arr);
        }
    }
