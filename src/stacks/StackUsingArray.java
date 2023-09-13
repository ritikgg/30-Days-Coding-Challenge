package stacks;

public class StackUsingArray {
    private int data[];
    private int topIndex;//index of the top most element of the stack

    public StackUsingArray(int size){
        data = new int[size];
        topIndex = -1;
    }
    public StackUsingArray(){
        data = new int[2];
        topIndex = -1;
    }

    //Time Complexity O(1)
    public int size(){
        return topIndex + 1;
    }
    //Time Complexity O(1)
    public boolean isEmpty(){
//        if(topIndex == -1){
//            return true;
//        }
//        return false;
        return topIndex == -1;
    }
    //Time Complexity O(1)
    public void push (int elem) throws StackFullException {
        //if stack is full
        if(topIndex == data.length-1){
            //Throw Exception
//            StackFullException e = new StackFullException();
//            throw e;
//            throw new StackFullException(); // alternate way
            doubleCapacity();
        }
        data[++topIndex] = elem;
    }
    private void doubleCapacity(){
        System.out.println("Double it");
        int temp[] = data;
        data = new int[2*temp.length];
        for(int i = 0;i<temp.length;i++){
            data[i] = temp[i];
        }

    }
    //Time Complexity O(1)
    public int top() throws StackEmptyExeption {
        if(topIndex == -1){
            //Throw StackEmpty Exception
            throw new StackEmptyExeption();
        }
        return data[topIndex];
    }
    //Time Complexity O(1)
    public int pop() throws StackEmptyExeption {
        if(topIndex == -1){
            //Throw StackEmpty Exception
            throw new StackEmptyExeption();
        }
        int temp = data[topIndex--];
//        topIndex--;
        return temp;
    }

}
