package task_manager.task;


import org.junit.jupiter.api.Test;
import task_manager.constants.TaskStatus;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void toStringTest() {
        Task task = new Task("Test Task");

        assertEquals("Task {id: " + 1 +
                ", description: " + "Test Task" +
                ", status: " + TaskStatus.TODO.getStatus() +
                ", createdAt: " +  task.getCreatedAt() +
                ", updatedAt: " + task.getUpdatedAt(), task.toString());
    }
}