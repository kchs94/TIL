package IT독서.열혈자바프로그래밍.챕23_컬렉션프레임워크1.src;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;

public class ListIteratorCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);

        ListIterator<String> litr = list.listIterator();    // 양방향 반복자 획득

        String str;
        while(litr.hasNext()){  // 오른쪽에서 왼쪽으로 이동을 위한 반복문
            str = litr.next();
            System.out.print(str + '\t');
            if(str.equals("Toy"))   // "Toy" 만나면 "Toy2" 저장
                litr.add("Toy2");
        }
        System.out.println();

        while(litr.hasPrevious()){  // 오른쪽에서 왼쪽으로 이동을 위한 반복문
            str = litr.previous();
            System.out.print(str + '\t');
            if(str.equals("Robot"))     // "Robot" 만나면 "Robot2" 저장
                litr.add("Robot2");
        }
        System.out.println();

        // 다시 왼쪽에서 오른쪽으로
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}
