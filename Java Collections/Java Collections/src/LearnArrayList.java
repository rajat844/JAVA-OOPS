import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args){
        // String[] studentsName = new String[30];
        // studentsName[0] = "Rakesh";
        // studentsName[29] = "Harish";
        
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Rakesh");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);

        //add element on the index
        list.add(1,50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(300);

        //concatenate 2 lists
        list.addAll(newList);
        System.out.println(list);

        //to get element on particular index
        System.out.println(list.get(1));

        //remove element from the list
        list.remove(2);
        list.remove(Integer.valueOf(4));
        System.out.println(list);


        //change value of element on an index
        list.set(3,1000);
        System.out.println(list);

        //check if element is present or not
        System.out.println(list.contains(500));
        System.out.println(list.contains(300));

        //iterate to the arraylist
        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        for(Integer x:list){
            System.out.print(x);
        }







    }

    
}
