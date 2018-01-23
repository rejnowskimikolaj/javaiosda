import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Zad3 {

    public static void main(String[] args) {
        String fileName = "src/resources/numbers";
        String line;
        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                boolean isLineOk = true;

                //2;2.2;6;5.5
                String []numbers = line.split(";");
                double sum=0;
                for(String stringNumber:numbers){
                    try{
                    double number = Double.parseDouble(stringNumber);
                    sum+=number;

                    }
                    catch (NumberFormatException nfe){
                        System.out.println("line couldnt be parsed: "+line+"\n"+"skipping line.");
                        isLineOk = false;
                        break;
                    }

                }

                if(isLineOk){
                    double average = sum/numbers.length;
                    System.out.println("line: "+line+" ,average: "+average);
                }

            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"+ fileName + "'");
        }
    }
}
