package IT도서.열혈자바프로그래밍.챕24컬렉션프레임워크2.src;

import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class SortCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
        list = new ArrayList<>(list);

        // 정렬 이전 출력
        for(Iterator<String> itr=list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();

        // 정렬
        Collections.sort(list);

        //정렬 이후 출력
        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}
