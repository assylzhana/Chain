class HardwareSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public HardwareSupportHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType().equals("Hardware")) {
            System.out.println("Hardware support team is handling request with ID: " + request.getId());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for request with ID: " + request.getId());
        }
    }
}
