public abstract class Car extends Vehicle{

    String[] carOptionals = {"ABS", "Music System", "Airbag", "Sun Roof"};

    protected int totalOptionalPrice = 0;
    boolean match = false;
    String itemOfOpt = "";

    public Car(String... optionals) {
        for(String option : optionals){
            for(String carOption : carOptionals) {
                if (option.equals(carOption)) {
                    this.match = true;
                    break;
                }
            }
            if(this.match){
                this.totalOptionalPrice += this.getAllOptionals().get(option);
                this.match = false;
            }else{
                this.setException(true);
                break;
            }
        }
        if(!this.isException()){
            optionalsOfOrder(optionals);
        }
    }

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public String getType(){
        return "car";
    }

    @Override
    public void optionalsOfOrder(String... optionals){
        if(optionals.length>0){
            for(int i = 0 ; i < optionals.length-1 ; i++){
                this.itemOfOpt = this.itemOfOpt.concat(optionals[i] + ", ");
            }
            this.itemOfOpt = this.itemOfOpt.concat(optionals[optionals.length-1]);
        }
    }
}
