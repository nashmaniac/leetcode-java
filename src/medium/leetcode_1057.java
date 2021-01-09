package medium;

import java.util.ArrayList;

public class leetcode_1057 {
    public void solve() {
        int[][] workers = new int[][]{{0,0},{2,1}};
        int[][] bikes = new int[][]{{1,2},{3,3}};


        workers = new int[][]{{664,994},{3,425},{599,913},{220,352},{145,348},{604,428},{519,183},{732,148}};
        bikes = new int[][]{{611,698},{113,338},{579,770},{276,588},{948,679},{731,525},{925,877},{182,281},{39,299}};
        System.out.println(assignBikes(workers, bikes));
    }


    public int findDist(int[] workerPos, int[] bikePos) {
        return Math.abs(workerPos[0]-bikePos[0]) + Math.abs(workerPos[1]-bikePos[1]);
    }

    public int[] assignBikes(int[][] workers, int[][] bikes) {
        int workerCount = workers.length;
        int bikeCount = bikes.length;
        int[] bikeMapping = new int[workerCount];
        boolean[] workerAssigned = new boolean[workerCount];
        boolean[] bikeAssigned = new boolean[bikeCount];

        ArrayList<int[]>[] distBucket = new ArrayList[20001];

        for(int i=0;i<workerCount;i++) {
            for(int j=0;j<bikeCount;j++) {
                int dist = findDist(workers[i], bikes[j]);
                if(distBucket[dist] == null) {
                    distBucket[dist] = new ArrayList();
                }

                distBucket[dist].add(new int[]{i, j});
            }
        }

        for(int i=0;i<distBucket.length;i++) {
            if(distBucket[i] == null) continue;
            for(int j=0;j<distBucket[i].size();j++) {
                int w = distBucket[i].get(j)[0];
                int b = distBucket[i].get(j)[1];

                if(!workerAssigned[w] && !bikeAssigned[b]) {
                    bikeMapping[w] = b;
                    workerAssigned[w] = true;
                    bikeAssigned[b] = true;
                }
            }
        }
        return bikeMapping;
    }

    public static void main(String[] args) {
        leetcode_1057 t = new leetcode_1057();
        t.solve();
    }
}
