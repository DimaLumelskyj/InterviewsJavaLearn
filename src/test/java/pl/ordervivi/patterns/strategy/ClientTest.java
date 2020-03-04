package pl.ordervivi.patterns.strategy;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ClientTest {

    @Test
    public void useOfConsoleLogging() {
        final Client client = new Client(new ConsoleLogging());
        client.doSomeWork(32);
    }

    @Test
    public void useOfMockConsoleLogging() {
        final Logging mockLogging = mock(Logging.class);
        final Client client = new Client(mockLogging);
        client.doSomeWork(33);
        client.doSomeWork(32);
        verify(mockLogging).write("Even number: 32");
    }

    @Test
    public void useFileLogging() throws IOException {
        final File tmpFile = File.createTempFile("test", "log");
        final Client client = new Client(new FileLogging(tmpFile));
        client.doSomeWork(141);
        client.doSomeWork(142);
        client.doSomeWork(143);

        final BufferedReader reader = new BufferedReader(new FileReader(tmpFile));
        assertTrue(reader.readLine().contains("Even number: 142"));
    }

}