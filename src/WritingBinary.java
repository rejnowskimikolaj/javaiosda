import java.io.FileOutputStream;
import java.io.IOException;

public class WritingBinary {

    public static void main(String[] args) {

        String fileName = "tempBin.txt";

        try {
            String bytes = "Binarna linia";
            byte[] buffer = bytes.getBytes();

            FileOutputStream outputStream =
                    new FileOutputStream(fileName);

            outputStream.write(buffer);
            outputStream.close();

            System.out.println("Wrote " + buffer.length +
                    " bytes");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error writing file '"
                            + fileName + "'");
        }
    }
}
