package ht1.student;

public class StudentClass implements Printable{

    public String studentName;
    public int gradeBookNumber;
    public int gPA;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGradeBookNumber() {
        return gradeBookNumber;
    }

    public void setGradeBookNumber(int gradeBookNumber) {
        this.gradeBookNumber = gradeBookNumber;
    }

    public int getGPA() {
        return gPA;
    }

    public void setGPA(int gPA) {
        this.gPA = gPA;
    }

    @Override
    public void print() {
        System.out.println("Student name: " + getStudentName() +
                ", Grade book number: " + getGradeBookNumber() +
                ", GPA: " + getGPA());
    }
}
