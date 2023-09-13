package stacks;

import java.util.Stack;

public class StackCollections
{
    public static boolean isBalanced(String exp){

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0;i<exp.length();i++){
            if(exp.charAt(i) == '('){
                stack.push(exp.charAt(i));
            } else if (exp.charAt(i) == ')') {
                if(stack.isEmpty()){
                    return false;
                }
                char topChar = stack.pop();
                if(exp.charAt(i) == ')' && topChar == '('){
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void reverseStack(Stack<Integer> s1, Stack<Integer> helper){
        if(s1.size() <= 1){
            return;
        }
        int temp = s1.pop();
        reverseStack(s1,helper);
        while (!s1.isEmpty()){
            int top = s1.pop();
            helper.push(top);
        }
        s1.push(temp);
        while (!helper.empty()){
            int top = helper.pop();
            s1.push(top);
        }
        
    }


    public static void main(String[] args) {
        int[] arr = {4,6,5,7,1,9};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        for(int elem: arr){
            stack.push(elem);
        }
        reverseStack(stack,helper);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
//        String[] str = new String[]{"{","}"};
//        System.out.println(isBalanced(Arrays.toString(str)));
//        Stack<String> stack = new Stack<>();
//        int arr[] = {5,6,7,8,9};
//        for(int ele:arr){
//            stack.push(ele);
//        }
//        stack.push(5);
//        stack.push(10);
//        stack.push(15);

//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
//        stack.push(10);
//        System.out.println(stack.pop() + stack.size());
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());

    }
}
