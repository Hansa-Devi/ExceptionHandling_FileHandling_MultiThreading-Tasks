import java.io.*;

public class FileHandling_15_WriteAndRead {
    public static void main(String[] args) throws IOException {
        File f = new File("../Exception_MultiThreading_FileHndling/src/student.txt");
        if (!f.exists())
            System.out.println("file Doesn't exit");

        FileWriter fileWriter = new FileWriter(f,true);
        fileWriter.write("\n MUET Jamshoro.\n");
        fileWriter.close();

        String data="";
        String fullData="";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
        while (data != null) {
            if (data == null)
                break;
            fullData += data;
            data = bufferedReader.readLine();
        }
        bufferedReader.close();
        System.out.println("Content After writing in File: \n" + fullData);





    }
}
