import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling_11_ReadLineByLine {
    public static void main(String[] args) throws IOException {
        File file = new File("../Exception_MultiThreading_FileHndling/src/student.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String fileline;
        while ((fileline = bufferedReader.readLine()) != null)
            System.out.println(fileline);

        bufferedReader.close();

    }
}
