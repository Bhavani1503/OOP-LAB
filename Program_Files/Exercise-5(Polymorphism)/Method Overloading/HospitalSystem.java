class Hospital {
    void registerPatient(String name, int age) {
        System.out.println("Registering patient: " + name + ", Age: " + age);
    }

    void registerPatient(String name, int age, String disease) {
        System.out.println("Registering patient: " + name + ", Age: " + age + ", Disease: " + disease);
    }

    void registerPatient(String name, int age, String disease, String emergencyLevel) {
        System.out.println("Registering patient: " + name + ", Age: " + age + ", Disease: " + disease + ", Emergency Level: " + emergencyLevel);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.registerPatient("Alice", 30);
        hospital.registerPatient("Bob", 45, "Diabetes");
        hospital.registerPatient("Charlie", 60, "Heart Attack", "Critical");
    }
}
