public class Discount {
    public double calculateDiscount(Bero bObj){
        if (bObj.beroType == "Steel Bero"){
            return (bObj.getPrice()*10)/100;
        } else if (bObj.beroType == "Wooden Bero") {
            return (bObj.getPrice()*15)/100;
        }
        else return 0;
    }
}
