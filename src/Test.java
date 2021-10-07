import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // 저장
        map.put(45, "브라운");
        map.put(37, "제임스");
        map.put(23, "김충섭");

        // 조회
        System.out.println("23번: " + map.get(23));
        System.out.println("37번: " + map.get(37));
        System.out.println("45번: " + map.get(45));

        // 삭제
        map.remove(37);

        // 삭제확인
        System.out.println("37번: " + map.get(37));
    }
}
