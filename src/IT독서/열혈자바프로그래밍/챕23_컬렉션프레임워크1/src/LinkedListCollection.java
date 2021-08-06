package IT독서.열혈자바프로그래밍.챕23_컬렉션프레임워크1.src;

import java.util.List;
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(); // 유일한 변화
        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();

        list.remove(0);
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
    }
}
