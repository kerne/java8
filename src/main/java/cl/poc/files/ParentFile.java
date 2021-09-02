package cl.poc.files;

import java.io.File;
import java.util.Optional;
import java.util.OptionalInt;

public class ParentFile {
    private static final String HOME = System.getProperty("user.home");
    private static String FILENAME = HOME + "/Documents/cesar/otro/otros";

    public static void main(String[] args) {

        File dir = new File(HOME + File.separator + "Documents" + File.separator + "cesar");
        System.out.println(dir.getParentFile());



    }
}
