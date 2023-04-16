public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return this.industriousness;
    }

    public int getLoyalty() {
        return this.loyalty;
    }

    public int getHonesty() {
        return this.honesty;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + " " + this.surname + ". Магия: " + this.magic + ". Трансгрессия: " + this.transgression +
                ", Трудолюбие: " + this.industriousness + ", Верность: " + this.loyalty + ", Честность: " + this.honesty;
    }
    public static void compareHufflepuffStudents (Hufflepuff student, Hufflepuff student2) {
        int sum1 = student.getIndustriousness() + student.getLoyalty() + student.getHonesty();
        int sum2 = student2.getIndustriousness() + student2.getHonesty() + student2.getLoyalty();
        if (sum1 > sum2) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Пуффендуец, чем " + student2.getName() + " " + student2.getSurname());
        } else if (sum2 > sum1) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший Пуффендуец, чем " + student.getName() + " " + student.getSurname());
        } else System.out.println("Качества студентов равные");
    }
}