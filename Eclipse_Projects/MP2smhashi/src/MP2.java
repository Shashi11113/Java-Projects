// Sadam Hashi, smhashi, CIS 340, MP2

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MP2 {
    //Creating a class level scanner object
    private Scanner scnr;
    //Declaring an object of an ArrayList type
    private ArrayList<Device> devices;

    //Method to instantiate scanner and devices objects
    public MP2() {
        devices = new ArrayList<>();
        scnr = new Scanner(System.in);
    }

    //Main method to run the program
    public static void main(String[] args) {
        // Creating a class object to invoke non-static methods
        MP2 LibraryApp = new MP2();
        // Invoking the non-static methods to run the program
        LibraryApp.SampleData();
        LibraryApp.displayMenu();
    }

    //Creates 5 entries of devices in the app list
    private void SampleData() {
        devices.add(new Device("6757A", "Apple 9.7-inch iPad Pro", true));
        devices.add(new Device("93P51B", "Amazon Kindle Fire Kids Edition", true));
        devices.add(new Device("10N8C", "LeapFrog Epic Learning Tablet", true));
        devices.add(new Device("85U2O", "Amazon Kindle Fire HD 8", true));
        devices.add(new Device("91H2D", "HP Envy 8 Note", true));
    }

    //Displays the choices for the user, and uses try/catch exception handling
    private void displayMenu() {
        int choice;
        do {
            System.out.println("\nLibrary Device Checkout System");
            System.out.println("1. List devices by Title");
            System.out.println("2. Add New Devices");
            System.out.println("3. Edit Device information");
            System.out.println("4. Search by Device Name");
            System.out.println("5. Check Out Devices");
            System.out.println("6. Checked In Devices");
            System.out.println("7. Exit");
            System.out.print("Select menu option 1-7: ");

            try {
                choice = scnr.nextInt();
                scnr.nextLine(); 
            } catch (InputMismatchException err) {
                System.out.println("Invalid input. Please enter an integer between 1 and 7.");
                scnr.next(); 
                choice = 0; // Keeps loop to continue
                continue;
            }

            switch (choice) {
                case 1:
                    listDevices();
                    break;
                case 2:
                    addDevice();
                    break;
                case 3:
                    editDevice();
                    break;
                case 4:
                    searchDevice();
                    break;
                case 5:
                    checkOutDevice();
                    break;
                case 6:
                    checkIn();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input. Please enter an integer between 1 and 7.");
            }
        } while (choice != 7);
    }

    //Uses for-each loop to print out the list of devices if the user requests in the menu option
    private void listDevices() {
        System.out.println("\n#   SKU      Name");
        int index = 1;
        for (Device device : devices) {
            if (device != null) {
            	System.out.printf("%-3d %-8s %-32s %s\n", index++, device.getSku(), device.getName(), device.status());
            }
        }
        continues();
    }

    //Prompts the user to add a new device while keeping the size of the devices around 10
    private void addDevice() {
        if (devices.size() >= 10) {
            System.out.println("\nUnable to add more devices\n");
            continues();
            return;
        }

        System.out.print("Enter SKU: ");
        String sku = scnr.nextLine();
        System.out.print("Enter Name: ");
        String name = scnr.nextLine();

        devices.add(new Device(sku, name, true));
        System.out.println("\nAdded Google Home Hub to Catalog.");
        continues();
    }

    //Prompts the user for the number to edit an existing device
    private void editDevice() {
        System.out.println("Devices:");
        int index = 1;
        int index_Two = 0;
        for (Device device : devices) {
            if (device != null) {
                System.out.printf("%d %s  %s  %s\n", index++, device.getSku(), device.getName(), device.status());
            }
            index_Two++;
        }

        System.out.printf("\nEnter the number of device to edit (1-%d): ", index_Two);
        try {
            int choice = scnr.nextInt();
            scnr.nextLine(); 

            if (choice > 0 && choice <= devices.size()) 
            {
                Device device = devices.get(choice - 1);
                System.out.print("Enter new Name: ");
                String name = scnr.nextLine();
                device.setName(name);
                System.out.println("\nDevice information updated.");
            } 
            else 
            {
                System.out.println("Invalid choice.");
            }
        } 
        catch (NumberFormatException err) 
        {
            System.out.println("Invalid input. Please enter a valid number.");
            scnr.next(); 
        }
        continues();
    }

    //Uses the contains method to search for device names by prompting the user
    private void searchDevice() 
    {
        System.out.print("\nEnter device name to search: ");
        String name = scnr.nextLine();

        System.out.println("\nSearch Results:");
        for (Device device : devices) {
            if (device != null && device.getName().toLowerCase().contains(name.toLowerCase())) 
            {
                System.out.printf("%s  %s  %s\n", device.getSku(), device.getName(), device.status());
            }
        }
        continues();
    }

    //Checks the status of a device and allows the user to check out the device if available
    private void checkOutDevice() {
        System.out.println("\nAvailable devices:\n");
        int index = 1;
        for (Device device : devices) 
        {
            if (device != null && device.getAvailable()) 
            {
                System.out.printf("%d %s  %s  %s%n", index++, device.getSku(), device.getName(), device.status());
            }
        }

        System.out.print("Enter the number of device to check out: ");
        try 
        {
            int choice = scnr.nextInt();
            scnr.nextLine(); 

            if (choice > 0 && choice <= devices.size() && devices.get(choice - 1).getAvailable()) 
            {
                devices.get(choice - 1).setAvailable(false);
                System.out.println("Device checked out successfully.");
            } 
            else 
            {
                System.out.println("Invalid choice or device already checked out.");
            }
        } catch (NumberFormatException err) 
        {
            System.out.println("Invalid input. Please enter a valid number.");
            scnr.next(); 
        }
        continues();
    }

    //Checks the current checked out devices and prompts to check in
    private void checkIn() {
        System.out.println("Checked out devices:");
        int index = 1;
        for (Device device : devices)
        {
            if (device != null && !device.getAvailable()) 
            {
                System.out.printf("%d %s  %s  %s%n", index++, device.getSku(), device.getName(), device.status());
            }
        }

        System.out.print("Enter the number of device to check in: ");
        try 
        {
            int choice = scnr.nextInt();
            scnr.nextLine(); 

            if (choice > 0 && choice <= devices.size() && !devices.get(choice - 1).getAvailable()) 
            {
                devices.get(choice - 1).setAvailable(true);
                System.out.println("Device checked in successfully.");
            } 
            else 
            {
                System.out.println("Invalid choice or device already available.");
            }
        }
        catch (NumberFormatException err) 
        {
            System.out.println("Invalid input. Please enter a valid number.");
            scnr.next(); 
        }
        continues();
    }

    //Uses for-each loop to identify if a SKU exists and not null
    private Device findDeviceBySku(String sku) 
    {
        for (Device device : devices) {
            if (device != null && device.getSku().equalsIgnoreCase(sku)) 
            {
                return device;
            }
        }
        return null;
    }

    // Asks the user to press enter to continue the program until they want to exit
    private void continues() 
    {
        System.out.print("\nPress Enter to continue...");
        scnr.nextLine();
    }
}



