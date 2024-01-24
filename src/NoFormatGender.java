import java.io.IOException;

public class NoFormatGender extends IOException {
    public NoFormatGender() {
        super("Неверный формат введенных данных. Пол обозначается одной буквой(f или m)");
    }
}
