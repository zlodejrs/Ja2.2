public class BonusMilesService {

    public int calculate(int price) {
        int miles = 20;
        int milesAmount = price / miles;
        return milesAmount;
		
    }
}
