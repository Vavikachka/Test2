import java.io.IOException;

public class NoFormatPhone extends IOException {
    public NoFormatPhone() {
        super("Неверный формат введенных данных. Номер телфона не должен содержать знаки и пробелы");
    }
}
