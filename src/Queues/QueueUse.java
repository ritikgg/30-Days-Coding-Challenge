package Queues;

public class QueueUse {
    public static void main(String[] args) throws QueueFullException {

        QueueUsingArray queue = new QueueUsingArray();
        int[] arr = {10,20,30,40,50,60,700};
        for(int elem:arr){

//            try {
                queue.enqueue(elem);
//            }
//            catch (QueueFullException e){

//            }
        }
        while (!queue.isEmpty())
        try {
            System.out.println(queue.dequeue());
        }
        catch (QueueEmptyException e){
            //will never reach here
        }
    }

}
