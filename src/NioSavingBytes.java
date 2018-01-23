import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioSavingBytes {
    public static void main(String[] args) {
        {
            String fileName = "temp.bin";
            Path path = Paths.get(fileName);
            try {
                byte[] bytes = Files.readAllBytes(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
