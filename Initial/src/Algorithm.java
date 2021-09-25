import java.util.*;

public class Algorithm {
    private Database database;

    public Algorithm(Database database) {
        this.database = database;
    }

    public Database getDatabase() {
        return database;
    }

    public static void initialSetUp(Database database) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter University: ");
        String university = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter University Email ID: ");
        String email = scanner.nextLine();
        System.out.println("Enter Courses seperated by commas: ");
        String courses = scanner.nextLine();
        Student newStudent = new Student(university, name, email, courses, database);

        for (Course course : newStudent.getCourses()) {
            for (Student student : course.getStudentList()) {
                int count = student.getCount() + 1;
                student.setCount(count);
                student.getCommonCourses().add(course.getName());
            }
        }

        bubbleSort(database.getCompleteStudentList());

        for (int i = database.getCompleteStudentList().size() - 1; i >= 0; i--) {
            if (database.getCompleteStudentList().get(i).getEmail() != newStudent.getEmail()) {
                System.out.println(database.getCompleteStudentList().get(i).getName() + ", " + database.getCompleteStudentList().get(i).getCount() + " --> " + database.getCompleteStudentList().get(i).getCommonCourses());
            }
        }
    }

    public static void bubbleSort(ArrayList<Student> completeStudentList)
    {
        int n = completeStudentList.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (completeStudentList.get(j).getCount() > completeStudentList.get(j + 1).getCount()) {
                    Student temp = completeStudentList.get(j);
                    completeStudentList.set(j, completeStudentList.get(j + 1));
                    completeStudentList.set(j + 1, temp);
                }
    }

    public static void main(String[] args) {
        Algorithm run = new Algorithm(new Database());
        initialSetUp(run.getDatabase());
    }
}
