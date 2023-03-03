package Hw2702;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int magic, int wizardry, int transgress, int nobility, int honor, int courage) {
        super(name, surname, magic, wizardry, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }
    public int sumCharacter(){
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return this.getName() + " " +
                this.getSurname() +
                "\n honor=" + honor +
                " \n courage=" + courage +
                " \n sumCharacter=" + sumCharacter() +
                " \n ";
  }




    public void compareStudentsInFaculty(Gryffindor student) {
        if (sumCharacter()> student.sumCharacter()){
            System.out.println(toString()+ " \n" + student.toString() + " \n " + this.getName() + " " + this.getSurname() + " лучший Гриффиндорец, чем " + student.getName() + "  " + student.getSurname());
        }else {
            System.out.println(toString() + " \n " + student.toString() + "  " + " \n " + student.getName() + " " + student.getSurname() + " лучший Гриффиндорец, чем "+ this.getName()+ " " + this.getSurname());
        }

    }

}


