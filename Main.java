import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try{
            Scanner in=new Scanner(System.in);
            University<Student>university=new University<>();
            boolean exit=false;
            while(!exit){
                System.out.println("\nMenu:");
                System.out.println("1.  Add Student");
                System.out.println("2.  Add course");
                System.out.println("3.  Add grades for AllStudents");
                System.out.println("4.  Display All Students");
                System.out.println("5.  Display Highest Grade in Course");
                System.out.println("6.  Display for All Student in Course");
                System.out.println("7.  Display Student With Highest Grade in Course");
                System.out.println("8.  Display All Courses");
                System.out.println("9.  Exit");
                System.out.println("Enter Your choice");

                int choice=in.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("Enter Student name: ");
                        String StudentName=in.next();
                        System.out.println("Enter Student ID: ");
                        int studentId=in.nextInt();
                        university.addStudent(new UndergrduateStudent(StudentName,studentId));
                        break;

                    case 2:
                        System.out.println("Enter Course Name: ");
                        String courseName=in.next();
                        university.addCourse(new GenericCourse(courseName));
                        break;

                    case 3:
                        university.addGradesForAllStudents();
                        break;

                    case 4:
                        university.displayAllStudents();
                        break;

                    case 5:
                        System.out.println("Enter The Course Name: ");
                        String highestGradeCourse=in.next();
                        university.displayHighestGradeInCourse(highestGradeCourse);
                        break;

                    case 6:
                        System.out.println("Enter The Course Name: ");
                        String allGradesCouse=in.next();
                        university.displayGradesForAllStudentsInCourse(allGradesCouse);
                        break;

                    case 7:
                        System.out.println("Enter The Course Name: ");
                        String highestGradeStudentCourse=in.next();
                        university.displayStudentWithHighestGradeInCourse(highestGradeStudentCourse);
                        break;

                    case 8:
                        university.displayAllCourses();
                        break;

                    case 9:
                        exit=true;
                        System.out.println("Exiting the program.Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice.please enter a number between 1 and 9");
                        break;
                }
            }
        }
        catch (Exception e){
            System.out.println("An unexpected error occurred:" + e.getMessage());
        }
    }
}