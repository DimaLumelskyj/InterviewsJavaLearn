package pl.ordervivi.patterns.strategy;

public class ConsoleLogging implements Logging {
    @Override
    public void write(final String message) {
        System.out.println(Message.logMessage(message));
    }
}
