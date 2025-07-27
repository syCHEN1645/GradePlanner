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

    public static float minimumAverageGrade() {
        int futureTotalCredit = 0;
        for (CourseList list : plan.semesters) {
            for (Course c : list.courses) {
                if (!c.isFixed()) {
                    futureTotalCredit += c.getCredit();
                }
            }
        }
        float[] pastGradeCredit = calculatePastTotalGradeCredit();
        float futureTotalGrade = (pastGradeCredit[1] + futureTotalCredit) * target - pastGradeCredit[0];
        return futureTotalGrade / futureTotalCredit;
    }

    public static float[] calculatePastTotalGradeCredit() {
        float pastTotalGrade = 0;
        int pastTotalCredit = 0;
        for (CourseList list : plan.semesters) {
            int credit = list.calculateSemCredit();
            pastTotalGrade += list.calculateSemGrade() * credit;
            pastTotalCredit += credit;
        }
        return new float[]{pastTotalGrade, (float)pastTotalCredit};
    }
}
