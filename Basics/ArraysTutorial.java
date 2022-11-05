import java.util.*;

public class ArraysTutorial {
    public static void main(String[] args) {
        // int[] rnos = new int[5];
        // int[] r = {23,12,45,32,15};
        // String[] name = new String[10];
        // System.out.println(name[0]);
        // System.out.println(rnos[0]);
        Scanner sc = new Scanner(System.in);

        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 29;
        // arr[2] = 28;
        // arr[3] = 74;
        // arr[4] = 45;

        // System.out.println(arr[3]);

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = sc.nextInt();
        // }

        // for(int j : arr){
        // System.out.print(j + " ");
        // }

        // arrays of objects
        // String[] str = new String[6];
        // for (int i = 0; i < str.length; i++) {
        // str[i] = sc.next();
        // }
        // System.out.println(Arrays.toString(str));
        // sc.close();

        // int[] nums = {3,4,5,6,7};
        // change(nums);
        // System.out.println(Arrays.toString(nums));
        // int[][] arr = new int[3][2];

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(67);
        arr.add(67);
        arr.add(67);
        arr.add(67);
        arr.add(67);
        arr.add(67);
        arr.add(67);

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        sc.close();
    }

    // public static void change(int[] arr){
    // arr[0] = 99;

    // for(int x: arr){
    // System.out.println(x);
    // }
    // }

}
