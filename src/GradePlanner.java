import java.util.ArrayList;
import java.util.Scanner;

public class GradePlanner {
    protected static ArrayList<CoursePlan> plans = new ArrayList<>();
    protected static CoursePlan currentPlan;
    protected static Scanner scanner = new Scanner(System.in);
    protected static boolean active;

    public GradePlanner() {
        if (plans.isEmpty()) {
            addCoursePlan();
        }
        currentPlan = plans.get(0);
        active = true;
    }

    public static void startProgram() {
        while (active) {
            String input = scanner.nextLine();
            Command command = CommandParser.parse(input);
            execute(command);
        }
    }

    protected static void execute(Command command) {
        if (command.getName().equals(Command.LIST)) {
            list((CommandList) command);
        } else if (command.getName().equals(Command.EXIT) || command.getName().equals(Command.QUIT)) {
            quit((CommandQuit) command);
        } else {
            // invalid command
            invalidate();
        }
    }

    protected static void list(CommandList command) {
        currentPlan.listPlan();
    }

    protected static void quit(CommandQuit command) {
        active = false;
    }

    protected static void invalidate() {
        System.out.println("Invalid command");
    }

    protected void addCoursePlan() {
        plans.add(new CoursePlan());
    }


}
