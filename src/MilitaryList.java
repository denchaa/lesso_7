import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MilitaryList {
    private List<MilitaryPerson> militaryList;

    // Конструктор
    public MilitaryList() {
        militaryList = new ArrayList<>();
    }

    // Метод добавления военного
    public void addMilitary(MilitaryPerson person) {
        militaryList.add(person);
    }

    // Метод печати списка военных
    public void printMilitaryList() {
        for (MilitaryPerson person : militaryList) {
            System.out.println(person);
            System.out.println("-----------------------------");
        }
    }

    // Сортировка по фамилиям
    public void sortByLastName() {
        militaryList.sort(Comparator.comparing(MilitaryPerson::getLastName));
    }

    // Сортировка по зарплатам
    public void sortBySalary() {
        militaryList.sort((p1, p2) -> {
            double salary1 = getSalary(p1);
            double salary2 = getSalary(p2);
            return Double.compare(salary1, salary2);
        });
    }

    // Вспомогательный метод для получения зарплаты
    private double getSalary(MilitaryPerson person) {
        if (person instanceof ContractService) {
            return ((ContractService) person).getSalary();
        } else if (person instanceof MilitaryManagement) {
            return ((MilitaryManagement) person).getBonus();
        } else if (person instanceof AwardedMilitary) {
            return ((AwardedMilitary) person).getPrize();
        }
        return 0; // Для обычных военных зарплата не определена
    }
}
