# Galino-Reinier-C.---VAS
## Overview
This Veterinary Appointment System is designed to streamline the process of scheduling veterinary appointments for pets. It allows pet owners to book, update, or cancel appointments with veterinarians, ensuring timely and organized care for their animals. The system improves efficiency in veterinary clinics by reducing scheduling conflicts and waiting times, ultimately contributing to better animal health outcomes.

## Application of OOP Principles
In this project, Object-Oriented Programming (OOP) principles are applied to manage and organize the various components of the system:

- **Encapsulation**: The `Appointment` class encapsulates all the details related to an appointment (such as date, time, and pet details), ensuring that sensitive data is only accessed through defined methods.
- **Inheritance**: The `AppointmentManager` class inherits from a base `Admin` class that provides general functionalities for managing records, like adding, updating, and deleting.
- **Polymorphism**: Different types of users (e.g., customers, admin) interact with the system in different ways, but they all use the same methods (like `viewAppointments`) with varying implementations depending on the role.
- **Abstraction**: The system abstracts away complex logic (like database handling) through the `AppointmentManager` class, presenting the user with a simple interface for booking appointments.

## SDG Integration
- **SDG 3: Good Health and Well-being**  
This project aligns with **SDG 3** by promoting the health and well-being of animals. The veterinary appointment system ensures that pets and animals receive timely medical care, which is essential for maintaining their health. By organizing appointment schedules, the system helps reduce delays in treatment and supports better health outcomes for animals.
- The system helps pet owners manage their animals' medical needs effectively, ensuring their pets' health is monitored regularly and appointments are not missed. This contributes to overall animal welfare, which is vital for community health.

## Instruction for Running the Program 

1.**Clone the repository**:
   git clone https://github.com/Reinier-Galino/Galino-Reinier-C.---VAS.git
Open BlueJ and navigate to the project folder:
1.Open BlueJ and select "Project" -> "Open Project."
2.Browse to the folder where the project was cloned and select it.
Compile the classes:
1.In BlueJ, right-click on each class (such as Appointment, AppointmentManager, etc.) and choose "Compile" to make sure all the classes are compiled.
Run the program:
1.After compiling, right-click on the main class (e.g., Main) and choose "Create Object" to instantiate the main class.
2.You can then call the methods you need to test by interacting with the object created.
