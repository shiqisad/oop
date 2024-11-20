/**
 * Represents a General Practitioner (GP) as a type of health professional.
 */
public class GeneralPractitioner extends HealthProfessional {
    private String clinicHours; // Clinic working hours

    /**
     * Default constructor that initializes the General Practitioner with default values.
     */
    public GeneralPractitioner() {
        super();
        this.clinicHours = "Not specified";
    }

    /**
     * Constructs a General Practitioner object with the specified ID, name, description, and clinic hours.
     *
     * @param id          The ID of the General Practitioner.
     * @param name        The name of the General Practitioner.
     * @param desc        A brief description of the General Practitioner's role.
     * @param clinicHours The working hours of the General Practitioner in the clinic.
     */
    public GeneralPractitioner(int id, String name, String desc, String clinicHours) {
        super(id, name, desc);
        this.clinicHours = clinicHours;
    }

    /**
     * Prints the details of the General Practitioner.
     */
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printDetails();
        System.out.println("Clinic Hours: " + clinicHours);
    }
}
