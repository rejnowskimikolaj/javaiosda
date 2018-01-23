package sols;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {

        String filePath = "src/resources/numbers";
        String line = null;
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while((line = bufferedReader.readLine())!=null){
                boolean lineParsedSuccesfuly = true;
                String[] splits = line.split(";");
                double sum = 0;
                for(String number:splits){
                    try {
                        sum += Double.parseDouble(number);
                    }
                    catch (IllegalArgumentException iae){
                        System.out.println("unable to parse line: "+line);
                        lineParsedSuccesfuly=false;
                        break;
                    }
                }
                if(splits.length!=0&&lineParsedSuccesfuly) {
                    double avg = sum/splits.length;
                    System.out.println(line+": "+avg);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
