import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {

    public static void main(String[] args) {

        String fileName = "src/resources/dore_1516645935369.txt";
        try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

            // write() nie dodaje znaku nowej linii
            bufferedWriter.write("Dear Slim, \n");
            bufferedWriter.write("I wrote you, but you still ain't callin");
            bufferedWriter.newLine();
            bufferedWriter.write("I left my cell, my pager \n");
            bufferedWriter.write("and my home phone at the bottom \n");

            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println( "Error writing to file '"+ fileName + "'");
        }
    }

}
