package helper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static void checkFileInPath(Path path) throws IOException {
        if(!Files.exists(path)){
            System.out.println("File not found path: " + path);
            throw new IOException("File not found path: " + path);
        }
    }

    public static List<String> readFile(Path path) throws IOException {
        List<String> textString = new ArrayList<>();
        for (String s : Files.readAllLines(path)) {
            if (!"".equals(s)){
                textString.add(s);
            }
        }
        return textString;
    }
}
