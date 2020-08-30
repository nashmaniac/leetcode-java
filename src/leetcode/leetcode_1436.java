package leetcode;

import java.util.HashMap;
import java.util.List;

public class leetcode_1436 {

    public String destCity(List<List<String>> paths) {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        for(int i=0;i<paths.size();i++) {
            if (!hashMap.containsKey(paths.get(i).get(0))) {
                hashMap.put(paths.get(i).get(0), paths.get(i).get(1));
            }
        }
        String startCity = paths.get(0).get(0);
        String destinationCity = null;
        while (hashMap.containsKey(startCity)) {
            destinationCity = hashMap.get(startCity);
            startCity = destinationCity;
        }
        return destinationCity;
    }
    public static void main(String[] args) {
        leetcode_1436 t = new leetcode_1436();

    }
}
