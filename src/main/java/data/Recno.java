package data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

// определяем последовательность тегов в XML
@XmlType(propOrder = {"ES_REC","REZ_ES"})
public class Recno {
    private String ES_REC;
    private String REZ_ES;

    public Recno(String ES_REC, String REZ_ES) {
        this.ES_REC = ES_REC;
        this.REZ_ES = REZ_ES;
    }

    @XmlAttribute(name = "IdInfoOR")
    public String getES_REC() {
        return ES_REC;
    }

    @XmlElement(name = "REZ_ES")
    public String getREZ_ES() {
        return REZ_ES;
    }

    public Recno() {
    }

    @Override
    public String toString() {
        return "Recno{" +
                "ES_REC='" + ES_REC + '\'' +
                ", REZ_ES='" + REZ_ES + '\'' +
                '}';
    }
}
