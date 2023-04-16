public class Hogwarts {
    protected String name;
    protected String surname;
    protected int magic;
    protected int transgression;

    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getMagic() {
        return this.magic;
    }
    public int getTransgression() {
        return this.transgression;
    }
    @Override
    public String toString() {
        return "Имя: " + this.name + " " + this.surname + ". Магия: " + this.magic + ". Трансгрессия: " + this.transgression;
    }
    public static void compareHogwartsStudents(Hogwarts student, Hogwarts student2) {
        int sum1 = student.getMagic() + student.getTransgression();
        int sum2 = student2.getMagic() + student2.getTransgression();
        if (sum1 > sum2) {
            System.out.println(student.getName() + " " + student.getSurname() + " обладает большей мощностью магии, чем " + student2.getName() + " " + student2.getSurname());
        } else if (sum2 > sum1) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " обладает большей мощностью магии, чем " + student.getName() + " " + student.getSurname());
        } else System.out.println("Сила магии обоих учеников равна");
    }
}
