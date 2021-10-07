package IT도서.열혈자바프로그래밍.챕터28_메소드참조와Optional.src;

class Friend{   // 친구 정보
    String name;
    Company cmp;    // null일 수 있음

    public Friend(String n, Company c){
        name = n;
        cmp = c;
    }
    public String getName(){ return name;}
    public Company getCmp(){ return cmp;}
}

class Company{  // '친구 정보'에 속하는 '회사 정보'
    String cName;
    ContInfo cInfo; // null 일 수 있음

    public Company(String cn, ContInfo ci){
        cName = cn;
        cInfo = ci;
    }
    public String getCName(){ return cName;}
    public ContInfo getCInfo(){ return cInfo;}
}

class ContInfo{ // '회사 정보'에 속하는 '회사 연락처'
    String phone;   // null일 수 있다.
    String address; // null일 수 있다.

    public ContInfo(String ph, String ad){  // 생성자
        phone = ph;
        address = ad;
    }

    //getter
    public String getPhone(){ return phone;}
    public String getAddress(){ return address;}
}

public class NullPointerCaseStudy {

    public static void showCompAddr(Friend f){
        String addr = null;

        if(f != null){  // 인자로 전달된 것이 null 일 수도 있으니깐
            Company com = f.getCmp();
            if(com != null){    // 회사 정보가 없을 수도 있으니
                ContInfo info = com.getCInfo();
                if(info != null)    // 회사의 연락처 정보가 없을 수도 있으니깐
                    addr = info.getAddress();
            }
        }

        if(addr != null)
            System.out.println(addr);
        else
            System.out.println("There's no address information");
    }

    public static void main(String[] args) {
        ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
        Company cp = new Company("YaHo Co., Ltd.", ci);
        Friend frn = new Friend("LEE SU", cp);
        showCompAddr(frn);
    }
}
