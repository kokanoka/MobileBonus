public class Main {
    public static void main(String[] args) {
        int balance = 4000;
        int payment = 800;
        int bonus;

        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = balance + payment + bonus;
        System.out.println(totalBalance + "," + bonus);
    }
}