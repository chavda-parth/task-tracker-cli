package task_manager;

import task_manager.constants.TaskStrings;

public class TaskManager {
    public static String handleInput(String[] input) {
        String output = "quester: ";

        final int inputLength = input.length;

        if (inputLength == 0) {
            output += TaskStrings.NO_INPUT.getText() + TaskStrings.HELP.getText();
        } else {
            String command = input[0];

            switch (command) {
                case "-add:":
                    if (input[1].isBlank()) {
                        output += TaskStrings.TOO_FEW_ARGS.getText() + command + TaskStrings.CORRECT_USAGE_ADD.getText();
                    } else if (inputLength > 2) {
                        output += TaskStrings.TOO_MANY_ARGS.getText() + command + TaskStrings.CORRECT_USAGE_ADD.getText();
                    }
                    break;
                default:
                    output += TaskStrings.INVALID_INPUT.getText() + TaskStrings.HELP.getText();
            }
        }

        return output;
    }
}
