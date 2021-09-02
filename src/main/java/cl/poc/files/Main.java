package cl.poc.files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Main {

    private static final String HOME = System.getProperty("user.home");


    public static void checkPathWhenFilesExists() {
        Path p = Paths.get(HOME);
        System.out.println(Files.exists(p));
    }

    public static void checkPathWhenFilesNotExists() {
        Path p = Paths.get(HOME + "/java.txt");
        System.out.println(Files.notExists(p));
    }

    public static void checkPermissionReadable() {
        Path p = Paths.get(HOME + "/Documents/cesar/java");
        System.out.println(Files.isReadable(p));
    }

    public static void checkPermissionWriteable() {
        Path p = Paths.get(HOME + "/Documents/cesar/java");
        System.out.println(Files.isWritable(p));
    }

    public static void checkSameFiles() throws IOException {
        Path p2 = Paths.get(HOME + "/Documents/cesar/java");
        Path p1 = Paths.get(HOME + "/Documents/cesar/java");

        System.out.println(Files.isSameFile(p1, p2));
    }


    public static void createFiles() throws IOException {
        Path p2 = Paths.get(HOME + "/Documents/cesar/javaTest");

        if (Files.notExists(p2)) {
            Files.createFile(p2);
        }

        System.out.println(Files.exists(p2));

    }

    public static void createDirectory() throws IOException {

        Path p1 = Paths.get(HOME + "/Documents/cesar/CARPETA2");
        if (!Files.exists(p1)) {
            Files.createDirectory(p1);
        }

        System.out.println(Files.isRegularFile(p1));
        System.out.println(Files.isDirectory(p1));

    }

    public static void checkSubDirectory() throws IOException {

        Path p1 = Paths.get(HOME + "/Documents/cesar/");

        Path subdir = p1.resolve("CARPETA2");

        if (!Files.exists(subdir)) {
            Files.createDirectories(subdir);
        }

        p1.forEach(System.out::println);

    }

    public static void tempFile() throws IOException {
        String prefix = "log_";
        String suffix = ".txt";
        Path p = Paths.get(HOME + "/Documents/cesar/");

        Files.createTempFile(p, prefix, suffix);
    }

    public static void deleteFile() throws IOException {

        Path p = Paths.get(HOME + "/Documents/cesar/borrar");
        if (Files.notExists(p)) {
            Files.createFile(p);
        }

        System.out.println(Files.deleteIfExists(p));
    }

    public static void copy() throws IOException {
        Path dir1 = Paths.get(HOME + "/Documents/cesar/");
        Path dir2 = Paths.get(HOME + "/Documents/cesar/");

        Path file = dir1.resolve("copy1");
        if (Files.notExists(file)) {
            Files.createFile(file);
        }
        Path fileCopied = Paths.get(HOME + "/Documents/cesar/copyOtro");
        Files.copy(file, fileCopied, StandardCopyOption.REPLACE_EXISTING);

        System.out.println(fileCopied.getFileName());

    }

    public static void readFile() throws IOException {
        Path path = Paths.get(HOME + "/Documents/cesar/java");

        if (Files.exists(path)) {

            Files.write(path, "Hola Cesar...".getBytes());

            Files.readAllLines(path).stream().forEach(System.out::println);

        }


    }

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get(HOME+"/Documents");

        System.out.println(p1);

        Path absolute = p1.toAbsolutePath();

        System.out.println(absolute.getFileName());
        System.out.println("X->" + absolute.getNameCount());
    }
}
