package build;

import data.Kvit;
import data.Recno;
import data.RecnoList;
import helper.FileHelper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class KvitBuilder {
    private static RecnoList parseRecno(List<String> textRecno, String recno_ES) {
        List<Recno> recnos = new ArrayList<>();
        for (int i = 1; i < textRecno.size(); i++) {
            String[] arrS = parse(textRecno, i);
            recnos.add(new Recno(arrS[0], arrS[1]));
        }
        return new RecnoList(recno_ES, recnos);
    }

    public static Kvit buildKvit(Path fileOneIn, Path fileTwoIn) throws IOException {
        String[] s = parse(FileHelper.readFile(fileOneIn), 1);
        return new Kvit(fileOneIn.getFileName().toString()
                , fileTwoIn.getFileName().toString()
                , parseRecno(FileHelper.readFile(fileTwoIn), s[4])
                , s[0], s[1], s[2], s[3], s[5], s[6], s[7], s[8]);
    }

    private static String[] parse(List<String> strings, int i) {
        return strings.get(i).split(",");
    }

}
