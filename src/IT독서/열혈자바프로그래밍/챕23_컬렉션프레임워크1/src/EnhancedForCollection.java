package IT독서.열혈자바프로그래밍.챕23_컬렉션프레임워크1.src;

import java.util.List;
import java.util.LinkedList;

public class EnhancedForCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // 인스턴스 저장
        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        // 전체 인스턴스 참조
        for(String s : list)    // 전체 인스턴스를 대상으로 하는 연산이 필요한 경우 사용한다.
            System.out.print(s + '\t');
        System.out.println();

        list.remove(0); // 첫 번째 인스턴스 삭제

        // 전체 인스턴스 참조
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();
    }
}
