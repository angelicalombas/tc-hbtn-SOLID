public class Vehicle{
    private String color;
    private String year;
    private double engine;

    public Vehicle(String color, String year, double engine){
        this.color  = color;
        this.year = year;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
