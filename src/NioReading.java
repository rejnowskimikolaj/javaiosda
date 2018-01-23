import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioReading {

    public static void main(String[] args) {

        Path path = Paths.get("src/main/resources/temp.txt");

        try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){

            String currentLine = null;
            while((currentLine = reader.readLine()) != null){//dopóki jest kolejna linia
                System.out.println(currentLine);
            }
        }catch(IOException ex){
            ex.printStackTrace(); //handle an exception here
        }
    }
}
