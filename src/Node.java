public class Node<G> {
    G data;
    Node<G> next;//this is only a variable to store anything,in LinkedList class we are going to store address of next Integer.
    Node(G data){
        this.data = data;
    }
}
