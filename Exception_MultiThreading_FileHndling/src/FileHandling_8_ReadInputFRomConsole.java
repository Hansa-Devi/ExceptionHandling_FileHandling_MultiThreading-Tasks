import java.io.*;
import java.util.Scanner;

public class FileHandling_8_ReadInputFRomConsole {
    public static void main(String[] args)throws IOException{
        BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String data = bread.readLine();
        System.out.println("Your name: "+data);


    }
}
