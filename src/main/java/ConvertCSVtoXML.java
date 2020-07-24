import build.KvitBuilder;
import data.Kvit;
import helper.FileHelper;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertCSVtoXML {
    public static void main(String[] args) throws IOException, JAXBException {
        if (args.length != 3) {
            System.out.println("Count params not result = 3");
            return;
        }

        Path fileOneIn = Paths.get(args[0]);
        Path fileTwoIn = Paths.get(args[1]);
        Path fileXMLOut = Paths.get(args[2]);

        //Добавить проверочки что файлы существуют
        FileHelper.checkFileInPath(fileOneIn);
        FileHelper.checkFileInPath(fileTwoIn);

        //Получаем разобранный объект
        Kvit k = KvitBuilder.buildKvit(fileOneIn, fileTwoIn);

        //Сохраняем в XML
        FileHelper.saveObjectToXMLFile(fileXMLOut, k);
    }
}
