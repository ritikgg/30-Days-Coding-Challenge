package arraysQuestions;

public class findUnique {
//    public static int findUnique(int[] input){
//
//
//        for(int i=0;i<input.length;i++){
//            int j;
//            boolean isUnique = true;
//            for (j=0;j<input.length;j++){
//                if (i!=j){
//                    if(input[i]==input[j]){
//                        isUnique = false;
//                        break;
//                    }
//                }
//
//            }
//            if(isUnique){
//                return input[i];
//            }
//        }
//        return -1;
//    }
public static int findUnique(int[] input) {
    for (int i = 0; i < input.length; i++) {
        int j;
        boolean notUnique = true;
        for (j = 0; j < input.length; j++) {
            if (i != j) {
                if (input[i] == input[j]) {
                    notUnique = false;
                    break;
                }
            }
        }
        if (!notUnique) {
            return input[i]; // Return the unique element
        }
    }
    return -1; // No unique element found
}


    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(findUnique(arr));
    }
}
