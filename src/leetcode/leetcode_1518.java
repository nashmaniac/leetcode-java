package leetcode;

public class leetcode_1518 {

    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;

        while (numBottles >= numExchange) {
            int returnedBottles = numBottles/numExchange;
            numBottles = returnedBottles + (numBottles%numExchange);
            count += returnedBottles;
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_1518 t = new leetcode_1518();
        System.out.println(t.numWaterBottles(2, 3));
    }
}
