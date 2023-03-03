package Hw2702;

public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int authoritativeness;

    public Slytherin(String name, String surname, int magic, int wizardry, int transgress, int trick, int determination, int ambition, int ingenuity, int authoritativeness) {
        super(name, surname, magic, wizardry, transgress);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.authoritativeness = authoritativeness;


    }

    public int getTrick() {

        return trick;
    }

    public void setTrick(int trick) {

        this.trick = trick;
    }

    public int getDetermination() {

        return determination;
    }

    public void setDetermination(int determination) {

        this.determination = determination;
    }

    public int getAmbition() {

        return ambition;
    }

    public void setAmbition(int ambition) {

        this.ambition = ambition;
    }

    public int getIngenuity() {

        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {

        this.ingenuity = ingenuity;
    }

    public int getAuthoritativeness() {

        return authoritativeness;
    }

    public void setAuthoritativeness(int authoritativeness) {
        this.authoritativeness = authoritativeness;
    }

    public int sumCharacter() {
        return trick + determination + ambition + ingenuity;
    }

    @Override
    public String toString() {
        return this.getName() + " " +
                this.getSurname() +
                "\n trick =" + trick +
                " \n determination =" + determination +
                " \n ambition =" + ambition +
                " \n ingenuity =" + ingenuity +
                " \n sumCharacter=" + sumCharacter() +
                " \n ";
    }

    public void compareStudentsInFaculty(Slytherin student) {
        if (sumCharacter() > student.sumCharacter()) {
            System.out.println(toString()+ " \n" + student.toString() + " \n " + this.getName() + " " + this.getSurname() + " лучший Слизеринец, чем " + student.getName() + "  " + student.getSurname());
        } else {
            System.out.println(toString() + " \n " + student.toString() + "  " + " \n " + student.getName() + " " + student.getSurname() + " лучший Слизеринец, чем " + this.getName() + " " + this.getSurname());
        }
    }
}