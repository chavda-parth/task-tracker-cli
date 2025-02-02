package task_manager.task;

import task_manager.constants.TaskStatus;

import java.util.Date;

public class Task {
    private int lastAssignedId = 0;
    private int id;
    private String description;
    private TaskStatus status;
    private Date createdAt;
    private Date updatedAt;

    public Task(String description) {
        this.id = ++lastAssignedId;
        this.description = description;
        this.status = TaskStatus.TODO;
        this.createdAt = this.updatedAt = new Date();
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Task {id: " + this.id +
                ", description: " + this.description +
                ", status: " + this.status.getStatus() +
                ", createdAt: " + this.createdAt +
                ", updatedAt: " + this.updatedAt;
    }
}
