public class Task {
    private String name;
    private Priority priority;


    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public void displayDetails(){
        System.out.print("Name: " + name);
        System.out.print(" | ");
        System.out.print("Priority: " + priority);
        System.out.println("");
    }
}
