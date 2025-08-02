public class CommandParser {
    public static Command parse(String input) {
        String[] words = input.split(" ");
        Command command;
        if (words[0].equals(Command.LIST)) {
            command = new CommandList();
        } else if (words[0].equals(Command.EXIT) || words[0].equals(Command.QUIT)) {
            command = new CommandQuit();
        } else {
            command = new CommandInvalid();
        }
        return command;
    }

}
