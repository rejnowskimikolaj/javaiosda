import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Zad2 {
/*

2. Napisz program, który odczyta linie
z pliku z poprzedniego zadania i zapisze je do nowego pliku o nazwie:
<nazwa pliku źródłowego>_<timestamp>.txt
Linie w nowym pliku powinny być "odwrócone",
czyli ostatnia linia z pliku źródłowego będzie pierwszą linią w pliku docelowym.
 Reszta analogicznie.
 */
    public static void main(String[] args) {

        String fileName = "src/resources/dore.txt";
        List<String> lines = new LinkedList<>();
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {

                lines.add(line);
            }

            bufferedReader.close();
            System.out.println("input file: "+lines);
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"+ fileName + "'");
        }

        String newFileName = fileName.split("\\.")[0]+"_"+System.currentTimeMillis()+"."+fileName.split("\\.")[1];

        try {
            FileWriter fileWriter = new FileWriter(newFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
       //     Collections.reverse(lines);
            for(int i=lines.size()-1;i>=0;i--) bufferedWriter.write(lines.get(i)+"\n");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
