package leetcode.s201_300;

public class leetcode_243 {

    public int shortestDistance(String[] words, String word1, String word2) {
        int firstIndex = words.length;
        int secondIndex = words.length;
        int distance = Integer.MAX_VALUE;
        for(int i=0;i< words.length;i++) {
            if(word1.equals(words[i]) && firstIndex!=-1 && i<firstIndex) {
                firstIndex = i;
            }
            if(word2.equals(words[i]) && secondIndex!=-1 && i<secondIndex) {
                secondIndex = i;
            }
            if(firstIndex!=-1 && secondIndex!=-1) {
                distance = Math.min(distance, Math.abs(firstIndex-secondIndex));
            }
        }
        return distance;
    }

    public void solve() {
//        shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding", "practice");
//        shortestDistance(new String[]{"a","a","b","b"},
//        "a",
//        "b");

        shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding");
    }

    public static void main(String[] args) {
        leetcode_243 t = new leetcode_243();
        t.solve();
    }
}
