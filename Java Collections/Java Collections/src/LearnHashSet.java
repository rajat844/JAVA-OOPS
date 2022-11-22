import java.util.HashSet;

public class LearnHashSet {
    public static void main(String[] args) {
        HashSet<Integer> st = new HashSet<>();
        // add element to the set
        st.add(32);
        st.add(44);
        st.add(43);
        st.add(2);
        st.add(79);

        System.out.println(st);

        // remove the element from the set
        st.remove(44);

        // check if set contains the element
        System.out.println(st.contains(44));
        System.out.println(st.contains(43));

        //check if set is empty
        System.out.println(st.isEmpty());

        //check the number of element in set
        System.out.println(st.size());

        //clear the set
        st.clear();
        System.out.println(st);

    }
}
