package school;

import java.util.ArrayList;
import java.util.Objects;

public class Course {

    private String courseName;
    private String courseNumber;
    private ArrayList<Student> courseRoster;

    public Course(String courseName, String courseNumber) {

        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseRoster = new ArrayList<>();
    }

    public String toString() {
        return String.format("Course Number: " + this.courseNumber + "\tCourse Name: " + this.courseName);
    }

    public boolean addStudent(Student student) {
        if(!this.courseRoster.contains(student)) {
            this.courseRoster.add(student);
            return true;
        }
        return false;
    }

    public void dropStudent(Student student) {
        this.courseRoster.remove(student);
    }

    public void printRoster() {
        for(Student student : courseRoster) {
            System.out.println(student);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseNumber.equals(course.courseNumber) &&
                courseRoster.equals(course.courseRoster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNumber, courseRoster);
    }

    public String getCourseName() {
        return courseName;
    }

    private void setCourseName(String name) {
        this.courseName = name;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    private void setCourseNumber(String number) {
        this.courseNumber = number;
    }

    public ArrayList<Student> getRoster() {
        return courseRoster;
    }

    public void setCourseRoster(ArrayList<Student> courseRoster) {
        this.courseRoster = courseRoster;
    }

    public static void main(String[] args) {
        Course lc101 = new Course("LaunchCode", "LC101");
        Student student1 = new Student("Ada Lovelace");
        Student student2 = new Student("George Boole");
        Student student3 = new Student("Charles Babbage");

        lc101.addStudent(student1);
        lc101.addStudent(student2);
        lc101.addStudent(student3);

        student1.addStudentGrade(3, 4.0);
        student1.addStudentGrade(4, 4.5);
        student2.addStudentGrade(3, 3.0);
        student2.addStudentGrade(4, 3.5);
        student3.addStudentGrade(3, 4.0);
        student3.addStudentGrade(4, 3.0);

        student1.addStudentGrade(90, 4.1);
        student2.addStudentGrade(60, 3.5);
        student3.addStudentGrade(20, 3.2);

        lc101.printRoster();

        System.out.println("\n" + student1.getStudentName() + " is a " + student1.getStudentGradeLevel());
        System.out.println(student2.getStudentName() + " is a " + student2.getStudentGradeLevel());
        System.out.println(student3.getStudentName() + " is a " + student3.getStudentGradeLevel());
    }

}
