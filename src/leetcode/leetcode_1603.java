package leetcode;

public class leetcode_1603 {


    class ParkingSystem {
        int[] capTable = new int[3];
        int[] capLimit = new int[3];

        public ParkingSystem(int big, int medium, int small) {
            for(int i=0;i<3;i++) {
                capTable[i] = 0;
                capLimit[i] = 0;
            }
            capLimit[0] = big;
            capLimit[1] = medium;
            capLimit[2] = small;
        }

        public boolean addCar(int carType) {
            if(capTable[carType-1] >= capLimit[carType-1]) {
                return false;
            }
            capTable[carType-1]++;
            return true;
        }
    }

    public static void main(String[] args) {
        leetcode_1603 t = new leetcode_1603();
    }
}
