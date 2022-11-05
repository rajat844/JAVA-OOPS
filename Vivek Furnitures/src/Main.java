import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the Phone number");
        long phone = sc.nextLong();
        System.out.println("Enter the city");
        String address = sc.nextLine();
        CustomerDetails c = new CustomerDetails(name,phone,address);
        System.out.println("Enter the Bero type");
        String btype = sc.nextLine();
        System.out.println("Enter the Colour");
        String color = sc.nextLine();
        if (btype.equals("Wooden Bero")){
            System.out.println("Enter the Wood type");
            String type = sc.nextLine();
            WoodenBero b = new WoodenBero(btype,color,type);
            b.calculatePrice();
            Discount d = new Discount();
            double sum = b.getPrice() - d.calculateDiscount(b);

            System.out.printf("Amount needs to be paid Rs.%.2f",sum);

        }else if(btype.equals( "Steel Bero")) {
            System.out.println("Enter the height");
            int height = sc.nextInt();
            SteelBero b = new SteelBero(btype, color, height);
            b.calculatePrice();
            Discount d = new Discount();
            double sum = b.getPrice() - d.calculateDiscount(b);
            System.out.printf("Amount needs to be paid Rs.%.2f",sum);
        }
    }
}