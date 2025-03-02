//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создаём объекты разных типов военных
        MilitaryPerson person1 = new MilitaryPerson(
                "Иванов",
                "1-я рота",
                "лейтенант",
                new Date(95, 4, 15), // 15 мая 1995 года
                new Date(117, 8, 1), // 1 сентября 2017 года
                "123-й стрелковый полк"
        );

        MilitaryManagement person2 = new MilitaryManagement(
                "Петров",
                "2-я рота",
                "майор",
                new Date(90, 6, 20), // 20 июля 1990 года
                new Date(110, 5, 15), // 15 июня 2010 года
                "Центральный военный округ", // Часть
                "Начальник штаба", // Должность
                12, // Выслуга лет (int)
                5000.0 // Сумма надбавки (double)
        );

        ContractService person3 = new ContractService(
                "Сидоров",
                "3-я рота",
                "сержант",
                new Date(98, 2, 10), // 10 марта 1998 года
                new Date(120, 3, 1), // 1 апреля 2020 года
                "456-й стрелковый полк", // Часть
                "5 лет", // Период договора
                new Date(120, 3, 1), // Дата договора
                "123-456", // Номер протокола
                30000.0 // Сумма зарплаты (double)
        );

        AwardedMilitary person4 = new AwardedMilitary(
                "Кузнецов",
                "4-я рота",
                "капитан",
                new Date(93, 8, 25), // 25 сентября 1993 года
                new Date(115, 7, 10), // 10 августа 2015 года
                "789-й стрелковый полк", // Часть
                "Орден Мужества", // Название награды
                10000.0, // Премия (double)
                2000.0 // Сумма надбавки (double)
        );

        // Создаём список военных
        MilitaryList militaryList = new MilitaryList();
        militaryList.addMilitary(person1);
        militaryList.addMilitary(person2);
        militaryList.addMilitary(person3);
        militaryList.addMilitary(person4);

        // Выводим список военных
        System.out.println("Список военных:");
        militaryList.printMilitaryList();

        // Сортировка по фамилиям
        System.out.println("\nСписок военных, отсортированный по фамилиям:");
        militaryList.sortByLastName();
        militaryList.printMilitaryList();

        // Сортировка по зарплатам
        System.out.println("\nСписок военных, отсортированный по зарплатам:");
        militaryList.sortBySalary();
        militaryList.printMilitaryList();
    }
}