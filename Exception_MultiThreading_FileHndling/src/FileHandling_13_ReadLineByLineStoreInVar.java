import java.io.*;

public class FileHandling_13_ReadLineByLineStoreInVar {
    public static void main(String[] args) throws IOException {
        File f = new File("../Exception_MultiThreading_FileHndling/src/student.txt");
        if (!f.exists())
            System.out.println("File doesn't exit");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
        String strVar= "";
        String strData = "";
        while (strData != null) {
            if (strData == null)
                break;
            strVar += strData;
            strData = bufferedReader.readLine();

        }

        System.out.println(strVar);



    }
}
