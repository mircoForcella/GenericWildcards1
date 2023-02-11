import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(2.1);
        individualMarksListLisa.add(13.5);
        Student lisaStudent = new Student("Lisa", "Stuart", Student.getAverageMark(individualMarksListLisa));

        ArrayList<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(7);
        projectMarksListJeremy.add(26);
        Student jeremyStudent = new Student("Jeremy","Green",Student.getAverageMark(projectMarksListJeremy));

        ArrayList<Student> listOfStudents= new ArrayList();
        listOfStudents.add(lisaStudent);
        listOfStudents.add(jeremyStudent);

        System.out.println(listOfStudents.get(0).toString());
        System.out.println(listOfStudents.get(1).toString());

    }
}
