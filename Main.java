import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, String> customerAccounts = new HashMap<>();
    private static HashMap<String, String> adminAccounts = new HashMap<>();

    public static void main(String[] args) {
        initializeAccounts();

        AppointmentManager manager = new AppointmentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Veterinarian Appointment System");
            System.out.println("1. Customer");
            System.out.println("2. Admin");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleCustomerLogin(manager);
                    break;
                case 2:
                    handleAdminLogin(manager);
                    break;
                case 3:
                    System.out.println("Exiting system. Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void handleCustomerLogin(AppointmentManager manager) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Back");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (login(customerAccounts)) {
                        Customer customer = new Customer("", "", manager);
                        customer.menu();
                        return;
                    }
                    break;
                case 2:
                    signUpCustomer();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void handleAdminLogin(AppointmentManager manager) {
        if (login(adminAccounts)) {
            Admin admin = new Admin("admin", "admin12345", manager, customerAccounts);
            admin.menu();
        }
    }

    private static boolean login(HashMap<String, String> accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (accounts.containsKey(username) && accounts.get(username).equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid credentials. Please try again.");
            return false;
        }
    }

    private static void signUpCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        if (customerAccounts.containsKey(username)) {
            System.out.println("Username already exists. Please choose another.");
            return;
        }

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        customerAccounts.put(username, password);
        System.out.println("Sign-up successful!");
    }

    private static void initializeAccounts() {
        adminAccounts.put("admin", "admin12345");
    }
}