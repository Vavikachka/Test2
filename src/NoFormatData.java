import java.io.IOException;

public class NoFormatData extends IOException {
    public NoFormatData() {
        super("Неверный формат введенных данных. Требуемый вид даты рождения: dd.mm.yyyy");
    }
}
