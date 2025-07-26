public class GradePlanner {
    protected static CoursePlan plan = new CoursePlan();
    protected static float target;

    public static float getTarget() {
        return target;
    }

    public static void setTarget(float target) {
        GradePlanner.target = target;
    }

    public static void minimumPlan() {
        //
    }

    public static void minimumAverageGrade() {
    }

    public static float calculatePastTotalGrade() {
        float pastTotalGrade = 0;
        for (CourseList list : plan.semesters) {
            for (Course c : list.courses) {

            }
        }
        return pastTotalGrade;
    }
}
