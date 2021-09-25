import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Student {
    private String university;
    private String name;
    private String email;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<String> commonCourses;
    private int count = 0;

    public Student(String university, String name, String email, String courses, Database database) {
        this.university = university;
        this.name = name;
        this.email = email;
        String[] courseArray = courses.split(", ");
        ArrayList<Course> coursesArrayList = new ArrayList<>();
        for (String course : courseArray) {
            coursesArrayList.add(database.getCourseMap().get(course));
        }
        this.courses = coursesArrayList;
        this.count = 0;
        this.commonCourses = new ArrayList<String>();
        database.getCompleteStudentList().add(this);
        for (Course course : this.courses) {
            course.getStudentList().add(this);
        }
    }
    //getters
    public String getUniversity() {
        return this.university;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public int getCount() {
        return this.count;
    }

    public ArrayList<String> getCommonCourses() {
        return this.commonCourses;
    }

    //setters
    public void setUniversity(String university) {
        this.university = university;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
