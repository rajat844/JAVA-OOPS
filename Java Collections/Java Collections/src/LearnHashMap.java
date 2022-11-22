import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> st = new HashMap<>();
        st.put("One",1);
        st.put("Two",2);
        st.put("Three",3);


        //update the value
        st.put("Two",23);

        //add only key is absent
        st.putIfAbsent("Four", 4);
        st.putIfAbsent("Two", 2);


        //iterate to the HashMap
        for(HashMap.Entry<String,Integer> e : st.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(st);

    }

}
