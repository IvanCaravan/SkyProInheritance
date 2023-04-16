public class Ravenclaw  extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int smartness;
    private int creativity;

    public Ravenclaw(String name, String surname, int magic, int transgression, int intelligence, int wisdom, int smartness, int creativity) {
        super(name, surname, magic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.smartness = smartness;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getWisdom() {
        return this.wisdom;
    }
    public int getSmartness() {
        return this.smartness;
    }

    public int getCreativity() {
        return this.creativity;
    }
    @Override
    public String toString() {
        return "Имя: " + this.name + " " + this.surname + ". Магия: " + this.magic + ". Трансгрессия: " + this.transgression +
                ", Ум: " + this.intelligence + ", Мудрость: " + this.wisdom + ", Остроумие: " + this.smartness + ", Творчество: " + this.creativity;
    }

    public static void compareRavenclawStudents (Ravenclaw student, Ravenclaw student2) {
        int sum1 = student.getCreativity() + student.getIntelligence() + student.getWisdom() + student.getSmartness();
        int sum2 = student2.getCreativity() + student2.getIntelligence() + student2.getWisdom() + student2.getSmartness();
        if (sum1 > sum2) {
            System.out.println(student.getName() + " " + student.getSurname() + " лучший Когтевранец, чем " + student2.getName() + " " + student2.getSurname());
        } else if (sum2 > sum1) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " лучший Когтевранец, чем " + student.getName() + " " + student.getSurname());
        } else System.out.println("Качества студентов равные");
    }
}