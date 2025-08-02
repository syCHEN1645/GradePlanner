public class CommandParser {
    public static Command parse(String input) {
        String[] words = input.split(" ");
        Command command;
        if (words[0].equals(Command.LIST)) {
            command = new CommandList();
        } else if (words[0].equals(Command.EXIT) || words[0].equals(Command.QUIT)) {
            command = new CommandQuit();
        } else if (words[0].equals(Command.ADD)) {
            command = new CommandAdd();
            if (!isAddCommand(words, (CommandAdd)command)) {
                command = new CommandInvalid();
            }
        } else {
            command = new CommandInvalid();
        }
        return command;
    }

    protected static boolean isAddCommand(String[] words, CommandAdd command) {
        // command name, sem, credit, [grade]
        if (words.length < 3) {
            // too little arguments
            return false;
        }
        try {
            command.setSem(Integer.parseInt(words[1]));
        } catch (NumberFormatException e) {
            System.out.println("Argument 2 should be an integer");
            return false;
        }
        try {
            command.setCredit(Integer.parseInt(words[2]));
            command.setFixed(false);
        } catch (NumberFormatException e) {
            System.out.println("Argument 3 should be an integer");
            return false;
        }
        if (words.length >= 4) {
            try {
                command.setGrade(Double.parseDouble(words[3]));
                command.setFixed(true);
            } catch (NumberFormatException e) {
                System.out.println("Argument 4 should be a double");
                return false;
            }
        }
        return true;
    }
}
