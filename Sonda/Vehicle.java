import java.util.HashMap;

public abstract class Vehicle implements IVehicleStandards {

    private HashMap<String,Integer> allOptionals = new HashMap<>();

    public HashMap<String, Integer> getAllOptionals() {
        return allOptionals;
    }

    public Vehicle() {
        this.allOptionals.put("Airbag",3000);
        this.allOptionals.put("Music System",1000);
        this.allOptionals.put("ABS",5000);
        this.allOptionals.put("Sun Roof",2000);
        this.allOptionals.put("Seat Heating",2000);
    }

    private boolean exception = false;

    public boolean isException() {
        return this.exception;
    }

    public void setException(boolean exception) {
        this.exception = exception;
    }

    public abstract String getType();

    @Override
    public abstract int cost();
    @Override
    public abstract void optionalsOfOrder(String... optionals);
}
