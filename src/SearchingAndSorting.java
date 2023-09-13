import java.util.*;

public class SearchingAndSorting {
    public static void printArray(int[] input) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateRandomArray(int length) {
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(1000); // Generate random integers up to 1000
        }

        return arr;
    }

    public static int linearSearch(int[] input) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element to find");
        int target = s.nextInt();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) {
                return i;
            }

        }
        return -1;
    }

    public static int binarySearch(int[] input, int element) {
        int start = 0;
        int end = input.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (element == input[mid]) {
                return mid;
            } else if (element < input[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void selectionSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int min = input[i];
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < min) {
                    min = input[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                input[minIndex] = input[i];
                input[i] = min;
            }
        }
    }

    public static void bubbleSort(int [] input) {

        for (int i = 0; i < input.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < input.length - i; j++) {
                if (input[j] < input[j - 1]) {
                    int temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void insertionSort(int[] input, int[] input2) {
        int n = input.length;
        for (int i = 1; i < n; i++) {

            //inset the ith element in the sorted portion
            int j = i - 1;
            int temp = input[i];
            while (j >= 0 && input[j] > temp) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = temp;
        }
    }

    public static int[] merge(int[] input1, int[] input2) {
        int i = 0, j = 0, k = 0;

        int[] ans = new int[input1.length + input2.length];

        while ((i < input1.length) && (j < input2.length)) {
            if (input1[i] < input2[j]) {
                ans[k] = input1[i];
                i++;
                k++;
            } else {
                ans[k] = input2[j];
                j++;
                k++;
            }
        }
        while (i < input1.length) {
            ans[k] = input1[i];
            i++;
            k++;
        }
        while (j < input2.length) {
            ans[k] = input2[j];
            j++;
            k++;
        }
        return ans;

    }
    public static void arrayIntersection(int[] input1 , int[] input2){
        Arrays.sort(input1);
        Arrays.sort(input2);
//        bubbleSort(input1);
//        bubbleSort(input2);
        int i = 0;
        int j = 0;
        while(i<input1.length && j<input2.length){
            if(input1[i]==input2[j]){
                System.out.println(input1[i] + " ");
                i++;
                j++;
            }else if(input1[i]<input2[j]){
                i++;
            }
            else{
                j++;
            }
        }
    }
    public static int findEquilibrium(int [] arr){
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr) {
            totalSum += num;
        }
        for(int i = 0; i<arr.length;i++){
            int num = arr[i];
            totalSum+=num;
        }
        for(int i = 0;i<arr.length;i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,6,1,3,6};
        int[] arr2 = {4,6,8,5,2,9,8,6};
//        bubbleSort(arr1);
//        arrayIntersection(arr1,arr2);
        System.out.println(findEquilibrium(arr2));

        //        int[] arr2 = {3, 7, 10, 15,20};
//        mergeSort(arr, arr2);
//        printArray(mergeSort(arr, arr2));
    }
}
