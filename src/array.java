
import java.util.Scanner;

public class array {
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i = 0; i<size; i++){
            input[i] = s.nextInt();
        }
        return input;
    }
    public static void printArray(int[] input){
        int size = input.length;
        for(int i = 0;i<size;i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }
    public static int largestArray(int[] input){
        int max = Integer.MIN_VALUE ;
        for(int i = 0;i< input.length;i++){
            if(max<input[i]){
                max = input[i];
            }
        }return max;

    }


    public static int sumOfArray(int[] input){
        int sum = 0;
        for(int i = 0;i< input.length;i++){
            sum = sum + input[i];
        }
        return sum;
    }
    public static void incrementArray(int[] input){
        input = new int[5];
        for(int i =0; i <= input.length-1;i++){
            input[i]++;

        }
    }
    public static void swap(int[] n ){

        for(int i = 0;i<n.length-1;i+=2 ){
            int temp = n[i];
            n[i] = n[i+1]; // value at n[i+1] is now equal to n[i]
            n[i+1] = temp; // value at temp is now equal to n[i+1]
        }

    }
    // push all zeros in the array to last
    public static void pushToZero(int[] input){
        int last = 0;
        for (int i = 0;i<input.length;i++){

            if(input[i]!=0){
                input[last] = input[i];
                last++;
            }
        }
        //all non-zero elements ends here and now all 0 will be placed at end.
        while (last < input.length){
            input[last] = 0;
            last++;

        }
    }
    //make the dth number element to come at first position.
    public static void rotateArray(int[] input, int d ){
        if(d >= input.length){
            System.out.println("Invalid Number");
            return;
        }
        // Create a temporary array to store the rotated elements
        int [] temp = new int[d];

        // Copy the first 'd' elements into the temporary array
        for (int i = 0;i<d;i++) {
            temp[i] = input[i];
        }
        // Shift the remaining elements 'd' positions to the left
        for(int i = d;i<input.length;i++){
            input[i-d] = input[i];
        }
        // Copy the elements from the temporary array to the end of the original array
        for(int i = 0;i<d;i++){
            input[input.length-d+i] = temp[i];
        }
    }
    public static void rotateArraySimple(int[] input, int steps){
        int [] temp =new int[input.length];
        //copy array in temporary array
        for(int i = 0;i<input.length;i++){
            temp[i] = input[i];
        }
        // shifting elements
        for(int i = 0;i< input.length;i++){
            input[(i+steps)%input.length] = temp[i];
        }
    }
    public static int findNLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < 7; i++) {
            if (arr[i] > largest) {
//                thirdLargest = secondLargest;
//                secondLargest = largest;
                largest = arr[i];
            }
//            else if (arr[i] > thirdLargest && arr[i] < secondLargest) {
//                thirdLargest = arr[i];
//            }
        }

        return largest;
    }
    public static int findRotationIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if (arr[start] < arr[mid]) {
                start = mid + 1;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start++;
            }
        }

        // If the array is not rotated
        return 0;
    }




    public static void main(String[] args) {
//        int[] arr = takeInput();

//        printArray(arr);

//        System.out.println(findNLargest(arr));
//        pushToZero(arr);
//        rotateArraySimple(arr,4);
//        printArray(arr);
//        System.out.println(findRotationIndex(arr));
//        printArray(arr);
//        swap(arr);
//        printArray(arr);
//        incrementArray(arr);
//        printArray(arr);
//        int largest = largestArray(arr);
//        System.out.println("largest:- " + largest);
//        System.out.println(sumOfArray(arr));

//        int find = findNumber(arr,48);
//        System.out.println(find);
//        System.out.println(findNLargest(arr));
    }
}




