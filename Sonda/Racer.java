public class Racer extends Motorbike {

    int basePrice = 60000;
    int totalPrice = 0;

    public Racer() {
        this.totalPrice = this.basePrice;
    }

    public Racer(String... optionals) {
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
    public String toString(){
        if (!this.isException() && !this.itemOfOpt.equals("")) {
            return "Racer with " + this.itemOfOpt + " having a total price of " + this.totalPrice + " TL";
        } else if(!this.isException() && this.itemOfOpt.equals("")){
            return "Racer having a total price of " + this.totalPrice + " TL";
        }else{
            return "Invalid optional";
        }
    }
}
