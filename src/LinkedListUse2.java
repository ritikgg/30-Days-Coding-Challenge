import javax.management.NotificationEmitter;
import java.sql.SQLOutput;

public class LinkedListUse2 extends LinkedListUse{
    //LinkedList operation by Recursion


    static class DoubleNode{
        Node<Integer>head;
        Node<Integer>tail;

        DoubleNode(){
        }
        DoubleNode(Node<Integer> head,Node<Integer> tail){
            this.head = head;
            this.tail = tail;
        }

    }
    public static void printRecursive(Node<Integer> head2){
        if(head2 == null){
            return;
        }
        System.out.print(head2.data + " ");
        printRecursive(head2.next);
    }

    public static Node<Integer> insertRecursive(Node<Integer> head2, int elem, int pos){

        if (head2 == null && pos > 0){
            return head2;
        }
        if(pos == 0){
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head2;
            return newNode;
        }
        else {
//           Node<Integer> smallerHead = insertRecursive(head2.next,elem,pos-1);
//           head2.next = smallerHead;
            head2.next = insertRecursive(head2.next,elem,pos-1);
            return head2;
        }


    }
    public static Node<Integer> deleteRecursive (Node<Integer> head, int pos){
        if(head == null){
            return head;
        }
        if(pos == 0){
            return head.next;
        }
        Node<Integer> smallHead = deleteRecursive(head.next,pos-1);
        head.next = smallHead;

        return head;
    }

    public static Node<Integer> reverseLL(Node<Integer> head){
        if(head == null || head.next==null){ //LL of length zero or one
            return head;
        }
        Node<Integer> smallHead = reverseLL(head.next);
        Node<Integer>tail = smallHead;
        while (tail.next != null){
            tail = tail.next; //i++
        }
        tail.next = head;
        head.next = null;
//        head.next.next = head;
//        head.next = null;
        return smallHead;
    }

    public static DoubleNode  OPreverseLL(Node<Integer> head) {
        DoubleNode ans;
        if(head == null || head.next==null){ //LL of zero length
            ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        DoubleNode smallAns = OPreverseLL(head.next);
        smallAns.tail.next = head;
        head.next = null;
        ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }
    public static Node<Integer>  OPreverseLL1(Node<Integer> head) {
        DoubleNode ans = OPreverseLL(head);
        return ans.head;
    }

    public static Node<Integer> midPoint(Node<Integer> head){
        Node<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node<Integer> mergeTwoSortedLL(Node<Integer> head1,Node<Integer> head2){
       if (head1 == null){
           return head2;
       }
       if(head2 == null){
           return head1;
       }
        Node<Integer> t1 = head1, t2= head2;
        Node<Integer> head = null,tail = null;
        if(t1.data <= t2.data){
            head = t1;
            tail = t1;
            t1 = t1.next;

        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while(t1 != null && t2 != null){
            if(t1.data<=t2.data){
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }
            else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        //
        if (t1 == null){
            tail.next = t2;
        }
        else{
            tail.next = t1;
        }
        return head;
    }
    public static Node<Integer> mergeSort(Node<Integer>head){
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> mid = midPoint(head);
        Node<Integer> half1 = head, half2 = mid.next;
        mid.next = null;

        half1 = mergeSort(half1);
        half2 = mergeSort(half2);
        Node<Integer> finalHead = mergeTwoSortedLL(half1,half2);
        return finalHead;
    }
    public static void main(String[] args) {
        System.out.println("head1 enter");
        Node<Integer> head1 = takeInput();
//        System.out.println("head2 enter");
//        Node<Integer> head2 = takeInput();
        System.out.println("merge sort start");
        Node<Integer> head = mergeSort(head1);
        printRecursive(head);


//        Node<Integer> mid = midPoint(head2);
//        System.out.println(mid.data);
//        head2 = insertRecursive(head2,70,0);
//        head2 = deleteRecursive(head2,2);

//        head2 = OPreverseLL1(head2);
    }

}
