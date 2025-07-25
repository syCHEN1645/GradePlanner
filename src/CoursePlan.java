import java.util.ArrayList;
import java.util.List;

public class CoursePlan {
    protected List<CourseList> semesters = new ArrayList<>();

    public CoursePlan() {
        for (int i = 0; i < 8; i++) {
            semesters.add(new CourseList());
        }
    }

    public float calculateGrade(int end) {
        float grade = 0;
        for (int i = 0; i < end; i++) {
            //
        }
        return grade;
    }

    public float calculateGrade() {
        float totalGrade = 0;
        int totalCredit = 0;
        for (CourseList sem : semesters) {
            totalGrade += sem.calculateSemCredit() * sem.calculateSemCredit();
            totalCredit += sem.calculateSemCredit();
        }
        return totalCredit == 0 ? 0 : totalGrade / totalCredit;
    }
}
