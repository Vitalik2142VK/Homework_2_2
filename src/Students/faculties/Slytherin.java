package Students.faculties;

import Students.Hogwarts;

//Слизерин
public class Slytherin extends Hogwarts {
    private int cunning, determination, ambition, resourcefulness, thirstPower; // хитрость, решительность, амбициозность, находчивость, жажда власти

    public Slytherin(String name, int powerMagic, int transgression, int cunning, int determination, int ambition,
              int resourcefulness, int thirstPower) {
        super(name, powerMagic, transgression);
        faculty = "Слизерин";
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getThirstPower() {
        return thirstPower;
    }

    @Override
    public int studentScorSpecQualFaculty() {
        return cunning + determination + ambition + resourcefulness + thirstPower;
    }
    @Override
    public int totalNumberStudentPoints() {
        return this.getPowerMagicAndTransgression() + cunning + determination + ambition + resourcefulness + thirstPower;
    }

    @Override
    public String toString() {
        return generalDataStudents() + "\nХитрость: " + cunning + "\nРешительность: " + determination +
                "\nАмбициозность: " + ambition + "\nНаходчивость: " + resourcefulness + "\nЖажда власти: " + thirstPower;
    }
}
