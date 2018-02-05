package OCP.ex1;

public class ConsoleLogger implements IMessageLogger{

    @Override
    public void Log(String message) {
        System.out.println(message);
    }
}
