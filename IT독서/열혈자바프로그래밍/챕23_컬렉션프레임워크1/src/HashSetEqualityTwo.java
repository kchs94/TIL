package IT독서.열혈자바프로그래밍.챕23_컬렉션프레임워크1.src;

import java.util.HashSet;

class Num1{
    private int num;
    public Num1(int n ){ num = n;}

    @Override
    public String toString(){
        return String.valueOf(num);
    }

    @Override
    public int hashCode() {
        return num%3;   // num의 값이 같으면 부류도 같다.
    }

    @Override
    public boolean equals(Object obj){  // num의 값이 같으면 true 반환
        if(num == ((Num1)obj).num)
            return true;
        else
            return false;
    }
}

public class HashSetEqualityTwo {
    public static void main(String[] args) {
        HashSet<Num1> set = new HashSet<>();
        set.add(new Num1(7799));
        set.add(new Num1(9955));
        set.add(new Num1(7799));
        System.out.println("인스턴스 수: " + set.size());

        for(Num1 n : set)
            System.out.print(n.toString() + '\t');
        System.out.println();
    }
}
