package COR;

public class HelpHandlerA extends HelpHandler {
    public HelpHandlerA(Handler successor) {
        super(successor);
    }

    public void handleRequest(Request request) {
        if (request.getKind().equals("HelpA")) {
            System.out.println("Help A...");
        } else {
            super.handleRequest(request);
        }
    }
}
