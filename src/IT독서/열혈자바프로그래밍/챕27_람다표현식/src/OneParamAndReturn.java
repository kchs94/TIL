package IT독서.열혈자바프로그래밍.챕27_람다표현식.src;

interface HowLong {
    int len(String s);  // 값을 반환하는 메소드
}

public class OneParamAndReturn {
    public static void main(String[] args) {
        HowLong h1 = s -> s.length();
        System.out.println(h1.len("나는 아주 행복해"));
    }
}
