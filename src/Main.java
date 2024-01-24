import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoFormatData, NoFormatPhone, NoFormatGender {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите данные (Фамилия Имя Отчество дата рождения номер телефона пол): ");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        if(data.length!=6){
            System.out.println("Ошибка! Введено неверное количество данных.");
        }

        try {
            String surname = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDate = data[3];
            if(!birthDate.contains(".")){
                throw new NoFormatData();
            }
            String phoneNumber = data[4];
            if(phoneNumber.contains("+") || phoneNumber.contains(" ")){
                throw new NoFormatPhone();
            }
            String gender = data[5];
            if(gender.length()==1){
                throw new NoFormatGender();
            }
            String output = surname + firstName + middleName + birthDate + " " + phoneNumber + gender;

            FileWriter fileWriter = new FileWriter(surname + ".txt");
            fileWriter.write(output);
            fileWriter.close();
        } catch (NoFormatGender e){
            throw new NoFormatGender();
        } catch (NoFormatPhone e){
            throw new NoFormatPhone();
        } catch (NoFormatData e){
            throw new NoFormatData();
        } catch (IOException e) {
            System.out.println("Ошибка! Не удалось создать файл.");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Ошибка! Введены неполные данные.");
        }

        System.out.println("Данные успешно сохранены в файле " + data[0] + ".txt");
    }
    }
