package leetcode.s0601_700;

import java.util.HashMap;
import java.util.List;

public class leetcode_690 {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    HashMap<Integer, List<Integer>> employeeList = new HashMap<>();
    HashMap<Integer, Integer> importance = new HashMap<>();

    public int getScore(int id) {
        int sum = 0;
        sum +=  importance.get(id);
        for(Integer i: employeeList.get(id)) {
            sum += getScore(i);
        }
        return sum;
    }


    public int getImportance(List<Employee> employees, int id) {
        for (Employee e: employees) {
            employeeList.put(e.id, e.subordinates);
            importance.put(e.id, e.importance);
        }

        return getScore(id);
    }
    public static void main(String[] args) {
        leetcode_690 t = new leetcode_690();
    }
}
