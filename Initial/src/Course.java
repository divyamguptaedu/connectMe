import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> studentList;

    public Course(String name, Database database) {
        this.name = name;
        this.studentList = new ArrayList<Student>();
        database.getCourseMap().put(name, this);
    }

    //getters
    public String getName() {
        return this.name;
    }

    public ArrayList<Student> getStudentList() {
        return this.studentList;
    }

    //setName
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
