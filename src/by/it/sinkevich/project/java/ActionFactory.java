package by.it.sinkevich.project.java;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {

    public ActionCommand getCommandFromRequest(HttpServletRequest request) {
        ActionCommand result = new CommandIndex();

        String commandValue = request.getParameter("command");

        if (commandValue != null && !commandValue.isEmpty()) {
            try {
                Action action = Action.valueOf(commandValue.toUpperCase());
                result = action.command;
            } catch (IllegalArgumentException e) {
                result = new CommandError();
                request.setAttribute(Action.errorMessage, "<b>Unknown command " + commandValue + "</b>");
                request.setAttribute(Action.message, "<b>Unknown command " + commandValue + "</b>");
            }
        }
        return result;
    }
}
