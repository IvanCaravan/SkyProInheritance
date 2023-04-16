public class Griffindor extends Hogwarts{
    private int nobleness;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int magic, int transgression, int nobleness, int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobleness() {
        return this.nobleness;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getBravery() {
        return this.bravery;
    }
    @Override
    public String toString() {
        return "Имя: " + this.name + " " + this.surname + ". Магия: " + this.magic + ". Трансгрессия: " + this.transgression +
                ", Благородство: " + this.nobleness + ", Честь: " + this.honor + ", Храбрость: " + this.bravery;
    }

    public static void compareGriffindorStudents(Griffindor student, Griffindor student2) {
        int sum1 = student.getNobleness() + student.getHonor() + student.getBravery();
        int sum2 = student2.getNobleness() + student2.getHonor() + student2.getBravery();
        if (sum1 > sum2) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Гриффиндорец, чем " + student2.getName() + " " + student2.getSurname());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший Гриффиндорец, чем " + student.getName() + " " + student.getSurname());
        } else System.out.println("Качества студентов равные");
    }
}
