package core_programming_basics.elementary_coding.level1;

public class ProfitAndLoss {
    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;
        int profit = sp - cp;
        float profitPercent = ((float) profit/cp)*100;
        System.out.println("The profit is INR : " + profit + " " + "and the profit percentage is : " + profitPercent);
    }
}
