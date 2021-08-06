package IT독서.열혈자바프로그래밍.챕23_컬렉션프레임워크1.src;

import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    }
}

public class ComparatorString {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new StringComparator());
        tree.add("Box");
        tree.add("Rabbit");
        tree.add("Robot");

        for(String s : tree)
            System.out.print(s.toString() + '\t');
    }
}
