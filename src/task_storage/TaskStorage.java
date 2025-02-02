package task_storage;

import task_manager.task.Task;

import java.util.ArrayList;

public class TaskStorage {
    private static TaskStorage storage_instance = null;

    private ArrayList<Task> tasksList;

    private TaskStorage() {
        this.tasksList = new ArrayList<>();
    }

    public static synchronized TaskStorage getInstance() {
        if (storage_instance == null) {
            storage_instance = new TaskStorage();
        }

        return storage_instance;
    }

    public void storeTask(Task task) {
        tasksList.add(task);
    }
}
