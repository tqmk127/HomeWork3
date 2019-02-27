package RoadEnterprise;

public class Enterprise {

    private Car[] cars;

    //відкритий конструктор приймає посилання на масив з даними
    Enterprise(Car[] list) {
        cars = list;
    }

    public void printInfo() {
//друк всіх елементів масиву
        for (Car car : cars) {
            System.out.println("Марка авто: " + car.getCarBrand() + "\nНомерний знак: " + car.getCarNumber() +
                    "\nПрізвище та ім'я водія: " + car.getDriver() + "\nВантажопідйомність: " +
                    car.getWeightCapacity() + " тонн\nАвтомобіль в рейсі(так(true)/ні(false)): " +
                    car.isInTheWay() + "\nДата виїзду в рейс: " + car.getDepartureDate() +
                    "\nТривалість рейсу: " + car.getDuration() + " дн.\n");
        }
    }

    //друк автомобілів, які знаходяться в рейсі
    public void printInfo(boolean isInTheWay) {
        if (isInTheWay) {
            for (Car car : cars) {
                if (car.isInTheWay() == isInTheWay)
                    System.out.println("Марка авто: " + car.getCarBrand() + "\nНомерний знак: " + car.getCarNumber() +
                            "\nПрізвище та ім'я водія: " + car.getDriver() + "\nВантажопідйомність: " +
                            car.getWeightCapacity() + " тонн\nДата виїзду в рейс: " + car.getDepartureDate() +
                            "\nТривалість рейсу: " + car.getDuration() + " дн.\n");
            }
        } else {//друк автомобілів, які не знаходяться в рейсі
            for (Car car : cars) {
                if (car.isInTheWay() == isInTheWay)
                    System.out.println("Марка авто: " + car.getCarBrand() + "\nНомерний знак: " + car.getCarNumber() +
                            "\nПрізвище та ім'я водія: " + car.getDriver() + "\nВантажопідйомність: " +
                            car.getWeightCapacity() + " тонн\n");
            }
        }
    }

    public void findCar(double weightCapacity) {//пошук автомобіля, який не врейсі і підходить по вантажопідйомності
        for (Car car : cars) {
            if (car.getWeightCapacity() == weightCapacity && car.isInTheWay() == false) {
                System.out.println("Пошук відбувся успішо! Шуканий результат: ");
                System.out.println("Марка авто: " + car.getCarBrand() + "\nНомерний знак: " + car.getCarNumber() +
                        "\nПрізвище та ім'я водія: " + car.getDriver() + "\nВантажопідйомність: " +
                        car.getWeightCapacity() + " тонн\nДата виїзду в рейс: " + car.getDepartureDate() +
                        "\nТривалість рейсу: " + car.getDuration() + "дн.\n");
            }
        }
    }
}



