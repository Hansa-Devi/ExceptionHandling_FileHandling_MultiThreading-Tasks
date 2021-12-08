// Java program to get file size in bytes, kb, mb.

import java.io.File;
import java.io.IOException;

public class FileHandling_9_FileSize {
   private static long fileSizeInBytes(File file){
    long size = file.length();
    return size;
}
    private static long fileSizeInKilobytes(File file){
        long size = file.length()/1024;
        return size;
    }
    private static long fileSizeInMegabytes(File file){
        long size = file.length()/(1024*1024);
        return size;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("../Exception_MultiThreading_FileHndling/src/student.txt");
        if (file.exists()){
            System.out.println("Size in bytes: "+fileSizeInBytes(file));
            System.out.println("Size in kb "+fileSizeInKilobytes(file));
            System.out.println("Size in mb "+fileSizeInMegabytes(file));
        }
        else
            System.out.println("File doesn't exit");

    }
}
