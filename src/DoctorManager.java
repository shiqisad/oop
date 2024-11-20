import java.util.ArrayList;

/**
 * Manages a collection of health professionals (doctors) and provides functionality to add and print doctor details.
 */
public class DoctorManager {
    private ArrayList<HealthProfessional> doctors;

    /**
     * Default constructor that initializes the doctor list.
     */
    public DoctorManager() {
        this.doctors = new ArrayList<>();
    }

    /**
     * Adds a new health professional (doctor) to the collection.
     *
     * @param doctor The health professional (doctor) to add to the collection.
     */
    public void addDoctor(HealthProfessional doctor) {
        this.doctors.add(doctor);
    }

    /**
     * Prints the details of all doctors in the collection.
     */
    public void printDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
        } else {
            for (HealthProfessional doctor : doctors) {
                doctor.printDetails();
                System.out.println();
            }
        }
    }
}
