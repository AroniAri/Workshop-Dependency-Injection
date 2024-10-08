package se.lexicon.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

// Annotate as a Spring Component
@Component
public class ScannerInputService implements UserInputService {

    private final Scanner scanner; // Scanner dependency


    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        return null;
    }

    @Override
    public int getInt() {
        return 0;

    }
}







