package easy;

import java.util.HashSet;

public class leetcode_929 {
    public void solve() {

        String[] emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }


    public int numUniqueEmails(String[] emails) {
        HashSet<String> a = new HashSet<>();
        for(int i=0;i<emails.length;i++) {
            String[] parts = emails[i].split("@", 2);
            String[] names = parts[0].split("\\+", 2);
            a.add(names[0].replace(".", "")+"@"+parts[1]);
        }
        return a.size();
    }

    public static void main(String[] args) {
        leetcode_929 t = new leetcode_929();
        t.solve();
    }
}
