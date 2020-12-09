package leetcode.s301_400;

import java.util.List;

public class leetcode_339 {
    public interface NestedInteger {
        public boolean isInteger();

        public Integer getInteger();

        public void setInteger(int value);

        public void add(NestedInteger ni);

        public List<NestedInteger> getList();
    }

    public int levelSum(NestedInteger n, int level) {
        int sum = 0;
        if(n.isInteger()) {
            sum += (n.getInteger()*level);
        } else {
            for(NestedInteger no: n.getList()) {
                sum += levelSum(no, level+1);
            }
        }
        return sum;
    }

    public int depthSum(List<NestedInteger> nestedList) {
        int sum = 0;
        for(NestedInteger n: nestedList) {
            sum += levelSum(n, 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        leetcode_339 t = new leetcode_339();
    }
}
