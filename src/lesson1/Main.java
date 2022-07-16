package lesson1;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(new Barriers(1700, 2.5));

        Team team1 = new Team("'Победа'",
                new People("Аркадий", 1500, 2.3),
                new People("Васёк", 1600, 2.5),
                new People("Денис", 2000, 2.6),
                new People("Пётр", 1900, 2.4));

        Team team2 = new Team("'Скала'",
                new People("Матвей", 1550, 2.7),
                new People("Артём", 1700, 2.4),
                new People("Семён", 1800, 2.6),
                new People("Олег", 1800, 2.8));

        course1.doIt(team1);
        course1.doIt(team2);

        System.out.println("\n''РЕЗУЛЬТАТЫ СОРЕВНОВАНИЙ''\n");
        team1.showResults();
        System.out.println();
        team2.showResults();
    }
}




