package COR;

public interface Handler {
    void handleRequest(Request request);
    void setSuccessor(Handler successor);
}

