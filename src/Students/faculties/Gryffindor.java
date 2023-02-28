package Students.faculties;

import Students.Hogwarts;

// Гриффиндор
public class Gryffindor extends Hogwarts {
    private int nobility, honor, bravery; // благородство, честь, храбрость

    public Gryffindor(String name, int powerMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, powerMagic, transgression);
        faculty = "Гриффиндор";
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }
    @Override
    public int studentScorSpecQualFaculty() {
        return nobility + honor + bravery;
    }
    @Override
    public int totalNumberStudentPoints() {
        return this.getPowerMagicAndTransgression() + nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return generalDataStudents() + "\nБлагородство: " + nobility + "\nЧесть: " + honor + "\nXрабрость: " + bravery;
    }
}
