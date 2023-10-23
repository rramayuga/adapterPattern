package adapterPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Devices:");
        System.out.println("1. Laptop");
        System.out.println("2. Refrigerator");
        System.out.println("3. Smartphone Charger");
        System.out.print("Choose a device to plug into the power outlet: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Laptop laptop = new Laptop();
                PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
                laptopAdapter.plugIn();
                break;
            case 2:
                Refrigerator refrigerator = new Refrigerator();
                PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
                refrigeratorAdapter.plugIn();
                break;
            case 3:
                SmartphoneCharger charger = new SmartphoneCharger();
                PowerOutlet smartphoneAdapter = new SmartphoneAdapter(charger);
                smartphoneAdapter.plugIn();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
