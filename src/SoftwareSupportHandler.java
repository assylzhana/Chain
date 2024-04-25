class SoftwareSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public SoftwareSupportHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType().equals("Software")) {
            System.out.println("Software support team is handling request with ID: " + request.getId());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for request with ID: " + request.getId());
        }
    }
}