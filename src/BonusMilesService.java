public class BonusMilesService {
    public int calculate(int price) {
        int byeTickets = 1;
        int priceMiles = 20;
        int miles = (price / priceMiles) * byeTickets;

        return miles;
    }
}
