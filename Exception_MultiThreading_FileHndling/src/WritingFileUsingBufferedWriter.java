import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileUsingBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bout = new BufferedWriter(new FileWriter("./Myfile.txt",true));
        bout.write(" It's Me Hansa");
        bout.close();
    }
}
