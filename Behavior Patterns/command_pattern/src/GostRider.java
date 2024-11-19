public class GostRider {
    private Command lastCommand;

    public void takeAction(Command command) {
        command.execute();
        lastCommand = command;
    }

    public void revertAction() {
        if (lastCommand != null) {
            lastCommand.revert();
        }
    }
}
