import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoursePlan plan = new CoursePlan();
        plan.setTarget(4.7);
        plan.addCourse(1, new Course(4, 4.5, true));
        plan.addCourse(1, new Course(4, 4.5, true));
        plan.addCourse(1, new Course(4, 4.5, true));
        plan.addCourse(1, new Course(4, 5, true));
        plan.addCourse(2, new Course(4, 0));
        plan.addCourse(2, new Course(4, 0));
        plan.addCourse(2, new Course(4, 0));
        plan.addCourse(2, new Course(4, 0));
        plan.listPlan();
        System.out.println(plan.getMinimumAverageGrade());
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
        System.out.println("!");
        System.out.println(scanner.nextLine());
        System.out.println("!");
    }
}