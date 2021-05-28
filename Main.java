public class Main {
    public static void main(String[] args) {
//                int ticketPrice = 5000;
//                int freeMiles = 20;
//                int mileAmount = ticketPrice / freeMiles;
//                System.out.println(mileAmount);
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}