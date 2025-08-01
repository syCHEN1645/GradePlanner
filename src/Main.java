//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GradePlanner.setTarget(4.7);
        GradePlanner.addCourse(1, new Course(4, 4.5, true));
        GradePlanner.addCourse(1, new Course(4, 4.5, true));
        GradePlanner.addCourse(1, new Course(4, 4.5, true));
        GradePlanner.addCourse(1, new Course(4, 5, true));
        GradePlanner.addCourse(2, new Course(4, 0));
        GradePlanner.addCourse(2, new Course(4, 0));
        GradePlanner.addCourse(2, new Course(4, 0));
        GradePlanner.addCourse(2, new Course(4, 0));
        GradePlanner.listPlan();
        System.out.println(GradePlanner.minimumAverageGrade());
    }
}