package Students.faculties;

import Students.Hogwarts;

//Когтевран
public class Ravenclaw extends Hogwarts {
    private int smart, wise, witty, creativity; // ум, мудрость, остроумие и творчество

    public Ravenclaw(String name, int powerMagic, int transgression, int smart, int wise, int witty, int creativity) {
        super(name, powerMagic, transgression);
        faculty = "Когтевран";
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }
    public int getWise() {
        return wise;
    }
    public int getWitty() {
        return witty;
    }
    public int getCreativity() {
        return creativity;
    }

    @Override
    public int studentScorSpecQualFaculty() {
        return smart + wise + witty + creativity;
    }
    @Override
    public int totalNumberStudentPoints() {
        return this.getPowerMagicAndTransgression() + smart + wise + witty + creativity;
    }

    @Override
    public String toString() {
        return generalDataStudents() + "\nУм : " + smart + "\nМудрость: " + wise + "\nОстроумие: " + witty +
                "\nТворчество: " + creativity;
    }
}
