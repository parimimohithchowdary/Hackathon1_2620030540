import java.util.Scanner;

public class WasteCollectionData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vehicleNumber = sc.nextInt();
        double wasteCollected = sc.nextDouble();
        int collectionPoints = sc.nextInt();
        char vehicleStatus = sc.next().charAt(0);

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected);
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
    }
}