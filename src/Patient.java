/**
 * Represents a patient in the health service system.
 */
public class Patient {
    private String name;
    private String mobile;

    /**
     * Constructs a Patient object with the specified name and mobile number.
     *
     * @param name   The name of the patient.
     * @param mobile The mobile number of the patient.
     */
    public Patient(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    /**
     * Gets the name of the patient.
     *
     * @return The name of the patient.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the mobile number of the patient.
     *
     * @return The mobile number of the patient.
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Prints the details of the patient, including the name and mobile number.
     * This method is used to display patient information.
     */
    public void printPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Mobile: " + mobile);
    }
}
