import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {
    private OffsetDateTime data;

    public Data(OffsetDateTime data){
        this.data = data;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public String fullData(){
        String dataStringFull = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.SHORT).localizedBy(Locale.ITALIAN));
        return dataStringFull;
    }

    public String mediumData(){
        String dataStringMedium = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).localizedBy(Locale.ITALIAN));
        return dataStringMedium;
    }
    public String shortData(){
        String dataStringShort = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).localizedBy(Locale.ITALIAN));
        return dataStringShort;
    }
}
