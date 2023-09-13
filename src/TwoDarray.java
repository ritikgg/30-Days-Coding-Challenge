import java.util.Scanner;

public class TwoDarray {
    public static int[][] takeInput(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows = s.nextInt();
        System.out.println("Enter no. of column");
        int cols = s.nextInt();
        int[][] arr = new int [rows][cols];

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.println("Enter the element at " + i +" row " + j + " column");
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void print(int arr [][]){
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i=0;i< rows;i++){
            for(int j=0;j< cols;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int largestCol(int[][]arr){
        int row = arr.length;
        int col = arr[0].length;
        int largest = Integer.MIN_VALUE;
        for(int j = 0;j<col;j++){
            int sum = 0;
            for(int i = 0;i<row;i++){
                sum = sum + arr[i][j];
            }
            if(sum>largest){
                largest = sum;
            }
        }
        return largest;
    }
    public static void main(String[] arg) {
//        int [][] arr = {{1,2,4,5,},{5,6,7,8,9,},{5,6,7,8,9}};
//        System.out.println(arr.length+arr[0].length);
//        System.out.println(arr);
//        System.out.println(arr[0][1]);
//        System.out.println(arr[1].length);
        int[][] arr = takeInput();
        int larColSum = largestCol(arr);
        System.out.println(larColSum);
    }
}
