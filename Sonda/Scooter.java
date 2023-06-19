public class Scooter extends Motorbike {

    int basePrice = 20000;
    int totalPrice = 0;

    public Scooter() {
        this.totalPrice = this.basePrice;
    }

    public Scooter(String... optionals) {
        super(optionals);
        if(!this.isException()){
            this.totalPrice = this.basePrice + super.totalOptionalPrice;
        }
    }

    @Override
    public int cost() {
        return this.totalPrice;
    }
    @Override
    public String toString() {
        if (!this.isException() && !this.itemOfOpt.equals("")) {
            return "Scooter with " + this.itemOfOpt + " having a total price of " + this.totalPrice + " TL";
        } else if(!this.isException() && this.itemOfOpt.equals("")){
            return "Scooter having a total price of " + this.totalPrice + " TL";
        }else{
            return "Invalid optional";
        }
    }
}
