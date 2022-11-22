import java.util.Stack;


public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        //add element in the stack
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Snow Leopard");

        //get the first element of stack
        System.out.println(animals.peek());

        //pop the element of the stack
        animals.pop();

        System.out.println(animals.peek());


    }

}
