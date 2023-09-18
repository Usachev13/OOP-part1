import java.util.Random;

public class Main {
    public static int getRnd() {
        Random random = new Random();
        return random.nextInt(0, 100);
    }
    public static void main(String[] args) {
        hogwarts[]  hogwarts = {
                new Gryffindor("Гарри Поттер", getRnd(), getRnd(), getRnd(), getRnd(), getRnd()),
                new Gryffindor("Гермиона Гренджер", getRnd(), getRnd(), getRnd(), getRnd(), getRnd()),
                new Gryffindor("Рон Уизли", getRnd(), getRnd(), getRnd(), getRnd(), getRnd()),
                new Slytherin("Драко Малфой", getRnd(), getRnd(), getRnd(), getRnd(), getRnd(),getRnd(),getRnd()),
                new Slytherin("Грэхэм Монтегю", getRnd(), getRnd(), getRnd(), getRnd(), getRnd(),getRnd(),getRnd()),
                new Slytherin("Грегори Гойл", getRnd(), getRnd(), getRnd(), getRnd(), getRnd(),getRnd(),getRnd()),
                new Hufflepuff("Захария Смит", getRnd(), getRnd(), getRnd(), getRnd(), getRnd()),
                new Hufflepuff("Седрик Диггори", getRnd(), getRnd(), getRnd(), getRnd(), getRnd()),
                new Hufflepuff("Джастин Финч-Флетчл", getRnd(), getRnd(), getRnd(), getRnd(), getRnd()),
                new Ravenclaw("Чжоу Чанг", getRnd(), getRnd(), getRnd(), getRnd(), getRnd(),getRnd()),
                new Ravenclaw("Падма Патил", getRnd(), getRnd(), getRnd(), getRnd(), getRnd(),getRnd()),
                new Ravenclaw("Маркус Белби", getRnd(), getRnd(), getRnd(), getRnd(), getRnd(),getRnd())
        };
        System.out.println(hogwarts[1].toString());
        hogwarts student = hogwarts[0];
        hogwarts student2 = hogwarts[1];
        student.compare(student2);
        ((Gryffindor) student).compare(((Gryffindor) student2));
    }

}
