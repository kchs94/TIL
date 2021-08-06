package IT독서.열혈자바프로그래밍.챕23_컬렉션프레임워크1.src;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);   // 저장 과정에서 오토 박싱 진행

        int n;
        for(Iterator<Integer> itr = list.iterator(); itr.hasNext();){
            n = itr.next(); // 오토 언박싱 진행
            System.out.print(n  + "\t");
        }
        System.out.println();
    }
}
