package pl.ordervivi.patterns.strategy;

public class Client {
    private final Logging logging;

    public Client(Logging logging) {
        this.logging = logging;
    }

    public void doSomeWork(final int count) {
        if (count % 2 == 0) {
            logging.write("Even number: " + count);
        }
    }
}
