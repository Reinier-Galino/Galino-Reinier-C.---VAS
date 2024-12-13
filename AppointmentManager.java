import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentManager {
    private ArrayList<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment added successfully!");
    }

    public void updateAppointment(String name) {
        for (Appointment appointment : appointments) {
            if (appointment.getName().equalsIgnoreCase(name)) {
                Scanner scanner = new Scanner(System.in);

                // Display current details
                System.out.println("Current Appointment Details:");
                System.out.println(appointment);

                // Allow user to selectively update fields
                System.out.print("Enter new Email (leave blank to keep current): ");
                String email = scanner.nextLine();
                if (!email.isEmpty()) {
                    appointment.setEmail(email);
                }

                System.out.print("Enter new Contact No (leave blank to keep current): ");
                String contactNo = scanner.nextLine();
                if (!contactNo.isEmpty()) {
                    appointment.setContactNo(contactNo);
                }

                System.out.print("Enter new Pet Name (leave blank to keep current): ");
                String petName = scanner.nextLine();
                if (!petName.isEmpty()) {
                    appointment.setPetName(petName);
                }

                System.out.print("Enter new Pet Age (leave blank to keep current): ");
                String petAge = scanner.nextLine();
                if (!petAge.isEmpty()) {
                    appointment.setPetAge(petAge);
                }

                System.out.print("Enter new Date (leave blank to keep current): ");
                String date = scanner.nextLine();
                if (!date.isEmpty()) {
                    appointment.setDate(date);
                }
                
                System.out.print("Enter new Time (leave blank to keep current): ");
                String time = scanner.nextLine();
                if (!time.isEmpty()) {
                    appointment.setTime(time);
                }
                
                System.out.print("List of Vaccines for Dogs: ");
                    System.out.print("\n* Initial Puppy Vaccination (5 weeks)");
                    System.out.print("\n* Rabbies Vaccination (14 weeks)");
                    System.out.print("\n* Bordetella Vaccination (6-8 weeks)");
                    System.out.print("\nList of Vaccines for Cats: ");
                    System.out.print("\n* Initial Kitten Vaccination (6-8 weeks)");
                    System.out.print("\n* Rabbies Vaccination (12-16 weeks)");
                    System.out.print("\n* Feline Leukemia Vaccination (8 weeks)");
                System.out.print("\nEnter new Vaccine (leave blank to keep current): ");
                String vaccine = scanner.nextLine();
                if (!vaccine.isEmpty()) {
                    appointment.setVaccine(vaccine);
                }

                System.out.println("Appointment updated successfully!");
                return;
            }
        }
        System.out.println("Appointment not found!");
    }

    public void deleteAppointment(String name) {
        for (Appointment appointment : appointments) {
            if (appointment.getName().equalsIgnoreCase(name)) {
                appointments.remove(appointment);
                System.out.println("Appointment deleted successfully!");
                return;
            }
        }
        System.out.println("Appointment not found!");
    }

    public void displayAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("\nNo appointments available.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
                System.out.println("=====================================");
            }
        }
    }
}
