public class Sivic extends Car {

    int basePrice = 50000;
    int totalPrice = 0;

    public Sivic() {
        this.totalPrice = this.basePrice;
    }

    public Sivic(String... optionals) {
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
            return "Sivic with " + this.itemOfOpt + " having a total price of " + this.totalPrice + " TL";
        } else if(!this.isException() && this.itemOfOpt.equals("")){
            return "Sivic having a total price of " + this.totalPrice + " TL";
        }else{
            return "Invalid optional";
        }
    }
}
