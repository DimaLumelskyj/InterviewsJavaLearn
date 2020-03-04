package pl.ordervivi.patterns.strategy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogging implements Logging {
    private final File toWrite;

    public FileLogging(File toWrite) {
        this.toWrite = toWrite;
    }

    @Override
    public void write(final String message) {
        try {
            final FileWriter fileWriter = new FileWriter(toWrite);
            fileWriter.write(Message.logMessage(message));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
