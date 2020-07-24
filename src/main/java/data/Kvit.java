package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

// определяем корневой элемент
@XmlRootElement(name = "KVIT")
// определяем последовательность тегов в XML
@XmlType(propOrder = {"idnor", "es", "sizeEs", "dateEs", "recho","dateKvit","timeKvit","oper","telOper"})
public class Kvit {
    //Имена файлов
    private String fileNameKvid;
    private String fileNameRecno;

    //Формат файла KVIT
    private String idnor;
    private String es;
    private String sizeEs;
    private String dateEs;
    private String dateKvit;
    private String timeKvit;
    private String oper;
    private String telOper;

    private RecnoList recho;

    public Kvit(String fileNameKvid, String fileNameRecno, RecnoList recho, String idnor, String es, String sizeEs, String dateEs, String dateKvit, String timeKvit, String oper, String telOper) {
        this.fileNameKvid = fileNameKvid;
        this.fileNameRecno = fileNameRecno;
        this.recho = recho;
        this.idnor = idnor;
        this.es = es;
        this.sizeEs = sizeEs;
        this.dateEs = dateEs;
        this.dateKvit = dateKvit;
        this.timeKvit = timeKvit;
        this.oper = oper;
        this.telOper = telOper;
    }

    public Kvit() {
    }

    @XmlElement(name = "IDNOR")
    public String getIdnor() {
        return idnor;
    }

    @XmlElement(name = "ES")
    public String getEs() {
        return es;
    }

    @XmlElement(name = "SIZE_ES")
    public String getSizeEs() {
        return sizeEs;
    }

    @XmlElement(name = "DATE_ES")
    public String getDateEs() {
        return dateEs;
    }

    @XmlElement(name = "DATE_KVIT")
    public String getDateKvit() {
        return dateKvit;
    }

    @XmlElement(name = "TIME_KVIT")
    public String getTimeKvit() {
        return timeKvit;
    }

    @XmlElement(name = "OPER")
    public String getOper() {
        return oper;
    }

    @XmlElement(name = "TEL_OPER")
    public String getTelOper() {
        return telOper;
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
    public RecnoList getRecho() {
        return recho;
    }

    @Override
    public String toString() {
        return "Kvit{" +
                "fileNameKvid='" + fileNameKvid + '\'' +
                ", fileNameRecno='" + fileNameRecno + '\'' +
                ", IDNOR='" + idnor + '\'' +
                ", ES='" + es + '\'' +
                ", SIZE_ES='" + sizeEs + '\'' +
                ", DATE_ES='" + dateEs + '\'' +
                ", DATE_KVIT='" + dateKvit + '\'' +
                ", TIME_KVIT='" + timeKvit + '\'' +
                ", OPER='" + oper + '\'' +
                ", TEL_OPER='" + telOper + '\'' +
                ", rechos=" + recho +
                '}';
    }
}
