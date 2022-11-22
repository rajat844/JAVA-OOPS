import java.util.*;

public class LearnLinkedListQueue {
    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();

        q.offer(12);
        q.offer(15);
        q.offer(17);

        //remove and get first element of the LinkedList
        System.out.println(q.poll());

        //get the head element of the LinkedList
        System.out.println(q.peek());

        System.out.println(q);


    }
    
}
