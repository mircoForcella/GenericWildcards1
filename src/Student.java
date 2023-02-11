import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private String studentSurname;
    private double marksAverage;

    public Student(String studentName, String studentSurname, double marksAverage) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }

    public static double getAverageMark(List<? extends Number>listOfMarks ){
        return (listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue())/2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public double getMarksAverage() {
        return marksAverage;
    }

    public void setMarksAverage(double marksAverage) {
        this.marksAverage = marksAverage;
    }
}
