import build.BuilderKvit;
import data.Kvit;
import helper.FileHelper;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertCSVtoXML {
    public static void main(String[] args) throws IOException, JAXBException {


        Path fileOneIn = Paths.get(args[0]);
        Path fileTwoIn = Paths.get(args[1]);
        Path fileXMLOut  = Paths.get(args[2]);

        //Добавить проверочки что файлы существуют
        FileHelper.checkFileInPath(fileOneIn);
        FileHelper.checkFileInPath(fileTwoIn);

        Kvit k = BuilderKvit.getKvit(fileOneIn, fileTwoIn);

        BuilderKvit.saveXML(fileXMLOut);

        System.out.println(k);
        System.out.println(k.getRechos());
    }
}
