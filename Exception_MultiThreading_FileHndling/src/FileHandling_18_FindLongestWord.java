import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling_18_FindLongestWord {
    public static void main(String[] args) throws IOException {

        String currentWord;
        String longestWord = "";

        Scanner ip = new Scanner(new File("../Exception_MultiThreading_FileHndling/src/student.txt"));
        while (ip.hasNext()) {
            currentWord = ip.nextLine();
            if (currentWord.length() > longestWord.length())
                longestWord = currentWord;
        }
        System.out.println("Longest word in file is:   "+longestWord);


    }
}
