package IT독서.열혈자바프로그래밍.챕23_컬렉션프레임워크1.src;

import java.util.List;  // 제네릭 클래스라고 하더라도 import 문에서는 클래스명만 작성한다.
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  // 컬렉션 인스턴스 생성

        // 컬렉션 인스턴스에 문자열 인스턴스 저장
        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        // 저장된 문자열 인스턴스의 참조
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();

        list.remove(0); // 첫 번째 인스턴스 삭제

        // 첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
    }
}
