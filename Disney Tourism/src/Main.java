import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the costumer Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter the City Name");
        String city = sc.next();
        System.out.println("Enter the phone number");
        String phoneNumber = sc.next();
        System.out.println("Enter number of people");
        int noOfPeople = sc.nextInt();
        int option = sc.nextInt();

        if(option == 1){
            int days = sc.nextInt();
            String food = sc.next();
            BoatHouseBooking book = new BoatHouseBooking(name,city,phoneNumber,noOfPeople,days,food);
            System.out.println(book.calculateTotalAmount());
        } else {
            float hours = sc.nextFloat();
            String guide = sc.next();
            BoatRideBooking book = new BoatRideBooking(name,city,phoneNumber,noOfPeople,hours,guide);
            System.out.println(book.calculateTotalAmount());

        }
    }
}