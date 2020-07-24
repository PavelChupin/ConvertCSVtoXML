package data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

// определяем последовательность тегов в XML
@XmlType(propOrder = {"recnoEs", "rechos"})
public class RecnoList {
    private String recnoEs;
    private List<Recno> rechos;

    public RecnoList() {
    }

    public RecnoList(String recnoEs, List<Recno> rechos) {
        this.recnoEs = recnoEs;
        this.rechos = rechos;
    }

    @XmlAttribute(name = "nRec")
    public String getRecnoEs() {
        return recnoEs;
    }

    @XmlElement(name = "ES_REC")
    public List<Recno> getRechos() {
        return rechos;
    }

    @Override
    public String toString() {
        return "RecnoList{" +
                "RECNO_ES='" + recnoEs + '\'' +
                '}';
    }
}
