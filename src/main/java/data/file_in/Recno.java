package data.file_in;

public class Recno {
    private String ES_REC;
    private String REZ_ES;

    public Recno(String ES_REC, String REZ_ES) {
        this.ES_REC = ES_REC;
        this.REZ_ES = REZ_ES;
    }

    public String getES_REC() {
        return ES_REC;
    }

    public String getREZ_ES() {
        return REZ_ES;
    }

    @Override
    public String toString() {
        return "Recno{" +
                "ES_REC='" + ES_REC + '\'' +
                ", REZ_ES='" + REZ_ES + '\'' +
                '}';
    }
}
