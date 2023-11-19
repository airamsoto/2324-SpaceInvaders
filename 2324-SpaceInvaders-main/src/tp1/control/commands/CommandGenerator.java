package tp1.control.commands;

import java.util.Arrays;
import java.util.List;

public class CommandGenerator {

	private static final List<Command> availableCommands = Arrays.asList(
		new HelpCommand(),
		new MoveCommand(),
		new ExitCommand(),
		new ShockwaveCommand(),
		new ShootCommand(),
		new ListCommand(),
		new ResetCommand()
		//TODO fill with your code
	);

	public static Command parse(String[] commandWords) {		
		Command command = null;
		for (Command c: availableCommands) {
			command = c.parse(commandWords);
			if(command != null ) return command;
		}
		return null;

	}
		
	public static String commandHelp() {
		for (Command c: availableCommands) {
			return c.helpText();
		}
		return null;
	}

}
