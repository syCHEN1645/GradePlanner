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
            Command command = CommandParser.parse(input);
            CommandParser.execute(command);
        }
    }

    public static void addCoursePlan() {
        plans.add(new CoursePlan());
    }


}
