import java.util.ArrayList;
import java.util.List;

public class CoursePlan {
    protected List<CourseList> semesters = new ArrayList<>();

    public CoursePlan() {
        for (int i = 0; i < 8; i++) {
            semesters.add(new CourseList());
        }
    }

    public double calculateGrade(int end) {
        if (end > 8 || end <= 0) {
            end = 8;
        }
        double totalGrade = 0;
        int totalCredit = 0;
        for (int i = 0; i < end; i++) {
            CourseList sem = semesters.get(end);
            totalGrade += sem.calculateSemCredit() * sem.calculateSemCredit();
            totalCredit += sem.calculateSemCredit();
        }
        return totalCredit == 0 ? 0 : totalGrade / totalCredit;
    }

    public double calculateGrade() {
        double totalGrade = 0;
        int totalCredit = 0;
        for (CourseList sem : semesters) {
            totalGrade += sem.calculateSemCredit() * sem.calculateSemCredit();
            totalCredit += sem.calculateSemCredit();
        }
        return totalCredit == 0 ? 0 : totalGrade / totalCredit;
    }
}
