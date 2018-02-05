package OCP.ex1;

public class Logger {
    IMessageLogger iMessageLogger;

    public Logger(IMessageLogger iMessageLogger) {
        this.iMessageLogger = iMessageLogger;
    }

    public void Log(String message){
        iMessageLogger.Log(message);

    }
}
