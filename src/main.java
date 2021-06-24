public class main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10_000;
        int mile = service.calculate(ticketPrice);
        System.out.println("Mile = " + mile);
    }
}
