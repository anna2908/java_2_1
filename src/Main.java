public class Main
{
    public static void main(String[] args)
    {
        int ticketPrice = 110;
        int bonusPrice = 20;

        System.out.println("Стоимость билета - " + ticketPrice + " руб.");
        System.out.println("Начисленно бонусов - " +(ticketPrice/bonusPrice));
    }
}