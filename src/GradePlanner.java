public class GradePlanner {
    protected static CoursePlan plan = new CoursePlan();
    protected static double target;

    public static double getTarget() {
        return target;
    }

    public static void setTarget(double target) {
        GradePlanner.target = target;
    }

    public static void addCourse(int sem, Course course) {
        plan.semesters.get(sem).addCourse(course);
    }

    public static void deleteCourse(int sem, int index) {
        plan.semesters.get(sem).deleteCourse(index);
    }

    public static void listPlan() {
        for (CourseList list : plan.semesters) {
            if (!list.courses.isEmpty()) {
                list.listCourses();
                System.out.println();
            }
        }
    }

    public static void minimumPlan() {
        //
    }

    public static double minimumAverageGrade() {
        int futureTotalCredit = 0;
        for (CourseList list : plan.semesters) {
            for (Course c : list.courses) {
                if (!c.isFixed()) {
                    futureTotalCredit += c.getCredit();
                }
            }
        }
        double[] pastGradeCredit = calculatePastTotalGradeCredit();
        double futureTotalGrade = (pastGradeCredit[1] + futureTotalCredit) * target - pastGradeCredit[0];
        return futureTotalGrade / futureTotalCredit;
    }

    public static double[] calculatePastTotalGradeCredit() {
        double pastTotalGrade = 0;
        int pastTotalCredit = 0;
        for (CourseList list : plan.semesters) {
            int credit = list.calculateSemCredit();
            pastTotalGrade += list.calculateSemGrade() * credit;
            pastTotalCredit += credit;
        }
        return new double[]{pastTotalGrade, (double)pastTotalCredit};
    }
}
