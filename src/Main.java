public class Main {
    public static void main(String[] args) {
        Griffindor potter = new Griffindor("Harry", "Potter", 70, 50, 40, 90, 59);
        Griffindor granger = new Griffindor("Hermione", "Granger", 80, 37, 56, 86, 67);
        Griffindor weasley = new Griffindor("Ron", "Weasley", 40, 56, 45, 76, 45);
        Slytherin malfoy = new Slytherin("Draco", "Malfoy", 56, 37, 95, 25, 86, 34, 65);
        Slytherin montegrew = new Slytherin("Graham", "Montegrew", 56, 45, 23, 66, 45, 12, 45);
        Slytherin goil = new Slytherin("Gregory", "Goil", 45, 56, 72, 64, 23, 44, 66);
        Hufflepuff smith = new Hufflepuff("Zakharia", "Smith", 23, 12, 45, 67, 37);
        Hufflepuff diggory = new Hufflepuff("Sedrick", "Diggory", 23, 34, 72, 37, 12);
        Hufflepuff finch = new Hufflepuff("Justin", "Finch-Flatchley", 37, 57, 26, 46, 95);
        Ravenclaw chang = new Ravenclaw("Cho", "Chang", 46, 25, 65, 86, 37, 66);
        Ravenclaw pattil = new Ravenclaw("Padma", "Pattil", 56,25,25,65,35,65);
        Ravenclaw belbi = new Ravenclaw("Marcus", "Belbi", 64, 14, 72, 65, 34, 75);
        System.out.println(belbi);
        Griffindor.compareGriffindorStudents(potter,weasley);
        Hogwarts.compareHogwartsStudents(finch,granger);
        Hufflepuff.compareHufflepuffStudents(diggory,smith);
        Ravenclaw.compareRavenclawStudents(pattil,chang);
        Slytherin.compareSlytherinStudents(malfoy,goil);

    }
}