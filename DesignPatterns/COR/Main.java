package COR;

public class Main {
    public static void main(String[] args) {
        Handler printHandler = new PrintHandler(null);
        Handler helpHandlerA = new HelpHandlerA(printHandler);
        Handler helpHandlerB = new HelpHandlerB(helpHandlerA);

        Request printRequest = new Request("Print");
        Request helpRequestA = new Request("HelpA");
        Request helpRequestB = new Request("HelpB");

        helpHandlerB.handleRequest(printRequest);
        helpHandlerB.handleRequest(helpRequestA);
        helpHandlerB.handleRequest(helpRequestB);
    }
}
