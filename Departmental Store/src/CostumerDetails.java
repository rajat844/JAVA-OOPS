public class CostumerDetails implements BonusPoints,DoorDelivery {
    private String customerName;
    private String phoneNumber;
    private String streetName;
    private double billAmount;
    private int distance;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public CostumerDetails(String customerName, String phoneNumber, String streetName, double billAmount, int distance) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.streetName = streetName;
        this.billAmount = billAmount;
        this.distance = distance;
    }

    @Override
    public double calculateBonusPoints() {
        if(billAmount >= 250){
            double bonusPoints = billAmount /10;
            return bonusPoints;
        }
        return 0;
    }

    @Override
    public double deliveryCharge(){
        double charge;
        if(distance >= 25){
            charge = 8*distance;
        } else if (distance < 25 && distance >= 15) {
            charge = 5*distance;
        }
        else {
            charge = 2*distance;
        }
        return charge;
    }
}
