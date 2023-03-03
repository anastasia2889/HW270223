package Hw2702;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int magic, int wizardry, int transgress, int diligence, int loyalty, int honesty) {
        super(name, surname, magic, wizardry, transgress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;


    }

    public int getDiligence() {

        return diligence;
    }

    public void setDiligence(int diligence) {

        this.diligence = diligence;
    }

    public int getLoyalty() {

        return loyalty;
    }

    public void setLoyalty(int loyalty) {

        this.loyalty = loyalty;
    }

    public int getHonesty() {

        return honesty;
    }

    public void setHonesty(int honesty) {

        this.honesty = honesty;
    }

    public int sumCharacter() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return this.getName() + " " +
                this.getSurname() +
                "\n diligence =" + diligence +
                " \n loyalty =" + loyalty +
                " \n honesty =" + honesty +
                " \n sumCharacter=" + sumCharacter() +
                " \n ";
    }

    public void compareStudentsInFaculty(Hufflepuff student) {
        if (sumCharacter() > student.sumCharacter()) {
            System.out.println(toString()+ " \n" + student.toString() + " \n " + this.getName() + " " + this.getSurname() + " лучший Пуффендуец, чем " + student.getName() + "  " + student.getSurname());
        }else {
            System.out.println(toString() + " \n " + student.toString() + "  " + " \n " + student.getName() + " " + student.getSurname() + " лучший Пуффендуец, чем "+ this.getName()+ " " + this.getSurname());
        }

    }
}