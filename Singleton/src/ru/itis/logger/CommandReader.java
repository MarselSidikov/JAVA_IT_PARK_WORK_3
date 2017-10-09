package ru.itis.logger;

import java.util.Scanner;

public class CommandReader {

    private Scanner scanner;

    private Logger logger = Logger.getInstance();

    public CommandReader() {
        scanner = new Scanner(System.in);
    }

    public void readCommand() {
        String command = scanner.next();
        logger.log(this.getClass().getName(), "read command " + command);
    }
}
