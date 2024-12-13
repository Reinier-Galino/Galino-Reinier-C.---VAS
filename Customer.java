// Customer Class
import java.util.Scanner;

public class Customer extends User {
    private AppointmentManager manager;

    public Customer(String username, String password, AppointmentManager manager) {
        super(username, password);
        this.manager = manager;
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Add Appointment");
            System.out.println("2. Update Appointment");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addAppointment();
                    break;
                case 2:
                    System.out.print("Enter Name to Update Appointment: ");
                    scanner.nextLine(); // Consume newline
                    String updateName = scanner.nextLine();
                    manager.updateAppointment(updateName);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private void addAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Contact No: ");
        String contactNo = scanner.nextLine();
        System.out.print("Enter Pet Name: ");
        String petName = scanner.nextLine();
        System.out.print("Enter Pet Age (in weeks): ");
        String petAge = scanner.nextLine();
        System.out.print("Enter Date (MM/DD/YYYY): ");
        String date = scanner.nextLine();
        System.out.print("Enter Time (HH:mm am/pm): ");
        String time = scanner.nextLine();
        System.out.print("Enter Pet Type (Dog/Cat): ");
        String petType = scanner.nextLine();
        System.out.print("List of Vaccines for Dogs: ");
        System.out.print("\n* Initial Puppy Vaccination (5 weeks)");
        System.out.print("\n* Rabbies Vaccination (14 weeks)");
        System.out.print("\n* Bordetella Vaccination (6-8 weeks)");
        System.out.print("\nList of Vaccines for Cats: ");
        System.out.print("\n* Initial Kitten Vaccination (6-8 weeks)");
        System.out.print("\n* Rabbies Vaccination (12-16 weeks)");
        System.out.print("\n* Feline Leukemia Vaccination (8 weeks)");
        System.out.print("\nEnter Vaccine: ");
        String vaccine = scanner.nextLine();

        Appointment appointment = new Appointment(name, email, contactNo, petName, petAge, date, time, petType, vaccine);
        manager.addAppointment(appointment);
        System.out.println("Appointment added successfully!");
    }
}
