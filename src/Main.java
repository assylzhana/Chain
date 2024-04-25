public class Main {
    public static void main(String[] args) {
        SupportHandler networkHandler = new NetworkSupportHandler(null);
        SupportHandler softwareHandler = new SoftwareSupportHandler(networkHandler);
        SupportHandler hardwareHandler = new HardwareSupportHandler(softwareHandler);
        HelpDesk helpDesk = new HelpDesk(hardwareHandler);
        SupportRequest request1 = new SupportRequest(1, "Computer won't start", "Hardware", 1);
        SupportRequest request2 = new SupportRequest(2, "Application crashing", "Software", 2);
        SupportRequest request3 = new SupportRequest(3, "Can't connect to internet", "Network", 1);
        helpDesk.processRequest(request1);
        helpDesk.processRequest(request2);
        helpDesk.processRequest(request3);
    }
}