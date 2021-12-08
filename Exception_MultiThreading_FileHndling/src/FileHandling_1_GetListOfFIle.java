import java.io.File;
import java.io.IOException;

public class FileHandling_1_GetListOfFIle {
    public static void main(String[] args) throws IOException {
        File file = new File("src/");
        String [] fileList = file.list();
        for (String list : fileList) {
            System.out.println(list);
        }
    }
}
