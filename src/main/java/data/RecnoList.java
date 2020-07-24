package data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

// определяем последовательность тегов в XML
@XmlType(propOrder = {"RECNO_ES", "rechos"})
public class RecnoList {
    private String RECNO_ES;
    private List<Recno> rechos;

    public RecnoList() {
    }

    public RecnoList(String RECNO_ES, List<Recno> rechos) {
        this.RECNO_ES = RECNO_ES;
        this.rechos = rechos;
    }

    @XmlAttribute(name = "nRec")
    public String getRECNO_ES() {
        return RECNO_ES;
    }

    @XmlElement(name = "ES_REC")
    public List<Recno> getRechos() {
        return rechos;
    }

    @Override
    public String toString() {
        return "RecnoList{" +
                "RECNO_ES='" + RECNO_ES + '\'' +
                '}';
    }
}
