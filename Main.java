// Main.java - Main class with menu system
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Create objects of Tiger and Dolphin
        Tiger tigerObject = new Tiger("Tiger", 200, 120, 5, 10, 40, "Loud");
        Dolphin dolphinObject = new Dolphin("Dolphin", 150, 100, 4, "Gray", 30);

        int choice;
        do {
            // Display main menu
            System.out.println("\n******* ZOO ANIMAL CHOICE MENU *******");
            System.out.println("1. Tiger");
            System.out.println("2. Dolphin");
            System.out.println("3. Exit");
            System.out.print("Enter choice of animal (1-3): ");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    handleTigerMenu(tigerObject, keyboard);
                    break;
                case 2:
                    handleDolphinMenu(dolphinObject, keyboard);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 3);

        keyboard.close();
    }

    // Method to handle Tiger menu
    private static void handleTigerMenu(Tiger tiger, Scanner keyboard) {
        int menuChoice;
        do {
            System.out.println("\n******* ANIMAL DETAILS MENU FOR: TIGER *******");
            System.out.println("1. Set Properties");
            System.out.println("2. Display Properties");
            System.out.println("3. Display Movement");
            System.out.println("4. Display Eating");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter choice (1-5): ");
            menuChoice = keyboard.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.print("Enter new speed: ");
                    tiger.setSpeed(keyboard.nextInt());
                    break;
                case 2:
                    System.out.println("Tiger Details:");
                    System.out.println("Age: " + tiger.getAge());
                    System.out.println("Height: " + tiger.getHeight());
                    System.out.println("Speed: " + tiger.getSpeed() + " mph");
                    break;
                case 3:
                    tiger.walking();
                    break;
                case 4:
                    tiger.eatingCompleted();
                    break;
                case 5:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (menuChoice != 5);
    }

    // Method to handle Dolphin menu
    private static void handleDolphinMenu(Dolphin dolphin, Scanner keyboard) {
        int menuChoice;
        do {
            System.out.println("\n******* ANIMAL DETAILS MENU FOR: DOLPHIN *******");
            System.out.println("1. Set Properties");
            System.out.println("2. Display Properties");
            System.out.println("3. Display Movement");
            System.out.println("4. Display Eating");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter choice (1-5): ");
            menuChoice = keyboard.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.print("Enter new swimming speed: ");
                    dolphin.setSwimmingSpeed(keyboard.nextInt());
                    break;
                case 2:
                    System.out.println("Dolphin Details:");
                    System.out.println("Age: " + dolphin.getAge());
                    System.out.println("Height: " + dolphin.getHeight());
                    System.out.println("Swimming Speed: " + dolphin.getSwimmingSpeed() + " nautical miles per hour");
                    break;
                case 3:
                    dolphin.swimming();
                    break;
                case 4:
                    dolphin.eatingCompleted();
                    break;
                case 5:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (menuChoice != 5);
    }
}
