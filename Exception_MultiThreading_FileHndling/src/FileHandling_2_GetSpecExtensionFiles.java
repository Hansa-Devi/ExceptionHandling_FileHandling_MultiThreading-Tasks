import com.sun.deploy.security.SelectableSecurityManager;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Locale;

public class FileHandling_2_GetSpecExtensionFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("src/");
        String [] files = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                if (s.toLowerCase().endsWith(".txt"))
                    return true;
                else
                    return false;
            }
        });
        for (String filename : files) {
            System.out.println(filename);
        }
    }
}
