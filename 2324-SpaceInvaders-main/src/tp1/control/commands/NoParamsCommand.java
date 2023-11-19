package tp1.control.commands;

public abstract class NoParamsCommand extends Command {

	@Override //en esta funcion se comprueba que el tamaño del array sea solo 1
	// y que la palabra del array coincide
	public Command parse(String[] commandWords) {
		if(commandWords.length == 1) {
			matchCommandName(commandWords[0]);
		}

		return null;
	}
	
}
