import java.io.File;
import java.io.IOException;

public class FileHandling_6_CompareLexicographically {
    public static void main(String[] args) throws IOException {
//        File file1 = new File("student.txt");
//        File file2 = new File("student123.txt");

        File file1 = new File("FileWritingExample.java");
        File file2 = new File("FileReadingExample.java");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
        int value = file1.compareTo(file2);
        if ( value == 0)
            System.out.println(file1.getName() + " = "+file2.getName());
        else if(value < 0)
        System.out.println(file1.getName() + " < "+file2.getName() +" by value : "+value);
        else
            System.out.println(file1.getName() + " > "+file2.getName()+" by value : "+value);

    }
}
