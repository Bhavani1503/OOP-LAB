class Employee {
    String name = "John Doe";
    double salary = 50000;

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department = "IT";

    void showManagerDetails() {
        System.out.println("Manager Department: " + department);
    }
}

class HR extends Manager {
    void hireEmployee() {
        System.out.println("HR is hiring employees.");
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        HR hrPerson = new HR();
        
        hrPerson.showDetails();   
        hrPerson.showManagerDetails();
        hrPerson.hireEmployee();
    }
}
