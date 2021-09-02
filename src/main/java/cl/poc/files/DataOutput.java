package cl.poc.files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutput {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/cesararaya/Documents/cesar/java");
        try (
                DataOutputStream os = new DataOutputStream(new FileOutputStream(file));
                DataInputStream is = new DataInputStream((new FileInputStream(file)))
        ) {
            os.writeChars("JAVA");

            int count = is.available();

            byte[] array = new byte[count];

            int a = is.read(array);
            System.out.println(a);
            for (byte b : array) {
                System.out.println((char)b);
            }

        }
    }
}