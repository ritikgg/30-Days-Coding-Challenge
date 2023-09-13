public class demo {


    public static void change(int input[]) {
        input = new int[5];
        input[0] = 15;
        System.out.println(input[1]);
    }
    public static void swap(int n []){

        for(int i = 0;i<n.length-1;i+=2 ){
           int temp = n[i];
           n[i] = n[i+1];
           n[i+1] = temp;
        }
//        for (int i =0;i<n.length;i++){
//            System.out.print(n[i] + " ");
//        }

    }
    public static void main(String args[]) {
//        int arr[] = new int[5];
//        change(arr);
//        System.out.println(arr[0]);
//        int in [] = {1,2,4,6,7,4,8,7,0};
//        swap(in);
        System.out.println(10 % 7);
    }

}
