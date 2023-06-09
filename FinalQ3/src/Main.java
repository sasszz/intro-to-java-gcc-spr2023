import java.util.*; // stays
public class Main { // stays
    public static void main(String[] args) { // stays
        Scanner scanner = new Scanner(System.in); // stays
        List<Car> cars = new ArrayList<>(); // stays
        System.out.print("Please enter the cars below and type -1 + enter when done");
        while(scanner.hasNext()) {
            Car car = new Car(); // stays
            String make = scanner.nextLine(); // stays
            if("-1".equals(make)) break; // stays
            car.setMake(make);
            String model = scanner.nextLine(); // stays
            if("-1".equals(model)) break; // stays
            car.setModel(model);
            cars.add(car);
        }
        scanner.close(); // stays
        System.out.format("There are %s cars \n", cars.size());
        for(Car car : cars) {
            System.out.print(car.getMake() + "" + car.getModel());
            System.out.format("%s", "\n");
        }
    }
}