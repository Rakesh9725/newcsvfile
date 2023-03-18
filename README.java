package file;
import java.io.*;
public class csv {
   public static final String delimiter = ",";
   public static void read(String csvFile) {
      try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";
         String[] tempArr;
         while((line = br.readLine()) != null) {
            tempArr = line.split(delimiter);
            for(String word : tempArr) {
               System.out.print(word + " ");
            }
            System.out.println();
         }
         br.close();
         } catch(IOException e) {
            e.printStackTrace();
         }
   }
   public static void main(String[] args) {
      
      String csvFile = "C:\\Users\\Rakesh\\Desktop\\csvfile.csv";
       csv.read(csvFile);
   }
}
