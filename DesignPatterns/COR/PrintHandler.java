package COR;

public class PrintHandler extends HelpHandler {
    public PrintHandler(Handler successor) {
        super(successor);
    }

    public void handleRequest(Request request) {
        if (request.getKind().equals("Print")) {
            System.out.println("Printing...");
        } else {
            super.handleRequest(request);
        }
    }
}