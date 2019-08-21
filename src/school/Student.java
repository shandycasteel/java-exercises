package school;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String studentName;
    private final int studentId;
    private int studentNumberOfCredits;
    private double studentGpa;

    public Student(String studentName, int studentId, int studentNumberOfCredits, double studentGpa) {

        this.studentName = studentName;
        this.studentId = studentId;
        this.studentNumberOfCredits = studentNumberOfCredits;
        this.studentGpa = studentGpa;
    }

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentId = nextStudentId;
        nextStudentId++;
    }


    public String toString() {
        return String.format("ID: " + this.studentId + "\tName: " + this.studentName + "\tGPA: %.2f", this.studentGpa);
    }


    public void addStudentGrade(int courseCredits, double grade) {

        double currentQualityScore = this.getStudentGpa() * this.getStudentNumberOfCredits();
        double classQualityScore = grade * courseCredits;
        double totalQualityScore = classQualityScore + currentQualityScore;

        this.setStudentNumberOfCredits(this.getStudentNumberOfCredits() + courseCredits);
        this.setStudentGpa(totalQualityScore / this.getStudentNumberOfCredits());

    }


    //Equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }


    //Getters and Setters

    public String getStudentGradeLevel() {

        if(this.getStudentNumberOfCredits() >= 90) {
            return "Senior";
        }
        if(this.getStudentNumberOfCredits() >= 60) {
            return "Junior";
        }
        if(this.getStudentNumberOfCredits() >= 30) {
            return "Sophomore";
        }
        else {
            return "Freshman";
        }
    }

    public String getStudentName() {
        return this.studentName;
    }

    private void setStudentName(String name) {
        this.studentName = name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public int getStudentNumberOfCredits() {
        return this.studentNumberOfCredits;
    }

    private void setStudentNumberOfCredits(int numberOfCredits) {
        this.studentNumberOfCredits = numberOfCredits;
    }

    public double getStudentGpa() {
        return this.studentGpa;
    }

    public double setStudentGpa(double studentGpa) {
        return this.studentGpa = studentGpa;
    }
}
