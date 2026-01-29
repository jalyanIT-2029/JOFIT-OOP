package Activity2;

public class Course {
    String courseCode;
    String courseTitle;
    Student[] enrolledStudents;
    int enrollmentCount = 0;
    static String schoolName = " LORMA Colleges";

    public static Course course1;

    public Course() {
    }

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];
    }

    public void enrollStudent(Student student) {
        if (enrollmentCount < enrolledStudents.length) {
            enrolledStudents[enrollmentCount] = student;
            enrollmentCount++;
        } else {
            System.out.println("This course has reached its limit.");
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseCode + "-" + courseTitle);
        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println("- " + enrolledStudents[i].firstName + " " + enrolledStudents[i].middleName + " "
                    + enrolledStudents[i].lastName);
        }
    }

    public static String getSchoolName() {
        return schoolName;
    }
}
