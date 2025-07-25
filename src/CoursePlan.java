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
        float grade = 0;
        for (CourseList sem : semesters) {
            //
        }
        return grade;
    }
}
