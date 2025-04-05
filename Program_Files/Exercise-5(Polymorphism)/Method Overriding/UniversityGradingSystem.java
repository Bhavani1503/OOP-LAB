class Course {
    protected String courseName;
    protected int creditHours;
    public Course(String name, int credits) {
        this.courseName = name;
        this.creditHours = credits;
    }
    public String calculateGrade(double score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }
    public void displayCourseInfo() {
        System.out.println(courseName + " (" + creditHours + " credits)");
    }
}
class LabCourse extends Course {
    public LabCourse(String name, int credits) {
        super(name, credits);
    }   
    public String calculateGrade(double score) {
        String grade = super.calculateGrade(score);
        if (grade.equals("A") || grade.equals("B")) {
            return grade + "+"; 
        }
        return grade;
    }
}
class PassFailCourse extends Course {
    public PassFailCourse(String name, int credits) {
        super(name, credits);
    }   
    public String calculateGrade(double score) {
        return (score >= 70) ? "Pass" : "Fail";
    }
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Grading: Pass/Fail");
    }
}
public class UniversityGradingSystem {
    public static void main(String[] args) {
        Course math = new Course("Calculus", 4);
        Course physicsLab = new LabCourse("Physics Lab", 2);
        Course ethics = new PassFailCourse("Ethics", 3);       
        System.out.println("=== Course Grades ===");
        math.displayCourseInfo();
        System.out.println("Grade: " + math.calculateGrade(85));
        physicsLab.displayCourseInfo();
        System.out.println("Grade: " + physicsLab.calculateGrade(92));
        
        ethics.displayCourseInfo();
        System.out.println("Grade: " + ethics.calculateGrade(68));
    }
}