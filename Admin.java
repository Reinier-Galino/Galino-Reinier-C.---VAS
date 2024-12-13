import java.util.HashMap;
import java.util.Scanner;

public class Admin extends User {
    private AppointmentManager manager;
    private HashMap<String, String> customerAccounts;

    public Admin(String username, String password, AppointmentManager manager, HashMap<String, String> customerAccounts) {
        super(username, password);
        this.manager = manager;
        this.customerAccounts = customerAccounts;
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. View Appointments");
            System.out.println("2. Delete Appointment");
            System.out.println("3. View Customer Info");
            System.out.println("4. Delete Customer Info");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAll Appointments:");
                    manager.displayAppointments();
                    break;
                case 2:
                    System.out.print("Enter Name to Delete Appointment: ");
                    scanner.nextLine(); // Consume newline
                    String deleteName = scanner.nextLine();
                    manager.deleteAppointment(deleteName);
                    break;
                case 3:
                    viewCustomerInfo();
                    break;
                case 4:
                    deleteCustomerInfo();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void viewCustomerInfo() {
        System.out.println("\nCustomer Info:");
        for (String username : customerAccounts.keySet()) {
            System.out.println("Username: " + username + ", Password: " + maskPassword(customerAccounts.get(username)));
        }
    }

    private void deleteCustomerInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username to Delete: ");
        String username = scanner.nextLine();

        if (customerAccounts.containsKey(username)) {
            customerAccounts.remove(username);
            System.out.println("Customer account deleted successfully.");
        } else {
            System.out.println("Username not found.");
        }
    }

    private String maskPassword(String password) {
        return "*".repeat(password.length());
    }
}