public class WoodenBero extends Bero{
    private String woodType;
    public void setWoodType(String woodType){
        this.woodType = woodType;
    }
    public String getWoodType(){
        return this.woodType;
    }

    public WoodenBero(String beroType, String beroColour, String woodType) {
        super(beroType, beroColour);
        this.woodType = woodType;
    }

    public void calculatePrice(){
        if(woodType == "Ply Wood"){
            setPrice(15000);
        } else if (woodType == "Teak") {
            setPrice(12000);
        } else if (woodType == "Engineered Wood"){
            setPrice(10000);
        }
    }

}
