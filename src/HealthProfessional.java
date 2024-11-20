/**
 * Represents a health professional in the health service system.
 */
public class HealthProfessional {
    protected int id;
    protected String name;
    protected String desc;

    /**
     * Default constructor that initializes the health professional with default values.
     */
    public HealthProfessional() {
        this(0, "", "");
    }

    /**
     * Constructs a HealthProfessional object with the specified ID, name, and description.
     *
     * @param id    The ID of the health professional.
     * @param name  The name of the health professional.
     * @param desc  A brief description of the health professional's role or specialization.
     */
    public HealthProfessional(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    /**
     * Gets the ID of the health professional.
     *
     * @return The ID of the health professional.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the health professional.
     *
     * @return The name of the health professional.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the description of the health professional's role or specialization.
     *
     * @return The description of the health professional.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Prints the details of the health professional.
     */
    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + desc);
    }
}
