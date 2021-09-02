package cl.poc.files;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MkDirsPoc {

    private static String PATH_HOME = System.getProperty("user.home");

    public static void main(String[] args) throws IOException {
        Console console = System.console();
        String name = console.readLine("What's your name? ");
        System.out.printf("You entered: %s", name);


    }
}
