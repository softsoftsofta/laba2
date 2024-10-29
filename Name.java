import java.util.Objects;

import static java.lang.System.out;

class Name {

    String lastName;
    String firstName;
    String patronymic;

    public Name(String firstName, String lastName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    void correctionCheck() {
        if (!Objects.equals(patronymic, "")) {
            if ((Objects.equals(firstName, "")) || (Objects.equals(lastName, "")))
                throw new IllegalArgumentException("Имя не может быть составлено таким образом");
        }
        if (!Objects.equals(lastName, "")) {
            if (Objects.equals(firstName, ""))
                throw new IllegalArgumentException("Имя не может быть составлено таким образом");
        }
    }

    void displayInfo() {
        String name = "";

        if (!Objects.equals(lastName, "")) {
            if (!lastName.matches("[а-яА-ЯёЁ]+")) {
                throw new IllegalArgumentException("Могут быть использованы только символы русского алфавита");
            }
            name += lastName + " ";
        }

        if (!Objects.equals(firstName, "")) {
            if (!firstName.matches("[а-яА-ЯёЁ]+")) {
                throw new IllegalArgumentException("Могут быть использованы только символы русского алфавита");
            }
            name += firstName + " ";
        }

        if (!Objects.equals(patronymic, "")) {
            if (!patronymic.matches("[а-яА-ЯёЁ]+")) {
                throw new IllegalArgumentException("Могут быть использованы только символы русского алфавита");
            }
            name += patronymic + " ";
        }

        out.println("Имя: " + name);

    }
}