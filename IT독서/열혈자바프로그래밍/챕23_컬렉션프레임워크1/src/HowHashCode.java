package IT독서.열혈자바프로그래밍.챕23_컬렉션프레임워크1.src;

import java.util.HashSet;

class Car {
    private String model;
    private String color;

    public Car(String m, String c) {
        model = m;
        color = c;
    }

    @Override
    public String toString(){
        return model + " : " + color;
    }

    @Override
    public int hashCode() {
        return (model.hashCode() + color.hashCode()) / 2;
    }

    @Override
    public boolean equals(Object obj){
        String m = ((Car)obj).model;
        String c = ((Car)obj).color;

        if(model.equals(m) && color.equals(c))
            return true;
        else
            return false;
    }
}

public class HowHashCode {
    public static void main(String[] args) {
        HashSet<Car> set = new HashSet<>();
        set.add(new Car("HY_HD_301", "RED"));
        set.add(new Car("HY_HD_301", "BLACK"));
        set.add(new Car("HY_HD_302", "RED"));
        set.add(new Car("HY_HD_302", "WHITE"));
        set.add(new Car("HY_HD_301", "BLACK"));

        System.out.println("인스턴수 수: " + set.size());

        for(Car car : set)
            System.out.println(car.toString() + '\t');
    }
}
