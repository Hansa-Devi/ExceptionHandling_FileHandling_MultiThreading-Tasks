import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("./Myfile.txt",true);
        String str = " World";
        char [] chars = str.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            fout.write(chars[i]);
        }
        fout.close();


    }
}
