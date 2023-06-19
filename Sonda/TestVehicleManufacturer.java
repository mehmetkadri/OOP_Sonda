public class TestVehicleManufacturer {
    public static void main(String[] args) throws InvalidOptionalException{
        try {
            Inventory order = new Inventory();

            Vehicle carOrder = new Sivic( "ABS", "Music System", "Airbag");
            order.add(carOrder);

            carOrder = new Sivic("ABS", "Sun Roof");
            order.add(carOrder);

            carOrder = new Sity("Music System", "Sun Roof");
            order.add(carOrder);

            Vehicle motorbikeOrder = new Racer("ABS", "Seat Heating");
            order.add(motorbikeOrder);

            motorbikeOrder = new Scooter("Seat Heating");
            order.add(motorbikeOrder);

            System.out.println(order);
        }catch (InvalidOptionalException i){
            System.out.println("You've entered an invalid optional in an order.");
        }
    }
}
