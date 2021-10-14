package IT도서.열혈자바프로그래밍.챕터29_스트림1.src.문제29_1.문제2;

import java.util.List;
import java.util.Arrays;

class Box<T> {
    private T object;
    public Box(T object){
        this.object = object;
    }
    public T get(){
        return object;
    }
}

public class BoxToInteger {
    public static void main(String[] args) {
        List<Box<String>> list = Arrays.asList(new Box<>("Robot"), new Box<>("Simple"));
        list.stream()   // 컬렉션 인스턴스로 스트림 생성
                .map(box -> box.get().length())  // 중간 연산자
                .forEach(n -> System.out.print(n + "\t"));  // 최종 연산자
        System.out.println();
    }
}