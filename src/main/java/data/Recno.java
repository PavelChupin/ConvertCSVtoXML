package data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

// определяем последовательность тегов в XML
@XmlType(propOrder = {"esRec", "rezEs"})
public class Recno {
    private String esRec;
    private String rezEs;

    public Recno(String esRec, String rezEs) {
        this.esRec = esRec;
        this.rezEs = rezEs;
    }

    @XmlAttribute(name = "IdInfoOR")
    public String getEsRec() {
        return esRec;
    }

    @XmlElement(name = "REZ_ES")
    public String getRezEs() {
        return rezEs;
    }

    public Recno() {
    }

    @Override
    public String toString() {
        return "Recno{" +
                "ES_REC='" + esRec + '\'' +
                ", REZ_ES='" + rezEs + '\'' +
                '}';
    }
}
