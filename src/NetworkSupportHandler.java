class NetworkSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public NetworkSupportHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType().equals("Network")) {
            System.out.println("Network support team is handling request with ID: " + request.getId());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for request with ID: " + request.getId());
        }
    }
}