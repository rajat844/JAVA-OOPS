import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //add element to the Last
        dq.offerLast(23);
        dq.offerLast(46);

        //add element to the starting
        dq.offerFirst(29);
        dq.offerFirst(40);
        
        System.out.println(dq);

        //display the first element
        System.out.println(dq.peekFirst());
        //display the last element
        System.out.println(dq.peekLast());

        //pop the first element
        System.out.println(dq.pollFirst());
        //pop the last elemnt
        System.out.println(dq.pollLast());
    }
    
}
