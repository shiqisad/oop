/**
 * Represents an appointment made by a patient with a health professional (doctor).
 */
public class Appointment {
    private Patient patient;
    private String timeSlot;
    private HealthProfessional doctor;

    /**
     * Default constructor for creating an empty Appointment object.
     */
    public Appointment() {
    }

    /**
     * Constructs an Appointment with the specified patient, time slot, and doctor.
     *
     * @param patient The patient making the appointment.
     * @param timeSlot The time slot for the appointment.
     * @param doctor The doctor the patient is meeting for the appointment.
     */
    public Appointment(Patient patient, String timeSlot, HealthProfessional doctor) {
        this.patient = patient;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    /**
     * Returns the patient associated with the appointment.
     *
     * @return The patient of this appointment.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Returns the time slot of the appointment.
     *
     * @return The time slot for this appointment.
     */
    public String getTimeSlot() {
        return timeSlot;
    }

    /**
     * Returns the doctor assigned to the appointment.
     *
     * @return The doctor for this appointment.
     */
    public HealthProfessional getDoctor() {
        return doctor;
    }

    /**
     * Prints the details of the appointment, including patient information,
     * time slot, and the doctor's name.
     */
    public void printAppointmentDetails() {
        System.out.println("Appointment Details:");
        patient.printPatientDetails();
        System.out.println("TimeSlot: " + timeSlot);
        System.out.println("Doctor: " + doctor.getName());
    }
}
