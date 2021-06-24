public class BonusMilesService {
    public int calculate (int ticketPrice) {
    int bonusMile = 20;
    int mile = ticketPrice / bonusMile;
    return mile;
    }
}
