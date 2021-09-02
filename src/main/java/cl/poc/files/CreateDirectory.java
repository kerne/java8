package cl.poc.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {
    private static final String HOME = System.getProperty("user.home");
    private static String FILENAME = HOME + "/Documents/cesar/otro/otros";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(FILENAME);

        Path otros = path.resolve("otros");
        if (Files.exists(otros)) {
            Files.delete(otros);

        }
        Path otro = path.resolve("otro");
        if (Files.exists(otro)) {
            Files.delete(otro);

        }
        Files.createDirectory(path);
    }
}

