package Students.faculties;

import Students.Hogwarts;

//Пуффендуй
public class Hufflepuff extends Hogwarts {
    private int diligence, loyalty, honesty;//  трудолюбие, верность, честность

    public Hufflepuff(String name, int powerMagic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, powerMagic, transgression);
        faculty = "Пуффендуй";
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }

    @Override
    public int studentScorSpecQualFaculty() {
        return diligence + loyalty + honesty;
    }
    @Override
    public int totalNumberStudentPoints() {
        return this.getPowerMagicAndTransgression() + diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return generalDataStudents() + "\nТрудолюбие: " + diligence + "\nВерность: " + loyalty + "\nЧестность: " + honesty;
    }
}
