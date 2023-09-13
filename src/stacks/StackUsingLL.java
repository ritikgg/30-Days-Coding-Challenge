package stacks;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;
    public StackUsingLL(){
        head = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void push( T elem){
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public T top() throws StackEmptyExeption {
        if(head == null){
            throw new StackEmptyExeption();
        }
        return head.data;

    }

    public T pop() throws StackEmptyExeption {
        if(head == null){
            throw new StackEmptyExeption();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}
