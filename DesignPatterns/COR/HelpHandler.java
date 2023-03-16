package COR;

public abstract class HelpHandler implements Handler {
    private Handler successor;

    public HelpHandler(Handler successor) {
        this.successor = successor;
    }

    public void handleRequest(Request request) {
        if (successor != null) {
            successor.handleRequest(request);
        }
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
