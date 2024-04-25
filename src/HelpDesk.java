public class HelpDesk {
    private SupportHandler supportHandler;

    public HelpDesk(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }

    public void processRequest(SupportRequest request) {
        supportHandler.handleRequest(request);
    }
}
