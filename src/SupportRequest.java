class SupportRequest {
    private int id;
    private String description;
    private String type;
    private int priority;

    public SupportRequest(int id, String description, String type, int priority) {
        this.id = id;
        this.description = description;
        this.type = type;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }
}
