import Hw2702.*;

public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Harry", "Potter", 100, 100, 100, 98, 100, 100);
        Gryffindor granger = new Gryffindor("Hermione", "Granger", 70, 100, 100, 100, 97, 87);
        Gryffindor weasley = new Gryffindor("Rom", "Weasley", 85, 90, 98, 78, 99, 67);

        Hufflepuff smith = new Hufflepuff("Zacharia", "Smith", 88, 50, 88, 60, 70, 54);
        Hufflepuff diggory = new Hufflepuff("Cedric", "Diggory", 17, 20, 90, 34, 90, 65);
        Hufflepuff finchfletchley = new Hufflepuff("Justin", "Finch-Fletchley", 35, 40, 19, 88, 69, 33);

        Ravenclaw chang = new Ravenclaw("Zhou", "Chang", 78, 99, 75, 15, 29, 52);
        Ravenclaw patil = new Ravenclaw("Padma", "Patil", 88, 100, 68, 81, 45, 45);
        Ravenclaw belby = new Ravenclaw("Markus", "Belby", 45, 98, 100, 19, 60, 88);

        Slytherin malfoy = new Slytherin("Drako", "Malfoy", 77, 88, 16, 99, 25, 34, 56, 80);
        Slytherin montegue = new Slytherin("Graham", "Montegue", 90, 17, 99, 87, 23, 45, 90, 66);
        Slytherin goyle = new Slytherin("Gragory", "Goyle", 78, 99, 23, 81, 7, 90, 12, 77);


        potter.compareStudentsInFaculty(granger);
        System.out.println();
        smith.compareStudentsInFaculty(finchfletchley);
        System.out.println();
        chang.compareStudentsInFaculty(belby);
        System.out.println();
        malfoy.compareStudentsInFaculty(goyle);
        patil.compareStudents(diggory);


    }

}
