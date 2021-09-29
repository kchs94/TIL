package IT독서.열혈자바프로그래밍.클래스의상속3_상속의목적.상속이도움되는상황_1;
// 해결: 상속의 특징인 연관된 일련의 클래스들에 대해 공통적인 규약을 정의할 수 있다.

class Friend{   // 대학 친구와 직장 동료 클르새의 공통규약을 만들기위해 존재하는 클래스
    protected String name;
    protected String phone;
    
    public Friend(String na, String ph){
        name = na;
        phone = ph;
    }
    public void showInfo(){
        System.out.println("이름: " + name);
        System.out.println("전화: " + phone);
    }
}

class UnivFriends extends Friend{
    private String major;

    public UnivFriends(String na, String ma, String ph){
        super(na, ph);
        major = ma;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("전공: " + major);
    }
}

class CompFriend extends Friend{
    private String department;

    public CompFriend(String na, String de, String ph){
        super(na, ph);
        department = ph;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("부서: " + department);
    }
}

public class MyFriends2 {
    public static void main(String[] args) {
        Friend[] frns = new Friend[10];
        int cnt =0;

        frns[cnt++] = new UnivFriends("Lee","Computer", "010-333-555");
        frns[cnt++] = new UnivFriends("SEO","Electronics", "010-222-444");
        frns[cnt++] = new CompFriend("YOON","R&D 1", "02-123-9999");
        frns[cnt++] = new CompFriend("PARK","R&D 2", "02-321-7777");

        // 모든 동창 및 동료의 정보 전체 출력
        for(int i=0; i<cnt; i++){
            frns[i].showInfo(); // 오버라이딩 한 메소드가 호출된다.
            System.out.println();
        }
    }
}
