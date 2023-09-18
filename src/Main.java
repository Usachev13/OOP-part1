import java.util.Random;

public class Main {
    public static int getRnd() {
        Random random = new Random();
        return random.nextInt(0, 100);
    }
    public static void main(String[] args) {
        Gryffindor[]  gryffindors = {
                new Gryffindor("Гарри Поттер", getRnd(), getRnd(), "Гриффиндор", getRnd(), getRnd(), getRnd()),
                new Gryffindor("Гермиона Гренджер", getRnd(), getRnd(), "Гриффиндор", getRnd(), getRnd(), getRnd()),
                new Gryffindor("Рон Уизли", getRnd(), getRnd(), "Гриффиндор", getRnd(), getRnd(), getRnd())
        };
        Slytherin[]  slytherins = {
                new Slytherin("Драко Малфой", getRnd(), getRnd(), "Слизерин", getRnd(), getRnd(), getRnd(),getRnd(),getRnd()),
                new Slytherin("Грэхэм Монтегю", getRnd(), getRnd(), "Слизерин", getRnd(), getRnd(), getRnd(),getRnd(),getRnd()),
                new Slytherin("Грегори Гойл", getRnd(), getRnd(), "Слизерин", getRnd(), getRnd(), getRnd(),getRnd(),getRnd())
        };
        Hufflepuff[]  hufflepuffs = {
                new Hufflepuff("Захария Смит", getRnd(), getRnd(), "Пуффендуй", getRnd(), getRnd(), getRnd()),
                new Hufflepuff("Седрик Диггори", getRnd(), getRnd(), "Пуффендуй", getRnd(), getRnd(), getRnd()),
                new Hufflepuff("Джастин Финч-Флетчл", getRnd(), getRnd(), "Пуффендуй", getRnd(), getRnd(), getRnd())
        };
        Ravenclaw[]  ravenclaws = {
                new Ravenclaw("Чжоу Чанг", getRnd(), getRnd(), "Когтевран", getRnd(), getRnd(), getRnd(),getRnd()),
                new Ravenclaw("Падма Патил", getRnd(), getRnd(), "Когтевран", getRnd(), getRnd(), getRnd(),getRnd()),
                new Ravenclaw("Маркус Белби", getRnd(), getRnd(), "Когтевран", getRnd(), getRnd(), getRnd(),getRnd())
        };


        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(slytherins);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);


        Ravenclaw temp = ravenclaws[0];
        Gryffindor temp1 = gryffindors[0];
        if (temp.getSpellPower() + temp.getTransgression() > temp1.getSpellPower() + temp1.getTransgression()){
            System.out.println(temp.getName() + " с факультета " + temp.getFaculty() + " обладет большей магической силой чем " + temp1.getName() + " с факультета " + temp1.getFaculty());
        }else {
            System.out.println(temp1.getName() + " с факультета " + temp1.getFaculty() + " обладет большей магической силой чем " + temp.getName() + " с факультета " + temp.getFaculty());

        }

    }
}
