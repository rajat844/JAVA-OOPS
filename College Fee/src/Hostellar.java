public class Hostellar extends Student {
    private int roomNumber;
    private char blockName;
    private String roomType;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public char getBlockName() {
        return blockName;
    }

    public void setBlockName(char blockName) {
        this.blockName = blockName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Hostellar(int studentId, String studentName, String department, String gender, String category, double collegeFee, int roomNumber, char blockName, String roomType) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.roomNumber = roomNumber;
        this.blockName = blockName;
        this.roomType = roomType;
    }
    @Override
    public double calculateTotalFee(){
        double hostelFees = 0;
        if(blockName == 'A'){
            hostelFees = 60000;
            if(roomType == "AC"){
                hostelFees += 8000;
            }
        } else if (blockName == 'B') {
            hostelFees = 50000;
            if (roomType == "AC") {
                hostelFees += 5000;
            }
        } else if (blockName == 'C'){
            hostelFees = 40000;
            if (roomType == "AC"){
                hostelFees += 2500;
            }
        }
        return collegeFee+hostelFees;
    }
}
