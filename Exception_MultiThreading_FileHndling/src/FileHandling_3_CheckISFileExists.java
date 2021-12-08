import java.io.File;
import java.io.IOException;

public class FileHandling_3_CheckISFileExists {
    public static void main(String[] args) throws IOException {
        File f = new File("../Exception_MultiThreading_FileHndling/src/student.txt");
        if (f.exists()) {
            System.out.println("File exists");
            System.out.println(f.length());
        }
        else
            System.out.println("File Doesn't exit");
    }
}
