import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    private static HashMap<String, Course> courseMap = new HashMap<String, Course>();
    private static ArrayList<Student> completeStudentList = new ArrayList<>();

    public HashMap<String, Course> getCourseMap() {
        return this.courseMap;
    }

    public ArrayList<Student> getCompleteStudentList() {
        return this.completeStudentList;
    }

    public Database() {
        Course CS1332 = new Course("CS1332", this);
        Course CS2340 = new Course("CS2340", this);
        Course ECON2105 = new Course("ECON2105", this);
        Course APPH1050 = new Course("APPH1050", this);
        Course PSYC1001 = new Course("PSYC1001", this);
        Course ENGL1102 = new Course("ENGL1102", this);
        Student A = new Student("GATECH", "A", "a@gatech.edu", "CS1332", this);
        Student B = new Student("GATECH", "B", "b@gatech.edu", "CS1332, CS2340", this);
        Student C = new Student("GATECH", "C", "c@gatech.edu", "CS1332, CS2340, ECON2105", this);
        Student D = new Student("GATECH", "D", "d@gatech.edu", "CS1332, CS2340, ECON2105, APPH1050", this);
        Student E = new Student("GATECH", "E", "e@gatech.edu", "CS1332, CS2340, ECON2105, APPH1050, PSYC1001", this);
        Student F = new Student("GATECH", "F", "f@gatech.edu", "CS2340, ECON2105, APPH1050, PSYC1001, ENGL1102", this);
        Student G = new Student("GATECH", "G", "g@gatech.edu", "ECON2105, APPH1050, PSYC1001, ENGL1102", this);
        Student H = new Student("GATECH", "H", "h@gatech.edu", "APPH1050, PSYC1001, ENGL1102", this);
        Student I = new Student("GATECH", "I", "i@gatech.edu", "PSYC1001, ENGL1102", this);
        Student J = new Student("GATECH", "J", "j@gatech.edu", "ENGL1102", this);
    }
}
