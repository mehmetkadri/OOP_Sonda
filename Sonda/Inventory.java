import java.util.ArrayList;

public class Inventory {
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    int finalCost = 0;
    String finalText = "";
    private int carCount = 0;
    private int motorCount = 0;

    public void add(Vehicle item) throws InvalidOptionalException{
        this.vehicles.add(item);
        if (!item.isException()){
            if(item.getType().equals("car")){
                this.carCount++;
            }else if(item.getType().equals("motor")){
                this.motorCount++;
            }
        }else if(item.isException()){
            throw new InvalidOptionalException();
        }
        this.finalCost+= item.cost();
    }

    @Override
    public String toString() {
        for(Vehicle vehicleItem : vehicles){
            this.finalText = this.finalText.concat(vehicleItem.toString() + "\n");
        }
        return this.finalText +"TOTAL : " + (this.carCount + this.motorCount) +  " Vehicles including " + this.carCount
                + " Cars and " + this.motorCount + " Motorbikes having a total price of "+ this.finalCost + " TL";
    }
}