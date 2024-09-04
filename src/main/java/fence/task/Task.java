package fence.task;

public class Task {

    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void complete() {
        this.isDone = true;
    }

    public void undo() {
        this.isDone = false;
    }

    @Override
    public String toString() {
        return "[" + (isDone ? "X" : " ") + "] " + this.description;
    }

    public String toTxt() {
        return "(" + (isDone ? "DONE" : "UNDONE") + ") " + this.description;
    }
}
