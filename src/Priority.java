public enum Priority {
    LOW("Low Urgency"), MEDIUM("Medium Urgency"), HIGH("High Urgency");

    private String description;

    // Constructor
    Priority(String description) {
        this.description = description;
    }

    // Getter method
    public String getDescription() {
        return description;
    }
}
