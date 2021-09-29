package JAVA.자료형.Map;

import java.util.HashMap;

// 자료형 맵(Map, Associative array, Hash): "이름" = "홍길동"과 같은 대응관계를 쉽게 표현할 수 있게 해주는 자료형.
// 맵은 딕셔너리와 비슷하다. baseball이라는 단어에 '야구'가 대응되듯이 Map은 Key와 Value를 한 쌍으로 갖는 자료형입니다.
// Map은 리스트나 배열처럼 순차적으로(Sequential) 해당 요소 값을 찾지 않고 key를 통해 value를 찾습니다.즉 Map의 가장 큰 특징은
// key로 value를 얻는다는 것입니다. 예를들어, baseball의 뜻을 알기위해 영어사전을 차례대로 모두 훑는게 아닌
// baseball이라는 단어가 있는 곳만을 펼쳐서 찾는거와 같습니다.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");    // 입력
        map.put("baseball", "야구");  // 입력

        System.out.println(map.get("people"));
        System.out.println(map.get("baseball"));
        System.out.println(map.containsKey("people"));
        System.out.println(map.remove("peolpe"));
        System.out.println(map.size());
    }
}
