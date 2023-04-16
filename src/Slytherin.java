public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return this.cunning;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbition() {
        return this.ambition;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public int getLustForPower() {
        return this.lustForPower;
    }
    @Override
    public String toString() {
        return "Имя: " + this.name + " " + this.surname + ". Магия: " + this.magic + ". Трансгрессия: " + this.transgression +
                ", Хитрость: " + this.cunning + ", Решительность: " + this.determination + ", Амбициозность: " + this.ambition +", Находчивость: " + this.resourcefulness + ", Жажда власти: " + this.lustForPower;
    }

    public static void compareSlytherinStudents (Slytherin student, Slytherin student2) {
        int sum1 = student.getAmbition() + student.getCunning() + student.getDetermination() + student.getResourcefulness() + student.getLustForPower();
        int sum2 = student2.getAmbition() + student2.getCunning() + student2.getDetermination() + student2.getResourcefulness() + student2.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Слизеринец, чем " + student2.getName() + " " + student2.getSurname());
        } else if (sum2 > sum1) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший Слизеринец, чем " + student.getName() + " " + student.getSurname());
        } else System.out.println("Качества студентов равные");
    }
}
