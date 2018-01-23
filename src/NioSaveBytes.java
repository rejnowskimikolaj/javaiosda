import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioSaveBytes {

    public static void main(String[] args) {
        byte [] bytes = {1,2,3};

        String fileName = "newTemp.bin";
        Path path = Paths.get(fileName);
        try {
            Files.write(path, bytes); //creates, overwrites
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
