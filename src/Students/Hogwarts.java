package Students;

import java.util.HashMap;

public abstract class Hogwarts {
    protected int powerMagic, transgression; // сила магии, расстояние транмгрессии
    protected String name, faculty; // имя, факультет

    public Hogwarts(String name, int powerMagic, int transgression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgression = transgression;
    }

    public int getPowerMagic() {
        return powerMagic;
    }
    public int getTransgression() {
        return transgression;
    }
    public String getName() {
        return name;
    }

    protected int getPowerMagicAndTransgression() {
        return powerMagic + transgression;
    } // получить баллы силы магии и трансгрессии

    public abstract int totalNumberStudentPoints(); // общее колличество баллов студента
    public abstract int studentScorSpecQualFaculty(); // баллы студента по особым качествам факультета
    public static Hogwarts betsStudentFaculty(Hogwarts[] students) {
        int j = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[j].studentScorSpecQualFaculty() < students[i].studentScorSpecQualFaculty())
                j = i;
        }
        return students[j];
    } // лучший студент факультета
    public static String compareStudents(Hogwarts student_1, Hogwarts student_2) {
        if (student_1.totalNumberStudentPoints() < student_2.totalNumberStudentPoints())
            return student_2.getName() + " имеет " + student_2.totalNumberStudentPoints() +
                    " баллов больше, чем " + student_1.getName();
        else if (student_1.totalNumberStudentPoints() == student_2.totalNumberStudentPoints())
            return "Колличество баллов у '" + student_1.getName() + "' и '" + student_2.getName() + "' равны.";
        else
            return student_1.getName() + " имеет " + student_1.totalNumberStudentPoints() +
                    " баллов больше, чем " + student_2.getName();
    }
    public String generalDataStudents() {
        return "Имя студента: " + name + "\nФакультет: " + faculty + "\nВсего баллов: " + this.totalNumberStudentPoints() +
                "\nСила магии: " + powerMagic + "\nРасстояние трансгрессии: " + transgression;
    }

    @Override
    public String toString() {
        return generalDataStudents();
    }
}
