package RoadEnterprise;

public class Main {
    public static void main(String[] args) {

        Enterprise enterprise;

        Car[] cars = {new Car("Mercedes", "AA0001BB", "Бондаренко Микола Іванович", 1.2, true, "21.02.19", 4),
                new Car("Mercedes", "AA0002BC", "Мельник Володимир Іванович", 1.3, false, "---", 0),
                new Car("KIA", "AA3452CC", "Коваленко Ганна Сергіївна", 1.6, true, "15.02.19", 2),
                new Car("KIA", "AA3456CC", "Шаповалов Андрій Петрович", 1.5, true, "16.02.19", 3),
                new Car("KIA", "AA1234VC", "Швець Олег Микитович", 1.8, false, "---", 0),
                new Car("Mercedes", "AA5501BB", "Литвиненко Анна Вікорівна", 1.9, true, "21.02.19", 3),
                new Car("Mercedes", "AA5502BC", "Ткаченко Олена Олександрівна", 1.1, false, "---", 0),
                new Car("MAN", "AA9870MC", "Коваль Володимир Миколайович", 2.1, true, "18.02.19", 1),
                new Car("MAN", "AA0101MC", "Саєнко Олександра Іванівна", 2.2, true, "19.02.19", 2),
                new Car("MAN", "AA2234NC", "Тищенко Микола Петрович", 2.3, false, "---", 0),

        };

        enterprise = new Enterprise(cars);//створення об'єкта

        System.out.println("-------------------------------------------");
        System.out.println("Список машин, які перебувають в рейсі:");
        enterprise.printInfo(true);
        System.out.println("-------------------------------------------");
        System.out.println("Список машин, які не перебувають в рейсі:");
        enterprise.printInfo(false);
        System.out.println("-------------------------------------------");
        enterprise.findCar(2.1);//пошук автомобіля, який не в рейсі і підходить по вантажопідйомності
    }
}
