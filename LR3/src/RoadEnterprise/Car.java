package RoadEnterprise;

public class Car {

    private String carBrand;//марка авто
    private String carNumber;//номерний знак
    private String driver;//Прізвище та ім'я водія
    private double weightCapacity;//вантажопідйомність
    private boolean inTheWay;//автомобіль в рейсі
    private String departureDate;//дата виїзду в рейс
    private int duration;//тривалість рейсу(в днях)

    //конструктор за замовчуванням
    public Car() {
        this.carBrand = "No name";
        this.carNumber = "AA0000BB";
        this.driver = "No name";
        this.weightCapacity = 0;
        this.inTheWay = false;
        this.departureDate = null;
        this.duration = 0;
    }

    //конструктор з параметрами
    public Car(String carBrand, String carNumber, String driver, double weightCapacity,
               boolean inTheWay, String departureDate, int duration) {
        this.carBrand = carBrand;
        this.carNumber = carNumber;
        this.driver = driver;
        this.weightCapacity = weightCapacity;
        this.inTheWay = inTheWay;
        this.departureDate = departureDate;
        this.duration = duration;
    }

    //перевантаження конструктора
    public Car(String carBrand, String carNumber, String driver, double weightCapacity,
               String departureDate, int duration) {
        this.carBrand = carBrand;
        this.carNumber = carNumber;
        this.driver = driver;
        this.weightCapacity = weightCapacity;
        this.inTheWay = true;
        this.departureDate = departureDate;
        this.duration = duration;
    }

    // методи-геттери для усіх полів
    public String getCarBrand() {
        return carBrand;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getDriver() {
        return driver;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public boolean isInTheWay() {
        return inTheWay;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public int getDuration() {
        return duration;
    }

}
