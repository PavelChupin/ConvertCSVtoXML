package data;

import com.sun.xml.txw2.annotation.XmlCDATA;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

// определяем корневой элемент
@XmlRootElement(name = "KVIT")
// определяем последовательность тегов в XML
@XmlType(propOrder = {"IDNOR", "ES", "SIZE_ES", "DATE_ES", "rechos"})
public class Kvit {
    //Имена файлов
    private String fileNameKvid;
    private String fileNameRecno;

    //Формат файла KVIT
    private String IDNOR;
    private String ES;
    private String SIZE_ES;
    private String DATE_ES;
    private String DATE_KVIT;
    private String TIME_KVIT;
    private String OPER;
    private String TEL_OPER;

    private RecnoList rechos;

    public Kvit(String fileNameKvid, String fileNameRecno, RecnoList rechos, String IDNOR, String ES, String SIZE_ES, String DATE_ES, String DATE_KVIT, String TIME_KVIT, String OPER, String TEL_OPER) {
        this.fileNameKvid = fileNameKvid;
        this.fileNameRecno = fileNameRecno;
        this.rechos = rechos;
        this.IDNOR = IDNOR;
        this.ES = ES;
        this.SIZE_ES = SIZE_ES;
        this.DATE_ES = DATE_ES;
        this.DATE_KVIT = DATE_KVIT;
        this.TIME_KVIT = TIME_KVIT;
        this.OPER = OPER;
        this.TEL_OPER = TEL_OPER;
    }

    public Kvit() {
    }

    @XmlElement(name = "IDNOR")
    public String getIDNOR() {
        return IDNOR;
    }

    @XmlElement(name = "ES")
    public String getES() {
        return ES;
    }

    @XmlElement(name = "SIZE_ES")
    public String getSIZE_ES() {
        return SIZE_ES;
    }

    @XmlElement(name = "DATE_ES")
    public String getDATE_ES() {
        return DATE_ES;
    }

    @XmlTransient
    public String getDATE_KVIT() {
        return DATE_KVIT;
    }

    @XmlTransient
    public String getTIME_KVIT() {
        return TIME_KVIT;
    }

    @XmlTransient
    public String getOPER() {
        return OPER;
    }

    @XmlTransient
    public String getTEL_OPER() {
        return TEL_OPER;
    }

    @XmlTransient
    public String getFileNameKvid() {
        return fileNameKvid;
    }

    @XmlTransient
    public String getFileNameRecno() {
        return fileNameRecno;
    }

    @XmlElement(name = "RECNO_ES")
    public RecnoList getRechos() {
        return rechos;
    }

    @Override
    public String toString() {
        return "Kvit{" +
                "fileNameKvid='" + fileNameKvid + '\'' +
                ", fileNameRecno='" + fileNameRecno + '\'' +
                ", IDNOR='" + IDNOR + '\'' +
                ", ES='" + ES + '\'' +
                ", SIZE_ES='" + SIZE_ES + '\'' +
                ", DATE_ES='" + DATE_ES + '\'' +
                ", DATE_KVIT='" + DATE_KVIT + '\'' +
                ", TIME_KVIT='" + TIME_KVIT + '\'' +
                ", OPER='" + OPER + '\'' +
                ", TEL_OPER='" + TEL_OPER + '\'' +
                ", rechos=" + rechos +
                '}';
    }
}
