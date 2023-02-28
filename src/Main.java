import Students.Hogwarts;
import Students.faculties.Gryffindor;
import Students.faculties.Hufflepuff;
import Students.faculties.Ravenclaw;
import Students.faculties.Slytherin;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] griffindors = new Gryffindor[]{
                new Gryffindor("Гарри Поттер", 28, 25, 15, 30, 30),
                new Gryffindor("Гермиона Грейнджер", 35, 25, 10, 28, 30),
                new Gryffindor("Рон Уизли", 20, 15, 25, 23, 15)
        };

        Hufflepuff[] hufflepuffs = new Hufflepuff[]{
                new Hufflepuff("Захария Смит", 27, 20, 32, 23, 17),
                new Hufflepuff("Седрик Диггори", 31, 29, 24, 31, 29),
                new Hufflepuff("Джастин Финч-Флетчли", 22, 12, 19, 34, 21)
        };

        Ravenclaw[] ravenclaws = new Ravenclaw[]{
                new Ravenclaw("Чжоу Чанг", 23, 19, 27, 12, 20, 30),
                new Ravenclaw("Падма Патил", 19, 20, 19, 26, 21, 17),
                new Ravenclaw("Маркус Белби", 28, 24, 25, 29, 24, 9)
        };

        Slytherin[] slytherins = new Slytherin[]{
                new Slytherin("Драко Малфой", 23, 27, 25, 21, 13, 18, 24),
                new Slytherin("Грэхэм Монтегю", 19, 18, 23, 16, 12, 32, 29),
                new Slytherin("Грегори Гойл", 30, 28, 31, 13, 15, 23, 21)
        };

        System.out.println("\nЛучший студент факультета Гриффиндор:");
        System.out.println(Hogwarts.betsStudentFaculty(griffindors));
        System.out.println("\nЛучший студент факультета Пуффендуй:");
        System.out.println(Hogwarts.betsStudentFaculty(hufflepuffs));
        System.out.println("\nЛучший студент факультета Когтевран:");
        System.out.println(Hogwarts.betsStudentFaculty(ravenclaws));
        System.out.println("\nЛучший студент факультета Слизерин:");
        System.out.println(Hogwarts.betsStudentFaculty(slytherins));

        System.out.println("\nСравнение баллов " + griffindors[0].getName() + " и " + slytherins[0].getName() + ":");
        System.out.println(Hogwarts.compareStudents(griffindors[0], slytherins[0]));
    }
}