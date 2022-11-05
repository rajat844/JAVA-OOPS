import java.util.*;

class Student {
    Integer rno;
    String name;
    Double marks;
    static String sign = "Kaleesa";

    public Student(Integer rno, String name, Double marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

public class ClassTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student kunal = new Student(1, "Aarav", 12.0);
        System.out.println(kunal.name + Student.sign);

        sc.close();
    }

}
