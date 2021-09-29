package IT독서.열혈자바프로그래밍.챕23_컬렉션프레임워크1.src;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class SetCollectionFeature {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();  // Set<E> 인터페이스를 구현하는 컬렉션 클래스는 1.중복x 2.순서x 특징이있다.
        set.add("Toy");
        set.add("Box");
        set.add("Robot");
        set.add("Box");
        System.out.println("인스턴스 수:" +  set.size());

        // 반복자를 이용한 전체 출력
        for(Iterator<String> itr = set.iterator(); itr.hasNext();)
            System.out.print(itr.next() + '\t');
        System.out.println();

        // for-each문을 이용한 전체 출력
        for(String s : set)
            System.out.print(s + '\t');
        System.out.println();
    }
}
