import java.util.*;
class UndergrduateStudent extends Student{
    private List<Integer> grades;
    public UndergrduateStudent(String studentName, int studentId) {
        super(studentName, studentId);
        this.grades=new ArrayList<>();
    }
    @Override
    public void addGrades(List<Course> courses) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (Course course : courses) {
            System.out.print("Enter grade for " + course.getName() + " (between 0 and 20): ");
            int grade = scanner.nextInt();
            // Validate the grade (assuming a grade is between 0 and 20)
            while (grade < 0 || grade > 20) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 20.");
                System.out.print("Enter grade for " + course.getName() + ": ");
                grade = scanner.nextInt();
            }
            grades.add(grade);
        }
    }

    @Override
    public int getGrade(int courseIndex) {
        return grades.get(courseIndex);
    }
}


