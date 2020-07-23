import data.file_in.Kvit;
import build.BuilderKvit;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertCSVtoXML {
    public static void main(String[] args) throws IOException {

        Path fileOneIn = Paths.get(args[0]);
        Path fileTwoIn  = Paths.get(args[1]);

        //Path fileXMLOut  = Paths.get(args[3]);

        Kvit k = BuilderKvit.parseKvit(fileOneIn,fileTwoIn);

        System.out.println(k);
        System.out.println(k.getRechos());
    }
}
