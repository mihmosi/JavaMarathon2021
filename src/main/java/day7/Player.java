package day7;
//import java.util.Random;
public class Player {
//    Random random = new Random();

    private int stamina;

    public final static int MAX_STAMINA = 100;
    public final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
//        this.stamina = random.nextInt((Player.MAX_STAMINA - 90) + 1) + 90;
        if (countPlayers < 6) {

            countPlayers++;
        }
    }

    public static int getCountPlayers() { return countPlayers; }

    public void run(){
        if (stamina == MIN_STAMINA) return;

        stamina--;
        if (stamina == MIN_STAMINA)  countPlayers--;
    }

    public int getStamina() { return stamina; }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть "+(6 - countPlayers) +" свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
