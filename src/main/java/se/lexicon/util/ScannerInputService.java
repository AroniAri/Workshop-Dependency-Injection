package se.lexicon.util;

import java.util.Scanner;

public class ScannerInputService implements UserInputService{
    private final Scanner scanner;

    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        return "";
    }

    @Override
    public int getInt() {
        return 0;
    }
}
