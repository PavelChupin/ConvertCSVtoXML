package build;

import data.file_in.Kvit;
import data.file_in.Recno;
import helper.FileHelper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BuilderKvit {
    private static List<Recno> parseRecno(List<String> textRecno) {
        List<Recno> recnos = new ArrayList<>();
        for (int i = 1; i < textRecno.size(); i++) {
            String[] arrS = textRecno.get(i).split(",");
            recnos.add(new Recno(arrS[0], arrS[1]));
        }
        return recnos;
    }

    public static Kvit parseKvit(Path fileOneIn, Path fileTwoIn) throws IOException {
        Kvit kvit = null;
        String[] s = FileHelper.readFile(fileOneIn).get(1).split(",");
        kvit = new Kvit(fileOneIn.getFileName().toString()
                , fileTwoIn.getFileName().toString()
                , parseRecno(FileHelper.readFile(fileTwoIn))
                , s[0], s[1], s[2], s[3], s[4], s[5], s[6], s[7], s[8]);
        return kvit;
    }
}
