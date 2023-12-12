public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13_676; //переменная для хранение стоимости билета
        int oneBonusMilleCost = 20; //переменная для хранения количества рублей для одной бонусной мили

        int bonusMile;
        if (ticketPrice >= oneBonusMilleCost) {
            bonusMile = ticketPrice / oneBonusMilleCost;
        } else {
            bonusMile = 0;
        }
        System.out.println("Количество бонусных миль " + bonusMile);
    }
}
