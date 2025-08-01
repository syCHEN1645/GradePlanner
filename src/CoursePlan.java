import java.util.ArrayList;
import java.util.List;

/**
 * CoursePlan is a class that contains a list of CourseList objects.
 * It is like an undergraduate career.
 */
public class CoursePlan {
    protected List<CourseList> semesters = new ArrayList<>();
    protected double target;

    public double getTarget() {
        return this.target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public CoursePlan() {
        for (int i = 0; i < 8; i++) {
            semesters.add(new CourseList());
        }
    }

    public double calculateFixedGrade(int end) {
        if (end > 8 || end <= 0) {
            end = 8;
        }
        double totalGrade = 0;
        int totalCredit = 0;
        for (int i = 0; i < end; i++) {
            CourseList sem = semesters.get(end);
            totalGrade += sem.getFixedSemCredit() * sem.getFixedSemCredit();
            totalCredit += sem.getFixedSemCredit();
        }
        return totalCredit == 0 ? 0 : totalGrade / totalCredit;
    }

    public double calculateFixedGrade() {
        double totalGrade = 0;
        int totalCredit = 0;
        for (CourseList sem : semesters) {
            totalGrade += sem.getFixedSemCredit() * sem.getFixedSemCredit();
            totalCredit += sem.getFixedSemCredit();
        }
        return totalCredit == 0 ? 0 : totalGrade / totalCredit;
    }


    public void addCourse(int sem, Course course) {
        semesters.get(sem).addCourse(course);
    }

    public void deleteCourse(int sem, int index) {
        semesters.get(sem).deleteCourse(index);
    }

    public void listPlan() {
        for (CourseList list : semesters) {
            if (!list.courses.isEmpty()) {
                list.listCourses();
                System.out.println();
            }
        }
    }

    public static void minimumPlan() {

    }

    public double getMinimumAverageGrade() {
        int futureTotalCredit = 0;
        for (CourseList list : semesters) {
            for (Course c : list.courses) {
                if (!c.isFixed()) {
                    futureTotalCredit += c.getCredit();
                }
            }
        }
        double[] pastGradeCredit = getFixedTotalGradeCredit();
        double futureTotalGrade = (pastGradeCredit[1] + futureTotalCredit) * target - pastGradeCredit[0];
        return futureTotalGrade / futureTotalCredit;
    }

    /**
     * Calculates total grade credit product and total credit
     * @return double array {past total grade, past total credit}
     */
    public double[] getFixedTotalGradeCredit() {
        double pastTotalGrade = 0;
        int pastTotalCredit = 0;
        for (CourseList list : semesters) {
            int credit = list.getFixedSemCredit();
            pastTotalGrade += list.getFixedSemGrade() * credit;
            pastTotalCredit += credit;
        }
        return new double[]{pastTotalGrade, (double)pastTotalCredit};
    }

    public double getUnfixedTotalCredit() {
        int pastTotalCredit = 0;
        for (CourseList list : semesters) {
            int credit = list.getUnfixedSemCredit();
            pastTotalCredit += credit;
        }
        return pastTotalCredit;
    }
}
