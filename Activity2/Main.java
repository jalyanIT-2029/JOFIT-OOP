package Activity2;
public class Main {
    public static void main(String[] args) {

        Student.getTotalStudents();

        Student student1 = new Student(2510123, "Jhelianne", "Figuerres", "Oligo", "Female", "jheliannefiguerres@gmail.com");
        Student student2 = new Student (2510456, "Jake", "Sim", "Makapagal", "Male", "jakesim@gmail.com");
        Student student3 = new Student (2510789, "Jeon", "Jungkook", "Bautista","Male", "jungkookjeon@hmail.com" );

        System.out.println("There's " + Student.getTotalStudents() + " students");

        student1.displayStudentInfo();

        System.out.println("School Name: " + Course.getSchoolName());

        Course introCom = new Course( "CS101", "Introduction to Programming");

        introCom.enrollStudent(student1);
        introCom.enrollStudent(student2);

        introCom.displayCourseInfo();


        
      



        //Student.enrolledStudents = new Product[50];
        //Student.enrolledStudents[0] = student1;
        //Student.enrolledStudents[1] = student2;
        //Student.enrolledStudents[2] = student3;

    }

}
