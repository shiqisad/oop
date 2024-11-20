/**
 * Represents a Nurse as a type of health professional.
 */
public class Nurse extends HealthProfessional {
    private String department; // Department the nurse is assigned to

    /**
     * Default constructor that initializes the Nurse with default values.
     */
    public Nurse() {
        super();
        this.department = "Not assigned";
    }

    /**
     * Constructs a Nurse object with the specified ID, name, description, and department.
     *
     * @param id         The ID of the Nurse.
     * @param name       The name of the Nurse.
     * @param desc       A brief description of the Nurse's role.
     * @param department The department the Nurse is assigned to.
     */
    public Nurse(int id, String name, String desc, String department) {
        super(id, name, desc);
        this.department = department;
    }

    /**
     * Prints the details of the Nurse.
     */
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: Nurse");
        super.printDetails();
        System.out.println("Department: " + department);
    }
}
