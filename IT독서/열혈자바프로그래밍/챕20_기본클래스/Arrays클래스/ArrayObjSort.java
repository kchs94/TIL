package IT독서.열혈자바프로그래밍.챕20_기본클래스.Arrays클래스;

import java.util.Arrays;

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o){
        Person p = (Person)o;
        if(this.age > p.age)
            return 1;   // 인자로 전달된 o가 작다면 양의 정수 반환
        else if(this.age < p.age)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString(){
        return name + ": " + age;
    }
}


public class ArrayObjSort {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);
        for(Person p: ar)
            System.out.println(p);
    }
}
