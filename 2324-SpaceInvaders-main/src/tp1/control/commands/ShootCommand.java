package tp1.control.commands;

import tp1.control.ExecutionResult;
import tp1.logic.Game;
import tp1.view.Messages;

public class ShootCommand extends NoParamsCommand{

    @Override
    public ExecutionResult execute(Game game) {
      //  game.exit();
        return new ExecutionResult(false);
    }

    @Override
    protected String getName() {
        return Messages.COMMAND_SHOOT_NAME;
    }

    @Override
    protected String getShortcut() {
        return Messages.COMMAND_SHOOT_SHORTCUT;
    }

    @Override
    protected String getDetails() {
        return Messages.COMMAND_SHOOT_DETAILS;
    }

    @Override
    protected String getHelp() {
        return Messages.COMMAND_SHOOT_HELP;
    }

}
