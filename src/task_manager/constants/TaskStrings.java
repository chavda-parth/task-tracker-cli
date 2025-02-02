package task_manager.constants;

public enum TaskStrings {
    NO_INPUT("No input provided."),
    HELP("\nFor help, use: task-cli -help"),
    TOO_FEW_ARGS("Too few arguments for "),
    TOO_MANY_ARGS("Too many arguments for "),
    CORRECT_USAGE_ADD("\nCorrect usage: task-cli -add <description>"),
    INVALID_INPUT("Invalid input: "),
    ADD_SUCCESS("Quest added successfully"),
    LONG_DESCRIPTION("Task description is too long. \nMaximum length: 100 characters");

    final String text;

    TaskStrings(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
