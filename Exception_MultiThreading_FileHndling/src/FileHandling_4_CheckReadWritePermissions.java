import java.io.File;
import java.io.IOException;

public class FileHandling_4_CheckReadWritePermissions {
    public static void main(String[] args) throws IOException {
        File file = new File("src/student.txt");
        System.out.println("Have Read Permissions? "+file.getAbsolutePath()+" : "+file.canRead());
        System.out.println("Have Write Permissions? "+file.getAbsolutePath()+" : "+file.canWrite());
    }
}
