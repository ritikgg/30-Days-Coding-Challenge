import java.util.ArrayList;

public class arraylist {
    public static void printArrayList (ArrayList<?> arr){
        for (int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));}

    }

    public static ArrayList<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(10);
//        arr.add(10);
//        arr.add(10);
//        arr.add(20);
//        arr.add(20);
//        arr.add(40);
//        arr.add(30);
//        arr.add(20);
        //Enhanced for loop
//        for(int i:arr){
//            System.out.println(i);
//        }
        int [] arr = {12,12,12,12,4,4,4,4,41,41,41,41,42};
        ArrayList<Integer> result = removeDuplicates(arr);
        printArrayList(result);





    }
}
