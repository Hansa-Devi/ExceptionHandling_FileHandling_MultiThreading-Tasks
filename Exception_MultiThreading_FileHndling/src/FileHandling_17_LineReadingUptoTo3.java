import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileHandling_17_LineReadingUptoTo3 {
    public static void main(String[] args)  throws IOException {
        File f = new File("../Exception_MultiThreading_FileHndling/src/student.txt");
        String s ="";
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(f));
        while ((s= lineNumberReader.readLine())!= null && lineNumberReader.getLineNumber() <=3){
            System.out.println(s);
        }
        lineNumberReader.close();

    }
}
