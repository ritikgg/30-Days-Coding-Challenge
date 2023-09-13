import java.util.Scanner;

public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1;
        n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
//        Node<Integer> n5 = new Node<>(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n5;
        return n1;
    }
    public static void print (Node<Integer> head) {
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
//        System.out.println(head.next.next.next.data);
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;//its like i++ in array to increment array.

        }
        System.out.println();

    }

    public static void printIthElement (Node<Integer> head, int index){
        int count = 0;
        Node<Integer> temp = head;
        while (temp!=null){
            if(count==index){
                System.out.println(temp.data);
                return;
            }

            count++;
            temp = temp.next; //increment
        }
    }
    public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null,tail = null;

        while (data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null){
                //Make this node as head node
                head = currentNode;
                tail = currentNode;
            }
            else {
//                Node<Integer> tail = head;
//                while (tail.next!=null){
//                    tail = tail.next; //tail++
//                }

//                //Now tall will refer to last node
//                //Connect current node after last node
                tail.next = currentNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp!=null){
            temp.data++;
            temp = temp.next;

        }
    }

    public static int length(Node<Integer> head){
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
        Node<Integer> insertNode = new Node<Integer>(elem);
        if (pos == 0) {
            insertNode.next = head;
//            head = nodeInput;
            return insertNode;
        } else {
            int count = 0;
            Node<Integer> prev = head;
            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next; //prev++
            }
            if (prev != null) {
                insertNode.next = prev.next; // link bnaya jo insert krna h sath
                prev.next = insertNode;
            }
            return head;
        }
    }

    public static Node<Integer> deleteNode(Node<Integer> head,int pos){
        if(head == null){
            return head;
        }
        if(pos == 0){
            return head.next;
        }
        int count = 0;
        Node<Integer> currHead = head;
        while (currHead != null && count < (pos-1)){
            currHead = currHead.next;
            count++;
        }
        if(currHead == null || currHead.next == null){
            return head;
        }
        currHead.next = currHead.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
//        increment(head);
//        System.out.println(length(head));
//        printIthElement(head,2);
//        head = insert(head,80,5);
        deleteNode(head,0);
        print(head);



//        Node <Integer>n1 = new Node<>(10);
//        System.out.println(n1.data);
//        System.out.println(n1.next);

    }
}
