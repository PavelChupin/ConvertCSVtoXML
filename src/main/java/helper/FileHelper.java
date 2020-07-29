package helper;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;
import data.Kvit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static void checkFileInPath(Path path) throws IOException {
        if (!Files.exists(path)) {
            System.out.println("File not found path: " + path);
            throw new IOException("File not found path: " + path);
        }
    }

    public static List<String> readFile(Path path) throws IOException {
        List<String> textString = new ArrayList<>();
        for (String s : Files.readAllLines(path)) {
            if (!"".equals(s)) {
                textString.add(s);
            }
        }
        return textString;
    }

    public static void saveObjectToXMLFile(Path fileOut, Kvit kvit) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Kvit.class);
        Marshaller marshaller = context.createMarshaller();

        //Устанавливаем  кодировку
        marshaller.setProperty(Marshaller.JAXB_ENCODING, StandardCharsets.UTF_8.toString());

        //Убираем standalone из тега заголовка
        //Включаем режим вывода только XML фрагмента без заголовка
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        //Добавляем заголовок в нужном виде
        marshaller.setProperty("com.sun.xml.bind.xmlHeaders","<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

        // устанавливаем флаг для читабельного вывода XML в JAXB
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        //Включаем экранирование символов
        marshaller.setProperty(CharacterEscapeHandler.class.getName(), new CustomCharacterEscapeHandler());

        // маршаллинг объекта в файл
        marshaller.marshal(kvit, fileOut.toFile());
    }
}
