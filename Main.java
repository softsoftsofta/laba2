import static java.lang.System.out;

import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main m = new Main();

        out.println("Введите номер задания: ");
        int n = in.nextInt();
        in.nextLine();
        switch (n) {
            case 13, 34:
                out.println("Задание 1.3(3.4). Ввод имён.");
                out.println("Введите имя (обязательно при составлении имени): ");
                String firstName = in.nextLine();

                out.println("Введите фамилию: ");
                String lastName = in.nextLine();

                out.println("Введите отчество (только если была введена фамилия): ");
                String patronymic = in.nextLine();

                Name name = new Name(firstName, lastName, patronymic);
                name.correctionCheck();
                name.displayInfo();
                break;

            case 15:
                out.println("Задание 1.5. Этажи.");
                out.println("Введите число этажей (число этажей не может быть меньше 1): ");
                int floors = in.nextInt();

                House house = new House(floors);
                house.checkFloors();
                house.displayInfo();
                break;

            case 24:
                out.println("Задание 2.4. Сотрудники.");
                Employee.Department itDepartment = new Employee.Department("IT");

                Employee petrov = new Employee("Петров", itDepartment);
                Employee kozlov = new Employee("Козлов", itDepartment);
                Employee sidorov = new Employee("Сидоров", itDepartment);

                itDepartment.setHead(kozlov);

                //itDepartment.setHead(sidorov);
                //Выдаст ошибку, если попытаться сделать больше одного главы отдела

                System.out.println(petrov.toString());
                System.out.println(kozlov.toString());
                System.out.println(sidorov.toString());
                break;

            case 55:
                out.println("Задание 5.5. Дроби.");
                Decimal f1 = new Decimal(2,5);
                Decimal f2 = new Decimal(4,6);
                Decimal f3 = new Decimal(1,5);

                String str1 = f1.getDecimal();
                out.println(str1);
                String str2 = f2.getDecimal();
                out.println(str2);

                Decimal result1 = f1.sum(f2);
                Decimal result2 = f1.minus(f2);
                Decimal result3 = f1.mult(f2);
                Decimal result4 = f1.div(f2);

                Decimal result5 = f1.sum(f2).div(f3).minus(5);

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + n);
        }

    }
}

