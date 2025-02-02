package task_manager;

import task_manager.constants.TaskStrings;
import task_manager.task.add_task.AddTask;

public class TaskManager {
    /**
     * Handles all user input by delegating action specific tasks to other smaller functions.
     * @param input: Array of strings.
     * @return output string containing a description of end result.
     */
    public static String handleInput(String[] input) {
        String output = "task-cli: ";

        final int inputLength = input.length;

        if (inputLength == 0) {
            output += TaskStrings.NO_INPUT.getText() + TaskStrings.HELP.getText();
        } else {
            String command = input[0].trim();

            switch (command) {
                case "-add":
                    output += AddTask.handleAdd(input); // Abstraction of all operations related to add command.
                    break;
                default:
                    output += TaskStrings.INVALID_INPUT.getText() + command + TaskStrings.HELP.getText();
            }
        }

        return output;
    }
}
