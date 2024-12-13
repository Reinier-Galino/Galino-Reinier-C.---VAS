public class Appointment {
    private String name;
    private String email;
    private String contactNo;
    private String petName;
    private String petAge;
    private String date;
    private String time;
    private String petType;
    private String vaccine;

    // Constructor
    public Appointment(String name, String email, String contactNo, String petName, String petAge, String date, String time, String petType, String vaccine) {
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.petName = petName;
        this.petAge = petAge;
        this.date = date;
        this.time = time;
        this.petType = petType;
        this.vaccine = vaccine;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getContactNo() { return contactNo; }
    public void setContactNo(String contactNo) { this.contactNo = contactNo; }
    public String getPetName() { return petName; }
    public void setPetName(String petName) { this.petName = petName; }
    public String getPetAge() { return petAge; }
    public void setPetAge(String petAge) { this.petAge = petAge; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public String getPetType() { return petType; }
    public void setPetType(String petType) { this.petType = petType; }
    public String getVaccine() { return vaccine; }
    public void setVaccine(String vaccine) { this.vaccine = vaccine; }

    @Override
    public String toString() {
        return "Name: " + name + "\nEmail: " + email + "\nContact No: " + contactNo +
               "\nPet Name: " + petName + "\nPet Age: " + petAge + "\nDate: " + date +
               "\nTime: " + time + "\nPet Type: " + petType + "\nVaccine: " + vaccine;
    }
}
