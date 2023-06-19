public class Sity extends Car {

    int basePrice = 40000;
    int totalPrice = 0;

    public Sity() {
        this.totalPrice = this.basePrice;
    }

    public Sity(String... optionals) {
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
            return "Sity with " + this.itemOfOpt + " having a total price of " + this.totalPrice + " TL";
        } else if(!this.isException() && this.itemOfOpt.equals("")){
            return "Sity having a total price of " + this.totalPrice + " TL";
        }else{
            return "Invalid optional";
        }
    }
}
