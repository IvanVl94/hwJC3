public class Main {
    public static void main(String[] args) {
        Car car = new Car("Лада", 4);
        Car car2 = new Car("Мерседес", 4);

        Truck truck = new Truck("Вольво", 6);
        Truck truck2 = new Truck("Мерседес", 8);

        Bicycle bicycle = new Bicycle("GT", 2);
        Bicycle bicycle2 = new Bicycle("Василёк", 2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(car2);
        System.out.println();
        station.check(bicycle);
        System.out.println();
        station.check(bicycle2);
        System.out.println();
        station.check(truck);
        System.out.println();
        station.check(truck2);
    }
}