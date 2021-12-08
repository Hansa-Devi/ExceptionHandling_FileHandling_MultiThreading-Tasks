import java.io.File;
import java.io.IOException;

public class FileHandlingBasicProgram {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:/Users/User/IdeaProjects/Exception_MultiThreading_FileHndling/src/Student.txt");
        f1.createNewFile();
        System.out.println(f1.exists());
        System.out.println(f1.length());
        System.out.println(f1.canWrite());
        System.out.println(f1.delete());
        System.out.println(f1.exists());


    }
}
