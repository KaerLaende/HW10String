public class Main {
    public static void main(String[] args) {
//Задание
        String firstName = "Кирилл";
        String lastName = "Вохминов";
        String middleName = "Михайлович";
        String fullName =lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
        System.out.println(fullName.toUpperCase());
        task3();
    }
    private static void task3() {
        String firstName = "Семён";
        String lastName = "Иванов";
        String middleName = "Семёнович";
        String fullName =lastName+" "+firstName+" "+middleName;
        fullName=fullName.replace('ё','е');

        System.out.println("ФИО сотрудника — " + fullName);
    }


// Код-пример с видеоУрока <-уже привычка с большой буквы писать=))
    private static void example() {
        String phone = "9604157537";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
// Убираем возможные пробелы в номере телефона
        phone = phone.replace("+", "");
// Убираем плюс (+), который может ввести пользователь
        if (phone.length() == 11) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        String expectedPhone = "79604157537";
// Записываем строку expectedPhone («ожидаемыйТелефон»)
        if (phone.equals(expectedPhone)) {
// Сравниваем phone с expectedPhone с помощью метода equals()
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println("phone = " + phone);


        System.out.println("Hello world!");
    }
}