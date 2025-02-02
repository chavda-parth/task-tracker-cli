package task_manager;

import org.junit.jupiter.api.Test;
import task_manager.constants.TaskStrings;
import task_manager.task.Task;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    public void handleInputTest() {
        assertEquals("task-cli: " + TaskStrings.NO_INPUT.getText() + TaskStrings.HELP.getText(), TaskManager.handleInput(new String[]{}));
        assertEquals("task-cli: " + TaskStrings.TOO_FEW_ARGS.getText() + "-add" + TaskStrings.CORRECT_USAGE_ADD.getText(), TaskManager.handleInput(new String[] {"-add"}));
        assertEquals("task-cli: " + TaskStrings.TOO_FEW_ARGS.getText() + "-add  " + TaskStrings.CORRECT_USAGE_ADD.getText(), TaskManager.handleInput(new String[] {"-add  "}));
        assertEquals("task-cli: " + TaskStrings.TOO_MANY_ARGS.getText() + "-add" + TaskStrings.CORRECT_USAGE_ADD.getText(), TaskManager.handleInput(new String[] {"-add", "new", "user"}));
        assertEquals("task-cli: " + TaskStrings.INVALID_INPUT.getText() + "add" + TaskStrings.HELP.getText(), TaskManager.handleInput(new String[] {"add"}));
        assertEquals("task-cli: " + TaskStrings.LONG_DESCRIPTION.getText(), TaskManager.handleInput(new String[] {"-add", "A character can be any letter, number, punctuation, special character, or space. Each of these characters takes up one byte of space in a computer's memory. Some Unicode characters, like emojis and some letters in non-Latin alphabets, take up two bytes of space and therefore count as two characters. Use our character counter tool below for an accurate count of your characters."}));
        assertEquals("task-cli: " + TaskStrings.ADD_SUCCESS.getText() + " (ID: 1)", TaskManager.handleInput(new String[]{"-add", "Buy Groceries"}));
    }
}