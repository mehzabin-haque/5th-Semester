package COR;

public class HelpHandlerB extends HelpHandler {
    public HelpHandlerB(Handler successor) {
        super(successor);
    }

    public void handleRequest(Request request) {
        if (request.getKind().equals("HelpB")) {
            System.out.println("Help B...");
        } else {
            super.handleRequest(request);
        }
    }
}
