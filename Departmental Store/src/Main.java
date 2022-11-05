import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter the phone number");
        String phNumber = sc.next();
        System.out.println("Enter the street name");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("Enter the bill amount");
        double amount = sc.nextDouble();
        System.out.println("Enter the distance");
        int distance = sc.nextInt();

        CostumerDetails costumer = new CostumerDetails(name,phNumber,address,amount,distance);
        System.out.println(costumer.calculateBonusPoints());
        System.out.println(costumer.deliveryCharge());

    }
}