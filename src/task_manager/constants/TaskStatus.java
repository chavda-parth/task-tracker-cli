package task_manager.constants;

public enum TaskStatus {
    TODO("todo"),
    IN_PROGRESS("in-progress"),
    DONE("done");

    final String status;

    TaskStatus (String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
