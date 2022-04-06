public class Car extends Vehicle implements IVehicleCar{

    private int seats;

    public Car(String color, String year, double engine,int seats) {
        super(color, year, engine);
        configureVehicle(color,year,engine, seats);
    }


    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        System.out.println("Criando um carro com Interface: " + getColor() + " " + getEngine());
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os motores com Interface");
    }
}
