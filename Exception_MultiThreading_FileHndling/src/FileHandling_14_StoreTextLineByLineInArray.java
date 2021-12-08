import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHandling_14_StoreTextLineByLineInArray {
    public static void main(String[] args) throws IOException {
        File f = new File("../Exception_MultiThreading_FileHndling/src/student.txt");
        if (!f.exists())
            System.out.println("File doesn't exit");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
        String data = "";
        List<String> list = new ArrayList<String>();

        while (data != null){
            data = bufferedReader.readLine();
            if (data == null)
                break;
            list.add(data);
        }
        System.out.println(Arrays.toString(list.toArray()));


    }
}
