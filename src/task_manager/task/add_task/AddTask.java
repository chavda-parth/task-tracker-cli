package task_manager.task.add_task;

import task_manager.constants.TaskStrings;
import task_manager.task.Task;
import task_storage.TaskStorage;

public class AddTask {

    /**
     * Handles addition of Task and all related functions.
     * @param input: Array of Strings
     * @return Output in string format.
     */
    public static String handleAdd(String[] input) {
        String output = validateAdd(input);

        if (output.isBlank()) {
            String description = input[1];
            output += TaskStrings.ADD_SUCCESS.getText() + " (ID: " + addTask(description) + ")";
        }

        return output;
    }

    /**
     * Handles validation of "-add" command.
     * @param input: Array of Strings
     * @return Output string or blank string depending on user provided arguments of "-add" command if any.
     */
    private static String validateAdd(String[] input) {
        int inputLength = input.length;
        String output = "";

        String command = input[0];

        if (inputLength == 1 || input[1].isBlank()) {
            output += TaskStrings.TOO_FEW_ARGS.getText() + command + TaskStrings.CORRECT_USAGE_ADD.getText();
        } else if (inputLength > 2) {
            output += TaskStrings.TOO_MANY_ARGS.getText() + command + TaskStrings.CORRECT_USAGE_ADD.getText();
        } else if (input[1].length() > 100) {
            output += TaskStrings.LONG_DESCRIPTION.getText();
        }

        return output;
    }

    private static int addTask(String description) {
        Task task = new Task(description);

        TaskStorage taskStorage = TaskStorage.getInstance();

        taskStorage.storeTask(task);

        return task.getId();
    }
}
