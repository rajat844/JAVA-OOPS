import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(100);
        pq.offer(200);
        pq.offer(50);

        System.out.println(pq);
        //get the first element of the prority queue
        System.out.println(pq.peek());

        //pop the first element of the priority queue
        pq.poll();
        System.out.println(pq);
    }
}
