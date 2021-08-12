package IT독서.열혈자바프로그래밍.챕26_네스티도와람다.src.SortComparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Strcomp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    }
}

public class SortComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ROBOT");
        list.add("APPLE");
        list.add("BOX");

        Strcomp cmp = new Strcomp();    // 정렬 기준
        Collections.sort(list, cmp); // 정렬 기준 변경해서 정렬 진행
        System.out.println(list);
    }
}
