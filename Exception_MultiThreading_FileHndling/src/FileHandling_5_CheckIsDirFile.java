import java.io.File;
import java.io.IOException;

public class FileHandling_5_CheckIsDirFile {
    public static void main(String[] args) throws IOException {
        File f= new File("src");
        if (f.isFile())
            System.out.println("path is file");
        else if (f.isDirectory())
            System.out.println("path is directory");
        else
            System.out.println("nothing");
    }
}
