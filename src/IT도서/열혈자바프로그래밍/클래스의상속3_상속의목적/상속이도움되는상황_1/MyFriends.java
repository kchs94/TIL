package IT도서.열혈자바프로그래밍.클래스의상속3_상속의목적.상속이도움되는상황_1;
// 상속을 하는 이유: 공통적인 규약을 만들 수 있다.

// 문제: 배열이 두개 이므로 무엇을 하건 그 과정이 둘로 나뉜다.
class UnivFriend{   // 대학 동창
    private String name;    // 이름
    private String major;   // 전공
    private String phone;   // 전화번호

    public UnivFriend(String na, String ma, String ph){ // 생성자
        name = na;
        major = ma;
        phone = ph;
    }

    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("전공: " + major);
        System.out.println("전화: " + phone);
    }
}

class CompFriends{
    private String name;    //이름
    private String department;  //부서
    private String phone;   // 전화

    public CompFriends(String na, String de, String ph){    // 생성자
        name = na;
        department = de;
        phone = ph;
    }

    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("부서: " + department);
        System.out.println("전화: " + phone);
    }
}

public class MyFriends {
    public static void main(String[] args) {
        // 대학 동창의 관리를 위한 배열과 변수
        UnivFriend[] ufrns = new UnivFriend[5];
        int ucnt=0;

        // 직장 동료의 관리를 위하 배열과 변수
        CompFriends[] cfrns = new CompFriends[5];
        int ccnt=0;

        // 대학 동창의 정보 저장
        ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-333-555");
        ufrns[ucnt++] = new UnivFriend("SEO", "Electornics", "010-222-1111");

        // 직장 동료의 정보 저장
        cfrns[ccnt++] = new CompFriends("YOON", "R&D 1", "02-123-444");
        cfrns[ccnt++] = new CompFriends("KIM", "R&D 2", "02-444-4123");

        // 모든 동창 및 동료의 정보 전체 출력
        for(int i=0; i<ucnt; i++){
            ufrns[i].showInfo();
            System.out.println();
        }
        for(int i=0; i<ccnt; i++){
            cfrns[i].showInfo();
            System.out.println();
        }
    }
}
