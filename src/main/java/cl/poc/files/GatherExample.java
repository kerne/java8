package cl.poc.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GatherExample {


    private static final String HOME = System.getProperty("user.home");
    private static String FILENAME = HOME + "/Documents/cesar/java";


    public static void main(String[] args) {
        String stream1 = "Gather data stream first";
        String stream2 = "Gather data stream second";
        ByteBuffer bLen1 = ByteBuffer.allocate(1024);
        ByteBuffer bLen2 = ByteBuffer.allocate(1024);
        // Next two buffer hold the data we want to write
        ByteBuffer bstream1 = ByteBuffer.wrap(stream1.getBytes());
        ByteBuffer bstream2 = ByteBuffer.wrap(stream2.getBytes());
        int len1 = stream1.length();
        int len2 = stream2.length();
        // Writing length(data) to the Buffer
        bLen1.asIntBuffer().put(len1);
        bLen2.asIntBuffer().put(len2);
        System.out.println("Gathering : Len1 = " + len1);
        System.out.println("Gathering : Len2 = " + len2);
        // Write data to the file
        try (FileOutputStream out = new FileOutputStream(FILENAME);
             GatheringByteChannel gather = out.getChannel();) {
            gather.write(new ByteBuffer[]{bLen1, bLen2, bstream1, bstream2});

            Files.readAllLines(Paths.get(FILENAME)).stream().forEach(System.out::println);
        } catch (FileNotFoundException exObj) {
            exObj.printStackTrace();
        } catch (IOException ioObj) {
            ioObj.printStackTrace();
        }
    }
}