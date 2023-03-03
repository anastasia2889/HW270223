package Hw2702;

public class Hogwarts {
    private String name;
    private String surname;
    private int magic;
    private int wizardry;
    private int transgress;

    public Hogwarts(String name, String surname, int magic, int wizardry, int transgress) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.wizardry = wizardry;
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magic=" + magic +
                ", wizardry=" + wizardry +
                ", transgress=" + transgress +
                '}';
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;

    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;

    }

    public int getWizardry() {
        return wizardry;
    }

    public void setWizardry(int wizardry) {

        this.wizardry = wizardry;
    }

    public int getTransgress() {

        return transgress;
    }

    public void setTransgress(int transgress) {

        this.transgress = transgress;
    }

    private int sumCharater() {
        return wizardry + transgress;
    }

    public String property() {
        return this.wizardry +
                " \n transgress=" + transgress +
                " \n ";
    }

    public final void compareStudents(Hogwarts student) {
        if (sumCharater() > student.sumCharater()) {
            System.out.println(this.getName() + " " + this.getSurname() + property() + " \n" + student.name + "  " + student.surname + student.property() + this.name + " " + this.surname + " большей мощностью магии, чем " + student.name + " " + student.surname);
        } else {
            System.out.println(this.getName() + " " + this.getSurname() + property() + " \n " + student.property() + " \n " + student.name + "  " + student.surname + " большей мощьностью магии, чем " + this.name + " " + this.surname);
        }
    }
}
