import java.util.ArrayList;
import java.util.Scanner;

public class GradePlanner {
    protected static ArrayList<CoursePlan> plans = new ArrayList<>();
    protected static CoursePlan currentPlan;
    protected static Scanner scanner = new Scanner(System.in);

//    public GradePlanner() {
//        if (plans.isEmpty()) {
//            addCoursePlan();
//        }
//        currentPlan = plans.get(0);
//    }

    public static void startProgram() {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals(Command.LIST)) {
                System.out.println("List plan");
                currentPlan.listPlan();
            } else if (input.equals(Command.EXIT) || input.equals(Command.QUIT)) {
                System.out.println("Exit program");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public static void addCoursePlan() {
        plans.add(new CoursePlan());
    }


}
