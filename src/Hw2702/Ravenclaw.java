package Hw2702;

public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;

    public Ravenclaw(String name, String surname, int magic, int wizardry,int transgress, int mind, int wisdom, int wit) {

        super(name, surname, magic, wizardry, transgress);
        this.mind =mind;
        this.wisdom =wisdom;
        this.wit = wit;
    }
    public int getMind(){
        return mind;
    }
    public void setMind(int mind){

        this.mind= mind;
    }
    public int getWisdom(){

        return wisdom;
    }
    public void setWisdom(int wisdom){

        this.wisdom = wisdom;
    }
    public int getWit(){

        return wit;
    }
    public void setWit(int wit){

        this.wit = wit;
    }
    public int sumCharacter() {
        return mind + wisdom + wit;
    }

    @Override
    public String toString() {
        return this.getName() + " " +
                this.getSurname() +
                "\n mind =" + mind +
                " \n wisdom =" + wisdom +
                " \n wit =" + wit +
                " \n sumCharacter=" + sumCharacter() +
                " \n ";
    }
    public void compareStudentsInFaculty(Ravenclaw student) {
        if (sumCharacter() > student.sumCharacter()) {
            System.out.println(toString()+ " \n" + student.toString() + " \n " + this.getName() + " " + this.getSurname()+ " лучший Коктевранец, чем " + student.getName() + "  " + student.getSurname());
        } else {
            System.out.println(toString() + " \n " + student.toString() + "  " + " \n " + student.getName() + " " + student.getSurname()+ " лучший Коктевранец, чем " + this.getName() + " " + this.getSurname());
        }
    }
}