import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileHandling_7_GetLastModifiedTime {
    public static void main(String[] args)  throws IOException{
        File file = new File("student.txt");
        Date date = new Date(file.lastModified());
        System.out.println("Last Modified Time: "+ date);

    }
}
