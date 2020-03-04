package pl.ordervivi.patterns.strategy;

import java.time.LocalDateTime;

public class Message {
    private static long id = 0;

    public static String logMessage(String message) {
        return new StringBuilder("Log[")
                .append(id++)
                .append("] : [")
                .append(LocalDateTime.now())
                .append("] : ")
                .append(message).toString();
    }
}
