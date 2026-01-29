package Activity2;

public class Student { // class named java

    // Instance field
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;

    // static field
    static int totalStudents = 0;

    public Student() {
    }

    // Constructor
    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email) {

        // initialize the instsnce field
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;

        // increment the total students by 1
        totalStudents++;
    }

    // method that prints all the details for a specific student
    public void displayStudentInfo() {
        System.out.println("Name: " + lastName + ", " + firstName + " " + middleName);
        System.out.println("Student Id: " + studentId);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);

    }

    public static int getTotalStudents() {
        return totalStudents;
    }

}