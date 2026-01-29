package Activity2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Student registered: " + Student.getTotalStudents());

        Student student1 = new Student(1, "Jhelianne", "Oligo", "Figuerres", "Female",
                "jheliannefiguerres@gmail.com");
        Student student2 = new Student(2, "Jake", "Makapagal", "Sim", "Male",
                "jakesim@gmail.com");
        Student student3 = new Student(3, "Jungkook", "Bautista", "Jeon", "Male", "jungkookjeon@hmail.com");

        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        System.out.println("Total student registered: " + Student.getTotalStudents());

        System.out.println("University name:" + Course.getSchoolName());

        Course introCom = new Course("CS101", "Introduction to Programming");

        introCom.enrollStudent(student1);
        introCom.enrollStudent(student2);
        introCom.enrollStudent(student3);

        introCom.displayCourseInfo();
    }
}
