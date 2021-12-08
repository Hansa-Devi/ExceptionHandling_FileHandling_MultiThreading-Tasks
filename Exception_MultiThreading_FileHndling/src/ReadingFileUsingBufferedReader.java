import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFileUsingBufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader bin = new BufferedReader(new FileReader("Myfile.txt"));
        //method 1
//        int ch;
//        while ((ch = bin.read()) != -1){
//            System.out.print((char) ch);
//        }

        //method 2
        String data;
        while ((data = bin.readLine() ) != null){
            System.out.println(data);
        }
        bin.close();
    }
}
