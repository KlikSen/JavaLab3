package task1;

import java.util.List;

public class UncheckedException extends RuntimeException{
    private final ErrorCode errorCode;

    public UncheckedException(final List<String> messages, final ErrorCode errorCode) {
        super(messages.toString());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return "UncheckedException{" +
                "errorCode=" + errorCode + "\nmessage = " + getMessage() +
                '}';
    }
}
