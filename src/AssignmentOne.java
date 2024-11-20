import java.util.ArrayList;

/**
 * The main class for managing doctors, appointments, and patients in a health service system.
 * This class demonstrates the use of inheritance, collections, and object management.
 */
public class AssignmentOne {
    /**
     * The main method to demonstrate managing doctors and appointments.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        DoctorManager doctorManager = new DoctorManager();
        HealthProfessional gp1 = new GeneralPractitioner(1, "Smith",
                "General Practitioner with 10 years experience.", "9:00 AM - 5:00 PM");
        doctorManager.addDoctor(gp1);
        HealthProfessional gp2 = new GeneralPractitioner(2, "Johnson",
                "Experienced General Practitioner specializing in family care.", "8:00 AM - 6:00 PM");
        doctorManager.addDoctor(gp2);
        HealthProfessional gp3 = new GeneralPractitioner(3, "Lee",
                "General Practitioner specializing in pediatrics.", "10:00 AM - 4:00 PM");
        doctorManager.addDoctor(gp3);

        HealthProfessional nurse1 = new Nurse(11, "Anne",
                "Nurse specializing in emergency care.", "Emergency Care");
        doctorManager.addDoctor(nurse1);
        HealthProfessional nurse2 = new Nurse(12, "Mark",
                "Nurse specializing in pediatrics.", "Pediatrics");
        doctorManager.addDoctor(nurse2);

        doctorManager.printDoctors();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();

        createAppointment(appointments, "Alice", "1234567890", "9:00 AM", gp1);
        createAppointment(appointments, "Bob", "0987654321", "10:00 AM", gp3);
        createAppointment(appointments, "Charlie", "1122334455", "11:00 AM", nurse1);
        createAppointment(appointments, "David", "2222222222", "2:00 PM", nurse2);

        printExistingAppointments(appointments);
        cancelAppointment(appointments, "2222222222");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    /**
     * Creates a new appointment and adds it to the list of appointments.
     *
     * @param appointments The list of appointments.
     * @param patientName The name of the patient.
     * @param patientMobile The mobile number of the patient.
     * @param timeSlot The preferred time slot for the appointment.
     * @param doctor The doctor for the appointment.
     */
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientMobile == null || timeSlot == null || doctor == null) {
            System.out.println("Invalid appointment params.");
            return;
        }

        Patient patient = new Patient(patientName, patientMobile);
        Appointment appointment = new Appointment(patient, timeSlot, doctor);
        appointments.add(appointment);
        System.out.println("Create appointment ok!");
    }

    /**
     * Prints all existing appointments.
     *
     * @param appointments The list of appointments to print.
     */
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        System.out.println("Existing Appointments:");
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printAppointmentDetails();
                System.out.println();
            }
        }
    }

    /**
     * Cancels an appointment by searching for the patient using their mobile number.
     * If an appointment is found, it will be removed from the list.
     *
     * @param appointments The list of appointments.
     * @param mobile The mobile number of the patient to cancel the appointment for.
     */
    public static void cancelAppointment(ArrayList<Appointment> appointments, String mobile) {
        boolean find = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatient().getMobile().equals(mobile)) {
                appointments.remove(i);
                find = true;
                System.out.println("Cancel appointment for mobile: " + mobile);
                break;
            }
        }

        if (!find) {
            System.out.println("No appointment found for mobile: " + mobile);
        }
    }
}
