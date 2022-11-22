import java.util.*;

public class LearnTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> st = new TreeMap<>();
        st.put("One", 1);
        st.put("Two", 2);
        st.put("Three", 3);
        st.put("Five",5);
        st.put("Four",4);


        for(Map.Entry<String,Integer> e : st.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        
        System.out.println(st);
    }
}
