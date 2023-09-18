import java.util.Random;

public class PrintService {
    Random rnd = new Random();
    int firstIndexStudent = rnd.nextInt(0,3);

    public int getSecondIndexStudent() {
       int secondIndexStudent = rnd.nextInt(0,3);
        while (firstIndexStudent == secondIndexStudent){
            secondIndexStudent = rnd.nextInt(0,3);
        }
        return secondIndexStudent;
    }

    public void print(Gryffindor[] gryffindors) {
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println("Имя: " + gryffindor.getName() + "\n"
                    + "Сила магии: " + gryffindor.getSpellPower() + "\n"
                    + "Сила трансгрессии: " + gryffindor.getTransgression() + "\n"
                    + "Благородство: " + gryffindor.getNobility() + "\n"
                    + "Честь: " + gryffindor.getHonor() + "\n"
                    + "Храбрость: " + gryffindor.getCourage() + "\n"
            );
        }
        Gryffindor gryffindorFirstStudent = gryffindors[firstIndexStudent];
        Gryffindor gryffindorSecondStudent = gryffindors[getSecondIndexStudent()];
        int firstStudent = gryffindorFirstStudent.getNobility() + gryffindorFirstStudent.getHonor() + gryffindorFirstStudent.getCourage();
        int secondStudent = gryffindorSecondStudent.getNobility() + gryffindorSecondStudent.getHonor() + gryffindorSecondStudent.getCourage();
        if (firstStudent > secondStudent){
            System.out.println(gryffindorFirstStudent.getName() + " - лучший Гриффиндорец, чем " + gryffindorSecondStudent.getName());
        }else {
            System.out.println(gryffindorSecondStudent.getName() + " - лучший Гриффиндорец, чем " + gryffindorFirstStudent.getName());
        }
    }

    public void print(Slytherin[] slytherins) {
        for (Slytherin slytherin : slytherins) {
            System.out.println("Имя: " + slytherin.getName() + "\n"
                    + "Сила магии: " + slytherin.getSpellPower() + "\n"
                    + "Сила трансгрессии: " + slytherin.getTransgression() + "\n"
                    + "Хитрость: " + slytherin.getCunning() + "\n"
                    + "Решительность: " + slytherin.getDetermination() + "\n"
                    + "Амбициозность: " + slytherin.getAmbition() + "\n"
                    + "Находчивость: " + slytherin.getResourcefulness() + "\n"
                    + "Жажда власти: " + slytherin.getLustForPower() + "\n"
            );
        }
        Slytherin slytherinFirstStudent = slytherins[firstIndexStudent];
        Slytherin slytherinSecondStudent = slytherins[getSecondIndexStudent()];
        int firstStudent = slytherinFirstStudent.getCunning() + slytherinFirstStudent.getDetermination() + slytherinFirstStudent.getAmbition()+slytherinFirstStudent.getResourcefulness() + slytherinFirstStudent.getLustForPower();
        int secondStudent = slytherinSecondStudent.getCunning() + slytherinSecondStudent.getDetermination() + slytherinSecondStudent.getAmbition()+slytherinSecondStudent.getResourcefulness() + slytherinSecondStudent.getLustForPower();
        if (firstStudent > secondStudent){
            System.out.println(slytherinFirstStudent.getName() + " - лучший Слизеринец, чем " + slytherinSecondStudent.getName());
        }else {
            System.out.println(slytherinSecondStudent.getName() + " - лучший Слизеринец, чем " + slytherinFirstStudent.getName());
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("Имя: " + hufflepuff.getName() + "\n"
                    + "Сила магии: " + hufflepuff.getSpellPower() + "\n"
                    + "Сила трансгрессии: " + hufflepuff.getTransgression() + "\n"
                    + "Трудолюбие: " + hufflepuff.getHardworking() + "\n"
                    + "Честь: " + hufflepuff.getHonest() + "\n"
                    + "Преданность: " + hufflepuff.getLoyal() + "\n"
            );
        }
        Hufflepuff hufflepuffFirstStudent = hufflepuffs[firstIndexStudent];
        Hufflepuff hufflepuffSecondStudent = hufflepuffs[getSecondIndexStudent()];
        int firstStudent = hufflepuffFirstStudent.getHardworking() + hufflepuffFirstStudent.getHonest() + hufflepuffFirstStudent.getLoyal();
        int secondStudent = hufflepuffSecondStudent.getHardworking() + hufflepuffSecondStudent.getHonest() + hufflepuffSecondStudent.getLoyal();
        if (firstStudent > secondStudent){
            System.out.println(hufflepuffFirstStudent.getName() + " - лучший Пуффендуец, чем " + hufflepuffSecondStudent.getName());
        }else {
            System.out.println(hufflepuffSecondStudent.getName() + " - лучший Пуффендуец, чем " + hufflepuffFirstStudent.getName());
        }
    }
    public void print(Ravenclaw[] ravenclaws) {
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("Имя: " + ravenclaw.getName() + "\n"
                    + "Сила магии: " + ravenclaw.getSpellPower() + "\n"
                    + "Сила трансгрессии: " + ravenclaw.getTransgression() + "\n"
                    + "Креативность: " + ravenclaw.getCreation() + "\n"
                    + "Ум: " + ravenclaw.getSmart() + "\n"
                    + "Мудрость: " + ravenclaw.getWise() + "\n"
                    + "Остроумие: " + ravenclaw.getWitty() + "\n"
            );
        }
        Ravenclaw ravenclawFirstStudent = ravenclaws[firstIndexStudent];
        Ravenclaw rawenclawSecondStudent = ravenclaws[getSecondIndexStudent()];
        int firstStudent = ravenclawFirstStudent.getCreation() + ravenclawFirstStudent.getSmart() + ravenclawFirstStudent.getWise() + ravenclawFirstStudent.getWitty();
        int secondStudent = rawenclawSecondStudent.getCreation() + rawenclawSecondStudent.getSmart() + rawenclawSecondStudent.getWise() + rawenclawSecondStudent.getWitty();
        if (firstStudent > secondStudent){
            System.out.println(ravenclawFirstStudent.getName() + " - лучший Равенклавовец, чем " + rawenclawSecondStudent.getName());
        }else {
            System.out.println(rawenclawSecondStudent.getName() + " - лучший Равенклавовец, чем " + ravenclawFirstStudent.getName());
        }
    }
}